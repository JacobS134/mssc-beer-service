package jacob.springframework.msscbeerservice.web.modal;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {

    ObjectMapper objectMapper = new ObjectMapper();

    BeerDto getDto() {
        return BeerDto.builder()
                .beerName("beerName")
                .beerStyle(BeerStyleEnum.ALE)
                .id(UUID.randomUUID())
                .createdDate(OffsetDateTime.now())
                .lastUpdatedDate(OffsetDateTime.now())
                .price(new BigDecimal("12.99"))
                .quantityOnHand(22)
                .upc(1223232L)
                .myLocalDate(LocalDate.now())
                .build();
    }
}
