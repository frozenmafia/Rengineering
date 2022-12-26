package com.app.dream11.chat.presenters;

import com.app.dream11.core.service.graphql.api.Social.chat.GlRanksQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class GroupChatWindowPresenter$setGroupLeaderBoardData$2 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ GlRanksQuery.Data $data;
    final /* synthetic */ boolean $shouldShowViewAll;
    final /* synthetic */ GroupChatWindowPresenter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupChatWindowPresenter$setGroupLeaderBoardData$2(GroupChatWindowPresenter groupChatWindowPresenter, GlRanksQuery.Data data, boolean z) {
        super(0);
        this.this$0 = groupChatWindowPresenter;
        this.$data = data;
        this.$shouldShowViewAll = z;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.getChatEventHelper().trackGlBandLoaded(this.$data.getGlBand().getGlRanks().size(), this.$shouldShowViewAll);
    }
}
