package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class WindowInsetsCompat$Impl29$ah$a<T, R> {
    final Class<R> ag$a;
    private final Class<T> ah$a;
    final plusAssign<T, R> values;

    public WindowInsetsCompat$Impl29$ah$a(Class<T> cls, Class<R> cls2, plusAssign<T, R> plusassign) {
        this.ah$a = cls;
        this.ag$a = cls2;
        this.values = plusassign;
    }

    public boolean valueOf(Class<?> cls, Class<?> cls2) {
        return this.ah$a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.ag$a);
    }
}
