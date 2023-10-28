package ru.netology.javaqa;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    public void shouldSendReturnData() {


        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Добрый день")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Добрый вечер"));
    }


}