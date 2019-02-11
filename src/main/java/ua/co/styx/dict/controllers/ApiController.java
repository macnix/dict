package ua.co.styx.dict.controllers;


import com.mongodb.*;
import com.mongodb.MongoClient;
import com.mongodb.client.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.co.styx.dict.model.DCity;
import ua.co.styx.dict.model.DMark;

import java.io.*;
import java.util.*;


/**
 * @author dubetskyi_ov on 07.02.2019
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    public static final String DBHost = "172.16.16.14"; //mongodb  172.16.16.14
    public static final String DB = "DICT";
    public static final String DBuser = "root";
    public static final String DBpwd = "masterkey";

    @GetMapping("/DCity")
    public List<DCity> GetDCity() throws IOException {

        MongoClient mongoClient = null;
        MongoCredential mongoCredential = MongoCredential.createScramSha1Credential(DBuser, "admin",
                DBpwd.toCharArray());

        mongoClient = new MongoClient(new ServerAddress(DBHost, 27017), Arrays.asList(mongoCredential));
        MongoDatabase database = mongoClient.getDatabase (DB);
        String collectionName = "DCity";
        MongoCollection<DCity> collection = database.getCollection ("DCity", DCity.class);
        System.out.println (collection);
        List<DCity> documents = (List<DCity>) collection.find().into( new ArrayList<DCity>());


       return documents;
    }


    @GetMapping("/DMark")
    public List<DMark> GetDMark() throws IOException {
        MongoClient mongoClient = null;
        MongoCredential mongoCredential = MongoCredential.createScramSha1Credential(DBuser, "admin",
                DBpwd.toCharArray());

        mongoClient = new MongoClient(new ServerAddress(DBHost, 27017), Arrays.asList(mongoCredential));
        MongoDatabase database = mongoClient.getDatabase (DB);
        String collectionName = "DMark";
        MongoCollection<DMark> collection = null;
        List<DMark> documents = null;
        collection = database.getCollection ("DMark", DMark.class);
        documents = (List<DMark>) collection.find().into( new ArrayList<DMark>());

        return documents;
    }



    private boolean GetExits(MongoDatabase database, String collectionName) {
        MongoIterable<String> collection =  database.listCollectionNames();
        for(String s : collection) {
            if(s.equals(collectionName)) {
                return true;
            }
        }
        return false;
    }

}
