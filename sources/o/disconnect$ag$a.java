package o;
/* loaded from: classes6.dex */
public final class disconnect$ag$a<E> extends disconnect {
    private final E toString;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof disconnect$ag$a) && runAnimators.values(this.toString, ((disconnect$ag$a) obj).toString);
        }
        return true;
    }

    public int hashCode() {
        E e = this.toString;
        if (e != null) {
            return e.hashCode();
        }
        return 0;
    }

    public disconnect$ag$a(E e) {
        super(null);
        this.toString = e;
    }

    public final E ah$a() {
        return this.toString;
    }

    public String toString() {
        return ag$a(pause.toString.valueOf(), pause.toString.valueOf());
    }
}
