package bookStore.services;
import bookStore.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.junit.Assert.assertEquals;

public class GetUserInfo extends Globals {
    public void getUserInfo(){
        response = RestAssured.given().accept(ContentType.JSON).contentType(ContentType.JSON)
                  .header("Authorization","Bearer "+token).log().all()
                  .when()
                  .get("/Account/v1/User/"+userID)
                  .prettyPeek();
    }

    public void validations(){
        assertEquals(200,response.statusCode());
        assertEquals(userID,response.path("userId"));
        assertEquals(username,response.path("username"));
        assertEquals(isbnNumbers.get(0),response.path("books.isbn[0]"));
    }
}
