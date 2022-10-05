//this method can be used to remove a table if a user deemed it necessary

public class removeTable extends updateDB {

    public String tableName;

    public removeTable(String s) {
        tableName = s;
    }

    public void rem(String s) {
        String statement = "DROP TABLE " + s + ";";

        this.updateDB(statement);
    }
}
