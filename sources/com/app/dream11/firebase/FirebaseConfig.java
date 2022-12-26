package com.app.dream11.firebase;

import android.text.TextUtils;
import java.io.Serializable;
/* loaded from: classes3.dex */
public class FirebaseConfig implements Serializable {
    private static final long serialVersionUID = 121;
    private String firebaseProjectApiKey;
    private String firebaseProjectDbUrl;
    private String firebaseProjectName;

    public FirebaseConfig(String str, String str2, String str3) {
        this.firebaseProjectName = str;
        this.firebaseProjectApiKey = str2;
        this.firebaseProjectDbUrl = str3;
    }

    public String getFirebaseProjectName() {
        return this.firebaseProjectName;
    }

    public String getFirebaseProjectApiKey() {
        return this.firebaseProjectApiKey;
    }

    public String getFirebaseProjectDbUrl() {
        return this.firebaseProjectDbUrl;
    }

    public int hashCode() {
        return this.firebaseProjectName.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof FirebaseConfig) {
            return this.firebaseProjectName.equals(((FirebaseConfig) obj).firebaseProjectName);
        }
        return false;
    }

    public String toString() {
        return "FirebaseConfig{firebaseProjectName='" + this.firebaseProjectName + "', firebaseProjectApiKey='" + this.firebaseProjectApiKey + "', firebaseProjectDbUrl='" + this.firebaseProjectDbUrl + "'}";
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.firebaseProjectName) || TextUtils.isEmpty(this.firebaseProjectApiKey) || TextUtils.isEmpty(this.firebaseProjectDbUrl)) ? false : true;
    }
}
