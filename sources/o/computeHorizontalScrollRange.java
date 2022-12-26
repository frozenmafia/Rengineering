package o;

import android.content.res.Resources;
/* loaded from: classes3.dex */
public final class computeHorizontalScrollRange {
    public final int valueOf;
    public final float values;

    public computeHorizontalScrollRange(int i, float f) {
        this.valueOf = i;
        this.values = f;
        if (true ^ (f == 0.0f)) {
            return;
        }
        throw new IllegalArgumentException(("mass=" + ah$a() + " must be != 0").toString());
    }

    public final float ah$a() {
        return this.values;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof computeHorizontalScrollRange) {
            computeHorizontalScrollRange computehorizontalscrollrange = (computeHorizontalScrollRange) obj;
            return this.valueOf == computehorizontalscrollrange.valueOf && runAnimators.values(Float.valueOf(this.values), Float.valueOf(computehorizontalscrollrange.values));
        }
        return false;
    }

    public int hashCode() {
        return (this.valueOf * 31) + Float.floatToIntBits(this.values);
    }

    public String toString() {
        return "Size(sizeInDp=" + this.valueOf + ", mass=" + this.values + ')';
    }

    public final float values() {
        return this.valueOf * Resources.getSystem().getDisplayMetrics().density;
    }

    public /* synthetic */ computeHorizontalScrollRange(int i, float f, int i2) {
        this(i, (i2 & 2) != 0 ? 5.0f : f);
    }
}
