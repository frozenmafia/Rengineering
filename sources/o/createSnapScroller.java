package o;

import android.os.Bundle;
/* loaded from: classes5.dex */
public final class createSnapScroller {
    private static final shouldBeKeptAsChild toString = shouldBeKeptAsChild.ah$a();
    private final Bundle valueOf;

    public createSnapScroller() {
        this(new Bundle());
    }

    public createSnapScroller(Bundle bundle) {
        this.valueOf = (Bundle) bundle.clone();
    }

    public boolean toString(String str) {
        return str != null && this.valueOf.containsKey(str);
    }

    public addToData<Boolean> ah$a(String str) {
        if (!toString(str)) {
            return addToData.ag$a();
        }
        try {
            return addToData.toString((Boolean) this.valueOf.get(str));
        } catch (ClassCastException e) {
            toString.valueOf("Metadata key %s contains type other than boolean: %s", str, e.getMessage());
            return addToData.ag$a();
        }
    }

    public addToData<Float> valueOf(String str) {
        if (!toString(str)) {
            return addToData.ag$a();
        }
        try {
            return addToData.toString((Float) this.valueOf.get(str));
        } catch (ClassCastException e) {
            toString.valueOf("Metadata key %s contains type other than float: %s", str, e.getMessage());
            return addToData.ag$a();
        }
    }

    public addToData<Long> values(String str) {
        addToData<Integer> ag$a = ag$a(str);
        if (ag$a.ah$a()) {
            return addToData.ag$a(Long.valueOf(ag$a.values().intValue()));
        }
        return addToData.ag$a();
    }

    private addToData<Integer> ag$a(String str) {
        if (!toString(str)) {
            return addToData.ag$a();
        }
        try {
            return addToData.toString((Integer) this.valueOf.get(str));
        } catch (ClassCastException e) {
            toString.valueOf("Metadata key %s contains type other than int: %s", str, e.getMessage());
            return addToData.ag$a();
        }
    }
}
