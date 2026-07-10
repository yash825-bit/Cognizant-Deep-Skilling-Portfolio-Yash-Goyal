# Simple Logging Facade for Java (SLF4J)

A beginner-friendly project demonstrating how to use **SLF4J (Simple Logging Facade for Java)** in a Maven-based Java application.

This project is part of my **Cognizant Deep Skilling Portfolio**, where I practice Java backend development concepts using industry-standard tools and frameworks.

---

## 📌 Objective

The objective of this project is to understand:

- Why logging is important in Java applications
- How SLF4J acts as a logging abstraction
- Configuring SLF4J with Logback
- Different logging levels
- Best practices for writing log messages

---

## 🛠️ Tech Stack

- Java 17+
- Maven
- SLF4J
- Logback
- IntelliJ IDEA

---

## 📂 Project Structure

```
SimpleLoggingFacadeForJava_SLF4J
│
├── src
│   ├── main
│   │   └── java
│   └── test
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

---

## 📚 Concepts Covered

- Introduction to Logging
- SLF4J Architecture
- Logger Creation
- LoggerFactory
- Logging Levels
    - TRACE
    - DEBUG
    - INFO
    - WARN
    - ERROR
- Console Logging
- Logback Configuration

---

## 🚀 Example

```java
private static final Logger logger =
        LoggerFactory.getLogger(Logging.class);

logger.error("This is an error message");
logger.warn("This is a warning message");
logger.info("This is an information message");
logger.debug("This is a debug message");
logger.trace("This is a trace message");
```

---

## ▶️ Running the Project

Clone the repository

```bash
git clone https://github.com/yash825-bit/Cognizant-Deep-Skilling-Portfolio-Yash-Goyal.git
```

Navigate to the project

```bash
cd DeepSkilling/SimpleLoggingFacadeForJava_SLF4J
```

Run using Maven

```bash
mvn spring-boot:run
```

or

```bash
./mvnw spring-boot:run
```

---

## 📖 Learning Outcomes

After completing this project, I learned:

- How logging differs from using `System.out.println()`
- How SLF4J provides a common logging API
- How Logback implements the SLF4J API
- How to write maintainable log statements
- The importance of different log levels in production applications

---

## 🎯 Future Enhancements

- Logging Exceptions
- Parameterized Logging
- File-based Logging
- Rolling Log Files
- Logging Patterns
- Custom Logback Configuration
- Logging in Spring Boot Applications

---

## 👨‍💻 Author

**Yash Goyal**

B.Tech Computer Science Engineering  
GLA University

GitHub: https://github.com/yash825-bit

---

## 📄 License

This project is developed for educational purposes as part of the Cognizant Deep Skilling Program.