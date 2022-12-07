package lvpracticelast.domain;

import lvpracticelast.domain.*;
import lvpracticelast.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private Long orderId;

    public OrderCanceled(OrderManagement aggregate){
        super(aggregate);
    }
    public OrderCanceled(){
        super();
    }
}
