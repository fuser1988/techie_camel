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
        .log("Disparando procesamiento")
        .setHeader("Cabecera1",constant("valor cabecera1"))
        .setBody(constant("Mensaje a procesar"))
        .to("direct:procesarMensaje")
        .end();

        from("direct:procesarMensaje")
        .log("Inicio procesamiento de mensaje")
        .log("Body = ${body} , cabecera1 = ${header.cabecera1}")
        .end();
        
    }
}
