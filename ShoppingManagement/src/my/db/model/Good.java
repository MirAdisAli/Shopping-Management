package my.db.model;
public class Good {

   private int id;
   private String name;
   private float price;
   private int num;

   public Good() {
       super();
   }

   public String toString() {
       return "Good [id=" + id + ", name=" + name + ", price=" + price + ", num=" + num + "]";
   }

   public Good(int id, String name, float price, int num) {
       super();
       this.id = id;
       this.name = name;
       this.price = price;
       this.num = num;
   }

   public int getId() {
       return id;
   }
   public void setId(int id) {
       this.id = id;
   }
   public String getName() {
       return name;
   }
   public void setName(String name) {
       this.name = name;
   }
   public float getPrice() {
       return price;
   }
   public void setPrice(float price) {
       this.price = price;
   }
   public int getNum() {
       return num;
   }
   public void setNum(int num) {
       this.num = num;
   }
}
