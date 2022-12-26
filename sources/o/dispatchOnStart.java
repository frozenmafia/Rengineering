package o;

import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
public class dispatchOnStart<T> implements ViewKt$postDelayed$runnable$1<T> {
    protected final T ag$a;

    @Override // o.ViewKt$postDelayed$runnable$1
    public void HaptikSDK$a() {
    }

    @Override // o.ViewKt$postDelayed$runnable$1
    public final int ah$b() {
        return 1;
    }

    public dispatchOnStart(T t) {
        this.ag$a = (T) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(t);
    }

    @Override // o.ViewKt$postDelayed$runnable$1
    public Class<T> valueOf() {
        return (Class<T>) this.ag$a.getClass();
    }

    @Override // o.ViewKt$postDelayed$runnable$1
    public final T ag$a() {
        return this.ag$a;
    }
}
