package bookStore.services;
import bookStore.utilities.Globals;
import io.restassured.http.ContentType;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class GenerateToken extends Globals {
    public void generateToken(){
        Map<String,Object> map = new HashMap<>();
        map.put("userName",username);
        map.put("password",password);
        response = given().accept(ContentType.JSON).contentType(ContentType.JSON).body(map)
                    .when().post("/Account/v1/GenerateToken").prettyPeek();
    }

    public void validateThatTokenIsCreated(){
        assertEquals(200,response.statusCode());
        token  =response.path("token");
        assertEquals("Success",response.path("status"));
    }
}
