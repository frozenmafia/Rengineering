package com.app.dream11.fclogin;

import com.app.dream11Pro.R;
import kotlin.jvm.internal.Lambda;
import o.MenuPresenter;
import o.Styleable;
/* loaded from: classes3.dex */
final class FCLoginLoaderActivity$mFragmentHelper$2 extends Lambda implements Styleable.ArcMotion<MenuPresenter> {
    final /* synthetic */ FCLoginLoaderActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FCLoginLoaderActivity$mFragmentHelper$2(FCLoginLoaderActivity fCLoginLoaderActivity) {
        super(0);
        this.this$0 = fCLoginLoaderActivity;
    }

    @Override // o.Styleable.ArcMotion
    public final MenuPresenter invoke() {
        return new MenuPresenter(this.this$0.getSupportFragmentManager(), R.id.frameCustomLoader);
    }
}
