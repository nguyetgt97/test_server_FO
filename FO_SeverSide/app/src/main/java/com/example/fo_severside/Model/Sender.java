package com.example.fo_severside.Model;

import com.google.android.gms.tasks.Task;

public class Sender {
    public String to;
    public Notification notification;

//    public Sender(String body, String title) {
//        this.body = body;
//        this.title = title;
//    }

    public Sender(Task<String> token, Notification notification) {
    }

//    public String getBody() {
//        return body;
//    }
//
//    public void setBody(String body) {
//        this.body = body;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
}
