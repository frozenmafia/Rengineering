package com.app.dream11.contest.ui.preroundlock;

import com.app.dream11.model.FlowState;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.isConstantSize;
/* loaded from: classes2.dex */
public final class JoinedContestPreRoundLockPresenter$wlsSlug$2 extends Lambda implements Styleable.ArcMotion<String> {
    final /* synthetic */ isConstantSize this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinedContestPreRoundLockPresenter$wlsSlug$2(isConstantSize isconstantsize) {
        super(0);
        this.this$0 = isconstantsize;
    }

    @Override // o.Styleable.ArcMotion
    public final String invoke() {
        FlowState isconstantsize = isConstantSize.toString(this.this$0);
        String wlsSlug = isconstantsize == null ? null : isconstantsize.getWlsSlug();
        return wlsSlug == null ? isConstantSize.values(this.this$0).getActiveGameConfig().getWLSSlug() : wlsSlug;
    }
}
