package lvpracticelast.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name = "pay", url = "${api.url.pay}")
public interface PaymentInfoService {
    @RequestMapping(method= RequestMethod.POST, path="/paymentInfos")
    public void pay(@RequestBody PaymentInfo paymentInfo);
}

