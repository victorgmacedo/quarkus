package br.com.udemy.ifood;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class MarketplaceResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/marcketplace")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy"));
    }

}