package com.example.tcc.tccemptyapp.models.courseInfo;

import java.util.List;

/**
 * Created by Alan on 17/10/2016.
 */
public class Program extends CourseInfo {
    private List<Period> periodList;

    public Program(String name) {
        super(name);
    }

    public Program(String name, int id) {
        super(name, id);
    }

    public List<Period> getPeriodList() {
        return periodList;
    }

    public void setPeriodList(List<Period> periodList) {
        this.periodList = periodList;
    }
}
