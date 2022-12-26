package o;

import java.util.Queue;
import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
final class getLowerBound$ah$a<A> {
    private static final Queue<getLowerBound$ah$a<?>> valueOf = WindowInsetsControllerCompat.Impl30.AnonymousClass1.values(0);
    private A ag$a;
    private int ah$a;
    private int toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <A> getLowerBound$ah$a<A> valueOf(A a, int i, int i2) {
        getLowerBound$ah$a<A> getlowerbound_ah_a;
        Queue<getLowerBound$ah$a<?>> queue = valueOf;
        synchronized (queue) {
            getlowerbound_ah_a = (getLowerBound$ah$a<A>) queue.poll();
        }
        if (getlowerbound_ah_a == null) {
            getlowerbound_ah_a = new getLowerBound$ah$a<>();
        }
        getlowerbound_ah_a.values(a, i, i2);
        return getlowerbound_ah_a;
    }

    private getLowerBound$ah$a() {
    }

    private void values(A a, int i, int i2) {
        this.ag$a = a;
        this.ah$a = i;
        this.toString = i2;
    }

    public void ag$a() {
        Queue<getLowerBound$ah$a<?>> queue = valueOf;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof getLowerBound$ah$a) {
            getLowerBound$ah$a getlowerbound_ah_a = (getLowerBound$ah$a) obj;
            if (this.ah$a == getlowerbound_ah_a.ah$a && this.toString == getlowerbound_ah_a.toString && this.ag$a.equals(getlowerbound_ah_a.ag$a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.toString * 31) + this.ah$a) * 31) + this.ag$a.hashCode();
    }
}
