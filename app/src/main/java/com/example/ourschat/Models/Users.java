package com.example.ourschat.Models;

public class Users {
    String profilepic,useName,mail, password, userId, lastMessage;

    public Users(String profilepic, String useName, String mail, String password, String userId, String lastMessage) {
        this.profilepic = profilepic;
        this.useName = useName;
        this.mail = mail;
        this.password = password;
        this.userId = userId;
        this.lastMessage = lastMessage;

    }
    public Users(){}

    //SignUp constructor
    public Users( String useName, String mail, String password) {
        this.useName = useName;
        this.mail = mail;
        this.password = password;

    }


    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }


            }