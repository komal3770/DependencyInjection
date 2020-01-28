# Dependency Injection Example

In this Example, demonstrated dependency injection user Spring IOC containers BeanFactory and ApplicationContext with latest updated methods & Demonstrated types of injections.

## 1.Contructor-based Dependency Injection
``` It is accomplished when the container invokes a class constructor with a number of arguments, each representing a dependency on other classes.```

## 2.Setter Method based Dependency Injection
``` For setter-based DI, the container will call setter methods of our class, after invoking a no-argument constructor or no-argument static factory method to instantiate the bean.```

**Q - What happen if both are called at the same time?**

*Ans - Setter injection overrides constructor injection.*
