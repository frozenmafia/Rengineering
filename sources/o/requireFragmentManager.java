package o;

import android.net.Uri;
import java.util.List;
/* loaded from: classes4.dex */
public class requireFragmentManager implements requireActivity {
    final List<requireActivity> ah$a;

    @Override // o.requireActivity
    public boolean isResourceIdForDebugging() {
        return false;
    }

    public requireFragmentManager(List<requireActivity> list) {
        this.ah$a = (List) list.getClass();
    }

    public List<requireActivity> ag$a() {
        return this.ah$a;
    }

    public String toString() {
        return "MultiCacheKey:" + this.ah$a.toString();
    }

    @Override // o.requireActivity
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof requireFragmentManager) {
            return this.ah$a.equals(((requireFragmentManager) obj).ah$a);
        }
        return false;
    }

    @Override // o.requireActivity
    public int hashCode() {
        return this.ah$a.hashCode();
    }

    @Override // o.requireActivity
    public boolean containsUri(Uri uri) {
        for (int i = 0; i < this.ah$a.size(); i++) {
            if (this.ah$a.get(i).containsUri(uri)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.requireActivity
    public String getUriString() {
        return this.ah$a.get(0).getUriString();
    }
}
