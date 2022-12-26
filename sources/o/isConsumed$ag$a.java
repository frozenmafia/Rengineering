package o;
/* loaded from: classes3.dex */
final class isConsumed$ag$a<Z, R> {
    final replaceSystemWindowInsets<Z, R> ah$a;
    private final Class<R> valueOf;
    private final Class<Z> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public isConsumed$ag$a(Class<Z> cls, Class<R> cls2, replaceSystemWindowInsets<Z, R> replacesystemwindowinsets) {
        this.values = cls;
        this.valueOf = cls2;
        this.ah$a = replacesystemwindowinsets;
    }

    public boolean valueOf(Class<?> cls, Class<?> cls2) {
        return this.values.isAssignableFrom(cls) && cls2.isAssignableFrom(this.valueOf);
    }
}
