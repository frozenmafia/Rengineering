package com.app.dream11.chat.chatlist;

import com.app.dream11.chat.chatlist.ChatListItemVM;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChatListItemVM$onContestInviteBandClicked$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ ChatListItemVM this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListItemVM$onContestInviteBandClicked$1(ChatListItemVM chatListItemVM) {
        super(0);
        this.this$0 = chatListItemVM;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ChatListItemVM.ChatListItemListener handler = this.this$0.getHandler();
        if (handler == null) {
            return;
        }
        String channelUrl = this.this$0.getGroup().getChannelUrl();
        String channelType = this.this$0.getGroup().getChannelType();
        int participantCount = this.this$0.getGroup().getParticipantCount();
        Integer num = this.this$0.getContestInviteCount().get();
        if (num == null) {
            num = 0;
        }
        handler.onContestInviteBandClick(channelUrl, channelType, participantCount, num.intValue());
    }
}
