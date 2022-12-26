package com.app.dream11.chat.interfaces;
/* loaded from: classes.dex */
public interface IChatUser {
    int getDream11UserId();

    String getEncryptedMetaData();

    String getEncryptedProfilePic();

    String getFirstName();

    String getProfilePicUrl();

    String getTeamName();

    String getUserId();

    boolean isCurrentUser();

    void setCurrentUser(boolean z);

    void setFirstName(String str);

    void setProfilePicUrl(String str);

    void setTeamName(String str);
}
