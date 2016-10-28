package com.example.tcc.tccemptyapp.models.courseInfo;

/**
 * Created by Alan on 23/10/2016.
 */
public class CourseDetail extends CourseInfo {
    private int listId;
    private String code;
    private String info;

    public int getListId() {
        return listId;
    }

    public void setListId(int listId) {
        this.listId = listId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCodeAndName() {
        return this.code + " - " + this.name;
    }
}
