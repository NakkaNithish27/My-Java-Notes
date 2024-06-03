# Springboot Notes

- Initialize spring boot project with spring initialilzer website

- `mvn spring-boot:run` command to run inbuilt tomcat server

-  Dependency Injection gives us the object whenever it is required, we don't have to create it, this helps us to achieve loose coupling	

```java
ConfigurableApplicationContext context = SpringApplication.run(SpringbootDemoApplication.class, args);

Alien a1= context.getBean(Alien.class);
```

- Inside JVM we have a special container called spring container, this container contains all the objects, we call them spring beans

- A spring bean has two diff scopes 
1) Singleton scope 
2) Prototype scope 
3) Request 
4) Session

- In above, the spring container is created/ initialized in context, in which all the objects/ beans are created when ***run*** method is executed

- @Component - specifies that we need this bean to be created in the container

- When we use `getBean()`, the object will be injected in to our application, which we call **dependency injection**

## Singleton Design Pattern 

```@Component```

The moment we start the application, all the objects will be created in the container by default
Only one instance for each class




## Prototype Scope

```
@Component
@Scope(value = "prototype")
```
- All the objects won't be created when we start the application
- Mutiple instances for a class can be created
Instance will be created only when we ask using `getBean()`, otherwise the spring container will be empty by default



- If one bean is dependent on another bean, we have to connect them using `@Autowired`
- The default name for any bean will be the same class name with all small letters 

    ex: laptop for Laptop

- By default `@Autowired` searches for the bean type

- `@Qualifier("name)` -  using this we can search the bean with its name instead of its type

- `@Component("customname")` - we can change default bean name like this


## Spring MVC

- Separation of Concerns
- Every servlet behaves like a controller and jsp is the view
- Dispatcher Servlet(front controller) is responsible to communicate with all the controllers


## Web App using spring boot

- We put all the jsp files in src>main>webapp folder, as it is auto configured

- jsp is a special type, when springboot came in to picture the focus was on rest api's

```java
@Controller 
public class HomeController {
    @RequestMapping("home")  // localhost:8080/home
    @ResponseBody  //Whatever you are returning is not page name, its data
    public String returnHomePage(){
        System.out.println("Hi");
        return "home.jsp" ; // returns home.jsp text only
    }
}
```

- To work with jsp files in springboot, we need to add tomcat jasper dependency from maven repository of version same as inbuilt 
tomcat server

- Now the spring boot knows how to convert jsp into servlet
