package lvpracticelast.domain;

import lvpracticelast.domain.*;
import lvpracticelast.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;

    public OrderCanceled(OrderInfo aggregate){
        super(aggregate);
    }
    public OrderCanceled(){
        super();
    }
}
