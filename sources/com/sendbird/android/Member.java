package com.sendbird.android;

import com.sendbird.android.constant.StringSet;
import com.sendbird.android.shadow.com.google.gson.JsonElement;
import com.sendbird.android.shadow.com.google.gson.JsonObject;
/* loaded from: classes5.dex */
public class Member extends User {
    private boolean isMuted;
    private boolean mIsBlockedByMe;
    private boolean mIsBlockingMe;
    private MemberState mState;
    private Role role;

    @Deprecated
    /* loaded from: classes7.dex */
    public enum InvitationState {
        INVITED,
        JOINED
    }

    /* loaded from: classes5.dex */
    public enum MemberState {
        NONE,
        INVITED,
        JOINED
    }

    /* loaded from: classes5.dex */
    public enum MutedState {
        UNMUTED,
        MUTED
    }

    /* loaded from: classes5.dex */
    public enum Role {
        NONE("none"),
        OPERATOR("operator");
        
        private String value;

        Role(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }

        public static Role fromValue(String str) {
            Role[] values;
            for (Role role : values()) {
                if (role.value.equals(str)) {
                    return role;
                }
            }
            return NONE;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Member(JsonElement jsonElement) {
        super(jsonElement);
        if (jsonElement.isJsonNull()) {
            return;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        this.mState = (asJsonObject.has("state") && asJsonObject.get("state").getAsString().equals("invited")) ? MemberState.INVITED : MemberState.JOINED;
        boolean z = false;
        this.mIsBlockingMe = asJsonObject.has("is_blocking_me") && asJsonObject.get("is_blocking_me").getAsBoolean();
        this.mIsBlockedByMe = asJsonObject.has("is_blocked_by_me") && asJsonObject.get("is_blocked_by_me").getAsBoolean();
        if (asJsonObject.has(StringSet.is_muted) && asJsonObject.get(StringSet.is_muted).getAsBoolean()) {
            z = true;
        }
        this.isMuted = z;
        this.role = Role.NONE;
        if (asJsonObject.has(StringSet.role)) {
            this.role = Role.fromValue(asJsonObject.get(StringSet.role).getAsString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.sendbird.android.User
    public JsonElement toJson() {
        JsonObject asJsonObject = super.toJson().getAsJsonObject();
        if (this.mState == MemberState.INVITED) {
            asJsonObject.addProperty("state", "invited");
        } else {
            asJsonObject.addProperty("state", StringSet.joined);
        }
        asJsonObject.addProperty("is_blocking_me", Boolean.valueOf(this.mIsBlockingMe));
        asJsonObject.addProperty("is_blocked_by_me", Boolean.valueOf(this.mIsBlockedByMe));
        asJsonObject.addProperty(StringSet.role, this.role.getValue());
        asJsonObject.addProperty(StringSet.is_muted, Boolean.valueOf(this.isMuted));
        return asJsonObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setIsBlockingMe(boolean z) {
        this.mIsBlockingMe = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setIsBlockedByMe(boolean z) {
        this.mIsBlockedByMe = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updatePropertiesBySender(Sender sender) {
        super.updatePropertiesByUser(sender);
        setIsBlockedByMe(sender.isBlockedByMe());
    }

    @Deprecated
    public InvitationState getState() {
        InvitationState invitationState = InvitationState.INVITED;
        if (this.mState == MemberState.INVITED) {
            return InvitationState.INVITED;
        }
        return this.mState == MemberState.JOINED ? InvitationState.JOINED : invitationState;
    }

    public MemberState getMemberState() {
        return this.mState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setState(MemberState memberState) {
        this.mState = memberState;
    }

    public boolean isBlockingMe() {
        return this.mIsBlockingMe;
    }

    public boolean isBlockedByMe() {
        return this.mIsBlockedByMe;
    }

    public Role getRole() {
        return this.role;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setRole(Role role) {
        this.role = role;
    }

    public boolean isMuted() {
        return this.isMuted;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMuted(boolean z) {
        this.isMuted = z;
    }

    @Override // com.sendbird.android.User
    public String toString() {
        return super.toString() + "\nMember{mState=" + this.mState + ", mIsBlockingMe=" + this.mIsBlockingMe + ", mIsBlockedByMe=" + this.mIsBlockedByMe + ", role=" + this.role + ", isMuted=" + this.isMuted + '}';
    }
}
