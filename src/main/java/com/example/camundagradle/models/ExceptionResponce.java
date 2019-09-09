package com.example.camundagradle.models;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponce implements Serializable {
    private int status;
    private String source;
    private String title;
    private Date datestamp;


    public ExceptionResponce(){
        datestamp = new Date();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDatestamp() {
        return datestamp;
    }

    public void setDatestamp(Date datestamp) {
        this.datestamp = datestamp;
    }
}
