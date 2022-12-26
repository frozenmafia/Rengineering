package com.app.dream11.chat.ui;

import o.runAnimators;
/* loaded from: classes.dex */
public final class ChatInfo {
    private final String channelUrl;
    private final String chatType;
    private final String mappedType;
    private final String profilePic;

    public static /* synthetic */ ChatInfo copy$default(ChatInfo chatInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatInfo.channelUrl;
        }
        if ((i & 2) != 0) {
            str2 = chatInfo.profilePic;
        }
        if ((i & 4) != 0) {
            str3 = chatInfo.chatType;
        }
        if ((i & 8) != 0) {
            str4 = chatInfo.mappedType;
        }
        return chatInfo.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.channelUrl;
    }

    public final String component2() {
        return this.profilePic;
    }

    public final String component3() {
        return this.chatType;
    }

    public final String component4() {
        return this.mappedType;
    }

    public final ChatInfo copy(String str, String str2, String str3, String str4) {
        runAnimators.ag$a(str, "channelUrl");
        runAnimators.ag$a(str3, "chatType");
        runAnimators.ag$a(str4, "mappedType");
        return new ChatInfo(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatInfo) {
            ChatInfo chatInfo = (ChatInfo) obj;
            return runAnimators.values((Object) this.channelUrl, (Object) chatInfo.channelUrl) && runAnimators.values((Object) this.profilePic, (Object) chatInfo.profilePic) && runAnimators.values((Object) this.chatType, (Object) chatInfo.chatType) && runAnimators.values((Object) this.mappedType, (Object) chatInfo.mappedType);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.channelUrl.hashCode();
        String str = this.profilePic;
        return (((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.chatType.hashCode()) * 31) + this.mappedType.hashCode();
    }

    public String toString() {
        String str = this.channelUrl;
        String str2 = this.profilePic;
        String str3 = this.chatType;
        String str4 = this.mappedType;
        return "ChatInfo(channelUrl=" + str + ", profilePic=" + str2 + ", chatType=" + str3 + ", mappedType=" + str4 + ")";
    }

    public ChatInfo(String str, String str2, String str3, String str4) {
        runAnimators.ag$a(str, "channelUrl");
        runAnimators.ag$a(str3, "chatType");
        runAnimators.ag$a(str4, "mappedType");
        this.channelUrl = str;
        this.profilePic = str2;
        this.chatType = str3;
        this.mappedType = str4;
    }

    public final String getChannelUrl() {
        return this.channelUrl;
    }

    public final String getProfilePic() {
        return this.profilePic;
    }

    public final String getChatType() {
        return this.chatType;
    }

    public final String getMappedType() {
        return this.mappedType;
    }
}
