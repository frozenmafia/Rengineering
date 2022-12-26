package kotlin;

import java.io.Serializable;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class Triple<A, B, C> implements Serializable {
    private final A first;
    private final B second;
    private final C third;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Triple copy$default(Triple triple, Object obj, Object obj2, Object obj3, int i, Object obj4) {
        if ((i & 1) != 0) {
            obj = triple.first;
        }
        if ((i & 2) != 0) {
            obj2 = triple.second;
        }
        if ((i & 4) != 0) {
            obj3 = triple.third;
        }
        return triple.copy(obj, obj2, obj3);
    }

    public final A component1() {
        return this.first;
    }

    public final B component2() {
        return this.second;
    }

    public final C component3() {
        return this.third;
    }

    public final Triple<A, B, C> copy(A a, B b2, C c) {
        return new Triple<>(a, b2, c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Triple) {
            Triple triple = (Triple) obj;
            return runAnimators.values(this.first, triple.first) && runAnimators.values(this.second, triple.second) && runAnimators.values(this.third, triple.third);
        }
        return false;
    }

    public int hashCode() {
        A a = this.first;
        int hashCode = a == null ? 0 : a.hashCode();
        B b2 = this.second;
        int hashCode2 = b2 == null ? 0 : b2.hashCode();
        C c = this.third;
        return (((hashCode * 31) + hashCode2) * 31) + (c != null ? c.hashCode() : 0);
    }

    public Triple(A a, B b2, C c) {
        this.first = a;
        this.second = b2;
        this.third = c;
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public final C getThird() {
        return this.third;
    }

    public String toString() {
        return '(' + this.first + ", " + this.second + ", " + this.third + ')';
    }
}
