package com.app.dream11.login;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onFrameMetricsAvailable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class RegisterFragment$errorDialog$2 extends Lambda implements Styleable.ArcMotion<onFrameMetricsAvailable> {
    final /* synthetic */ RegisterFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterFragment$errorDialog$2(RegisterFragment registerFragment) {
        super(0);
        this.this$0 = registerFragment;
    }

    @Override // o.Styleable.ArcMotion
    public final onFrameMetricsAvailable invoke() {
        return new onFrameMetricsAvailable(this.this$0.getBaseActivity(), this.this$0);
    }
}
