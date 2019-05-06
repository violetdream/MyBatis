# Spring集成MyBatis

包含如下示例：

　　1、Spring JDBC

　　2、Spring集成MyBatis的示例



使用说明：

　　测试类主要在 test/java/com.gupaoedu.com中。

　　需要部署到tomcat中启动，访问：http://localhost:8080/


	1、当我们传入RowBounds做翻页查询的时候，使用limit物理分页，代替原来的逻辑分页基于mybatis-standaloneMyBatisTest.java —— testSelectByRowBounds()
		基于gupaoedu-vip-spring-mybatis，通过插件PageHelper
		引入Oracle数据库，用ROWNUM，在执行Mapper方法之前传入RowBounds实现ROWNUM物理分页。
	
	2、在未启用日志组件的情况下，输出执行的SQL，并且统计SQL的执行时间（先实现查询的拦截）提交地址https://gper.gupaoedu.com/homework/subjects/4871
		
		新增LogInceptor，打印出BoundSQL.getSql()得到执行的SQL语句，通过在invocation.proceed()方法前后时间相减得到查询的SQL执行时间。

