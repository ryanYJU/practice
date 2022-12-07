package lvpracticelast.infra;
import lvpracticelast.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class DeliveryInfoHateoasProcessor implements RepresentationModelProcessor<EntityModel<DeliveryInfo>>  {

    @Override
    public EntityModel<DeliveryInfo> process(EntityModel<DeliveryInfo> model) {

        
        return model;
    }
    
}
