package o;

import androidx.core.util.Pools;
import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
public final class requestSendAccessibilityEvent<Z> implements ViewKt$postDelayed$runnable$1<Z>, WindowInsetsControllerCompat.Impl30.valueOf {
    private static final Pools.Pool<requestSendAccessibilityEvent<?>> values;
    private boolean ag$a;
    private final WindowInsetsControllerCompat.OnControllableInsetsChangedListener ah$a = WindowInsetsControllerCompat.OnControllableInsetsChangedListener.ag$a();
    private ViewKt$postDelayed$runnable$1<Z> toString;
    private boolean valueOf;

    static {
        Pools.Pool<requestSendAccessibilityEvent<?>> impl30;
        impl30 = WindowInsetsControllerCompat.Impl30.toString(new Pools.SynchronizedPool(20), new WindowInsetsControllerCompat.Impl30.toString<requestSendAccessibilityEvent<?>>() { // from class: o.requestSendAccessibilityEvent.2
            @Override // o.WindowInsetsControllerCompat.Impl30.toString
            /* renamed from: ag$a */
            public requestSendAccessibilityEvent<?> ah$a() {
                return new requestSendAccessibilityEvent<>();
            }
        });
        values = impl30;
    }

    public static <Z> requestSendAccessibilityEvent<Z> toString(ViewKt$postDelayed$runnable$1<Z> viewKt$postDelayed$runnable$1) {
        requestSendAccessibilityEvent<Z> requestsendaccessibilityevent = (requestSendAccessibilityEvent) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(values.acquire());
        requestsendaccessibilityevent.values(viewKt$postDelayed$runnable$1);
        return requestsendaccessibilityevent;
    }

    requestSendAccessibilityEvent() {
    }

    private void values(ViewKt$postDelayed$runnable$1<Z> viewKt$postDelayed$runnable$1) {
        this.valueOf = false;
        this.ag$a = true;
        this.toString = viewKt$postDelayed$runnable$1;
    }

    private void values() {
        this.toString = null;
        values.release(this);
    }

    public void ah$a() {
        synchronized (this) {
            this.ah$a.ah$a();
            if (!this.ag$a) {
                throw new IllegalStateException("Already unlocked");
            }
            this.ag$a = false;
            if (this.valueOf) {
                HaptikSDK$a();
            }
        }
    }

    @Override // o.ViewKt$postDelayed$runnable$1
    public Class<Z> valueOf() {
        return this.toString.valueOf();
    }

    @Override // o.ViewKt$postDelayed$runnable$1
    public Z ag$a() {
        return this.toString.ag$a();
    }

    @Override // o.ViewKt$postDelayed$runnable$1
    public int ah$b() {
        return this.toString.ah$b();
    }

    @Override // o.ViewKt$postDelayed$runnable$1
    public void HaptikSDK$a() {
        synchronized (this) {
            this.ah$a.ah$a();
            this.valueOf = true;
            if (!this.ag$a) {
                this.toString.HaptikSDK$a();
                values();
            }
        }
    }

    @Override // o.WindowInsetsControllerCompat.Impl30.valueOf
    public WindowInsetsControllerCompat.OnControllableInsetsChangedListener e_() {
        return this.ah$a;
    }
}
