package com.facebook.imagepipeline.cache;

import com.facebook.common.memory.MemoryTrimType;
import com.facebook.imagepipeline.cache.MemoryCache;
import o.FragmentActivity;
/* loaded from: classes4.dex */
public class NativeMemoryCacheTrimStrategy implements MemoryCache.CacheTrimStrategy {
    private static final String TAG = "NativeMemoryCacheTrimStrategy";

    /* renamed from: com.facebook.imagepipeline.cache.NativeMemoryCacheTrimStrategy$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$common$memory$MemoryTrimType;

        static {
            int[] iArr = new int[MemoryTrimType.values().length];
            $SwitchMap$com$facebook$common$memory$MemoryTrimType = iArr;
            try {
                iArr[MemoryTrimType.OnCloseToDalvikHeapLimit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$common$memory$MemoryTrimType[MemoryTrimType.OnAppBackgrounded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$common$memory$MemoryTrimType[MemoryTrimType.OnSystemMemoryCriticallyLowWhileAppInForeground.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$common$memory$MemoryTrimType[MemoryTrimType.OnSystemLowMemoryWhileAppInForeground.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$common$memory$MemoryTrimType[MemoryTrimType.OnSystemLowMemoryWhileAppInBackground.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache.CacheTrimStrategy
    public double getTrimRatio(MemoryTrimType memoryTrimType) {
        int i = AnonymousClass1.$SwitchMap$com$facebook$common$memory$MemoryTrimType[memoryTrimType.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3 || i == 4 || i == 5) {
                return 1.0d;
            }
            FragmentActivity.toString(TAG, "unknown trim type: %s", memoryTrimType);
            return 0.0d;
        }
        return 0.0d;
    }
}
