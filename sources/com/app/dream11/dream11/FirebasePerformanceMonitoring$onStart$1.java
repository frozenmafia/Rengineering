package com.app.dream11.dream11;

import com.google.firebase.perf.metrics.Trace;
import java.util.HashMap;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.doesTransientStatePreventRecycling;
import o.onExtraCommand;
import o.setAnimationMatrix;
/* loaded from: classes.dex */
public final class FirebasePerformanceMonitoring$onStart$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $mapKeyTrace;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebasePerformanceMonitoring$onStart$1(String str) {
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
        Trace trace;
        HashMap hashMap;
        onExtraCommand onextracommand = onExtraCommand.ag$a;
        onExtraCommand.valueOf = doesTransientStatePreventRecycling.values().values(this.$mapKeyTrace);
        trace = onExtraCommand.valueOf;
        if (trace == null) {
            return;
        }
        String str = this.$mapKeyTrace;
        trace.HaptikSDK$d();
        hashMap = onExtraCommand.ah$a;
        hashMap.put(str, trace);
    }
}
