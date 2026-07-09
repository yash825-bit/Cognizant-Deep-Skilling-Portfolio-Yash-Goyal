# JUnit & Mockito Interview Notes

## JUnit

### What is JUnit?

JUnit is a **Java testing framework** used to write and execute **unit
tests**. It verifies that individual methods or classes behave as
expected.

### Why use JUnit?

-   Automates testing
-   Detects bugs early
-   Prevents regressions
-   Supports Test Driven Development (TDD)
-   Improves code quality

### Unit Testing

Testing **one unit** (usually one method) in isolation.

``` java
public int add(int a, int b){
    return a + b;
}
```

### Common JUnit Annotations

Annotation       Purpose
  ---------------- ----------------------------------
`@Test`          Marks a test method
`@Before`        Runs before every test (JUnit 4)
`@After`         Runs after every test
`@BeforeClass`   Runs once before all tests
`@AfterClass`    Runs once after all tests
`@Ignore`        Skips a test

### JUnit 5 Equivalents

JUnit 4          JUnit 5
  ---------------- ---------------
`@Before`        `@BeforeEach`
`@After`         `@AfterEach`
`@BeforeClass`   `@BeforeAll`
`@AfterClass`    `@AfterAll`

### Assertions

Common assertions:

-   `assertEquals()`
-   `assertNotEquals()`
-   `assertTrue()`
-   `assertFalse()`
-   `assertNull()`
-   `assertNotNull()`
-   `assertSame()`
-   `assertNotSame()`
-   `assertArrayEquals()`
-   `assertThrows()`

Example:

``` java
assertEquals(5, calculator.add(2, 3));
```

### AAA Pattern

-   **Arrange** -- Prepare objects and test data.
-   **Act** -- Execute the method being tested.
-   **Assert** -- Verify the expected result.

Example:

``` java
Calculator c = new Calculator();   // Arrange

int result = c.add(2, 3);          // Act

assertEquals(5, result);           // Assert
```

### Test Fixture

Common setup required before tests.

``` java
@Before
public void setUp() {
    calculator = new Calculator();
}
```

### Test Lifecycle

    @Before
       ↓
    @Test
       ↓
    @After

Runs for every test method.

### Advantages

-   Free & Open Source
-   Easy Maven/Gradle integration
-   IDE support
-   Automated testing
-   Better maintainability

------------------------------------------------------------------------

# Mockito

### What is Mockito?

Mockito is a **mocking framework** used with JUnit to create **fake
objects (mocks)** for testing dependencies in isolation.

### Why Mockito?

Without Mockito:

    StudentService
          ↓
    StudentRepository
          ↓
    Database

With Mockito:

    StudentService
          ↓
    Mock Repository

No real database is needed.

### Mock Object

Creates a fake implementation of a dependency.

``` java
ExternalApi api = mock(ExternalApi.class);
```

### Stubbing

Defines mock behavior.

``` java
when(api.getData()).thenReturn("Mock Data");
```

### Verification

Checks whether a method was called.

``` java
verify(repository).save(student);
```

### Common Mockito Methods

Method           Purpose
  ---------------- ----------------------------------
`mock()`         Creates a fake object
`when()`         Defines behavior
`thenReturn()`   Returns a predefined value
`verify()`       Verifies interaction
`times()`        Verifies call count
`never()`        Verifies method was never called
`any()`          Matches any argument

### Common Mockito Annotations

Annotation       Purpose
  ---------------- -----------------------------------------
`@Mock`          Creates a mock object
`@InjectMocks`   Injects mocks into the class under test
`@Spy`           Creates a partial mock
`@Captor`        Captures method arguments

### JUnit vs Mockito

JUnit               Mockito
  ------------------- -------------------------------
Testing framework   Mocking framework
Runs tests          Creates fake objects
Uses assertions     Mocks & verifies dependencies
`@Test`             `@Mock`
`assertEquals()`    `when()`, `verify()`

### Common Interview Questions

**What is JUnit?**\
A Java framework for writing and running unit tests.

**What is Unit Testing?**\
Testing an individual method or class independently.

**What is an Assertion?**\
A comparison between expected and actual results.

**What is AAA?**\
Arrange → Act → Assert.

**Difference between `@Before` and `@BeforeClass`?** - `@Before` runs
before every test. - `@BeforeClass` runs once before all tests.

**What is Mockito?**\
A Java mocking framework used to create fake dependencies for testing.

**What is Mocking?**\
Creating fake objects that simulate real dependencies.

**What is Stubbing?**\
Defining a mock's behavior using `when(...).thenReturn(...)`.

**What is Verification?**\
Checking that a mock method was invoked using `verify()`.

**Difference between Mock and Stub?** - **Stub:** Returns predefined
values. - **Mock:** Returns values and verifies interactions.

### Key Methods to Remember

#### JUnit

``` java
@Test
@Before
@After

assertEquals()
assertTrue()
assertFalse()
assertNull()
assertNotNull()
assertThrows()
```

#### Mockito

``` java
mock()

when()

thenReturn()

verify()

times()

never()

any()
```

### Interview Summary

> **JUnit** is used to write and execute unit tests, while **Mockito**
> is used to mock dependencies so that a class can be tested in
> isolation. They are commonly used together in Spring Boot and
> enterprise Java applications.