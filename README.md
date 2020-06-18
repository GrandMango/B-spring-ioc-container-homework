## @Component ##
@Component 是类级别的注解，使用 @Component 标记一个类，Spring 会使用 Classpath 去扫描检测被标记的类, 只要工程中的 Classpath 包含这个类，Spring 就会
为这个类创建一个 bean。 但是当引入外部库， @Component 就无法找到该类。 也就是说 @Component 对 Bean 的声明和定义是耦合的， 而用
 @Bean 可以解耦。

## @Bean ##
@Bean 是方法级别的注解，该方法要返回一个对象，该对象就是我们要创建的 Bean，@Bean 使得 Bean 的声明与实现脱钩，
也就是说我们可以按照不同的需求去创建和配置Bean。 比如 写一个 switch 根据不同状态码 返回不同 Bean 对象。
除此之外 使用 @Bean 时必须在包含该方法的类上加 @Configuration。 之前使用 xml 来配置 Spring， 用这个注解就可以不用直接写 xml 了。

