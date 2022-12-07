package lvpracticelast.domain;

import lvpracticelast.domain.주문됨;
import lvpracticelast.domain.Ordered;
import lvpracticelast.domain.OrderCompleted;
import lvpracticelast.domain.주문취소됨;
import lvpracticelast.domain.OrderCanceled;
import lvpracticelast.AppApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="OrderInfo_table")
@Data

public class OrderInfo  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String menu;
    
    
    
    
    
    private Integer count;
    
    
    
    
    
    private Long totalAmount;
    
    
    
    
    
    private Boolean isRapidDelivery;

    @PostPersist
    public void onPostPersist(){

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        lvpracticelast.external.결제이력 결제이력 = new lvpracticelast.external.결제이력();
        // mappings goes here
        Application.applicationContext.getBean(lvpracticelast.external.결제이력Service.class)
            .결제(결제이력);


        주문됨 주문됨 = new 주문됨(this);
        주문됨.publishAfterCommit();


        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        lvpracticelast.external.PaymentInfo paymentInfo = new lvpracticelast.external.PaymentInfo();
        // mappings goes here
        AppApplication.applicationContext.getBean(lvpracticelast.external.PaymentInfoService.class)
            .pay(paymentInfo);


        Ordered ordered = new Ordered(this);
        ordered.publishAfterCommit();



        OrderCompleted orderCompleted = new OrderCompleted(this);
        orderCompleted.publishAfterCommit();

    }
    @PrePersist
    public void onPrePersist(){


        주문취소됨 주문취소됨 = new 주문취소됨(this);
        주문취소됨.publishAfterCommit();



        OrderCanceled orderCanceled = new OrderCanceled(this);
        orderCanceled.publishAfterCommit();

    }
    @PreRemove
    public void onPreRemove(){
    }

    public static OrderInfoRepository repository(){
        OrderInfoRepository orderInfoRepository = AppApplication.applicationContext.getBean(OrderInfoRepository.class);
        return orderInfoRepository;
    }




    public static void orderStateChange(OrderAccepted orderAccepted){

        /** Example 1:  new item 
        OrderInfo orderInfo = new OrderInfo();
        repository().save(orderInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderAccepted.get???()).ifPresent(orderInfo->{
            
            orderInfo // do something
            repository().save(orderInfo);


         });
        */

        
    }
    public static void orderStateChange(RapidDeliveryStart rapidDeliveryStart){

        /** Example 1:  new item 
        OrderInfo orderInfo = new OrderInfo();
        repository().save(orderInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(rapidDeliveryStart.get???()).ifPresent(orderInfo->{
            
            orderInfo // do something
            repository().save(orderInfo);


         });
        */

        
    }
    public static void orderStateChange(DeliveryStarted deliveryStarted){

        /** Example 1:  new item 
        OrderInfo orderInfo = new OrderInfo();
        repository().save(orderInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryStarted.get???()).ifPresent(orderInfo->{
            
            orderInfo // do something
            repository().save(orderInfo);


         });
        */

        
    }
    public static void orderStateComplete(DeliveryCompleted deliveryCompleted){

        /** Example 1:  new item 
        OrderInfo orderInfo = new OrderInfo();
        repository().save(orderInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCompleted.get???()).ifPresent(orderInfo->{
            
            orderInfo // do something
            repository().save(orderInfo);


         });
        */

        
    }


}
