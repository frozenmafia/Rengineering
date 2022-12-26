package o;
/* loaded from: classes5.dex */
public abstract class getTrimPathStart extends parseInterpolatorFromTypeArray {
    private onPageScrolled<isClipPath<?>> ah$a;
    private long toString;
    private boolean valueOf;

    private final long valueOf(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public boolean HaptikSDK$a() {
        return false;
    }

    public void ah$a() {
    }

    public long invoke() {
        return !HaptikSDK$b() ? Long.MAX_VALUE : 0L;
    }

    protected boolean valueOf() {
        return ah$b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long ag$a() {
        onPageScrolled<isClipPath<?>> onpagescrolled = this.ah$a;
        return (onpagescrolled == null || onpagescrolled.ah$a()) ? Long.MAX_VALUE : 0L;
    }

    public final boolean HaptikSDK$b() {
        isClipPath<?> valueOf;
        onPageScrolled<isClipPath<?>> onpagescrolled = this.ah$a;
        if (onpagescrolled == null || (valueOf = onpagescrolled.valueOf()) == null) {
            return false;
        }
        valueOf.run();
        return true;
    }

    public final void values(isClipPath<?> isclippath) {
        onPageScrolled<isClipPath<?>> onpagescrolled = this.ah$a;
        if (onpagescrolled == null) {
            onpagescrolled = new onPageScrolled<>();
            this.ah$a = onpagescrolled;
        }
        onpagescrolled.ag$a(isclippath);
    }

    public final boolean HaptikSDK$c() {
        return this.toString >= valueOf(true);
    }

    public final boolean ah$b() {
        onPageScrolled<isClipPath<?>> onpagescrolled = this.ah$a;
        if (onpagescrolled != null) {
            return onpagescrolled.ah$a();
        }
        return true;
    }

    public static /* synthetic */ void toString(getTrimPathStart gettrimpathstart, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        gettrimpathstart.values(z);
    }

    public final void values(boolean z) {
        this.toString += valueOf(z);
        if (z) {
            return;
        }
        this.valueOf = true;
    }

    public static /* synthetic */ void values(getTrimPathStart gettrimpathstart, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        gettrimpathstart.ah$a(z);
    }

    public final void ah$a(boolean z) {
        long valueOf = this.toString - valueOf(z);
        this.toString = valueOf;
        if (valueOf > 0) {
            return;
        }
        if (getPixelSize.values()) {
            if (!(this.toString == 0)) {
                throw new AssertionError();
            }
        }
        if (this.valueOf) {
            ah$a();
        }
    }

    @Override // o.parseInterpolatorFromTypeArray
    public final parseInterpolatorFromTypeArray limitedParallelism(int i) {
        resetTouch.valueOf(i);
        return this;
    }
}
