package com.app.dream11.login;

import kotlin.jvm.internal.Lambda;
import o.JobIntentService;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class RegisterFragment$settingInfoDialog$2 extends Lambda implements Styleable.ArcMotion<JobIntentService> {
    final /* synthetic */ RegisterFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterFragment$settingInfoDialog$2(RegisterFragment registerFragment) {
        super(0);
        this.this$0 = registerFragment;
    }

    @Override // o.Styleable.ArcMotion
    public final JobIntentService invoke() {
        return new JobIntentService(this.this$0.getBaseActivity(), this.this$0);
    }
}
