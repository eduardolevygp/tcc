package com.example.tcc.tccemptyapp.models;


import com.example.tcc.tccemptyapp.constants.APIRoutes;

/**
 * Created by Alan on 02/10/2016.
 */
public class ManagementMember extends BaseModel {

    private String imageUrl;
    private String name;
    private String role;
    private String email;
    private String phone;
    private transient String fullImageUrl;

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getFullImageUrl() {
        if (this.fullImageUrl == null && this.imageUrl != null) {
            this.fullImageUrl = APIRoutes.BASE_URL_IMAGE + this.imageUrl;
        }
        return fullImageUrl;
    }
}
