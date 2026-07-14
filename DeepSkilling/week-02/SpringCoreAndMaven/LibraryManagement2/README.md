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

## Interview Questions
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
