package bookStore.step_defs;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.reset;

public class Hooks {
    @Before
    public void setUp(){
        baseURI = "https://demoqa.com";
    }

    @After
    public void tearDown()  {
        reset();
    }
}
