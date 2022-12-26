package com.app.dream11.dream11;

import com.google.firebase.perf.metrics.Trace;
import java.util.HashMap;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onExtraCommand;
import o.setAnimationMatrix;
/* loaded from: classes.dex */
public final class FirebasePerformanceMonitoring$addCustomTrace$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $mapKeyTrace;
    final /* synthetic */ String $property;
    final /* synthetic */ long $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebasePerformanceMonitoring$addCustomTrace$1(String str, String str2, long j) {
        super(0);
        this.$mapKeyTrace = str;
        this.$property = str2;
        this.$value = j;
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
        hashMap = onExtraCommand.ah$a;
        Trace trace = (Trace) hashMap.get(this.$mapKeyTrace);
        if (trace == null) {
            return;
        }
        trace.ah$a(this.$property, String.valueOf(this.$value));
    }
}
