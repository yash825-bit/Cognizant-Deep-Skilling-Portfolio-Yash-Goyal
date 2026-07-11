# LibraryManagement - Exercise 1: Configuring a Basic Spring Application

## Objective

Learn the fundamentals of **Spring Core** by creating a simple Maven
project, configuring the Spring IoC container using XML, defining beans,
and loading them from the application context.

------------------------------------------------------------------------

# Technologies Used

-   Java 17
-   Maven
-   Spring Framework (`spring-context`)
-   IntelliJ IDEA

------------------------------------------------------------------------

# Project Structure

``` text
LibraryManagement
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.library
│   │   │       ├── Main.java
│   │   │       ├── service
│   │   │       │     └── BookService.java
│   │   │       └── repository
│   │   │             └── BookRepository.java
│   │   │
│   │   └── resources
│   │         └── applicationContext.xml
│   │
│   └── test
│
└── pom.xml
```

------------------------------------------------------------------------

# Dependencies

``` xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>6.2.8</version>
</dependency>
```

> `spring-context` automatically brings in: - spring-core -
> spring-beans - spring-expression - spring-jcl

------------------------------------------------------------------------

# What We Implemented

## 1. Created a Maven Project

Created a plain Maven project named **LibraryManagement**.

## 2. Added Spring Core Dependency

Added `spring-context` to enable the Spring IoC container.

## 3. Created `applicationContext.xml`

Configured the Spring container using XML.

``` xml
<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
       http://www.springframework.org/schema/beans
       https://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="bookRepository"
          class="com.library.repository.BookRepository"/>

    <bean id="bookService"
          class="com.library.service.BookService"/>

</beans>
```

## 4. Created Bean Classes

-   `BookService`
-   `BookRepository`

## 5. Loaded Spring Context

``` java
ApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext.xml");

BookService service =
        context.getBean("bookService", BookService.class);

service.displayService();
```

------------------------------------------------------------------------

# Output

``` text
BookService bean is created.
```

------------------------------------------------------------------------

# Key Concepts

## Spring Framework

Spring is a lightweight Java framework used for building enterprise
applications.

Core features include:

-   Dependency Injection (DI)
-   Inversion of Control (IoC)
-   Aspect-Oriented Programming (AOP)
-   Spring MVC
-   Spring Boot
-   Data Access
-   Security

------------------------------------------------------------------------

## Spring Core

Spring Core is the foundation of the Spring Framework.

It provides:

-   IoC Container
-   Bean Management
-   Dependency Injection support
-   Configuration using XML, Java Config, or Annotations

------------------------------------------------------------------------

## IoC (Inversion of Control)

Traditional Java:

``` java
BookService service = new BookService();
```

The application creates the object.

Spring:

``` java
BookService service =
context.getBean("bookService", BookService.class);
```

Spring creates and manages the object.

This inversion of responsibility is called **Inversion of Control
(IoC)**.

------------------------------------------------------------------------

## IoC Container

The IoC Container:

-   Creates objects (Beans)
-   Stores them
-   Configures them
-   Manages their lifecycle
-   Injects dependencies (covered in the next exercise)

Two implementations:

-   BeanFactory (basic)
-   ApplicationContext (recommended)

------------------------------------------------------------------------

## Bean

A Bean is simply a Java object whose lifecycle is managed by Spring.

Example:

``` xml
<bean id="bookService"
      class="com.library.service.BookService"/>
```

-   `id` → Unique bean name
-   `class` → Fully qualified class name

------------------------------------------------------------------------

## ApplicationContext

`ApplicationContext` is the most commonly used Spring IoC container.

Responsibilities:

-   Reads XML configuration
-   Creates beans
-   Manages beans
-   Returns beans when requested

Example:

``` java
ApplicationContext context =
new ClassPathXmlApplicationContext("applicationContext.xml");
```

------------------------------------------------------------------------

## applicationContext.xml

This XML file tells Spring:

-   Which classes are beans
-   Bean IDs
-   Bean configuration
-   (Later) Dependency Injection configuration

------------------------------------------------------------------------

# Interview Questions

### 1. What is Spring Framework?

A lightweight Java framework that simplifies enterprise application
development using IoC and Dependency Injection.

------------------------------------------------------------------------

### 2. What is Spring Core?

The core module that provides the IoC container and bean management.

------------------------------------------------------------------------

### 3. What is a Bean?

A Java object managed by the Spring container.

------------------------------------------------------------------------

### 4. What is IoC?

Inversion of Control means object creation and lifecycle management are
handled by Spring instead of the application.

------------------------------------------------------------------------

### 5. What is ApplicationContext?

An implementation of the Spring IoC container that creates, configures,
and manages beans.

------------------------------------------------------------------------

### 6. Difference between BeanFactory and ApplicationContext?

  -----------------------------------------------------------------------
BeanFactory                 ApplicationContext
  --------------------------- -------------------------------------------
Basic IoC container         Advanced IoC container

Lazy initialization by      Eager singleton initialization by default
default

Limited enterprise features Supports events, internationalization,
resource loading, etc.

Rarely used                 Most commonly used
-----------------------------------------------------------------------

------------------------------------------------------------------------

### 7. Why use `spring-context` instead of only `spring-core`?

Because `spring-context` includes the IoC container
(`ApplicationContext`) and transitively brings in `spring-core`,
`spring-beans`, and other required modules.

------------------------------------------------------------------------

# Key Takeaways

-   Created a Maven-based Spring Core project.
-   Configured Spring using XML.
-   Defined beans in `applicationContext.xml`.
-   Loaded the Spring IoC container.
-   Retrieved a bean using `ApplicationContext`.
-   Understood the basics of IoC and bean management.
