package ua.co.styx.dict.model;

import com.mongodb.BasicDBObject;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * @author dubetskyi_ov on 07.02.2019
 */
@Document(collection = "Settlement")
public class Settlement extends BasicDBObject implements Serializable {
    private String gid;
    private String KOATUUCode;
    private String FullName;
    private int RegionID;
    private Integer MTSBUID;
    private Integer KOATUUL1;
    private Integer KOATUUL2;
    private Integer KOATUUL3;
    private Integer KOATUUL4;

    public Settlement(String gid, String KOATUUCode, String fullName, int regionID, Integer MTSBUID, Integer KOATUUL1, Integer KOATUUL2, Integer KOATUUL3, Integer KOATUUL4) {
        super.put("gid", gid);
        super.put("KOATUUCode", KOATUUCode);
        super.put("fullName", fullName);
        super.put("regionID", regionID);
        super.put("MTSBUID", MTSBUID);
        super.put("KOATUUL1", KOATUUL1);
        super.put("KOATUUL2", KOATUUL2);
        super.put("KOATUUL3", KOATUUL3);
        super.put("KOATUUL4", KOATUUL4);

    }

    public String getGid() {
        return (String) super.get("gid");
    }

    public void setGid(String gid) {
        super.put("gid", gid);
    }

    public String getKOATUUCode() {
        return (String) super.get("KOATUUCode");
    }

    public void setKOATUUCode(String KOATUUCode) {
        super.put("KOATUUCode", KOATUUCode);
    }

    public String getFullName() {
        return (String) super.get("fullName");
    }

    public void setFullName(String fullName) {
        super.put("fullName", fullName);
    }

    public int getRegionID() {
        return (int) super.get("regionID");
    }

    public void setRegionID(int regionID) {
        super.put("regionID", regionID);
    }

    public Integer getMTSBUID() {
        return (Integer) super.get("MTSBUID");
    }

    public void setMTSBUID(Integer MTSBUID) {
        super.put("MTSBUID", MTSBUID);
    }

    public Integer getKOATUUL1() {
        return (int) super.get("KOATUUL1");
    }

    public void setKOATUUL1(Integer KOATUUL1) {
        super.put("KOATUUL1", KOATUUL1);
    }

    public Integer getKOATUUL2() {
        return (int) super.get("KOATUUL2");
    }

    public void setKOATUUL2(Integer KOATUUL2) {
        super.put("KOATUUL2", KOATUUL2);
    }

    public Integer getKOATUUL3() {
        return (int) super.get("KOATUUL3");
    }

    public void setKOATUUL3(Integer KOATUUL3) {
        super.put("KOATUUL3", KOATUUL3);
    }

    public Integer getKOATUUL4() {
        return (int) super.get("KOATUUL4");
    }

    public void setKOATUUL4(Integer KOATUUL4) {
        super.put("KOATUUL4", KOATUUL4);
    }
}
