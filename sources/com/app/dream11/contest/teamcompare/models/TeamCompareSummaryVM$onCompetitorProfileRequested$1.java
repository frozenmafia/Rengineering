package com.app.dream11.contest.teamcompare.models;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.ToolbarActionBar;
import o.onItemSelected;
import o.popOutdatedAttrHolders;
import o.setAnimationMatrix;
/* loaded from: classes.dex */
public final class TeamCompareSummaryVM$onCompetitorProfileRequested$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ onItemSelected this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamCompareSummaryVM$onCompetitorProfileRequested$1(onItemSelected onitemselected) {
        super(0);
        this.this$0 = onitemselected;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ToolbarActionBar.ToolbarCallbackWrapper ah$a;
        popOutdatedAttrHolders isLogoutPending = this.this$0.isLogoutPending();
        if (isLogoutPending == null || (ah$a = isLogoutPending.ah$a()) == null) {
            return;
        }
        this.this$0.a().toString(ah$a.invoke(), ah$a.valueOf());
    }
}
