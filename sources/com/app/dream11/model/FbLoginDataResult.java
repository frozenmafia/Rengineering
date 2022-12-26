package com.app.dream11.model;

import java.util.Set;
/* loaded from: classes3.dex */
public class FbLoginDataResult {
    private String email;
    private Set<String> recentlyDeniedPermissions;
    private Set<String> recentlyGrantedPermissions;
    private String token;

    public FbLoginDataResult(String str, String str2, Set<String> set, Set<String> set2) {
        this.email = str;
        this.token = str2;
        this.recentlyGrantedPermissions = set;
        this.recentlyDeniedPermissions = set2;
    }

    public String getEmail() {
        return this.email;
    }

    public String getToken() {
        return this.token;
    }

    public Set<String> getRecentlyGrantedPermissions() {
        return this.recentlyGrantedPermissions;
    }

    public Set<String> getRecentlyDeniedPermissions() {
        return this.recentlyDeniedPermissions;
    }
}
