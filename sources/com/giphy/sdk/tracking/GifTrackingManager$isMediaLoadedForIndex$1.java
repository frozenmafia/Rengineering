package com.giphy.sdk.tracking;

import kotlin.jvm.internal.FunctionReferenceImpl;
import o.LocalBroadcastManager;
import o.Styleable;
import o.setAnimationMatrix;
/* loaded from: classes4.dex */
public final /* synthetic */ class GifTrackingManager$isMediaLoadedForIndex$1 extends FunctionReferenceImpl implements Styleable.ArcMotion<setAnimationMatrix> {
    public GifTrackingManager$isMediaLoadedForIndex$1(LocalBroadcastManager localBroadcastManager) {
        super(0, localBroadcastManager, LocalBroadcastManager.class, "updateTracking", "updateTracking()V", 0);
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((LocalBroadcastManager) this.receiver).valueOf();
    }
}
