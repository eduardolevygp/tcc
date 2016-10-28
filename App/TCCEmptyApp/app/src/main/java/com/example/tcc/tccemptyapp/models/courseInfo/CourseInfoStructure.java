package com.example.tcc.tccemptyapp.models.courseInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Alan on 23/10/2016.
 */
public class CourseInfoStructure {
    private static CourseInfoStructure mInstance;
    private List<Department> departmentList;

    public static CourseInfoStructure getInstance() {
        if (mInstance == null) {
            mInstance = new CourseInfoStructure();
        }
        return mInstance;
    }

    private CourseInfoStructure() {
        this.departmentList = getDepartments();
    }

    public List<Department> getDepartmentList() {
        return this.departmentList;
    }

    private List<Department> getDepartments() {
        Department dp1 = new Department();
        dp1.setName("PSI");
        dp1.setPeriodList(getPSIPeriods());

        Department dp2 = new Department();
        dp2.setName("PCS");
        dp2.setProgramList(getPCSPrograms());

        List<Department> departments = new ArrayList<>();
        departments.add(dp1);
        departments.add(dp2);

        return departments;
    }

    private List<Period> getPSIPeriods() {
        Period period1 = new Period();
        Period period2 = new Period();
        List<Period> periods = new ArrayList<>();

        period1.setName("Primeiro Semestre");
        period1.setId(1);
        period2.setName("Segundo Semestre");
        period2.setId(2);
        periods.addAll(Arrays.asList(period1, period2));

        return periods;
    }

    private List<Program> getPCSPrograms() {
        Program program1 = new Program();
        Program program2 = new Program();
        List<Program> programs = new ArrayList<>();

        program1.setName("Computação Cooperativo");
        program1.setPeriodList(getCoopPeriodList());
        program2.setName("Computação Semestral");
        program2.setId(5);
        programs.addAll(Arrays.asList(program1, program2));

        return programs;
    }

    private List<Period> getCoopPeriodList() {
        Period period1 = new Period();
        Period period2 = new Period();
        List<Period> periods = new ArrayList<>();

        period1.setName("Quinto Quadrimestre");
        period1.setId(3);
        period2.setName("Sexto Quadrimestre");
        period2.setId(4);
        periods.addAll(Arrays.asList(period1, period2));

        return periods;
    }
}
