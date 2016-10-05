package com.example.tcc.tccemptyapp.providers.adm;

import com.example.tcc.tccemptyapp.models.ManagementMember;

import java.util.List;

/**
 * Created by Alan on 05/10/2016.
 */
public interface ADMResponse {
    void onADMSuccess(List<ManagementMember> members);
    void onADMFailure();
}
