package ar.pnt.techie_camel;

import model.Feriado;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;


public class MyRouteBuilder extends RouteBuilder {
    

    public void configure() {
          from("timer:simple?period=1000").to("direct:start");

        
        from("direct:start").to("https://apiday.somospnt.com/api/feriados/2019")
        .unmarshal().json(JsonLibrary.Jackson, Feriado.class)        
        .log("=============")
//        .process(new InamoviblesFilter())
        .log("Body = ${body} , cabecera1 = ${header.cabecera1}")
        .end();
        
    }
}
