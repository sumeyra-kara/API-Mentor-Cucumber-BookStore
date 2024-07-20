package bookStore.services;
import bookStore.utilities.Globals;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class AddNewBook extends Globals {
    public void addNewBook(){
        String jsonBody="{\n" +
                "  \"userId\": \""+userID+"\",\n" +
                "  \"collectionOfIsbns\": [\n" +
                "    {\n" +
                "      \"isbn\": \""+isbnNumbers.get(0)+"\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        response= given().accept(ContentType.JSON).contentType(ContentType.JSON)
                .header("Authorization","Bearer "+token)
                .body(jsonBody).log().all()
                .when()
                .post("/BookStore/v1/Books")
                .prettyPeek();
    }


    public void validateThatBookIsAdded(){
        assertEquals(201,response.statusCode());
        assertEquals(isbnNumbers.get(0),response.path("books.isbn[0]"));
    }
}
