package com.app.dream11.contest;

import kotlin.jvm.internal.Lambda;
import o.ActionBar;
import o.Styleable;
/* loaded from: classes.dex */
public final class ContestHomePresenter$wlsSlug$2 extends Lambda implements Styleable.ArcMotion<String> {
    final /* synthetic */ ActionBar.Tab this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContestHomePresenter$wlsSlug$2(ActionBar.Tab tab) {
        super(0);
        this.this$0 = tab;
    }

    @Override // o.Styleable.ArcMotion
    public final String invoke() {
        String wlsSlug = ActionBar.Tab.HaptikSDK$a(this.this$0).getWlsSlug();
        return wlsSlug == null ? ActionBar.Tab.valueOf(this.this$0).getActiveGameConfig().getWLSSlug() : wlsSlug;
    }
}
