package lvpracticelast.domain;

import lvpracticelast.domain.*;
import lvpracticelast.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class PaymentApproved extends AbstractEvent {

    private Long id;
    private String orderId;
    private Integer totalAmount;

    public PaymentApproved(PaymentInfo aggregate){
        super(aggregate);
    }
    public PaymentApproved(){
        super();
    }
}
