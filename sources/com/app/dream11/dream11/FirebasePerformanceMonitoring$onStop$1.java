package com.app.dream11.dream11;

import com.google.firebase.perf.metrics.Trace;
import java.util.HashMap;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onExtraCommand;
import o.setAnimationMatrix;
/* loaded from: classes.dex */
public final class FirebasePerformanceMonitoring$onStop$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $mapKeyTrace;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebasePerformanceMonitoring$onStop$1(String str) {
        super(0);
        this.$mapKeyTrace = str;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HashMap hashMap;
        HashMap hashMap2;
        hashMap = onExtraCommand.ah$a;
        Trace trace = (Trace) hashMap.get(this.$mapKeyTrace);
        if (trace == null) {
            return;
        }
        String str = this.$mapKeyTrace;
        trace.ak();
        hashMap2 = onExtraCommand.ah$a;
        hashMap2.remove(str);
    }
}
