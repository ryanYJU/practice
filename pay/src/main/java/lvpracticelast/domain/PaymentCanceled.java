package lvpracticelast.domain;

import lvpracticelast.domain.*;
import lvpracticelast.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class PaymentCanceled extends AbstractEvent {

    private Long id;
    private String orderId;

    public PaymentCanceled(PaymentInfo aggregate){
        super(aggregate);
    }
    public PaymentCanceled(){
        super();
    }
}
