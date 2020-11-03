package com.moringaschool.mycloudtransports.RecyclerViews;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

public class Transports extends AppCompatActivity {
    private String uid;
    private String title;
    private String body;

    public Transports() {

    }

    public Transports(String uid, String title, String body) {
        this.uid = uid;
        this.title = title;
        this.body = body;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }



    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", uid);
        result.put("title", title);
        result.put("body", body);

        return result;
    }
    }
