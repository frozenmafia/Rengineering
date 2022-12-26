package o;

import android.os.Bundle;
/* loaded from: classes3.dex */
public final class toAdaptiveIcon extends onPostParceling {
    public static final getColorFilter$ah$a<toAdaptiveIcon> ah$a = computeBitmapSize.values;
    private final boolean ag$a;
    private final boolean values;

    public toAdaptiveIcon() {
        this.values = false;
        this.ag$a = false;
    }

    public toAdaptiveIcon(boolean z) {
        this.values = true;
        this.ag$a = z;
    }

    public int hashCode() {
        return recycleUpdateOp.valueOf(Boolean.valueOf(this.values), Boolean.valueOf(this.ag$a));
    }

    public boolean equals(Object obj) {
        if (obj instanceof toAdaptiveIcon) {
            toAdaptiveIcon toadaptiveicon = (toAdaptiveIcon) obj;
            return this.ag$a == toadaptiveicon.ag$a && this.values == toadaptiveicon.values;
        }
        return false;
    }

    @Override // o.getColorFilter
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(toString(0), 3);
        bundle.putBoolean(toString(1), this.values);
        bundle.putBoolean(toString(2), this.ag$a);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static toAdaptiveIcon toString(Bundle bundle) {
        FingerprintManagerCompat.toString(bundle.getInt(toString(0), -1) == 3);
        if (bundle.getBoolean(toString(1), false)) {
            return new toAdaptiveIcon(bundle.getBoolean(toString(2), false));
        }
        return new toAdaptiveIcon();
    }

    private static String toString(int i) {
        return Integer.toString(i, 36);
    }
}
