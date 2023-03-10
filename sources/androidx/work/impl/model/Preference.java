package androidx.work.impl.model;
/* loaded from: classes.dex */
public class Preference {
    public String mKey;
    public Long mValue;

    public Preference(String str, boolean z) {
        this(str, z ? 1L : 0L);
    }

    public Preference(String str, long j) {
        this.mKey = str;
        this.mValue = Long.valueOf(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Preference) {
            Preference preference = (Preference) obj;
            if (this.mKey.equals(preference.mKey)) {
                Long l = this.mValue;
                Long l2 = preference.mValue;
                return l != null ? l.equals(l2) : l2 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.mKey.hashCode();
        Long l = this.mValue;
        return (hashCode * 31) + (l != null ? l.hashCode() : 0);
    }
}
