package o;

import android.net.Uri;
/* loaded from: classes6.dex */
public final class popBackStackImmediate$ah$a {
    public static final popBackStackImmediate$ah$a$ah$a valueOf = new popBackStackImmediate$ah$a$ah$a(null);
    private Uri toString;
    private Object values;

    public popBackStackImmediate$ah$a(Uri uri, Object obj) {
        runAnimators.ag$a(uri, "uri");
        runAnimators.ag$a(obj, "tag");
        this.toString = uri;
        this.values = obj;
    }

    public final Uri ag$a() {
        return this.toString;
    }

    public final Object values() {
        return this.values;
    }

    public int hashCode() {
        return ((this.toString.hashCode() + 1073) * 37) + this.values.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof popBackStackImmediate$ah$a)) {
            popBackStackImmediate$ah$a popbackstackimmediate_ah_a = (popBackStackImmediate$ah$a) obj;
            if (popbackstackimmediate_ah_a.toString == this.toString && popbackstackimmediate_ah_a.values == this.values) {
                return true;
            }
        }
        return false;
    }
}
