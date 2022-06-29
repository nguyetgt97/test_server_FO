package com.example.fo_severside.Model;

import com.google.android.gms.tasks.Task;

public class Token {
    private Task<String> token;
    private boolean isServerToken;

    public Token() {
    }

    public Token(Task<String> token, boolean isServerToken) {
        this.token = token;
        this.isServerToken = isServerToken;
    }

    public Task<String> getToken() {
        return token;
    }

    public void setToken(Task<String> token) {
        this.token = token;
    }

    public boolean isServerToken() {
        return isServerToken;
    }

    public void setServerToken(boolean serverToken) {
        isServerToken = serverToken;
    }
}
