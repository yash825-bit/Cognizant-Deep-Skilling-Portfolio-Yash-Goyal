# Exercise 4 – Creating and Configuring a Maven Project

## Objective
Learn how to create and configure a standard Maven project with Spring dependencies.

## What I Did
- Created a Maven Quickstart project.
- Changed groupId to `com.library`.
- Configured the package as `com.library`.
- Added Spring Context, Spring AOP, Spring WebMVC and AspectJ Weaver dependencies.
- Configured the Maven Compiler Plugin for Java 17.
- Reloaded the Maven project to download dependencies and plugins.

## Maven Project Structure

```text
LibraryManagement
├── pom.xml
└── src
    ├── main
    │   ├── java
    │   └── resources
    └── test
        ├── java
        └── resources
```

## Notes

### What is Maven?
A build automation and dependency management tool for Java projects.

### Why Maven?
- Automatic dependency download
- Standard project structure
- Build automation
- Easy dependency management

### What is pom.xml?
The Project Object Model file that stores project metadata, dependencies, plugins and build configuration.

### Dependency
A library required by your application (Spring, JUnit, MySQL Connector).

### Plugin
A tool used by Maven during the build process (Compiler Plugin, Surefire Plugin).

### Dependency vs Plugin
- Dependency → Used by your application.
- Plugin → Used by Maven to build your application.

### Transitive Dependency
Maven automatically downloads the dependencies required by another dependency by reading its own POM file.

### Local Repository
Windows:
`C:\Users\<username>\.m2\repository`

Stores downloaded dependencies and plugins.

### Maven Lifecycle
validate → compile → test → package → verify → install → deploy

### Reload Maven Project
1. Reads pom.xml
2. Downloads missing dependencies
3. Resolves transitive dependencies
4. Downloads plugins
5. Updates IntelliJ classpath

## Things I covered
- What is Maven?
- What is pom.xml?
- What is a dependency?
- What is a plugin?
- Difference between dependency and plugin?
- What is a transitive dependency?
- What happens when you reload a Maven project?
- What is the Maven Compiler Plugin?

## Key Takeaways
- Learned Maven project structure.
- Added Spring dependencies.
- Configured Maven Compiler Plugin.
- Understood repositories, lifecycle and dependency management.

# Exercise 5 – Configuring the Spring IoC Container

## Objective
Learn how the Spring IoC (Inversion of Control) Container creates, manages, and wires beans using XML configuration.

---

# What We Did

## 1. Created `applicationContext.xml`

Location:

```text
src/main/resources/applicationContext.xml
```

## 2. Registered Beans

```xml
<bean id="bookRepository"
      class="com.library.repository.BookRepository"/>

<bean id="bookService"
      class="com.library.service.BookService">

    <property
        name="bookRepository"
        ref="bookRepository"/>

</bean>
```

`<property>` performs **setter-based dependency injection**.

---

## 3. Implemented Classes

### BookRepository

```java
public class BookRepository {

    public void displayBooks() {
        System.out.println("Displaying books from repository...");
    }
}
```

### BookService

```java
public class BookService {

    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        System.out.println("BookService: Fetching books...");
        bookRepository.displayBooks();
    }
}
```

Spring automatically calls:

```java
bookService.setBookRepository(bookRepository);
```

---

## 4. Loaded the IoC Container

```java
ApplicationContext context =
    new ClassPathXmlApplicationContext("applicationContext.xml");

BookService service =
    context.getBean("bookService", BookService.class);

service.displayBooks();
```

---

# Concepts

## What is IoC?

Inversion of Control is a design principle where Spring takes responsibility for creating and managing objects instead of your application.

Without Spring:

```java
BookRepository repo = new BookRepository();
BookService service = new BookService();
service.setBookRepository(repo);
```

With Spring:

- You define configuration.
- Spring creates objects.
- Spring injects dependencies.

---

## What is Dependency Injection?

Dependency Injection is the technique Spring uses to implement IoC.

This exercise uses **Setter Injection**.

```xml
<property name="bookRepository"
          ref="bookRepository"/>
```

which is equivalent to

```java
bookService.setBookRepository(bookRepository);
```

---

## What is a Bean?

A Bean is an object whose lifecycle is managed by the Spring IoC Container.

Examples:
- BookService
- BookRepository

---

## What is ApplicationContext?

ApplicationContext is Spring's IoC Container implementation.

Responsibilities:

- Reads XML configuration
- Creates beans
- Injects dependencies
- Manages bean lifecycle
- Returns beans through `getBean()`

---

# Internal Working

```text
Main()
   │
   ▼
Loads applicationContext.xml
   │
   ▼
Spring IoC Container
   │
   ├── Creates BookRepository
   ├── Creates BookService
   └── Calls setBookRepository(bookRepository)
   │
   ▼
Returns fully initialized BookService bean
```

---

# Common Error Faced

## Error

```
FileNotFoundException:
class path resource [apllicationContext.xml] cannot be opened because it does not exist
```

### Cause

The filename was misspelled.

❌ apllicationContext.xml

✅ applicationContext.xml

Spring searches for the exact filename inside `src/main/resources`.

---

# Interview Notes

## IoC vs DI

| IoC | DI |
|-----|----|
| Design Principle | Technique |
| Spring controls object creation | Spring injects dependencies |

**Interview line:**

> Dependency Injection is one way to achieve Inversion of Control.

---

# Common Interview Questions

- What is IoC?
- What is the Spring IoC Container?
- What is a Bean?
- What is ApplicationContext?
- Difference between IoC and DI?
- What is Setter Injection?
- What does `<property>` do?
- Why is `applicationContext.xml` placed in `src/main/resources`?

---

# Key Takeaways

- Configured the Spring IoC Container.
- Registered beans using XML.
- Used Setter Injection.
- Loaded beans through ApplicationContext.
- Understood IoC, DI, Beans and ApplicationContext.
- Fixed a common configuration error caused by a misspelled XML filename.
