package lvpracticelast.domain;

import lvpracticelast.domain.*;
import lvpracticelast.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryCompleted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Boolean isRapidDelivery;
    private Integer state;

    public DeliveryCompleted(DeliveryInfo aggregate){
        super(aggregate);
    }
    public DeliveryCompleted(){
        super();
    }
}
