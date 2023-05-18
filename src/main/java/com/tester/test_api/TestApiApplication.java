package com.tester.test_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

/**
 * TestApiApplication is the entry point for the Hello World API application.
 */
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Hello World API", version = "1.0.0"))
public final class TestApiApplication {
private TestApiApplication() {

}
/**
* Main method to start the TestApiApplication.
*
* @param args Command line arguments
*/
public static void main(final String[] args) {
SpringApplication.run(TestApiApplication.class, args);
}
}
