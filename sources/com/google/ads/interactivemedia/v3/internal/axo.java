package com.google.ads.interactivemedia.v3.internal;

import sun.misc.Unsafe;
/* loaded from: classes4.dex */
public final /* synthetic */ class axo {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
