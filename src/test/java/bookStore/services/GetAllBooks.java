package bookStore.services;
import bookStore.utilities.Globals;
import io.restassured.http.ContentType;
import org.junit.Assert;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class GetAllBooks extends Globals {
    public void getAllBooks(){
        response = given().accept(ContentType.JSON).log().all()
                            .when().get("/BookStore/v1/Books").prettyPeek();
    }

    public void validateThatAllBooksAreListed(){
        // validate status Code
        assertEquals(200,response.statusCode());

        // get all isbn numbers
        isbnNumbers =  response.path("books.isbn");

        // validate that list in not null
        for (String n : isbnNumbers) {
            Assert.assertNotNull(n);
        }
        //  isbnNumbers.forEach(n-> Assert.assertNotNull(n));
    }




}
