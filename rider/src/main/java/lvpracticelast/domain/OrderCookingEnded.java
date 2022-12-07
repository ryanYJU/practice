package lvpracticelast.domain;

import lvpracticelast.domain.*;
import lvpracticelast.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderCookingEnded extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String address;
    private Boolean isRapidDelivery;
}


