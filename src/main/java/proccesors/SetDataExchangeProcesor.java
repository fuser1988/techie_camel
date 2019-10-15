package proccesors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class SetDataExchangeProcesor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
//        System.out.println("1. Body in = " + exchange.getIn().getBody());
        exchange.getMessage().setBody("Mensaje a procesar");
        exchange.getMessage().setHeader("cabecera1","valor cabecera1");
    }
    
}
