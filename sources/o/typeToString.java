package o;

import android.os.Bundle;
/* loaded from: classes3.dex */
public final class typeToString implements getColorFilter {
    public static final typeToString ah$a = new typeToString(1.0f);
    public static final getColorFilter$ah$a<typeToString> valueOf = checkResource.ah$a;
    public final float ag$a;
    private final int toString;
    public final float values;

    public typeToString(float f) {
        this(f, 1.0f);
    }

    public typeToString(float f, float f2) {
        FingerprintManagerCompat.toString(f > 0.0f);
        FingerprintManagerCompat.toString(f2 > 0.0f);
        this.values = f;
        this.ag$a = f2;
        this.toString = Math.round(f * 1000.0f);
    }

    public long values(long j) {
        return j * this.toString;
    }

    public typeToString toString(float f) {
        return new typeToString(f, this.ag$a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        typeToString typetostring = (typeToString) obj;
        return this.values == typetostring.values && this.ag$a == typetostring.ag$a;
    }

    public int hashCode() {
        return ((Float.floatToRawIntBits(this.values) + androidx.databinding.library.baseAdapters.BR.userTeamVM) * 31) + Float.floatToRawIntBits(this.ag$a);
    }

    public String toString() {
        return getElevationDegrees.values("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.values), Float.valueOf(this.ag$a));
    }

    @Override // o.getColorFilter
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(Integer.toString(0, 36), this.values);
        bundle.putFloat(Integer.toString(1, 36), this.ag$a);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ typeToString valueOf(Bundle bundle) {
        return new typeToString(bundle.getFloat(Integer.toString(0, 36), 1.0f), bundle.getFloat(Integer.toString(1, 36), 1.0f));
    }
}
