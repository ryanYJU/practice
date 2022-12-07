package lvpracticelast.domain;

import lvpracticelast.domain.*;
import lvpracticelast.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String shopAddress;
    private String shopTelNo;
    private String deliveryAddress;
    private String deliveryTelNo;
    private Boolean isRapidDelivery;
    private Integer state;
}


