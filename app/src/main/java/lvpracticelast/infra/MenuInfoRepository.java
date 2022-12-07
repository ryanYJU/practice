package lvpracticelast.infra;

import lvpracticelast.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="menuInfos", path="menuInfos")
public interface MenuInfoRepository extends PagingAndSortingRepository<MenuInfo, Long> {

    

    
}
