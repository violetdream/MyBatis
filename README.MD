1、resultType（属性）和resultMap（标签引用）的区别？

resultType可自动将查询所对应的列值映射转换成为对像的属性；
resultMap可灵活配置所要映射成的属性名，可适用于复杂查询时用。

2、collection和association的区别？

collection 可实现对象属性一对多的查询
association 可实现对象

3、Statement和PreparedStatement的区别？
Statement执行方法是将写好的SQL语句直接做为参数，易出现SQL注入问题
PreparedStatement执行的SQL语句可用?作为占位符，可进行参数赋值，因其执行前会有预编译过程，所有执行效率更高。