package com.example.tcc.tccemptyapp.providers.adm;

import com.example.tcc.tccemptyapp.constants.Constants;
import com.example.tcc.tccemptyapp.models.ManagementMember;
import com.example.tcc.tccemptyapp.providers.general.HttpMethod;
import com.example.tcc.tccemptyapp.providers.general.RequestService;
import com.example.tcc.tccemptyapp.providers.general.ResponseHandler;

import java.util.List;

/**
 * Created by Alan on 04/10/2016.
 */
public class ADMProvider {

    public void getADMMembers(final ADMResponse handler) {
        new RequestService().performRequest(HttpMethod.GET, Constants.ADM_URL, new ResponseHandler() {
            @Override
            public void onSuccess(String jsonResponse) {
                List<ManagementMember> members = ManagementMember.toListModel(jsonResponse, ManagementMember.class);
                handler.onADMSuccess(members);
            }

            @Override
            public void onFailure(String jsonResponse) {
                handler.onADMFailure();
            }
        });
    }

}
