# spring-boot的mybatis

* DDL
```sql
DROP TABLE `person`;
CREATE TABLE `person` (
      `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
      `name` varchar(50) NOT NULL DEFAULT '',
      `age` int(10) unsigned NOT NULL DEFAULT '0',
      PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

INSERT INTO person values (1, 'zhangsan', 30);
```