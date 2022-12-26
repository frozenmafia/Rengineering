package o;
/* loaded from: classes5.dex */
public final class GhostViewPort<T> {
    private final T ag$a;
    private final int valueOf;

    public final T ah$a() {
        return this.ag$a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GhostViewPort) {
            GhostViewPort ghostViewPort = (GhostViewPort) obj;
            return this.valueOf == ghostViewPort.valueOf && runAnimators.values(this.ag$a, ghostViewPort.ag$a);
        }
        return false;
    }

    public int hashCode() {
        int i = this.valueOf;
        T t = this.ag$a;
        return (i * 31) + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.valueOf + ", value=" + this.ag$a + ')';
    }

    public final int valueOf() {
        return this.valueOf;
    }

    public GhostViewPort(int i, T t) {
        this.valueOf = i;
        this.ag$a = t;
    }

    public final int ag$a() {
        return this.valueOf;
    }

    public final T values() {
        return this.ag$a;
    }
}
