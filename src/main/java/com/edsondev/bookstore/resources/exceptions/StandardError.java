package com.edsondev.bookstore.resources.exceptions;

public class StandardError {
    private Long timestamp;
    private Integer status;
    private String error;

    /**
     * Construtor sem args*/
    public StandardError(){
        super();
    }

    /**
     * Constructor com args*/
    public StandardError(Long timestamp, Integer status, String error) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
    }

    /**
     * getters and setters*/
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
