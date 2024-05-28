//Initialize spring boot project with spring initialilzer website

mvn spring-boot:run //command to run inbuilt tomcat server

/* Dependency Injection gives us the object whenever it is required, we don't have to create it, this helps us to achieve loose coupling*/		

ConfigurableApplicationContext context = SpringApplication.run(SpringbootDemoApplication.class, args);

Alien a1= context.getBean(Alien.class);

//Inside JVM we have a special container called spring container, this container contains all the objects, we call them spring beans

//A spring bean has two diff scopes 1) Singleton scope 2) Prototype scope 3) Request 4) Session

/*In above, the spring container is created/ initialized in context, in which all the objects/ beans are created when run method is executed*/

/* @Component - specifies that we need this bean to be created in the container*/

/*When we use getBean(), the object will be injected in to our application, which we call dependency injection*/

/* Singleton Design Pattern - 

@Component
The moment we start the application, all the objects will be created in the container by default
Only one instance for each class

*/


/* Prototype Scope

@Component
@Scope(value = "prototype")
All the objects won't be created when we start the application
Mutiple instances for a class can be created
Instance will be created only when we ask using getBean(), otherwise the spring container will be empty by default

*/

/* If one bean is dependent on another bean, we have to connect them using @Autowired
The default name for any bean will be the same class name with all small letters ex: laptop for Laptop
By default @Autowired searches for the bean type
@Qualifier("name) -  using this we can search the bean with its name instead of its type
@Component("customname") - we can change default bean name like this
*/
