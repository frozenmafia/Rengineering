package o;
/* loaded from: classes5.dex */
public abstract class internalInitInvalidationTracker {
    private static final internalInitInvalidationTracker ag$a = new internalInitInvalidationTracker() { // from class: o.internalInitInvalidationTracker.1
        @Override // o.internalInitInvalidationTracker
        public long ag$a() {
            long nanoTime;
            nanoTime = System.nanoTime();
            return nanoTime;
        }
    };

    public abstract long ag$a();

    public static internalInitInvalidationTracker values() {
        return ag$a;
    }
}
