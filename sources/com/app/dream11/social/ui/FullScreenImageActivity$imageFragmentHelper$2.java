package com.app.dream11.social.ui;

import android.widget.FrameLayout;
import kotlin.jvm.internal.Lambda;
import o.AnyRes;
import o.MenuPresenter;
import o.Styleable;
/* loaded from: classes3.dex */
final class FullScreenImageActivity$imageFragmentHelper$2 extends Lambda implements Styleable.ArcMotion<MenuPresenter> {
    final /* synthetic */ FullScreenImageActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenImageActivity$imageFragmentHelper$2(FullScreenImageActivity fullScreenImageActivity) {
        super(0);
        this.this$0 = fullScreenImageActivity;
    }

    @Override // o.Styleable.ArcMotion
    public final MenuPresenter invoke() {
        return new MenuPresenter(this.this$0.getSupportFragmentManager(), ((FrameLayout) this.this$0.ah$a(AnyRes.values.fl_full_image)).getId());
    }
}
