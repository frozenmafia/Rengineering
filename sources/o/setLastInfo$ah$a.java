package o;

import org.conscrypt.Conscrypt;
/* loaded from: classes5.dex */
public final class setLastInfo$ah$a {
    private setLastInfo$ah$a() {
    }

    public /* synthetic */ setLastInfo$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    public final boolean valueOf() {
        return setLastInfo.values();
    }

    public final setLastInfo ag$a() {
        if (valueOf()) {
            return new setLastInfo(null);
        }
        return null;
    }

    public final boolean ah$a(int i, int i2, int i3) {
        Conscrypt.Version version = Conscrypt.version();
        if (version != null) {
            if (version.major() != i) {
                return version.major() > i;
            } else if (version.minor() != i2) {
                return version.minor() > i2;
            } else if (version.patch() >= i3) {
                return true;
            }
        }
        return false;
    }
}
