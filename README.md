# Java Kata Template

This is a template project for performing katas in Java 21 using Maven, JUnit 5.11.0, and AssertJ 3.24.2.

## Requirements

- Java 21
- Maven 3.8.1 or higher

## Project Structure

The project follows the standard Maven structure:

```
├── pom.xml
├── src
│   ├── main
│   │   └── java
│   │       └── name_kata
│   │           └── NameKata.java
│   └── test
│       └── java
│           └── NameKataTest.java
└── .gitignore
```

## Dependencies

The main dependencies of the project are:

- JUnit 5.11.0
- AssertJ 3.24.2

These dependencies are defined in the `pom.xml` file.

## Compile and Run Tests

To compile the project and run the tests, use the following Maven commands:

```sh
mvn clean compile
mvn test
```

## Contributing

If you wish to contribute to this project, please open an issue or a pull request in the repository.

## License

This project is licensed under the `MIT License`.
