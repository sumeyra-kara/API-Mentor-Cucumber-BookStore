package bookStore.step_defs;
import bookStore.services.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookStore_StepDefs {
    GetAllBooks getAllBooks = new GetAllBooks();
    CreateUser createUser = new CreateUser();
    GenerateToken generateToken = new GenerateToken();
    Authorized authorized = new Authorized();
    AddNewBook addNewBook = new AddNewBook();
    GetUserInfo getUserInfo = new GetUserInfo();
    UpdateBook updateBook = new UpdateBook();
    DeleteBook deleteBook = new DeleteBook();


    @When("get all Books")
    public void get_all_books() {
       getAllBooks.getAllBooks();
    }

    @Then("validate that all books are listed")
    public void validate_that_all_books_are_listed() {
        getAllBooks.validateThatAllBooksAreListed();
    }


    @When("create new User")
    public void create_new_user() {
        createUser.createUser();
    }

    @Then("validate that user is created")
    public void validate_that_user_is_created() {
        createUser.validateThatUserIsCreated();
    }

    @When("generate token")
    public void generate_token() {
        generateToken.generateToken();
    }
    @Then("validate that token is created")
    public void validate_that_token_is_created() {
        generateToken.validateThatTokenIsCreated();
    }

    @When("authorized User")
    public void authorized_user() {
        authorized.authorizedUser();
    }

    @Then("validate that user is authorized")
    public void validate_that_user_is_authorized() {
        authorized.validateThatUserIsAuthorized();
    }

    @When("add new book to user")
    public void add_new_book_to_user() {
        addNewBook.addNewBook();
    }

    @Then("validate that new book added")
    public void validate_that_new_book_added() {
       addNewBook.validateThatBookIsAdded();
    }

    @When("Get User Info")
    public void get_user_info() {
        getUserInfo.getUserInfo();
    }

    @Then("Validate that user's details are correct")
    public void validate_that_user_s_details_are_correct() {
        getUserInfo.validations();
    }

    @When("Update book")
    public void update_book() {
        updateBook.updateBook();
    }

    @Then("Validate that book is updated")
    public void validate_that_book_is_updated() {
        updateBook.validations();
    }

    @When("Delete Book")
    public void delete_book() {
        deleteBook.deleteBook();
    }

    @Then("Validate that book is removed")
    public void validate_that_book_is_removed() {
        deleteBook.validation();
    }

}
