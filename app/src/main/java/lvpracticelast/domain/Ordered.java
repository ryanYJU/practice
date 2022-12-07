package lvpracticelast.domain;

import lvpracticelast.domain.*;
import lvpracticelast.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Ordered extends AbstractEvent {

    private Long id;
    private String menu;
    private Integer count;
    private Long totalAmount;

    public Ordered(OrderInfo aggregate){
        super(aggregate);
    }
    public Ordered(){
        super();
    }
}
