# Frequently Asked Questions

## General Questions

### What is this project about?
This is a collection of Java projects designed to help developers learn and practice Java programming concepts through practical examples.

### Who is this for?
- Students learning Java
- Developers looking to improve their Java skills
- Anyone interested in practical Java programming examples

## Technical Questions

### What version of Java is required?
We recommend using Java 11 or later for all projects in this repository.

### How do I report bugs?
You can report bugs by creating an issue on our [GitHub repository](https://github.com/Sumangal44/javaprojects/issues).

### Can I contribute?
Yes! We welcome contributions. Please see our [Contributing Guide](/contributing) for more information.

## Project-Specific Questions

### Calculator Project
::: details How do I handle decimal numbers?
The Calculator class uses `double` for all calculations, so decimal numbers are handled automatically.
```java
Calculator calc = new Calculator();
double result = calc.divide(10.5, 2); // Returns 5.25
```
:::

### Student Management System
::: details How is data stored?
The Student Management System uses a simple file-based storage system by default, but can be configured to use a database.
:::

### Banking System
::: details Is the system secure?
The Banking System implements basic security measures including:
- Input validation
- Error handling
- Transaction logging
:::