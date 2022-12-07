package lvpracticelast.domain;

import lvpracticelast.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="deliveryInfos", path="deliveryInfos")
public interface DeliveryInfoRepository extends PagingAndSortingRepository<DeliveryInfo, Long>{

}
