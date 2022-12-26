package o;

import o.ViewPager;
/* loaded from: classes5.dex */
public final class setCurrentItemInternal extends setOffscreenPageLimit {
    public static final setCurrentItemInternal ah$a = new setCurrentItemInternal();

    @Override // o.parseInterpolatorFromTypeArray
    public String toString() {
        return "Dispatchers.Default";
    }

    private setCurrentItemInternal() {
        super(ViewPager.AnonymousClass3.ag$a, ViewPager.AnonymousClass3.values, ViewPager.AnonymousClass3.ah$a, "DefaultDispatcher");
    }

    @Override // o.setOffscreenPageLimit, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }
}
