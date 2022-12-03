package my.db.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import my.db.model.Good;
import my.db.util.DbUtil;

public class ShopView {

        Scanner input = new Scanner(System.in);
        public void ShopStart() {
                System.out.println("================= Welcome to the Supermarket Shopping Management System =================");

                String isGo="y";
                do{
                                showMenu();
                                System.out.println("Please enter the action to be performed");
                               
                                String select =input.next();
                                input.nextLine();

                                switch (select) {

                                case "1":
                                        insertGood();
                                        break;

                                case "2":
                                        System.out.println("Enter the item number to query");
                                        int goodId = input.nextInt();
                                        input.nextLine();

                                        Good good = searchGoodById(goodId);

                                        if(good!=null){
                                                System.out.println("Commodity number:"+goodId+" Trade name:"+good.getName()
                                                +"  commodity price:"+good.getPrice()+"  Quantity of commodities:"+good.getNum());
                                        }else{
                                                System.out.println("This product does not exist");
                                        }
                                        break;

                                case "3":
                                        getGoodList();
                                        break;

                                case "4":
                                        buyGood();
                                        break;

                                case "5":
                                        System.out.println("Enter item number to delete");
                                        int id = input.nextInt();
                                        input.nextLine();

                                        if(searchGoodById(id)!=null){
                                                deleteGood(id);
                                        }else{
                                                System.out.println("There is no such product");
                                        }
                                        break;
                                case "6":
                                        updateGood();
                                        break;

                                case "0":
                                        System.out.println("*************Welcome to the next use bye!*************");

                                        System.exit(0);
                                default:
                                        System.err.println("Wrong input, please input again!");
                                        continue;
                        }
                                System.out.println("input y Continue/Otherwise quit");
                                isGo = input.next();
                }while(isGo.equals("y"));
                System.out.println("*************Welcome to the next use bye!*************");
        }

                //Method for displaying system interface menu
                private void  showMenu() {
                        System.out.println("1.Products");
                        System.out.println("2.Query products according to product number");
                        System.out.println("3.List of products");
                        System.out.println("4.Purchase");
                        System.out.println("5.Delete merchandise");
                        System.out.println("6.Update product");
                        System.out.println("0.Exit system");
                }

        // Products

