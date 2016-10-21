package com.example.tcc.tccemptyapp.models.courseInfo;

import com.example.tcc.tccemptyapp.models.BaseModel;

import java.util.List;

/**
 * Created by Alan on 17/10/2016.
 */
public class Department extends BaseModel{
    private String name;
    private List<Program> programList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Program> getProgramList() {
        return programList;
    }

    public void setProgramList(List<Program> programList) {
        this.programList = programList;
    }
}
