package o;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class getFilterableStringBuilder extends getPersistedStringSet {
    private final setDialogTitle toString;
    private final findPreference valueOf;
    private final long values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getFilterableStringBuilder(long j, findPreference findpreference, setDialogTitle setdialogtitle) {
        this.values = j;
        Objects.requireNonNull(findpreference, "Null transportContext");
        this.valueOf = findpreference;
        Objects.requireNonNull(setdialogtitle, "Null event");
        this.toString = setdialogtitle;
    }

    @Override // o.getPersistedStringSet
    public long valueOf() {
        return this.values;
    }

    @Override // o.getPersistedStringSet
    public findPreference values() {
        return this.valueOf;
    }

    @Override // o.getPersistedStringSet
    public setDialogTitle ah$a() {
        return this.toString;
    }

    public String toString() {
        return "PersistedEvent{id=" + this.values + ", transportContext=" + this.valueOf + ", event=" + this.toString + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof getPersistedStringSet) {
            getPersistedStringSet getpersistedstringset = (getPersistedStringSet) obj;
            return this.values == getpersistedstringset.valueOf() && this.valueOf.equals(getpersistedstringset.values()) && this.toString.equals(getpersistedstringset.ah$a());
        }
        return false;
    }

    public int hashCode() {
        long j = this.values;
        int i = (int) (j ^ (j >>> 32));
        return ((this.valueOf.hashCode() ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ this.toString.hashCode();
    }
}
