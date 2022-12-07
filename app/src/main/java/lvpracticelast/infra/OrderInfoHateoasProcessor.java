package lvpracticelast.infra;
import lvpracticelast.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class OrderInfoHateoasProcessor implements RepresentationModelProcessor<EntityModel<OrderInfo>>  {

    @Override
    public EntityModel<OrderInfo> process(EntityModel<OrderInfo> model) {

        
        return model;
    }
    
}
