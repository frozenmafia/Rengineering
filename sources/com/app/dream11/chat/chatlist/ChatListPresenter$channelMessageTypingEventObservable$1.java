package com.app.dream11.chat.chatlist;

import com.app.dream11.chat.GroupTypingEvent;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.SupportSQLiteQuery;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChatListPresenter$channelMessageTypingEventObservable$1 extends Lambda implements Styleable.ArcMotion<SupportSQLiteQuery<GroupTypingEvent>> {
    final /* synthetic */ ChatListPresenter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListPresenter$channelMessageTypingEventObservable$1(ChatListPresenter chatListPresenter) {
        super(0);
        this.this$0 = chatListPresenter;
    }

    @Override // o.Styleable.ArcMotion
    public final SupportSQLiteQuery<GroupTypingEvent> invoke() {
        return this.this$0.getChatFeature().subscribeTypingEvent();
    }
}
