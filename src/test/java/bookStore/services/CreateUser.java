package bookStore.services;
import bookStore.utilities.Globals;
import com.github.javafaker.Faker;
import io.restassured.http.ContentType;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
public class CreateUser extends Globals {
    public void createUser(){
        username = new Faker().name().username();
        password = "Test123*";
        Map<String,Object> map = new HashMap<>();
        map.put("userName",username);
        map.put("password",password);
        response =  given().accept(ContentType.JSON).log().all()
                    .contentType(ContentType.JSON)
                    .body(map).post("/Account/v1/User").prettyPeek();
    }

    public void validateThatUserIsCreated(){
        assertEquals(201,response.statusCode());
        assertEquals(username,response.path("username"));
        userID = response.path("userID");
    }



}
