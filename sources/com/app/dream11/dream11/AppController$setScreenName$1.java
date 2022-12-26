package com.app.dream11.dream11;

import kotlin.jvm.internal.Lambda;
import o.NotificationApiHelperForO;
import o.Styleable;
import o.attachCompleter;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class AppController$setScreenName$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $screenName;
    final /* synthetic */ attachCompleter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppController$setScreenName$1(attachCompleter attachcompleter, String str) {
        super(0);
        this.this$0 = attachcompleter;
        this.$screenName = str;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NotificationApiHelperForO ITrustedWebActivityCallback$Default;
        ITrustedWebActivityCallback$Default = this.this$0.ITrustedWebActivityCallback$Default();
        ITrustedWebActivityCallback$Default.ah$a(this.$screenName);
    }
}
