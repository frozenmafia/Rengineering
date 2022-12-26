package o;

import java.security.MessageDigest;
/* loaded from: classes3.dex */
public final class setMargins implements getDescendants {
    private final androidx.collection.ArrayMap<updateMargins<?>, Object> toString = new setSystemUiFlag();

    public void values(setMargins setmargins) {
        this.toString.putAll((androidx.collection.SimpleArrayMap<? extends updateMargins<?>, ? extends Object>) setmargins.toString);
    }

    public <T> setMargins ag$a(updateMargins<T> updatemargins, T t) {
        this.toString.put(updatemargins, t);
        return this;
    }

    public <T> T valueOf(updateMargins<T> updatemargins) {
        return this.toString.containsKey(updatemargins) ? (T) this.toString.get(updatemargins) : updatemargins.ag$a();
    }

    @Override // o.getDescendants
    public boolean equals(Object obj) {
        if (obj instanceof setMargins) {
            return this.toString.equals(((setMargins) obj).toString);
        }
        return false;
    }

    @Override // o.getDescendants
    public int hashCode() {
        return this.toString.hashCode();
    }

    @Override // o.getDescendants
    public void ag$a(MessageDigest messageDigest) {
        for (int i = 0; i < this.toString.size(); i++) {
            this.toString.keyAt(i).values(this.toString.valueAt(i), messageDigest);
        }
    }

    public String toString() {
        return "Options{values=" + this.toString + '}';
    }
}
