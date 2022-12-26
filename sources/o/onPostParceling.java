package o;

import android.os.Bundle;
import o.IconCompat;
/* loaded from: classes3.dex */
public abstract class onPostParceling implements getColorFilter {
    public static final getColorFilter$ah$a<onPostParceling> toString = toIcon.toString;

    /* JADX INFO: Access modifiers changed from: private */
    public static onPostParceling ag$a(Bundle bundle) {
        int i = bundle.getInt(toString(0), -1);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return toAdaptiveIcon.ah$a.ah$a(bundle);
                    }
                    throw new IllegalArgumentException("Unknown RatingType: " + i);
                }
                return IconCompat.IconType.valueOf.ah$a(bundle);
            }
            return getResPackage.ah$a.ah$a(bundle);
        }
        return createFromBundle.valueOf.ah$a(bundle);
    }

    private static String toString(int i) {
        return Integer.toString(i, 36);
    }
}
