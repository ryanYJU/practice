package lvpracticelast.domain;

import lvpracticelast.domain.RapidDeliveryStart;
import lvpracticelast.domain.DeliveryStarted;
import lvpracticelast.domain.DeliveryCompleted;
import lvpracticelast.RiderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="DeliveryInfo_table")
@Data

public class DeliveryInfo  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long orderId;
    
    
    
    
    
    private String shopAddress;
    
    
    
    
    
    private String shopTelNo;
    
    
    
    
    
    private String deliveryAddress;
    
    
    
    
    
    private String deliveryTelNo;
    
    
    
    
    
    private Boolean isRapidDelivery;
    
    
    
    
    
    private Integer state;

    @PostPersist
    public void onPostPersist(){


        RapidDeliveryStart rapidDeliveryStart = new RapidDeliveryStart(this);
        rapidDeliveryStart.publishAfterCommit();



        DeliveryStarted deliveryStarted = new DeliveryStarted(this);
        deliveryStarted.publishAfterCommit();



        DeliveryCompleted deliveryCompleted = new DeliveryCompleted(this);
        deliveryCompleted.publishAfterCommit();

    }

    public static DeliveryInfoRepository repository(){
        DeliveryInfoRepository deliveryInfoRepository = RiderApplication.applicationContext.getBean(DeliveryInfoRepository.class);
        return deliveryInfoRepository;
    }




    public static void deliveryReceive(OrderCookingEnded orderCookingEnded){

        /** Example 1:  new item 
        DeliveryInfo deliveryInfo = new DeliveryInfo();
        repository().save(deliveryInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCookingEnded.get???()).ifPresent(deliveryInfo->{
            
            deliveryInfo // do something
            repository().save(deliveryInfo);


         });
        */

        
    }
    public static void deliveryComplete(OrderCompleted orderCompleted){

        /** Example 1:  new item 
        DeliveryInfo deliveryInfo = new DeliveryInfo();
        repository().save(deliveryInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCompleted.get???()).ifPresent(deliveryInfo->{
            
            deliveryInfo // do something
            repository().save(deliveryInfo);


         });
        */

        
    }


}
