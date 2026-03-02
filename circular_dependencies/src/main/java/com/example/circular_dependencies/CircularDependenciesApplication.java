package com.example.circular_dependencies;

/*
 * In modern Spring versions:
 *
 * 1. Circular Dependencies:
 *    - To allow circular dependencies using setter or field injection, you must explicitly enable:
 *        spring.main.allow-circular-references = true
 *    - Note: Circular dependencies cannot be resolved with constructor injection.
 *
 * 2. Constructor Injection:
 *    - If a class has only one constructor, you do not need to annotate it with @Autowired.
 *    - Spring Boot automatically detects and uses it.
 *
 * 3. Lazy Initialization:
 *    - Annotate the instance variable inside the constructor with @Lazy that will do the trick, this is called using the @Lazy with dependency
 *    - So the lazy dependencies will not be created instead a proxy will be inserted and the object is created with proxy
 *    - And now other beans can be created without any problems
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CircularDependenciesApplication {
	/*
		Only lazy initialization and refactoring are two valid approaches according to the spring
		other wise if we use feild injection or setter injection in both the cases we still would get
		error at the startup that there are circular dependencies in the project

		In order to resolve them we need to have this property set in the propeties file 
		spring.main.allow-circular-references = true
	
	*/
	public static void main(String[] args) {
		SpringApplication.run(CircularDependenciesApplication.class, args);
	}




}
