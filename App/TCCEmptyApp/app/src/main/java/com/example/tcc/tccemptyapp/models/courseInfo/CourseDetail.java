package com.example.tcc.tccemptyapp.models.courseInfo;

/**
 * Created by Alan on 23/10/2016.
 */
public class CourseDetail extends CourseInfo {
    private int listId;
    private String code;
    private String info;

    private transient String codeTitle;

    public CourseDetail(String name) {
        super(name);
    }

    public CourseDetail(String name, int id) {
        super(name, id);
    }

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
        if (codeTitle == null && code == null) {
            codeTitle = this.name;
        } else if (codeTitle == null) {
            codeTitle = this.code + " - " + this.name;
        }
        return this.codeTitle;
    }
}
