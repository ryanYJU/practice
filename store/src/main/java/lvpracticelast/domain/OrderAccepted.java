package lvpracticelast.domain;

import lvpracticelast.domain.*;
import lvpracticelast.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderAccepted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String address;

    public OrderAccepted(OrderManagement aggregate){
        super(aggregate);
    }
    public OrderAccepted(){
        super();
    }
}
