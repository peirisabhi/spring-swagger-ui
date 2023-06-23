# Spring Swagger UI

This repository contains an example project showcasing the usage of Swagger UI with a Spring Boot application. It demonstrates how to integrate Swagger UI to document and test your RESTful APIs in a Spring Boot project.

## Prerequisites

Before running this example, ensure that you have the following installed:

- Java Development Kit (JDK) 8 or later
- Maven

## Getting Started

To get started with this example, follow these steps:

1. Clone the repository:

   ```shell
   git clone https://github.com/peirisabhi/spring-swagger-ui.git
   ```

2. Navigate to the project directory:

   ```shell
   cd spring-swagger-ui
   ```

3. Build the project using Maven:

   ```shell
   mvn clean package
   ```

4. Run the application:

   ```shell
   mvn spring-boot:run
   ```

5. The application should now be running locally at `http://localhost:8081`. You can access the Swagger UI documentation and test your APIs.

## Swagger UI

Swagger UI provides a user-friendly interface to browse and test your RESTful APIs. Once the application is running, you can access the Swagger UI by opening the following URL in your web browser:

```
http://localhost:8081/swagger-ui/index.html
```

This will open the Swagger UI page, where you can explore the available endpoints, send requests, and view the responses.

## Configuration

The Swagger UI configuration for this example can be found in the `SwaggerConfig.java` file. You can modify the configuration according to your project requirements.

```java
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
		        .apis(RequestHandlerSelectors.basePackage("com.abhipeiris.springswaggerui"))
                .paths(PathSelectors.any())
                .build();
    }

}
```

You can customize the package to scan for API controllers and define specific paths to include or exclude from the documentation.

## Usage

This example project includes a sample RESTful API (`com.abhipeiris.springswaggerui`) to demonstrate the usage of Swagger UI. You can modify the existing API or add your own API controllers to document and test them using Swagger UI.

Feel free to explore the code and modify it to suit your needs. The code is extensively documented to help you understand each step and the purpose of different components.

## Contributing

Contributions to this project are welcome. If you find any issues or have ideas for improvements, please open an issue or submit a pull request.


## Contact

For any questions or feedback, please contact:

Abhishek Peiris
- Email: abhishekpeiris9@gmail.com
- GitHub: [@peirisabhi](https://github.com/peirisabhi)
