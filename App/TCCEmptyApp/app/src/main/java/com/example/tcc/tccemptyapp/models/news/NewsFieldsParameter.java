package com.example.tcc.tccemptyapp.models.news;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alan on 12/12/2016.
 */
public class NewsFieldsParameter {
    public final String paramKey = "fields";
    private List<String> fieldList;

    public NewsFieldsParameter() {
        this.fieldList = new ArrayList<>();
        this.fieldList.add("id");
        this.fieldList.add("message");
        this.fieldList.add("created_time");
        this.fieldList.add("full_picture");
        this.fieldList.add("from");
        this.fieldList.add("link");
        this.fieldList.add("story");
    }

    public String getEnumaretedParams() {
        final List<String> fieldList = this.fieldList;
        String params = fieldList.get(0);

        for (int i = 1; i < fieldList.size(); i++) {
            params = params + "," + fieldList.get(i);
        }

        return params;
    }
}
