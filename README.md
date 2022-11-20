# JDBC_MySQL
文件说明： 包含1个JDBCUtil类，该类构造方法私有，直接调用其静态方法。包含DQL、DML两种方法，DQL又分为允许注入和不允许注入的方法。

其他文件：一个测试类JDBCTest   一个T_ACT类：用于DQL查询。

运行环境：IDEA2019   .ignore插件（需要注意版本不能太高，否则IDEA提示不兼容）  win10 64位   MySQL 8.0数据库。

数据库表：t_act  包含2个字段  actno,balance  类型时bigint,double。

T_ACT类中属性名和类型，需要和t_act表中的属性名和类型相对应。

DQL返回的是ArrayList<T>列表，DML方法返回结果为boolean值。
  
JDBCTest类中运行，可校验封装效果。
