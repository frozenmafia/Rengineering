package o;

import android.net.Uri;
/* loaded from: classes4.dex */
public class requireView implements requireActivity {
    final boolean ah$a;
    final String values;

    public requireView(String str) {
        this(str, false);
    }

    public requireView(String str, boolean z) {
        this.values = (String) str.getClass();
        this.ah$a = z;
    }

    public String toString() {
        return this.values;
    }

    @Override // o.requireActivity
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof requireView) {
            return this.values.equals(((requireView) obj).values);
        }
        return false;
    }

    @Override // o.requireActivity
    public int hashCode() {
        return this.values.hashCode();
    }

    @Override // o.requireActivity
    public boolean containsUri(Uri uri) {
        return this.values.contains(uri.toString());
    }

    @Override // o.requireActivity
    public String getUriString() {
        return this.values;
    }

    @Override // o.requireActivity
    public boolean isResourceIdForDebugging() {
        return this.ah$a;
    }
}
