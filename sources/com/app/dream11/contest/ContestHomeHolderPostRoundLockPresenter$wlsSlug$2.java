package com.app.dream11.contest;

import com.app.dream11.model.FlowState;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setListNavigationCallbacks;
/* loaded from: classes.dex */
public final class ContestHomeHolderPostRoundLockPresenter$wlsSlug$2 extends Lambda implements Styleable.ArcMotion<String> {
    final /* synthetic */ setListNavigationCallbacks this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContestHomeHolderPostRoundLockPresenter$wlsSlug$2(setListNavigationCallbacks setlistnavigationcallbacks) {
        super(0);
        this.this$0 = setlistnavigationcallbacks;
    }

    @Override // o.Styleable.ArcMotion
    public final String invoke() {
        FlowState ah$a = setListNavigationCallbacks.ah$a(this.this$0);
        String wlsSlug = ah$a == null ? null : ah$a.getWlsSlug();
        return wlsSlug == null ? setListNavigationCallbacks.toString(this.this$0).getActiveGameConfig().getWLSSlug() : wlsSlug;
    }
}
