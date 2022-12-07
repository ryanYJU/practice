package lvpracticelast.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import lvpracticelast.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import lvpracticelast.domain.*;


@Service
@Transactional
public class PolicyHandler{
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='주문취소됨'")
    public void whenever주문취소됨_카톡알림처리(@Payload 주문취소됨 주문취소됨){

        주문취소됨 event = 주문취소됨;
        System.out.println("\n\n##### listener 카톡알림처리 : " + 주문취소됨 + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='주문됨'")
    public void whenever주문됨_카톡알림처리(@Payload 주문됨 주문됨){

        주문됨 event = 주문됨;
        System.out.println("\n\n##### listener 카톡알림처리 : " + 주문됨 + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='쿠폰발행됨'")
    public void whenever쿠폰발행됨_카톡알림처리(@Payload 쿠폰발행됨 쿠폰발행됨){

        쿠폰발행됨 event = 쿠폰발행됨;
        System.out.println("\n\n##### listener 카톡알림처리 : " + 쿠폰발행됨 + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='배달시작됨'")
    public void whenever배달시작됨_카톡알림처리(@Payload 배달시작됨 배달시작됨){

        배달시작됨 event = 배달시작됨;
        System.out.println("\n\n##### listener 카톡알림처리 : " + 배달시작됨 + "\n\n");


        

        // Sample Logic //

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCanceled'")
    public void wheneverOrderCanceled_KakaoNotiMessageSend(@Payload OrderCanceled orderCanceled){

        OrderCanceled event = orderCanceled;
        System.out.println("\n\n##### listener KakaoNotiMessageSend : " + orderCanceled + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Ordered'")
    public void wheneverOrdered_KakaoNotiMessageSend(@Payload Ordered ordered){

        Ordered event = ordered;
        System.out.println("\n\n##### listener KakaoNotiMessageSend : " + ordered + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderAccepted'")
    public void wheneverOrderAccepted_KakaoNotiMessageSend(@Payload OrderAccepted orderAccepted){

        OrderAccepted event = orderAccepted;
        System.out.println("\n\n##### listener KakaoNotiMessageSend : " + orderAccepted + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCookingStarted'")
    public void wheneverOrderCookingStarted_KakaoNotiMessageSend(@Payload OrderCookingStarted orderCookingStarted){

        OrderCookingStarted event = orderCookingStarted;
        System.out.println("\n\n##### listener KakaoNotiMessageSend : " + orderCookingStarted + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCookingEnded'")
    public void wheneverOrderCookingEnded_KakaoNotiMessageSend(@Payload OrderCookingEnded orderCookingEnded){

        OrderCookingEnded event = orderCookingEnded;
        System.out.println("\n\n##### listener KakaoNotiMessageSend : " + orderCookingEnded + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='RapidDeliveryStart'")
    public void wheneverRapidDeliveryStart_KakaoNotiMessageSend(@Payload RapidDeliveryStart rapidDeliveryStart){

        RapidDeliveryStart event = rapidDeliveryStart;
        System.out.println("\n\n##### listener KakaoNotiMessageSend : " + rapidDeliveryStart + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveryStarted'")
    public void wheneverDeliveryStarted_KakaoNotiMessageSend(@Payload DeliveryStarted deliveryStarted){

        DeliveryStarted event = deliveryStarted;
        System.out.println("\n\n##### listener KakaoNotiMessageSend : " + deliveryStarted + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveryCompleted'")
    public void wheneverDeliveryCompleted_KakaoNotiMessageSend(@Payload DeliveryCompleted deliveryCompleted){

        DeliveryCompleted event = deliveryCompleted;
        System.out.println("\n\n##### listener KakaoNotiMessageSend : " + deliveryCompleted + "\n\n");


        

        // Sample Logic //

        

    }

}


