# 学习 Spring
已经学习完成的内容如下（持续更新中）

## 示例代码
* Hello World（org.fengw.spring.hello）
* JdbcTemplate的使用（org.fengw.spring.jdbctemplate）
    * insert
    * update
    * query
* NamedParameterJdbcTemplate的使用（org.fengw.spring.namedparameterjdbctemplate）
    * insert
    * update
    * query
* JTA分布式事务管理（org.fengw.spring.jta）
* @Conditional注解条件化创建Bean（org.fengw.spring.configuration）
* AOP面向切面编程（org.fengw.spring.aop）
    * 前置通知 @Before（org.fengw.spring.aop.advice）
    * 后置通知 @After
    * 返回通知 @AfterReturning
    * 异常通知 @AfterThrowing
    * 定义切点 @Pointcut
    * 环绕通知 @Around（org.fengw.spring.aop.around）
    * 引入新方法 @DeclareParents（org.fengw.spring.aop.declareparents）
* Bean的作用域（org.fengw.spring.scope）
    * 单例（Singleton）（org.fengw.spring.scope.Singleton）
    * 原型（Prototype）]（org.fengw.spring.scope.Prototype）
    * 会话（Session） --> 过后再学
    * 请求（Request） --> 过后再学
* 自定义异常的事务回滚（org.fengw.spring.customexception）
    * 不能回滚：继承Exception并未指定@Transactional的rollbackFor属性
    * 可以回滚：继承Exception并已指定@Transactional的rollbackFor属性
    * 可以回滚：继承RuntimeException并未指定@Transactional的rollbackFor属性
    * 可以回滚：继承RuntimeException并已指定@Transactional的rollbackFor属性
* JPA（org.fengw.spring.jpa）
    * 使用注解方式进行RUD操作，不支持C操作
    * 使用实体类方式进行CUD、批量C、回滚操作

## 运行示例
* [JUnit测试类直接运行即可]（org.fengw.spring.test）
