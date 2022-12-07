package lvpracticelast.infra;
import lvpracticelast.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class PaymentInfoHateoasProcessor implements RepresentationModelProcessor<EntityModel<PaymentInfo>>  {

    @Override
    public EntityModel<PaymentInfo> process(EntityModel<PaymentInfo> model) {

        
        return model;
    }
    
}
