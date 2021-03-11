package jacob.springframework.msscbeerservice.web.mappers;

/*
 uses custom class and adds in the implementation of mapper
 */

import jacob.springframework.msscbeerservice.domain.Beer;
import jacob.springframework.msscbeerservice.web.modal.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}