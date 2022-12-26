package com.app.dream11.contest.ui.preroundlock;

import com.app.dream11.model.FlowState;
import kotlin.jvm.internal.Lambda;
import o.FontResourcesParserCompat;
import o.Styleable;
import o.isConstantSize;
/* loaded from: classes2.dex */
public final class JoinedContestPreRoundLockPresenter$matchIdFromFlowState$2 extends Lambda implements Styleable.ArcMotion<Integer> {
    final /* synthetic */ isConstantSize this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinedContestPreRoundLockPresenter$matchIdFromFlowState$2(isConstantSize isconstantsize) {
        super(0);
        this.this$0 = isconstantsize;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final Integer invoke() {
        FlowState isconstantsize = isConstantSize.toString(this.this$0);
        return Integer.valueOf(FontResourcesParserCompat.ProviderResourceEntry.ag$a(isconstantsize == null ? null : isconstantsize.getExtra("roundID"), -1));
    }
}
