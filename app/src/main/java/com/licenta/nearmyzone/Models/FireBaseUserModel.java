package com.licenta.nearmyzone.Models;

/**
 * Created by Morgenstern on 08/23/2017.
 */

public class FireBaseUserModel {

    private String username = "";
    private String email = "";
    private String password = "";
    private String userPhotoUrl = "";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserPhotoUrl() {
        return userPhotoUrl;
    }

    public void setUserPhotoUrl(String userPhotoUrl) {
        this.userPhotoUrl = userPhotoUrl;
    }
}
