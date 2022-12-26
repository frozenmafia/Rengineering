package kotlin;

import java.io.Serializable;
import o.runAnimators;
/* loaded from: classes.dex */
public final class Pair<A, B> implements Serializable {
    private final A first;
    private final B second;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Pair copy$default(Pair pair, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = pair.first;
        }
        if ((i & 2) != 0) {
            obj2 = pair.second;
        }
        return pair.copy(obj, obj2);
    }

    public final A component1() {
        return this.first;
    }

    public final B component2() {
        return this.second;
    }

    public final Pair<A, B> copy(A a, B b2) {
        return new Pair<>(a, b2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            return runAnimators.values(this.first, pair.first) && runAnimators.values(this.second, pair.second);
        }
        return false;
    }

    public int hashCode() {
        A a = this.first;
        int hashCode = a == null ? 0 : a.hashCode();
        B b2 = this.second;
        return (hashCode * 31) + (b2 != null ? b2.hashCode() : 0);
    }

    public Pair(A a, B b2) {
        this.first = a;
        this.second = b2;
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public String toString() {
        return '(' + this.first + ", " + this.second + ')';
    }
}
