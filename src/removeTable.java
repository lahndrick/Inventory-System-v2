package src;

//this method can be used to remove a table if a user deemed it necessary

public class removeTable extends updateDB {

    public removeTable(String s) {
        String statement = "DROP TABLE " + s + ";";
        updateDB(statement);
    }
}
