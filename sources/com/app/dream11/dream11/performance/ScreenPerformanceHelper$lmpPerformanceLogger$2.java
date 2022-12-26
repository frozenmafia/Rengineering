package com.app.dream11.dream11.performance;

import kotlin.jvm.internal.Lambda;
import o.Compatibility;
import o.Styleable;
import o.attachCompleter;
import o.setUseCompatPadding;
/* loaded from: classes6.dex */
public final class ScreenPerformanceHelper$lmpPerformanceLogger$2 extends Lambda implements Styleable.ArcMotion<Compatibility.Api15Impl> {
    final /* synthetic */ setUseCompatPadding this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScreenPerformanceHelper$lmpPerformanceLogger$2(setUseCompatPadding setusecompatpadding) {
        super(0);
        this.this$0 = setusecompatpadding;
    }

    @Override // o.Styleable.ArcMotion
    public final Compatibility.Api15Impl invoke() {
        String str;
        attachCompleter attachcompleter;
        str = this.this$0.ag$a;
        attachcompleter = this.this$0.values;
        return new Compatibility.Api15Impl(str, attachcompleter);
    }
}
