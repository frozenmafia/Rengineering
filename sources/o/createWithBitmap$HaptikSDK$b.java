package o;

import android.os.Bundle;
import com.google.android.exoplayer2.C;
/* loaded from: classes3.dex */
public final class createWithBitmap$HaptikSDK$b implements getColorFilter {
    public static final createWithBitmap$HaptikSDK$b ah$a = new toString().valueOf();
    public static final getColorFilter$ah$a<createWithBitmap$HaptikSDK$b> valueOf = createLegacyIconFromAdaptiveIcon.ag$a;
    public final long HaptikSDK$b;
    public final float ag$a;
    public final float ah$b;
    public final long toString;
    public final long values;

    /* loaded from: classes3.dex */
    public static final class toString {
        private long ag$a;
        private long ah$a;
        private long toString;
        private float valueOf;
        private float values;

        public toString() {
            this.ag$a = C.TIME_UNSET;
            this.ah$a = C.TIME_UNSET;
            this.toString = C.TIME_UNSET;
            this.valueOf = -3.4028235E38f;
            this.values = -3.4028235E38f;
        }

        private toString(createWithBitmap$HaptikSDK$b createwithbitmap_haptiksdk_b) {
            this.ag$a = createwithbitmap_haptiksdk_b.HaptikSDK$b;
            this.ah$a = createwithbitmap_haptiksdk_b.values;
            this.toString = createwithbitmap_haptiksdk_b.toString;
            this.valueOf = createwithbitmap_haptiksdk_b.ah$b;
            this.values = createwithbitmap_haptiksdk_b.ag$a;
        }

        public toString ag$a(long j) {
            this.ag$a = j;
            return this;
        }

        public toString values(long j) {
            this.ah$a = j;
            return this;
        }

        public toString toString(long j) {
            this.toString = j;
            return this;
        }

        public toString ah$a(float f) {
            this.valueOf = f;
            return this;
        }

        public toString toString(float f) {
            this.values = f;
            return this;
        }

        public createWithBitmap$HaptikSDK$b valueOf() {
            return new createWithBitmap$HaptikSDK$b(this);
        }
    }

    private createWithBitmap$HaptikSDK$b(toString tostring) {
        this(tostring.ag$a, tostring.ah$a, tostring.toString, tostring.valueOf, tostring.values);
    }

    @Deprecated
    public createWithBitmap$HaptikSDK$b(long j, long j2, long j3, float f, float f2) {
        this.HaptikSDK$b = j;
        this.values = j2;
        this.toString = j3;
        this.ah$b = f;
        this.ag$a = f2;
    }

    public toString ag$a() {
        return new toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof createWithBitmap$HaptikSDK$b) {
            createWithBitmap$HaptikSDK$b createwithbitmap_haptiksdk_b = (createWithBitmap$HaptikSDK$b) obj;
            return this.HaptikSDK$b == createwithbitmap_haptiksdk_b.HaptikSDK$b && this.values == createwithbitmap_haptiksdk_b.values && this.toString == createwithbitmap_haptiksdk_b.toString && this.ah$b == createwithbitmap_haptiksdk_b.ah$b && this.ag$a == createwithbitmap_haptiksdk_b.ag$a;
        }
        return false;
    }

    public int hashCode() {
        long j = this.HaptikSDK$b;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.values;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.toString;
        int i3 = (int) (j3 ^ (j3 >>> 32));
        float f = this.ah$b;
        int floatToIntBits = f != 0.0f ? Float.floatToIntBits(f) : 0;
        float f2 = this.ag$a;
        return (((((((i * 31) + i2) * 31) + i3) * 31) + floatToIntBits) * 31) + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }

    @Override // o.getColorFilter
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putLong(Integer.toString(0, 36), this.HaptikSDK$b);
        bundle.putLong(Integer.toString(1, 36), this.values);
        bundle.putLong(Integer.toString(2, 36), this.toString);
        bundle.putFloat(Integer.toString(3, 36), this.ah$b);
        bundle.putFloat(Integer.toString(4, 36), this.ag$a);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ createWithBitmap$HaptikSDK$b toString(Bundle bundle) {
        return new createWithBitmap$HaptikSDK$b(bundle.getLong(Integer.toString(0, 36), C.TIME_UNSET), bundle.getLong(Integer.toString(1, 36), C.TIME_UNSET), bundle.getLong(Integer.toString(2, 36), C.TIME_UNSET), bundle.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle.getFloat(Integer.toString(4, 36), -3.4028235E38f));
    }
}
