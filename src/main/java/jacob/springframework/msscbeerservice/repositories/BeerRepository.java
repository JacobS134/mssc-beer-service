package jacob.springframework.msscbeerservice.repositories;

import jacob.springframework.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

//dont need to annotate as repo
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
