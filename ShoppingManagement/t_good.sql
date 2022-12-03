use shop;

CREATE TABLE `t_good` (
`id` int(5) NOT NULL,
`name` varchar(25) NOT NULL,
`price` float(10,2) NOT NULL,
`num` int(5) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;