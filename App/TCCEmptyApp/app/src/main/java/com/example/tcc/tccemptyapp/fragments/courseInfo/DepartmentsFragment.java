package com.example.tcc.tccemptyapp.fragments.courseInfo;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.adapters.courseInfo.CourseInfoAdapter;
import com.example.tcc.tccemptyapp.adapters.courseInfo.DepartmentsAdapter;
import com.example.tcc.tccemptyapp.adapters.courseInfo.DepartmentsListener;
import com.example.tcc.tccemptyapp.models.courseInfo.Course;
import com.example.tcc.tccemptyapp.models.courseInfo.Department;
import com.example.tcc.tccemptyapp.models.courseInfo.Period;
import com.example.tcc.tccemptyapp.models.courseInfo.Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Alan on 17/10/2016.
 */
public class DepartmentsFragment extends CourseInfoFragment {

    @Override
    protected void setData() {}

    @Override
    protected int getFragmentTitle() {
        return R.string.fragment_departments;
    }

    @Override
    protected CourseInfoAdapter getAdapter() {
        return new DepartmentsAdapter(getContext(), getMockDepartments(), getDepartmentsListener());
    }

    private DepartmentsListener getDepartmentsListener() {
        return new DepartmentsListener() {
            @Override
            public void onDepartmentClick(Department department) {
                ProgramsFragment fragment = ProgramsFragment.newInstance(department);
                goToFragment(fragment);
            }
        };
    }

    private List<Department> getMockDepartments() {
        Department dp1 = new Department();
        dp1.setName("PCS");
        dp1.setProgramList(getMockPrograms(1));

        Department dp2 = new Department();
        dp2.setName("PEA");
        dp2.setProgramList(getMockPrograms(2));

        Department dp3 = new Department();
        dp3.setName("PTC");
        dp3.setProgramList(getMockPrograms(3));

        Department dp4 = new Department();
        dp4.setName("MAC");
        dp4.setProgramList(getMockPrograms(4));

        List<Department> departments = new ArrayList<>();
        departments.add(dp1);
        departments.add(dp2);
        departments.add(dp3);
        departments.add(dp4);

        return departments;
    }

    private List<Program> getMockPrograms(int position) {
        Program program1 = new Program();
        Program program2 = new Program();
        Program program3 = new Program();
        Program program4 = new Program();
        List<Program> programs = new ArrayList<>();

        if (position == 1) {
            program1.setName("Engenharia da Computação");
            program2.setName("Engenharia da Sistemas Digitais");
            programs.addAll(Arrays.asList(program1, program2));
        } else if (position == 2) {
            program1.setName("Engenharia de Automação");
            program2.setName("Engenharia de Controle");
            programs.addAll(Arrays.asList(program1, program2));
        } else if (position == 3) {
            program1.setName("Engenharia da Telecomunicações");
            programs.add(program1);
        } else if (position == 4) {
            program1.setName("Engenharia de Computação");
            program2.setName("Engenharia de Automação");
            program3.setName("Engenharia de Telecomunicações");
            program4.setName("Engenharia de Sistemas Digitais");
            programs.addAll(Arrays.asList(program1, program2, program3, program4));
        }

        program1.setPeriodList(getMockPeriods(false));
        program2.setPeriodList(getMockPeriods(false));
        program3.setPeriodList(getMockPeriods(false));
        program4.setPeriodList(getMockPeriods(true));

        return programs;
    }

    private List<Period> getMockPeriods(boolean isLast) {
        Period period1 = new Period();
        Period period2 = new Period();
        Period period3 = new Period();
        Period period4 = new Period();
        List<Period> periods = new ArrayList<>();

        if (!isLast) {
            period1.setName("1º Semestre");
            period2.setName("2º Semestre");
            periods.addAll(Arrays.asList(period1, period2));
        } else {
            period1.setName("1º Semestre");
            period2.setName("2º Semestre");
            period3.setName("3º Semestre");
            period4.setName("4º Semestre");
            periods.addAll(Arrays.asList(period1, period2, period3, period4));
        }

        period1.setCourseList(getMockCourses(1));
        period2.setCourseList(getMockCourses(2));
        period3.setCourseList(getMockCourses(3));
        period4.setCourseList(getMockCourses(4));

        return periods;
    }

    private List<Course> getMockCourses(int position) {
        Course course1 = new Course();
        Course course2 = new Course();
        Course course3 = new Course();
        Course course4 = new Course();
        List<Course> courses = new ArrayList<>();

        if (position == 1) {
            course1.setName("PCS2214");
            course1.setId(1);
            course2.setName("PCS2215");
            course2.setId(2);
            courses.addAll(Arrays.asList(course1, course2));
        } else if (position == 2) {
            course1.setName("PEA1234");
            course1.setId(3);
            course2.setName("PEA4321");
            course2.setId(4);
            courses.addAll(Arrays.asList(course1, course2));
        } else if (position == 3) {
            course1.setName("PTCXXXX");
            course1.setId(5);
            courses.add(course1);
        } else if (position == 4) {
            course1.setName("MAC2166");
            course1.setId(6);
            course2.setName("MAC2167");
            course2.setId(7);
            course3.setName("MAC0000");
            course3.setId(8);
            course4.setName("MAC0001");
            course4.setId(9);
            courses.addAll(Arrays.asList(course1, course2, course3, course4));
        }

        return courses;
    }
}
