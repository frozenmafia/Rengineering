package o;
/* loaded from: classes5.dex */
public class getDecoratedEnd<T> implements quickRecycleScrapView<T> {
    private static final Object toString = new Object();
    private volatile quickRecycleScrapView<T> ah$a;
    private volatile Object values = toString;

    public getDecoratedEnd(quickRecycleScrapView<T> quickrecyclescrapview) {
        this.ah$a = quickrecyclescrapview;
    }

    @Override // o.quickRecycleScrapView
    public T ag$a() {
        T t = (T) this.values;
        Object obj = toString;
        if (t == obj) {
            synchronized (this) {
                t = this.values;
                if (t == obj) {
                    t = this.ah$a.ag$a();
                    this.values = t;
                    this.ah$a = null;
                }
            }
        }
        return t;
    }
}
