package com.example.tcc.tccemptyapp.models.courseInfo;

import com.example.tcc.tccemptyapp.models.BaseModel;

import java.util.List;

/**
 * Created by Alan on 17/10/2016.
 */
public class Program extends BaseModel {
    private String name;
    private List<Period> periodList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Period> getPeriodList() {
        return periodList;
    }

    public void setPeriodList(List<Period> periodList) {
        this.periodList = periodList;
    }
}
