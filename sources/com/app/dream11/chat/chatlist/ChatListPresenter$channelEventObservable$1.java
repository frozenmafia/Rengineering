package com.app.dream11.chat.chatlist;

import com.app.dream11.chat.groups.ChannelData;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.SupportSQLiteQuery;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChatListPresenter$channelEventObservable$1 extends Lambda implements Styleable.ArcMotion<SupportSQLiteQuery<ChannelData>> {
    final /* synthetic */ ChatListPresenter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListPresenter$channelEventObservable$1(ChatListPresenter chatListPresenter) {
        super(0);
        this.this$0 = chatListPresenter;
    }

    @Override // o.Styleable.ArcMotion
    public final SupportSQLiteQuery<ChannelData> invoke() {
        return this.this$0.getChatFeature().subscribeChannelEvents();
    }
}
