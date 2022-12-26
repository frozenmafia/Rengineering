package com.app.dream11.dream11;

import android.view.View;
import com.app.dream11Pro.R;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes3.dex */
final class SplashActivity$mainView$2 extends Lambda implements Styleable.ArcMotion<View> {
    final /* synthetic */ SplashActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashActivity$mainView$2(SplashActivity splashActivity) {
        super(0);
        this.this$0 = splashActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final View invoke() {
        return this.this$0.findViewById(R.id.main);
    }
}
