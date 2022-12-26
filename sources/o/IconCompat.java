package o;

import android.os.Bundle;
/* loaded from: classes3.dex */
public final /* synthetic */ class IconCompat implements getColorFilter$ah$a {
    public static final /* synthetic */ IconCompat valueOf = new IconCompat();

    private /* synthetic */ IconCompat() {
    }

    @Override // o.getColorFilter$ah$a
    public final getColorFilter ah$a(Bundle bundle) {
        createFromIcon values;
        values = createFromIcon.values(bundle);
        return values;
    }

    /* loaded from: classes3.dex */
    public final class IconType extends onPostParceling {
        public static final getColorFilter$ah$a<IconType> valueOf = IconKt.values;
        private final int ah$a;
        private final float values;

        public IconType(int i) {
            FingerprintManagerCompat.toString(i > 0, "maxStars must be a positive integer");
            this.ah$a = i;
            this.values = -1.0f;
        }

        public IconType(int i, float f) {
            boolean z = false;
            FingerprintManagerCompat.toString(i > 0, "maxStars must be a positive integer");
            if (f >= 0.0f && f <= i) {
                z = true;
            }
            FingerprintManagerCompat.toString(z, "starRating is out of range [0, maxStars]");
            this.ah$a = i;
            this.values = f;
        }

        public int hashCode() {
            return recycleUpdateOp.valueOf(Integer.valueOf(this.ah$a), Float.valueOf(this.values));
        }

        public boolean equals(Object obj) {
            if (obj instanceof IconType) {
                IconType iconType = (IconType) obj;
                return this.ah$a == iconType.ah$a && this.values == iconType.values;
            }
            return false;
        }

        @Override // o.getColorFilter
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(toString(0), 2);
            bundle.putInt(toString(1), this.ah$a);
            bundle.putFloat(toString(2), this.values);
            return bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static IconType values(Bundle bundle) {
            FingerprintManagerCompat.toString(bundle.getInt(toString(0), -1) == 2);
            int i = bundle.getInt(toString(1), 5);
            float f = bundle.getFloat(toString(2), -1.0f);
            if (f == -1.0f) {
                return new IconType(i);
            }
            return new IconType(i, f);
        }

        private static String toString(int i) {
            return Integer.toString(i, 36);
        }
    }
}
