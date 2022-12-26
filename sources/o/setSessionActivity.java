package o;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class setSessionActivity<V> {
    private final Throwable ag$a;
    private final V ah$a;

    public setSessionActivity(V v) {
        this.ah$a = v;
        this.ag$a = null;
    }

    public setSessionActivity(Throwable th) {
        this.ag$a = th;
        this.ah$a = null;
    }

    public V ah$a() {
        return this.ah$a;
    }

    public Throwable valueOf() {
        return this.ag$a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setSessionActivity) {
            setSessionActivity setsessionactivity = (setSessionActivity) obj;
            if (ah$a() == null || !ah$a().equals(setsessionactivity.ah$a())) {
                if (valueOf() == null || setsessionactivity.valueOf() == null) {
                    return false;
                }
                return valueOf().toString().equals(valueOf().toString());
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{ah$a(), valueOf()});
    }
}
