package com.app.dream11.chat.viewmodels;

import com.app.dream11.chat.viewmodels.UserGlRankVm;
import com.app.dream11.core.service.graphql.api.Social.chat.GlRanksQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class UserGlRankVm$onEntryPointBandClicked$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ int $position;
    final /* synthetic */ UserGlRankVm this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserGlRankVm$onEntryPointBandClicked$1(UserGlRankVm userGlRankVm, int i) {
        super(0);
        this.this$0 = userGlRankVm;
        this.$position = i;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        UserGlRankVm.Handler handler = this.this$0.getHandler();
        GlRanksQuery.GlRank data = this.this$0.getData();
        Integer rank = data == null ? null : data.getRank();
        GlRanksQuery.GlRank data2 = this.this$0.getData();
        Integer valueOf = data2 == null ? null : Integer.valueOf(data2.getTourId());
        GlRanksQuery.GlRank data3 = this.this$0.getData();
        handler.onGroupLeaderboardRequested("chat_window_band", rank, "active", valueOf, data3 == null ? null : data3.getRankChange(), this.$position);
    }
}
