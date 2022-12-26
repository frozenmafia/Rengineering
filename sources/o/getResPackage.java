package o;

import android.os.Bundle;
/* loaded from: classes3.dex */
public final class getResPackage extends onPostParceling {
    public static final getColorFilter$ah$a<getResPackage> ah$a = createWithData.values;
    private final float ag$a;

    public getResPackage() {
        this.ag$a = -1.0f;
    }

    public getResPackage(float f) {
        FingerprintManagerCompat.toString(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.ag$a = f;
    }

    public int hashCode() {
        return recycleUpdateOp.valueOf(Float.valueOf(this.ag$a));
    }

    public boolean equals(Object obj) {
        return (obj instanceof getResPackage) && this.ag$a == ((getResPackage) obj).ag$a;
    }

    @Override // o.getColorFilter
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(values(0), 1);
        bundle.putFloat(values(1), this.ag$a);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static getResPackage valueOf(Bundle bundle) {
        FingerprintManagerCompat.toString(bundle.getInt(values(0), -1) == 1);
        float f = bundle.getFloat(values(1), -1.0f);
        return f == -1.0f ? new getResPackage() : new getResPackage(f);
    }

    private static String values(int i) {
        return Integer.toString(i, 36);
    }
}
