package com.example.camundagradle.models;


import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class CustomResponseData<T> implements Serializable {
    private int status;
    private Date datestamp;
    private List<T> data;

    public CustomResponseData(){
        datestamp=new Date();
        data = new LinkedList<T>();
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getDatestamp() {
        return datestamp;
    }

    public void setDatestamp(Date datestamp) {
        this.datestamp = datestamp;
    }
}
