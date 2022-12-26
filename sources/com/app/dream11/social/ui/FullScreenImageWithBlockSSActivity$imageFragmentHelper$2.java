package com.app.dream11.social.ui;

import android.widget.FrameLayout;
import kotlin.jvm.internal.Lambda;
import o.AnyRes;
import o.MenuPresenter;
import o.Styleable;
/* loaded from: classes3.dex */
final class FullScreenImageWithBlockSSActivity$imageFragmentHelper$2 extends Lambda implements Styleable.ArcMotion<MenuPresenter> {
    final /* synthetic */ FullScreenImageWithBlockSSActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenImageWithBlockSSActivity$imageFragmentHelper$2(FullScreenImageWithBlockSSActivity fullScreenImageWithBlockSSActivity) {
        super(0);
        this.this$0 = fullScreenImageWithBlockSSActivity;
    }

    @Override // o.Styleable.ArcMotion
    public final MenuPresenter invoke() {
        return new MenuPresenter(this.this$0.getSupportFragmentManager(), ((FrameLayout) this.this$0.valueOf(AnyRes.values.fl_full_image)).getId());
    }
}
