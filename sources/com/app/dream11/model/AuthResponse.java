package com.app.dream11.model;

import com.app.dream11.firebase.FirebaseConfig;
import o.getEmbeddedMenuWidthLimit;
/* loaded from: classes.dex */
public class AuthResponse extends getEmbeddedMenuWidthLimit {
    private String accessToken;
    private String email;
    private FirebaseConfig firebaseKey;
    private String firstName;
    private boolean newUser;
    private String refreshToken;
    private boolean shouldShowOnboarding;
    private String teamName;
    private RegisteredUserDetails userDetails;
    private int userId;

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int i) {
        this.userId = i;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public void setTeamName(String str) {
        this.teamName = str;
    }

    public RegisteredUserDetails getUserDetails() {
        return this.userDetails;
    }

    public void setUserDetails(RegisteredUserDetails registeredUserDetails) {
        this.userDetails = registeredUserDetails;
    }

    public boolean getNewUser() {
        return this.newUser;
    }

    public void setNewUser(boolean z) {
        this.newUser = z;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public void setRefreshToken(String str) {
        this.refreshToken = str;
    }

    public boolean isShouldShowOnboarding() {
        return this.shouldShowOnboarding;
    }

    public void setShouldShowOnboarding(boolean z) {
        this.shouldShowOnboarding = z;
    }

    public FirebaseConfig getFirebaseConfig() {
        return this.firebaseKey;
    }

    public void setFireBaseConfig(FirebaseConfig firebaseConfig) {
        this.firebaseKey = firebaseConfig;
    }

    public void setFirstName(String str) {
        this.firstName = str;
    }

    public String getFirstName() {
        return this.firstName;
    }
}
