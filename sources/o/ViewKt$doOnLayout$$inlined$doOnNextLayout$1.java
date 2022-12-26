package o;

import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
class ViewKt$doOnLayout$$inlined$doOnNextLayout$1<Z> implements ViewKt$postDelayed$runnable$1<Z> {
    private final values HaptikSDK$c;
    private final getDescendants ag$a;
    private final boolean ah$a;
    private final ViewKt$postDelayed$runnable$1<Z> ah$b;
    private int toString;
    private final boolean valueOf;
    private boolean values;

    /* loaded from: classes3.dex */
    interface values {
        void values(getDescendants getdescendants, ViewKt$doOnLayout$$inlined$doOnNextLayout$1<?> viewKt$doOnLayout$$inlined$doOnNextLayout$1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewKt$doOnLayout$$inlined$doOnNextLayout$1(ViewKt$postDelayed$runnable$1<Z> viewKt$postDelayed$runnable$1, boolean z, boolean z2, getDescendants getdescendants, values valuesVar) {
        this.ah$b = (ViewKt$postDelayed$runnable$1) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(viewKt$postDelayed$runnable$1);
        this.valueOf = z;
        this.ah$a = z2;
        this.ag$a = getdescendants;
        this.HaptikSDK$c = (values) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(valuesVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewKt$postDelayed$runnable$1<Z> ah$a() {
        return this.ah$b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean HaptikSDK$b() {
        return this.valueOf;
    }

    @Override // o.ViewKt$postDelayed$runnable$1
    public Class<Z> valueOf() {
        return this.ah$b.valueOf();
    }

    @Override // o.ViewKt$postDelayed$runnable$1
    public Z ag$a() {
        return this.ah$b.ag$a();
    }

    @Override // o.ViewKt$postDelayed$runnable$1
    public int ah$b() {
        return this.ah$b.ah$b();
    }

    @Override // o.ViewKt$postDelayed$runnable$1
    public void HaptikSDK$a() {
        synchronized (this) {
            if (this.toString > 0) {
                throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
            }
            if (this.values) {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
            this.values = true;
            if (this.ah$a) {
                this.ah$b.HaptikSDK$a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void values() {
        synchronized (this) {
            if (this.values) {
                throw new IllegalStateException("Cannot acquire a recycled resource");
            }
            this.toString++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void HaptikSDK$c() {
        boolean z;
        synchronized (this) {
            int i = this.toString;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.toString = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.HaptikSDK$c.values(this.ag$a, this);
        }
    }

    public String toString() {
        String str;
        synchronized (this) {
            str = "EngineResource{isMemoryCacheable=" + this.valueOf + ", listener=" + this.HaptikSDK$c + ", key=" + this.ag$a + ", acquired=" + this.toString + ", isRecycled=" + this.values + ", resource=" + this.ah$b + '}';
        }
        return str;
    }
}
