package lvpracticelast.domain;

import lvpracticelast.domain.결제승인됨;
import lvpracticelast.domain.PaymentApproved;
import lvpracticelast.domain.PaymentCanceled;
import lvpracticelast.PayApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="PaymentInfo_table")
@Data

public class PaymentInfo  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private Integer totalAmount;
    
    
    
    
    
    private Boolean pgStateOk;

    @PrePersist
    public void onPrePersist(){


        결제승인됨 결제승인됨 = new 결제승인됨(this);
        결제승인됨.publishAfterCommit();



        PaymentApproved paymentApproved = new PaymentApproved(this);
        paymentApproved.publishAfterCommit();



        PaymentCanceled paymentCanceled = new PaymentCanceled(this);
        paymentCanceled.publishAfterCommit();

    }

    public static PaymentInfoRepository repository(){
        PaymentInfoRepository paymentInfoRepository = PayApplication.applicationContext.getBean(PaymentInfoRepository.class);
        return paymentInfoRepository;
    }




    public static void paymentCancel(OrderCanceled orderCanceled){

        /** Example 1:  new item 
        PaymentInfo paymentInfo = new PaymentInfo();
        repository().save(paymentInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(paymentInfo->{
            
            paymentInfo // do something
            repository().save(paymentInfo);


         });
        */

        
    }
    public static void paymentCancel(OrderCanceled orderCanceled){

        /** Example 1:  new item 
        PaymentInfo paymentInfo = new PaymentInfo();
        repository().save(paymentInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(paymentInfo->{
            
            paymentInfo // do something
            repository().save(paymentInfo);


         });
        */

        
    }


}
