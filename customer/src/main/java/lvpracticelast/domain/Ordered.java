package lvpracticelast.domain;

import lvpracticelast.domain.*;
import lvpracticelast.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Ordered extends AbstractEvent {

    private Long id;
    private String menu;
    private Integer count;
    private Long totalAmount;
}


