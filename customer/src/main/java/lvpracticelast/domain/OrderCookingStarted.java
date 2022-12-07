package lvpracticelast.domain;

import lvpracticelast.domain.*;
import lvpracticelast.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderCookingStarted extends AbstractEvent {

    private Long id;
    private Long orderId;
}


