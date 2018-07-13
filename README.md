# 学习 Spring
已经学习完成的内容如下（持续更新中）

## 示例代码
* **fengw-hello**：Hello World
* **fengw-jdbc-template**：JdbcTemplate的使用
    * insert
    * update
    * query
* **fengw-named-parameter-jdbc-template**：NamedParameterJdbcTemplate的使用
    * insert
    * update
    * query
* **fengw-jta**：JTA分布式事务管理
* **fengw-configuration**：@Conditional注解条件化创建Bean
* **fengw-aop**：AOP面向切面编程
    * 前置通知 @Before（org.fengw.spring.advice）
    * 后置通知 @After
    * 返回通知 @AfterReturning
    * 异常通知 @AfterThrowing
    * 定义切点 @Pointcut
    * 环绕通知 @Around（org.fengw.spring.around）
    * 引入新方法 @DeclareParents（org.fengw.spring.declareparents）
* **fengw-scope**：Bean的作用域
    * 单例（Singleton）（org.fengw.spring.Singleton）
    * 原型（Prototype）]（org.fengw.spring.Prototype）
    * 会话（Session） --> 过后再学
    * 请求（Request） --> 过后再学
* **fengw-custom-exception**：自定义异常的事务回滚
    * 不能回滚：继承Exception并未指定@Transactional的rollbackFor属性
    * 可以回滚：继承Exception并已指定@Transactional的rollbackFor属性
    * 可以回滚：继承RuntimeException并未指定@Transactional的rollbackFor属性
    * 可以回滚：继承RuntimeException并已指定@Transactional的rollbackFor属性
* **fengw-jpa**：JPA
    * 使用注解方式进行RUD操作，不支持C操作
    * 使用实体类方式进行CUD、批量C、回滚操作
