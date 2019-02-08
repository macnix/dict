package ua.co.styx.dict.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.SerializedName;
import com.mongodb.BasicDBObject;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * @author dubetskyi_ov on 05.01.2019
 */

public class DMark extends BasicDBObject implements Serializable {
 
    private int ID;
    private String Name;

    public DMark(int ID, String Name) {
       
        super.put("ID", ID);
        super.put("Name", Name);

    }
    public ObjectId get_id() {
        return (ObjectId) super.get("_id");
    }

    public void set_id(ObjectId _id) {
        super.put("_id", _id);
    }

    public int getID() {
        return (int) super.get("ID");
    }

    public void setID(int ID) {
        super.put("ID", ID);
    }

    public String getName() {
        return (String) super.get("Name");
    }

    public void setName(String Name) {
        super.put("Name", Name);
    }
}
