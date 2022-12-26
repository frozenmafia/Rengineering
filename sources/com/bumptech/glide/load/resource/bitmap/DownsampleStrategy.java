package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import o.updateMargins;
/* loaded from: classes3.dex */
public abstract class DownsampleStrategy {
    public static final updateMargins<DownsampleStrategy> HaptikSDK$b;
    public static final DownsampleStrategy HaptikSDK$c;
    public static final DownsampleStrategy ag$a;
    static final boolean ah$b;
    public static final DownsampleStrategy values;
    public static final DownsampleStrategy valueOf = new toString();
    public static final DownsampleStrategy ah$a = new values();
    public static final DownsampleStrategy HaptikSDK$a = new DownsampleStrategy() { // from class: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$ah$a
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float valueOf(int i, int i2, int i3, int i4) {
            if (ah$b) {
                return Math.min(i3 / i, i4 / i2);
            }
            int max = Math.max(i2 / i4, i / i3);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(max);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public DownsampleStrategy.SampleSizeRounding ah$a(int i, int i2, int i3, int i4) {
            if (ah$b) {
                return DownsampleStrategy.SampleSizeRounding.QUALITY;
            }
            return DownsampleStrategy.SampleSizeRounding.MEMORY;
        }
    };
    public static final DownsampleStrategy toString = new valueOf();

    /* loaded from: classes3.dex */
    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    public abstract SampleSizeRounding ah$a(int i, int i2, int i3, int i4);

    public abstract float valueOf(int i, int i2, int i3, int i4);

    static {
        DownsampleStrategy downsampleStrategy = new DownsampleStrategy() { // from class: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$ag$a
            @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
            public float valueOf(int i, int i2, int i3, int i4) {
                return Math.max(i3 / i, i4 / i2);
            }

            @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
            public DownsampleStrategy.SampleSizeRounding ah$a(int i, int i2, int i3, int i4) {
                return DownsampleStrategy.SampleSizeRounding.QUALITY;
            }
        };
        ag$a = downsampleStrategy;
        HaptikSDK$c = new invoke();
        values = downsampleStrategy;
        HaptikSDK$b = updateMargins.valueOf("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", downsampleStrategy);
        ah$b = Build.VERSION.SDK_INT >= 19;
    }

    /* loaded from: classes3.dex */
    static class toString extends DownsampleStrategy {
        toString() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float valueOf(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(min);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding ah$a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }
    }

    /* loaded from: classes3.dex */
    static class values extends DownsampleStrategy {
        values() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float valueOf(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            int max = Math.max(1, Integer.highestOneBit(ceil));
            return 1.0f / (max << (max >= ceil ? 0 : 1));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding ah$a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.MEMORY;
        }
    }

    /* loaded from: classes3.dex */
    static class invoke extends DownsampleStrategy {
        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float valueOf(int i, int i2, int i3, int i4) {
            return 1.0f;
        }

        invoke() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding ah$a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }
    }

    /* loaded from: classes3.dex */
    static class valueOf extends DownsampleStrategy {
        valueOf() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float valueOf(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, HaptikSDK$a.valueOf(i, i2, i3, i4));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding ah$a(int i, int i2, int i3, int i4) {
            if (valueOf(i, i2, i3, i4) == 1.0f) {
                return SampleSizeRounding.QUALITY;
            }
            return HaptikSDK$a.ah$a(i, i2, i3, i4);
        }
    }
}
