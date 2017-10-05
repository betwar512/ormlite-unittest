package net.ormlighttest.database;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.sql.Date;

/**
 * Created by Betwar on 10/5/2017.
 */
@DatabaseTable(tableName = "user")
public class User {

    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(index = true)
    private String name;
    @DatabaseField
    private int personId;
    @DatabaseField
    private Date timestamp;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }
}
