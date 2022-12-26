package com.fancode.core.respository;

import android.content.Context;
import kotlin.jvm.internal.Lambda;
import o.C$default$onPause;
import o.C$default$onStop;
import o.Styleable;
import o.access$enqueue;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class BaseRepository$authenticator$1$device$2 extends Lambda implements Styleable.ArcMotion<access$enqueue> {
    final /* synthetic */ C$default$onPause this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseRepository$authenticator$1$device$2(C$default$onPause c$default$onPause) {
        super(0);
        this.this$0 = c$default$onPause;
    }

    @Override // o.Styleable.ArcMotion
    public final access$enqueue invoke() {
        Context context = this.this$0.invoke;
        if (context == null) {
            runAnimators.valueOf("context");
            context = null;
        }
        return C$default$onStop.toString(context);
    }
}
