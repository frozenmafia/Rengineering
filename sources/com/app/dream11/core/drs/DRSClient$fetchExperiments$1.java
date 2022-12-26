package com.app.dream11.core.drs;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.ViewPropertyAnimatorCompatSet;
import o.playSequentially;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes2.dex */
public final class DRSClient$fetchExperiments$1 extends Lambda implements Styleable.ChangeBounds<Map<String, ? extends playSequentially>, setAnimationMatrix> {
    final /* synthetic */ long $startTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DRSClient$fetchExperiments$1(long j) {
        super(1);
        this.$startTime = j;
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Map<String, ? extends playSequentially> map) {
        invoke2((Map<String, playSequentially>) map);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, playSequentially> map) {
        runAnimators.ag$a(map, "it");
        ViewPropertyAnimatorCompatSet.AnonymousClass1.values.toString(map, this.$startTime);
    }
}
