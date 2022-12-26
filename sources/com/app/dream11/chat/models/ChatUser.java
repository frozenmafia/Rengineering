package com.app.dream11.chat.models;

import com.app.dream11.chat.ChatFeatureContantsKt;
import com.app.dream11.chat.interfaces.IChatUser;
import com.sendbird.android.User;
import o.runAnimators;
/* loaded from: classes.dex */
public class ChatUser implements IChatUser {
    private final String encryptedMetaData;
    private final String encryptedProfilePic;
    private String firstName;
    private boolean isCurrentUser;
    private String profilePicUrl;
    private String teamName;
    private final String userId;

    public ChatUser(User user, String str, String str2, boolean z) {
        runAnimators.ag$a(user, "user");
        this.isCurrentUser = z;
        this.encryptedMetaData = ChatFeatureContantsKt.getUserMetaData(user);
        this.firstName = str;
        this.profilePicUrl = str2;
        String nickname = user.getNickname();
        runAnimators.ah$a(nickname, "user.nickname");
        this.teamName = nickname;
        String userId = user.getUserId();
        runAnimators.ah$a(userId, "user.userId");
        this.userId = userId;
        String profileUrl = user.getProfileUrl();
        runAnimators.ah$a(profileUrl, "user.profileUrl");
        this.encryptedProfilePic = profileUrl;
    }

    @Override // com.app.dream11.chat.interfaces.IChatUser
    public boolean isCurrentUser() {
        return this.isCurrentUser;
    }

    @Override // com.app.dream11.chat.interfaces.IChatUser
    public void setCurrentUser(boolean z) {
        this.isCurrentUser = z;
    }

    @Override // com.app.dream11.chat.interfaces.IChatUser
    public int getDream11UserId() {
        try {
            return Integer.parseInt(getUserId());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // com.app.dream11.chat.interfaces.IChatUser
    public String getEncryptedMetaData() {
        return this.encryptedMetaData;
    }

    @Override // com.app.dream11.chat.interfaces.IChatUser
    public void setFirstName(String str) {
        this.firstName = str;
    }

    @Override // com.app.dream11.chat.interfaces.IChatUser
    public String getFirstName() {
        String str = this.firstName;
        return str == null || str.length() == 0 ? "" : this.firstName;
    }

    @Override // com.app.dream11.chat.interfaces.IChatUser
    public String getProfilePicUrl() {
        return this.profilePicUrl;
    }

    @Override // com.app.dream11.chat.interfaces.IChatUser
    public void setProfilePicUrl(String str) {
        this.profilePicUrl = str;
    }

    @Override // com.app.dream11.chat.interfaces.IChatUser
    public String getTeamName() {
        return this.teamName;
    }

    @Override // com.app.dream11.chat.interfaces.IChatUser
    public void setTeamName(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.teamName = str;
    }

    @Override // com.app.dream11.chat.interfaces.IChatUser
    public String getUserId() {
        return this.userId;
    }

    @Override // com.app.dream11.chat.interfaces.IChatUser
    public String getEncryptedProfilePic() {
        return this.encryptedProfilePic;
    }
}
