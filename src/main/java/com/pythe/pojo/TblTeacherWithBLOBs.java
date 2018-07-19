package com.pythe.pojo;

public class TblTeacherWithBLOBs extends TblTeacher {
    private String description;

    private String collection;

    private String complaintlist;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection == null ? null : collection.trim();
    }

    public String getComplaintlist() {
        return complaintlist;
    }

    public void setComplaintlist(String complaintlist) {
        this.complaintlist = complaintlist == null ? null : complaintlist.trim();
    }
}