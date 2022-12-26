package com.app.dream11.chat.sendbird;

import com.sendbird.android.Member;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BaseChatChannel$getGroupMemberInfo$1$1$userList$1 extends Lambda implements Styleable.ChangeBounds<Member, Boolean> {
    final /* synthetic */ String $userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseChatChannel$getGroupMemberInfo$1$1$userList$1(String str) {
        super(1);
        this.$userId = str;
    }

    @Override // o.Styleable.ChangeBounds
    public final Boolean invoke(Member member) {
        return Boolean.valueOf(runAnimators.values((Object) member.getUserId(), (Object) this.$userId));
    }
}
