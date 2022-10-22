package src;

//this method can be used to create a new table if a user deemed it necessary

public class addTable extends updateDB {

    public addTable(String s) {
        String statement = "CREATE  TABLE " + s + " (BOOKID  INT,   TITLE   VARCHAR(50),   CATEGORY   VARCHAR(20),   PRICE   FLOAT);";
        updateDB(statement);
    }
}
