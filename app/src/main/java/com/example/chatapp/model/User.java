package com.example.chatapp.model;

public class User {

    private String id;
    private String Username;
    private String imageURL;
    private String status;
    private String search;


    public User(String id, String Username,String imageURL, String status,String search){
        this.id=id;
        this.Username=Username;
        this.imageURL=imageURL;
        this.status=status;
        this.search=search;
    }

    public User(){

    }

    public String getId() {
        return id;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getUsername() {
        return Username;
    }

    public String getStatus() {
        return status;
    }

    public String getSearch() {
        return search;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