        private void insertGood(){

                int id=0;
                System.out.println("Enter item number");
                while(true){
                         id= input.nextInt();
                         input.nextLine();

                        if(searchGoodById(id)==null){
                                break;
                        }
                        System.err.println("Duplicate number, please re-enter product number");
                }
                System.out.println("Enter product name");
                String name = input.nextLine();
                System.out.println("Enter unit price of goods");
                float price = input.nextFloat();
                input.nextLine();
                System.out.println("Enter item quantity");
                int num = input.nextInt();
                input.nextLine();

                String sql = "insert into t_good()values(?,?,?,?)";
                try {

                        Connection con = DbUtil.getConnection();

                        PreparedStatement pst = con.prepareStatement(sql);

                        pst.setInt(1, id);
                        pst.setString(2, name);
                        pst.setFloat(3, price);
                        pst.setInt(4, num);
                        //Execute sql statement
                    if(!pst.execute()){
                        System.out.println("Warehousing success");
                     }

                        DbUtil.close(con, pst);
                } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Abnormal storage"+e.getMessage());
                }
        }
        // Products inquiry

        private Good searchGoodById(int id) {

                String sql="select id,name,price,num from t_good where id=?";
                try {

                        Connection con = DbUtil.getConnection();

                        PreparedStatement pst = con.prepareStatement(sql);
                        pst.setInt(1, id);
                        ResultSet rs = pst.executeQuery();
                        if(rs.next()){
                                Good good = new Good(rs.getInt("id"), rs.getString("name"), 
                                                rs.getFloat("price"), rs.getInt("num"));
                                return good;
                        }

                        DbUtil.close(con, pst);
                } catch (SQLException e) {
                        e.printStackTrace();
                }
                return null;
        }
        //List of products
        
        private void getGoodList(){

                                String sql="select id,name,price,num from t_good";
                                try {

                                        Connection con = DbUtil.getConnection();

                                        PreparedStatement pst = con.prepareStatement(sql);
                                        ResultSet rs = pst.executeQuery();
                                        System.out.printf("%-12s %-20s %-14s %-10s\n","id", "Name", "Unit Price", "Quantity");
                                        System.out.printf("%-12s %-20s %-14s %-10s\n","-----", "-----------", "------------", "------------");
                                        if(rs != null){
                                                
                                                while(rs.next()){
                                                        
                                                        System.out.printf("%-12s %-20s %-14s %-10s\n",
                                                                        rs.getInt("id"), rs.getString("name"), rs.getFloat("price"), rs.getInt("num"));
                                                        
                                                }
                                        }

                                        DbUtil.close(con, pst);
                                } catch (SQLException e) {
                                        e.printStackTrace();
                                }
        }
        
        //Purchase 
        
        public void buyGood() {

                ArrayList<Good> goods = new ArrayList<>();

                String flag = "y";
                do{
                        System.out.println("Enter the purchase item number");
                        int id = input.nextInt();
                        input.nextLine();
                        Good good = searchGoodById(id);
                        if(good!=null){
                                System.out.println("Enter quantity of goods purchased");
                                int num = input.nextInt();
                                if(good.getNum()<num){
                                        System.out.println("This product inventory"+good.getNum()+"  Unable to purchase;");
                                        
                                }else{
                                        try{
                                                String sql="update t_good set num=? where id=?";

                                                Connection con = DbUtil.getConnection();

                                                PreparedStatement pst = con.prepareStatement(sql);
                                                pst.setInt(1, good.getNum()-num);
                                                pst.setInt(2, id);
                                                if(pst.executeUpdate()==1){

                                                        Good g = new Good(id,good.getName(),good.getPrice(),num);
                                                        if(goods.size()>0){
                                                                for (int i = 0; i < goods.size(); i++) {
                                                                        if(goods.get(i).getId()==id){
                                                                                goods.get(0).setNum(num+goods.get(0).getNum());
                                                                        }else{
                                                                                goods.add(g);
                                                                        }
                                                                }
                                                        }else{
                                                                goods.add(g);
                                                        }
                                                        System.out.println("Purchase success");
                                                }else{
                                                        System.out.println("Purchase failure");
                                                }
                                        }catch(Exception e){
                                                e.printStackTrace();
                                                System.out.println("Purchase exception"+e.getMessage());
                                        }
                                }
                                System.out.println("input y Continue to buy/Enter other settlement");
                                flag = input.next();
                                if(!flag.equals("y")){

                                        account(goods);
                                }
                        }else{
                                System.out.println("There is no such product");
                        }
                }while(flag.equals("y"));
        }
        //  Delete merchandise
        
        private void deleteGood(int id) {
                String sql = "delete from t_good where id=?";
                try {
  
                        Connection con = DbUtil.getConnection();

                        PreparedStatement pst = con.prepareStatement(sql);

                        pst.setInt(1, id);

                        if(!pst.execute()){
                                System.out.println("Delete successful");
                        }

                        DbUtil.close(con, pst);
                } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Delete exception"+e.getMessage());
                }
        }
        // Update product action

        private void updateGood() {
                System.out.println("Enter the item to modify id");
                int gid = input.nextInt();
                input.nextLine();
                Good good = searchGoodById(gid);
                System.out.println("The product information is as follows");
                if(good!=null){
                        System.out.println("Commodity number:"+gid+" Trade name:"+good.getName()
                        +"  commodity price:"+good.getPrice()+"  Quantity of commodities:"+good.getNum());
                        System.out.println("Modify product name");
                        String name = input.nextLine();
                        System.out.println("Modify commodity unit price");
                        float price = input.nextFloat();
                        input.nextLine();
                        System.out.println("Modify commodity inventory");
                        int num = input.nextInt();
                        input.nextLine();
                        String sql="update t_good set name=?,price=?,num=? where id=? ";
                        try {
                              
                                Connection con = DbUtil.getConnection();
                            
                                PreparedStatement pst = con.prepareStatement(sql);
                    
                                pst.setString(1, name);
                                pst.setFloat(2, price);
                                pst.setInt(3, num);
                                pst.setInt(4, gid);
                    
                                if(!pst.execute()){
                                        System.out.println("Update success");
                                }
   
                                DbUtil.close(con, pst);
                        } catch (Exception e) {
                                e.printStackTrace();
                                System.out.println("Update exception"+e.getMessage());
                        }
                }else{
                        System.out.println("This product does not exist");
                }
                
        }
        
        //Checkout
        
        private void account(ArrayList<Good> goods) {
                System.out.printf("%-12s %-20s %-12s %-15s\n","id", "Name", "Quantity", "Total price");
                System.out.printf("%-12s %-20s %-12s %-15s\n","-----", "-----------", "-----------", "------------");

                goods.forEach(in-> System.out.printf("%-12s %-20s %-12s %-15s\n",
                                in.getId(), in.getName(), in.getNum(), in.getNum()*in.getPrice()));
                

                float sum=0;
                for (int i = 0; i < goods.size(); i++) {

                        sum += (goods.get(i).getNum())*(goods.get(i).getPrice());
                }
                System.out.println("Aggregate consumption:"+sum+"element");
        }
}


