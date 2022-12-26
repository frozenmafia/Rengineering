package o;

import java.io.File;
/* loaded from: classes3.dex */
public final class frameworkSet {
    public static final frameworkSet$ah$a valueOf = new frameworkSet$ah$a(null);
    private final String ag$a;
    private final long values;

    public static final long ag$a(File file) {
        return valueOf.toString(file);
    }

    public static final String values() {
        return valueOf.values();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof frameworkSet) {
                frameworkSet frameworkset = (frameworkSet) obj;
                return this.values == frameworkset.values && runAnimators.values((Object) this.ag$a, (Object) frameworkset.ag$a);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.values;
        int i = (int) (j ^ (j >>> 32));
        String str = this.ag$a;
        return (i * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "SessionFilenameInfo(timestamp=" + this.values + ", uuid=" + this.ag$a + ")";
    }
}
