package o;
/* loaded from: classes3.dex */
public final class OnApplyWindowInsetsListener {
    private float ah$a;
    private float valueOf;

    public OnApplyWindowInsetsListener() {
        this(0.0f, 0.0f, 3, null);
    }

    public OnApplyWindowInsetsListener(float f, float f2) {
        this.ah$a = f;
        this.valueOf = f2;
    }

    public final float ag$a() {
        return this.ah$a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnApplyWindowInsetsListener) {
            OnApplyWindowInsetsListener onApplyWindowInsetsListener = (OnApplyWindowInsetsListener) obj;
            return runAnimators.values(Float.valueOf(this.ah$a), Float.valueOf(onApplyWindowInsetsListener.ah$a)) && runAnimators.values(Float.valueOf(this.valueOf), Float.valueOf(onApplyWindowInsetsListener.valueOf));
        }
        return false;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.ah$a) * 31) + Float.floatToIntBits(this.valueOf);
    }

    public String toString() {
        return "StoryGroupListStyling(edgePadding=" + this.ah$a + ", paddingBetweenItems=" + this.valueOf + ')';
    }

    public final float valueOf() {
        return this.valueOf;
    }

    public final void valueOf(float f) {
        this.ah$a = f;
    }

    public final void values(float f) {
        this.valueOf = f;
    }

    public /* synthetic */ OnApplyWindowInsetsListener(float f, float f2, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? Float.MIN_VALUE : f, (i & 2) != 0 ? Float.MIN_VALUE : f2);
    }
}
