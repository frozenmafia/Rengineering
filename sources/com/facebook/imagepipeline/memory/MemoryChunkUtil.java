package com.facebook.imagepipeline.memory;

import o.Fragment;
/* loaded from: classes4.dex */
public class MemoryChunkUtil {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int adjustByteCount(int i, int i2, int i3) {
        return Math.min(Math.max(0, i3 - i), i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void checkBounds(int i, int i2, int i3, int i4, int i5) {
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i4 >= 0));
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i >= 0));
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i3 >= 0));
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i + i4 <= i5));
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(i3 + i4 <= i2));
    }
}
