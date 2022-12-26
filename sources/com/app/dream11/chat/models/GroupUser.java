package com.app.dream11.chat.models;

import com.app.dream11.chat.interfaces.IGroupUser;
import com.sendbird.android.Member;
import com.sendbird.android.constant.StringSet;
import o.runAnimators;
/* loaded from: classes.dex */
public final class GroupUser extends ChatUser implements IGroupUser {
    private boolean isAdmin;
    private final Member member;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupUser(Member member, String str, String str2, boolean z) {
        super(member, str, str2, z);
        runAnimators.ag$a(member, StringSet.member);
        this.member = member;
        this.isAdmin = member.getRole() == Member.Role.OPERATOR;
    }

    @Override // com.app.dream11.chat.interfaces.IGroupUser
    public boolean isAdmin() {
        return this.isAdmin;
    }

    @Override // com.app.dream11.chat.interfaces.IGroupUser
    public void setAdmin(boolean z) {
        this.isAdmin = z;
    }

    @Override // com.app.dream11.chat.interfaces.IGroupUser
    public boolean getHasMemberJoined() {
        return this.member.getMemberState() == Member.MemberState.JOINED;
    }

    @Override // com.app.dream11.chat.interfaces.IGroupUser
    public boolean isMemberInvited() {
        return this.member.getMemberState() == Member.MemberState.INVITED;
    }
}
