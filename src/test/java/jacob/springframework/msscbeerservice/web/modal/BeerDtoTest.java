package jacob.springframework.msscbeerservice.web.modal;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;


@JsonTest
class BeerDtoTest extends BaseTest {

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void testDeserialize() throws IOException {
        String json = "{\"version\":null,\"createdDate\":{\"offset\":{\"totalSeconds\":3600,\"id\":\"+01:00\",\"rules\":{\"fixedOffset\":true,\"transitions\":[],\"transitionRules\":[]}},\"nano\":340879800,\"year\":2021,\"monthValue\":4,\"dayOfMonth\":9,\"hour\":13,\"minute\":54,\"second\":34,\"month\":\"APRIL\",\"dayOfWeek\":\"FRIDAY\",\"dayOfYear\":99},\"lastUpdatedDate\":{\"offset\":{\"totalSeconds\":3600,\"id\":\"+01:00\",\"rules\":{\"fixedOffset\":true,\"transitions\":[],\"transitionRules\":[]}},\"nano\":341879300,\"year\":2021,\"monthValue\":4,\"dayOfMonth\":9,\"hour\":13,\"minute\":54,\"second\":34,\"month\":\"APRIL\",\"dayOfWeek\":\"FRIDAY\",\"dayOfYear\":99},\"beerName\":\"beerName\",\"beerStyle\":\"ALE\",\"upc\":1223232,\"price\":\"12.99\",\"quantityOnHand\":22,\"myLocalDate\":[2021,4,9],\"beerId\":\"c259484b-8d9b-4ed4-a1df-b4726e01742c\"}\n";
        BeerDto dto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(dto);
    }
}