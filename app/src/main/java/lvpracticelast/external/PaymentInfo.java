package lvpracticelast.external;

import lombok.Data;
import java.util.Date;
@Data
public class PaymentInfo {

    private Long id;
    private String orderId;
    private Integer totalAmount;
    private Boolean pgStateOk;
}


