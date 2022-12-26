package o;

import android.net.Uri;
/* loaded from: classes3.dex */
public final class createWithBitmap$ah$a {
    public final Object ah$a;
    public final Uri valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof createWithBitmap$ah$a) {
            createWithBitmap$ah$a createwithbitmap_ah_a = (createWithBitmap$ah$a) obj;
            return this.valueOf.equals(createwithbitmap_ah_a.valueOf) && getElevationDegrees.values(this.ah$a, createwithbitmap_ah_a.ah$a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.valueOf.hashCode();
        Object obj = this.ah$a;
        return (hashCode * 31) + (obj != null ? obj.hashCode() : 0);
    }
}
