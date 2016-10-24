package com.example.tcc.tccemptyapp.fragments.courseInfo;

import com.example.tcc.tccemptyapp.R;
import com.example.tcc.tccemptyapp.adapters.courseInfo.CourseInfoAdapter;
import com.example.tcc.tccemptyapp.adapters.courseInfo.DepartmentsAdapter;
import com.example.tcc.tccemptyapp.adapters.courseInfo.DepartmentsListener;
import com.example.tcc.tccemptyapp.fragments.BaseFragment;
import com.example.tcc.tccemptyapp.helpers.TransactionHelper;
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
    protected void setParentObjectData() {}

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
                BaseFragment fragment;

                if (department.getId() > 0) {
                    fragment = CoursesFragment.newInstance(department.getId());
                } else if (department.getPeriodList() != null) {
                    fragment = PeriodsFragment.newInstance(department);
                } else {
                    fragment = ProgramsFragment.newInstance(department);
                }

                TransactionHelper.pushFragment(getActivity(), R.id.main_activity_container, fragment);
            }
        };
    }

    private List<Department> getMockDepartments() {
        Department dp1 = new Department();
        dp1.setName("PSI");
        dp1.setPeriodList(getMockPSIPeriods());

        Department dp2 = new Department();
        dp2.setName("PCS");
        dp2.setProgramList(getMockPCSPrograms());

        List<Department> departments = new ArrayList<>();
        departments.add(dp1);
        departments.add(dp2);

        return departments;
    }

    private List<Period> getMockPSIPeriods() {
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

    private List<Program> getMockPCSPrograms() {
        Program program1 = new Program();
        Program program2 = new Program();
        List<Program> programs = new ArrayList<>();

        program1.setName("Computação Cooperativo");
        program1.setPeriodList(getCoopMockPeriodList());
        program2.setName("Computação Semestral");
        program2.setId(5);
        programs.addAll(Arrays.asList(program1, program2));

        return programs;
    }

    private List<Period> getCoopMockPeriodList() {
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
