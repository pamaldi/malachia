# Malachia

Malachia is a Java Quarkus langchain4j project focused on implementing agentic application defining graph.


## Malachia

Malachia is a fictional character in Umberto Eco's novel The Name of the Rose. He is the abbey's librarian and the only one with access 
to the labyrinthine library, holding the secrets of its layout and organization.
He is portrayed as suspicious of outsiders and fiercely protective of the library's contents.

## Table of Contents

- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Building and Running](#building-and-running)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Project Structure



## Technologies Used

- Java
- Quarkus
- Langchaing4j
- Maven

## Getting Started

### Prerequisites

Ensure you have the following installed:

- Java 21 or higher
- Maven 3.6.3 or higher



## Contributing

We welcome contributions! Please follow these steps to contribute:
Fork the repository.
Create a new branch (git checkout -b feature-branch).
Commit your changes (git commit -am 'Add new feature').
Push to the branch (git push origin feature-branch).
Create a new Pull Request.

## License

This project is licensed under the MIT License. See the LICENSE file for details.
Feel free to reach out for any questions or support regarding the Malachia project. Enjoy experimenting with LLM agents
using Quarkus and Langchaing4j!




## Malachia and quarkus.

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: <https://quarkus.io/>.



## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at <http://localhost:8080/q/dev/>.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.jar.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/malachia-1.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult <https://quarkus.io/guides/maven-tooling>.
