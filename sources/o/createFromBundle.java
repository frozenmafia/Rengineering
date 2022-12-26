package o;

import android.os.Bundle;
/* loaded from: classes3.dex */
public final class createFromBundle extends onPostParceling {
    public static final getColorFilter$ah$a<createFromBundle> valueOf = createWithAdaptiveBitmap.toString;
    private final boolean ag$a;
    private final boolean values;

    public createFromBundle() {
        this.values = false;
        this.ag$a = false;
    }

    public createFromBundle(boolean z) {
        this.values = true;
        this.ag$a = z;
    }

    public int hashCode() {
        return recycleUpdateOp.valueOf(Boolean.valueOf(this.values), Boolean.valueOf(this.ag$a));
    }

    public boolean equals(Object obj) {
        if (obj instanceof createFromBundle) {
            createFromBundle createfrombundle = (createFromBundle) obj;
            return this.ag$a == createfrombundle.ag$a && this.values == createfrombundle.values;
        }
        return false;
    }

    @Override // o.getColorFilter
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(toString(0), 0);
        bundle.putBoolean(toString(1), this.values);
        bundle.putBoolean(toString(2), this.ag$a);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static createFromBundle values(Bundle bundle) {
        FingerprintManagerCompat.toString(bundle.getInt(toString(0), -1) == 0);
        if (bundle.getBoolean(toString(1), false)) {
            return new createFromBundle(bundle.getBoolean(toString(2), false));
        }
        return new createFromBundle();
    }

    private static String toString(int i) {
        return Integer.toString(i, 36);
    }
}
