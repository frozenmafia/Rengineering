package com.dream11.analytics;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCallbacks;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes4.dex */
public final class EventTracker$batchingHelper$1 extends Lambda implements Styleable.ChangeBounds<Collection<? extends String>, setAnimationMatrix> {
    public static final EventTracker$batchingHelper$1 INSTANCE = new EventTracker$batchingHelper$1();

    EventTracker$batchingHelper$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(Collection<? extends String> collection) {
        invoke2((Collection<String>) collection);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Collection<String> collection) {
        runAnimators.valueOf(collection, "it");
        removeCallbacks.toString.ag$a(collection);
    }
}
