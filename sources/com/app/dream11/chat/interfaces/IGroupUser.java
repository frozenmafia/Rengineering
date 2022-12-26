package com.app.dream11.chat.interfaces;
/* loaded from: classes.dex */
public interface IGroupUser extends IChatUser {
    boolean getHasMemberJoined();

    boolean isAdmin();

    boolean isMemberInvited();

    void setAdmin(boolean z);
}
