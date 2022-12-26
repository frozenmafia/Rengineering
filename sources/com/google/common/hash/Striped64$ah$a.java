package com.google.common.hash;

import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class Striped64$ah$a {
    private static final long ah$a;
    private static final Unsafe toString;
    volatile long valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Striped64$ah$a(long j) {
        this.valueOf = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean valueOf(long j, long j2) {
        return toString.compareAndSwapLong(this, ah$a, j, j2);
    }

    static {
        Unsafe unsafe;
        try {
            unsafe = Striped64.getUnsafe();
            toString = unsafe;
            ah$a = unsafe.objectFieldOffset(Striped64$ah$a.class.getDeclaredField("valueOf"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }
}
