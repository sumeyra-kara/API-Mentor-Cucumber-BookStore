package bookStore.services;

import bookStore.utilities.Globals;
import io.restassured.http.ContentType;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Authorized extends Globals {
    public void authorizedUser(){
        Map<String,Object> map = new HashMap<>();
        map.put("userName",username);
        map.put("password",password);

        response =  given().accept(ContentType.JSON).log().all()
                    .contentType(ContentType.JSON)
                    .body(map)
                    .when().post("/Account/v1/Authorized").prettyPeek();
    }

    public void validateThatUserIsAuthorized(){
        assertEquals(200,response.statusCode());
        assertTrue(response.asString().contains("true"));
    }

}
