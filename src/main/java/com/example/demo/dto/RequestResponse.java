package com.example.demo.dto;

public class RequestResponse {

    private int status;
    private String message;

    // No-argument constructor
    public RequestResponse() {}

    // Constructor with status and message
    public RequestResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

    // Getters and setters
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
