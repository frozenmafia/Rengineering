package com.app.dream11.chat.presenters;

import com.app.dream11.chat.dynamiccard.teamshare.TeamShareEventsHelper;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes.dex */
final class BaseChatWindowPresenter$teamShareEventsHelper$2 extends Lambda implements Styleable.ArcMotion<TeamShareEventsHelper> {
    final /* synthetic */ BaseChatWindowPresenter<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseChatWindowPresenter$teamShareEventsHelper$2(BaseChatWindowPresenter<T> baseChatWindowPresenter) {
        super(0);
        this.this$0 = baseChatWindowPresenter;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final TeamShareEventsHelper invoke() {
        return new TeamShareEventsHelper(this.this$0.getSocialFeature(), BaseChatWindowPresenter.access$getChatChannel$p(this.this$0));
    }
}
