package de.itout.test.hello;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;

/**
 * Application
 */
@OpenAPIDefinition(info = @Info(title = "Hello API", version = "1", description = "Hello World"))
public class Application extends javax.ws.rs.core.Application {

}