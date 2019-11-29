
package ar.pnt.techie_camel;

import java.util.ArrayList;
import model.Feriado;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class InamoviblesFilter implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.print(exchange.getMessage().getBody(String.class));
        exchange.getMessage().setBody("mensaje filtrado");
        exchange.getMessage().setHeader("cabecera1","valor cabecera1");
    }
    
}
