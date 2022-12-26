package o;

import android.os.Bundle;
/* loaded from: classes3.dex */
public final class getSatelliteCount implements getColorFilter {
    public static final getSatelliteCount ag$a = new getSatelliteCount(0, 0);
    public static final getColorFilter$ah$a<getSatelliteCount> valueOf = onFirstFix.toString;
    public final int HaptikSDK$c;
    public final int ah$a;
    public final int toString;
    public final float values;

    public getSatelliteCount(int i, int i2) {
        this(i, i2, 0, 1.0f);
    }

    public getSatelliteCount(int i, int i2, int i3, float f) {
        this.HaptikSDK$c = i;
        this.toString = i2;
        this.ah$a = i3;
        this.values = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getSatelliteCount) {
            getSatelliteCount getsatellitecount = (getSatelliteCount) obj;
            return this.HaptikSDK$c == getsatellitecount.HaptikSDK$c && this.toString == getsatellitecount.toString && this.ah$a == getsatellitecount.ah$a && this.values == getsatellitecount.values;
        }
        return false;
    }

    public int hashCode() {
        int i = this.HaptikSDK$c;
        return ((((((i + 217) * 31) + this.toString) * 31) + this.ah$a) * 31) + Float.floatToRawIntBits(this.values);
    }

    @Override // o.getColorFilter
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(Integer.toString(0, 36), this.HaptikSDK$c);
        bundle.putInt(Integer.toString(1, 36), this.toString);
        bundle.putInt(Integer.toString(2, 36), this.ah$a);
        bundle.putFloat(Integer.toString(3, 36), this.values);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ getSatelliteCount valueOf(Bundle bundle) {
        return new getSatelliteCount(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0), bundle.getFloat(Integer.toString(3, 36), 1.0f));
    }
}
