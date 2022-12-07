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
    @Autowired DeliveryInfoRepository deliveryInfoRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCookingEnded'")
    public void wheneverOrderCookingEnded_DeliveryReceive(@Payload OrderCookingEnded orderCookingEnded){

        OrderCookingEnded event = orderCookingEnded;
        System.out.println("\n\n##### listener DeliveryReceive : " + orderCookingEnded + "\n\n");


        

        // Sample Logic //
        DeliveryInfo.deliveryReceive(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCompleted'")
    public void wheneverOrderCompleted_DeliveryComplete(@Payload OrderCompleted orderCompleted){

        OrderCompleted event = orderCompleted;
        System.out.println("\n\n##### listener DeliveryComplete : " + orderCompleted + "\n\n");


        

        // Sample Logic //
        DeliveryInfo.deliveryComplete(event);
        

        

    }

}


