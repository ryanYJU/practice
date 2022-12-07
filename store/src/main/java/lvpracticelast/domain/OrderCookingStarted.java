package lvpracticelast.domain;

import lvpracticelast.domain.*;
import lvpracticelast.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderCookingStarted extends AbstractEvent {

    private Long id;
    private Long orderId;

    public OrderCookingStarted(OrderManagement aggregate){
        super(aggregate);
    }
    public OrderCookingStarted(){
        super();
    }
}
