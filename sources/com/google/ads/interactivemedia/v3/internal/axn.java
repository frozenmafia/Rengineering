package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes4.dex */
public final /* synthetic */ class axn {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
