package lvpracticelast.domain;

import lvpracticelast.domain.*;
import lvpracticelast.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderCookingEnded extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String address;
    private Boolean isRapidDelivery;

    public OrderCookingEnded(OrderManagement aggregate){
        super(aggregate);
    }
    public OrderCookingEnded(){
        super();
    }
}
