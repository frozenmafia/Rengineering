package o;
/* loaded from: classes5.dex */
public final class setChangeDuration<T, U> {
    private final T toString;
    private final U valueOf;

    public setChangeDuration(T t, U u) {
        this.toString = t;
        this.valueOf = u;
    }

    public T valueOf() {
        return this.toString;
    }

    public U ag$a() {
        return this.valueOf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setChangeDuration setchangeduration = (setChangeDuration) obj;
        T t = this.toString;
        if (t == null ? setchangeduration.toString == null : t.equals(setchangeduration.toString)) {
            U u = this.valueOf;
            U u2 = setchangeduration.valueOf;
            return u == null ? u2 == null : u.equals(u2);
        }
        return false;
    }

    public int hashCode() {
        T t = this.toString;
        int hashCode = t != null ? t.hashCode() : 0;
        U u = this.valueOf;
        return (hashCode * 31) + (u != null ? u.hashCode() : 0);
    }

    public String toString() {
        return "Pair(" + this.toString + "," + this.valueOf + ")";
    }
}
