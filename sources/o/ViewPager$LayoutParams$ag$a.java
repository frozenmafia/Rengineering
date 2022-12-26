package o;

import o.ViewPager;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class ViewPager$LayoutParams$ag$a extends calculatePageOffsets<Object> {
    public final ViewPager.LayoutParams<?> ag$a;
    private final long toString;
    public final onPageSelected values;

    public ViewPager$LayoutParams$ag$a(ViewPager.LayoutParams<?> layoutParams, onPageSelected onpageselected) {
        ViewPager.PagerObserver pagerObserver;
        this.ag$a = layoutParams;
        this.values = onpageselected;
        pagerObserver = ViewPager.OnPageChangeListener.toString;
        this.toString = pagerObserver.valueOf();
        onpageselected.ah$a(this);
    }

    @Override // o.calculatePageOffsets
    public long ah$a() {
        return this.toString;
    }

    @Override // o.calculatePageOffsets
    public Object valueOf(Object obj) {
        Object HaptikSDK$c;
        if (obj != null || (HaptikSDK$c = HaptikSDK$c()) == null) {
            try {
                return this.values.valueOf(this);
            } catch (Throwable th) {
                if (obj == null) {
                    ah$b();
                }
                throw th;
            }
        }
        return HaptikSDK$c;
    }

    @Override // o.calculatePageOffsets
    public void valueOf(Object obj, Object obj2) {
        values(obj2);
        this.values.ag$a(this, obj2);
    }

    private final Object HaptikSDK$c() {
        Object obj;
        ViewPager.LayoutParams<?> layoutParams = this.ag$a;
        while (true) {
            Object obj2 = layoutParams._state;
            if (obj2 == this) {
                return null;
            }
            if (obj2 instanceof clearOnPageChangeListeners) {
                ((clearOnPageChangeListeners) obj2).ah$a(this.ag$a);
            } else if (obj2 != ViewPager.OnPageChangeListener.invoke()) {
                obj = ViewPager.OnPageChangeListener.values;
                return obj;
            } else {
                if (ViewPager.LayoutParams.toString.compareAndSet(this.ag$a, ViewPager.OnPageChangeListener.invoke(), this)) {
                    return null;
                }
            }
        }
    }

    private final void ah$b() {
        ViewPager.LayoutParams.toString.compareAndSet(this.ag$a, this, ViewPager.OnPageChangeListener.invoke());
    }

    private final void values(Object obj) {
        boolean z = obj == null;
        if (ViewPager.LayoutParams.toString.compareAndSet(this.ag$a, this, z ? null : ViewPager.OnPageChangeListener.invoke()) && z) {
            this.ag$a.isLogoutPending();
        }
    }

    @Override // o.clearOnPageChangeListeners
    public String toString() {
        return "AtomicSelectOp(sequence=" + ah$a() + ')';
    }
}
