package lvpracticelast.domain;

import lvpracticelast.domain.배달시작됨;
import lvpracticelast.domain.OrderAccepted;
import lvpracticelast.domain.OrderCanceled;
import lvpracticelast.domain.OrderCookingStarted;
import lvpracticelast.domain.OrderCookingEnded;
import lvpracticelast.domain.쿠폰발행됨;
import lvpracticelast.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="OrderManagement_table")
@Data

public class OrderManagement  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long orderId;
    
    
    
    
    
    private String address;
    
    
    
    
    
    private Integer state;
    
    
    
    
    
    private Boolean isRapidDelivery;

    @PostPersist
    public void onPostPersist(){


        배달시작됨 배달시작됨 = new 배달시작됨(this);
        배달시작됨.publishAfterCommit();



        OrderAccepted orderAccepted = new OrderAccepted(this);
        orderAccepted.publishAfterCommit();



        OrderCanceled orderCanceled = new OrderCanceled(this);
        orderCanceled.publishAfterCommit();



        OrderCookingStarted orderCookingStarted = new OrderCookingStarted(this);
        orderCookingStarted.publishAfterCommit();



        OrderCookingEnded orderCookingEnded = new OrderCookingEnded(this);
        orderCookingEnded.publishAfterCommit();

    }
    @PrePersist
    public void onPrePersist(){


        쿠폰발행됨 쿠폰발행됨 = new 쿠폰발행됨(this);
        쿠폰발행됨.publishAfterCommit();

    }
    @PreUpdate
    public void onPreUpdate(){
    }

    public static OrderManagementRepository repository(){
        OrderManagementRepository orderManagementRepository = StoreApplication.applicationContext.getBean(OrderManagementRepository.class);
        return orderManagementRepository;
    }




    public static void orderReceive(PaymentApproved paymentApproved){

        /** Example 1:  new item 
        OrderManagement orderManagement = new OrderManagement();
        repository().save(orderManagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(paymentApproved.get???()).ifPresent(orderManagement->{
            
            orderManagement // do something
            repository().save(orderManagement);


         });
        */

        
    }
    public static void orderCancel(PaymentCanceled paymentCanceled){

        /** Example 1:  new item 
        OrderManagement orderManagement = new OrderManagement();
        repository().save(orderManagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(paymentCanceled.get???()).ifPresent(orderManagement->{
            
            orderManagement // do something
            repository().save(orderManagement);


         });
        */

        
    }
    public static void orderComplete(OrderCompleted orderCompleted){

        /** Example 1:  new item 
        OrderManagement orderManagement = new OrderManagement();
        repository().save(orderManagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCompleted.get???()).ifPresent(orderManagement->{
            
            orderManagement // do something
            repository().save(orderManagement);


         });
        */

        
    }


}
