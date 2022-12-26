package com.app.dream11.contest;

import com.app.dream11.model.FlowState;
import kotlin.jvm.internal.Lambda;
import o.FontResourcesParserCompat;
import o.Styleable;
import o.setListNavigationCallbacks;
/* loaded from: classes.dex */
public final class ContestHomeHolderPostRoundLockPresenter$deepLinkTabNameToRedirect$2 extends Lambda implements Styleable.ArcMotion<String> {
    final /* synthetic */ setListNavigationCallbacks this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContestHomeHolderPostRoundLockPresenter$deepLinkTabNameToRedirect$2(setListNavigationCallbacks setlistnavigationcallbacks) {
        super(0);
        this.this$0 = setlistnavigationcallbacks;
    }

    @Override // o.Styleable.ArcMotion
    public final String invoke() {
        FlowState ah$a = setListNavigationCallbacks.ah$a(this.this$0);
        return FontResourcesParserCompat.ProviderResourceEntry.valueOf(ah$a == null ? null : ah$a.getExtra("tab"), null);
    }
}
