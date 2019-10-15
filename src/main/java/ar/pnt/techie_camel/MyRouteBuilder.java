package ar.pnt.techie_camel;

import org.apache.camel.Message;
import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java8 DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {
    
    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {
        // here is a sample which set a raondom body then performs content
        // based routing on the message using method references

        from("timer:simple?period=1000")        
        .log("procesando mensage")                 // log("Body = ${body}")
        .end();        
    }
}
