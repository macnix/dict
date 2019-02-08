package ua.co.styx.dict.model;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;


/**
 * @author dubetskyi_ov on 07.02.2019
 */

@Document(collection = "DCity")
public class DCity extends BasicDBObject implements Serializable {

    private int ID;
    private String Name;
	private int DRegionID;
    private String KOATUU;
    private int DZoneID;

    public DCity(int ID, String Name, int DRegionID, String KOATUU, int DZoneID) {
		super.put("DRegionID", DRegionID);
        super.put("ID", ID);
        super.put("Name", Name);
        super.put("KOATUU", KOATUU);
        super.put("DZoneID", DZoneID);
    }

    public int getDRegionID() {
        return (int) super.get("DRegionID");
    }

    public void setDRegionID(int DRegionID) {
        super.put("DRegionID", DRegionID);
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

    public String getKOATUU() {
        return (String) super.get("KOATUU");
    }

    public void setKOATUU(String KOATUU) {
        super.put("KOATUU", KOATUU);
    }

    public int getDZoneID() {
        return (int) super.get("DZoneID");
    }

    public void setDZoneID(int DZoneID) {
        super.put("DZoneID", DZoneID);
    }
}
