package com.app.dream11.chat.groupshare.presenter;

import com.app.dream11.chat.interfaces.IChatChannel;
import com.app.dream11.chat.models.ChatContestCard;
import com.app.dream11.chat.sendbird.ChatChannelMessageEvent;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.SupportSQLiteQuery;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SelectGroupPresenter$sendContestToGroups$1$3$1 extends Lambda implements Styleable.ChangeBounds<IChatChannel, SupportSQLiteQuery<ChatChannelMessageEvent>> {
    final /* synthetic */ ChatContestCard $contestCard;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectGroupPresenter$sendContestToGroups$1$3$1(ChatContestCard chatContestCard) {
        super(1);
        this.$contestCard = chatContestCard;
    }

    @Override // o.Styleable.ChangeBounds
    public final SupportSQLiteQuery<ChatChannelMessageEvent> invoke(IChatChannel iChatChannel) {
        runAnimators.ag$a(iChatChannel, "it");
        ChatContestCard chatContestCard = this.$contestCard;
        runAnimators.ah$a(chatContestCard, "contestCard");
        return iChatChannel.sendContestToGroup(chatContestCard, false, false);
    }
}
