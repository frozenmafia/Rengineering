package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o.getCurrentItem;
/* loaded from: classes7.dex */
public abstract class getCurrentItem<S extends getCurrentItem<S>> extends dispatchOnPageScrolled<S> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater values = AtomicIntegerFieldUpdater.newUpdater(getCurrentItem.class, "cleanedAndPointers");
    private volatile /* synthetic */ int cleanedAndPointers;
    private final long toString;

    public abstract int HaptikSDK$a();

    public getCurrentItem(long j, S s, int i) {
        super(s);
        this.toString = j;
        this.cleanedAndPointers = i << 16;
    }

    public final long HaptikSDK$c() {
        return this.toString;
    }

    @Override // o.dispatchOnPageScrolled
    public boolean ah$a() {
        return this.cleanedAndPointers == HaptikSDK$a() && !HaptikSDK$b();
    }

    public final boolean ah$b() {
        return values.addAndGet(this, androidx.core.internal.view.SupportMenu.CATEGORY_MASK) == HaptikSDK$a() && !HaptikSDK$b();
    }

    public final void getInitSettings() {
        if (values.incrementAndGet(this) != HaptikSDK$a() || HaptikSDK$b()) {
            return;
        }
        invoke();
    }

    public final boolean HaptikWebView() {
        int i;
        do {
            i = this.cleanedAndPointers;
            if (!(i != HaptikSDK$a() || HaptikSDK$b())) {
                return false;
            }
        } while (!values.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
