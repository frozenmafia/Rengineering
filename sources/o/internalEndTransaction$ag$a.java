package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class internalEndTransaction$ag$a<V> extends internalEndTransaction$ah$a<V> {
    static final internalEndTransaction$ag$a<Object> valueOf = new internalEndTransaction$ag$a<>(null);
    private final V ag$a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public internalEndTransaction$ag$a(V v) {
        super();
        this.ag$a = v;
    }

    @Override // o.internalEndTransaction$ah$a, java.util.concurrent.Future
    public V get() {
        return this.ag$a;
    }
}
