package com.app.dream11.leaguelisting.brightcovepip;

import android.widget.FrameLayout;
import kotlin.jvm.internal.Lambda;
import o.AnyRes;
import o.MenuPresenter;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class BrightcovePipActivity$brightcovePipActivityFragHelper$2 extends Lambda implements Styleable.ArcMotion<MenuPresenter> {
    final /* synthetic */ BrightcovePipActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrightcovePipActivity$brightcovePipActivityFragHelper$2(BrightcovePipActivity brightcovePipActivity) {
        super(0);
        this.this$0 = brightcovePipActivity;
    }

    @Override // o.Styleable.ArcMotion
    public final MenuPresenter invoke() {
        return new MenuPresenter(this.this$0.getSupportFragmentManager(), ((FrameLayout) this.this$0.valueOf(AnyRes.values.container)).getId());
    }
}
