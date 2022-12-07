package lvpracticelast.domain;

import lvpracticelast.domain.*;
import lvpracticelast.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderCompleted extends AbstractEvent {

    private Long id;

    public OrderCompleted(OrderInfo aggregate){
        super(aggregate);
    }
    public OrderCompleted(){
        super();
    }
}
