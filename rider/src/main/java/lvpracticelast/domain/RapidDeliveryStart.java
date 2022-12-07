package lvpracticelast.domain;

import lvpracticelast.domain.*;
import lvpracticelast.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class RapidDeliveryStart extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String shopAddress;
    private String shopTelNo;
    private String deliveryAddress;
    private String deliveryTelNo;
    private Boolean isRapidDelivery;
    private Integer state;

    public RapidDeliveryStart(DeliveryInfo aggregate){
        super(aggregate);
    }
    public RapidDeliveryStart(){
        super();
    }
}
