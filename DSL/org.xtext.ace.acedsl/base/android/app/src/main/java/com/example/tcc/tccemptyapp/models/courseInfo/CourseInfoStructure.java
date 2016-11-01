package com.example.tcc.tccemptyapp.models.courseInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Alan on 23/10/2016.
 */
public class CourseInfoStructure {
    private static CourseInfoStructure mInstance;
    private List<@@@classe_app@@@> @@@lista_nome@@@;

    public static CourseInfoStructure getInstance() {
        if (mInstance == null) {
            mInstance = new CourseInfoStructure();
        }
        return mInstance;
    }

    private CourseInfoStructure() {
        this.@@@lista_nome@@@ = createStructure();
    }

    public List<@@@classe_app@@@> @@@getter_lista@@@() {
        return this.@@@lista_nome@@@;
    }

    private List<@@@classe_app@@@> createStructure() {

        @@@create_structure@@@
    }
}
