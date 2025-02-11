package com.example.bai2;

public class MessageModel {
    private int id;
    private int userId;
    private String title;
    private String body;

    public MessageModel(int id, int uid, String td, String bd){
        this.id=id;
        this.userId=uid;
        this.title=td;
        this.body=bd;
    }
    public MessageModel(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
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
}
