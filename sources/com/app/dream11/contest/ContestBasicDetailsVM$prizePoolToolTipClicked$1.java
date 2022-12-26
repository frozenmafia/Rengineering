package com.app.dream11.contest;

import com.app.dream11.core.service.graphql.api.WinningBreakupQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.compareStrings;
import o.getElevation;
import o.isActivityManifestHandlingUiMode$ah$a;
import o.setAnimationMatrix;
/* loaded from: classes.dex */
public final class ContestBasicDetailsVM$prizePoolToolTipClicked$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $message;
    final /* synthetic */ getElevation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContestBasicDetailsVM$prizePoolToolTipClicked$1(getElevation getelevation, String str) {
        super(0);
        this.this$0 = getelevation;
        this.$message = str;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        compareStrings comparestrings;
        isActivityManifestHandlingUiMode$ah$a ah$b = this.this$0.ah$b();
        comparestrings = this.this$0.ah$a;
        WinningBreakupQuery.Contest contest = (WinningBreakupQuery.Contest) comparestrings.invoke();
        ah$b.ah$a("PrizePool", contest == null ? null : contest.getId(), this.$message, "ContestCard");
    }
}
