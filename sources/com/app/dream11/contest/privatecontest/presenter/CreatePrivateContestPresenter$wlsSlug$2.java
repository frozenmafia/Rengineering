package com.app.dream11.contest.privatecontest.presenter;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onProvideKeyboardShortcuts;
/* loaded from: classes.dex */
public final class CreatePrivateContestPresenter$wlsSlug$2 extends Lambda implements Styleable.ArcMotion<String> {
    final /* synthetic */ onProvideKeyboardShortcuts this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePrivateContestPresenter$wlsSlug$2(onProvideKeyboardShortcuts onprovidekeyboardshortcuts) {
        super(0);
        this.this$0 = onprovidekeyboardshortcuts;
    }

    @Override // o.Styleable.ArcMotion
    public final String invoke() {
        String wlsSlug = onProvideKeyboardShortcuts.ag$a(this.this$0).getWlsSlug();
        return wlsSlug == null ? onProvideKeyboardShortcuts.values(this.this$0).getActiveGameConfig().getWLSSlug() : wlsSlug;
    }
}
