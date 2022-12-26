package o;
/* loaded from: classes3.dex */
public final class postInvalidateOnAnimation {
    private boolean ag$a;
    private boolean ah$a;
    private boolean toString;
    private boolean valueOf;

    public postInvalidateOnAnimation() {
        this(false, false, false, false, 15, null);
    }

    public postInvalidateOnAnimation(boolean z, boolean z2, boolean z3, boolean z4) {
        this.ag$a = z;
        this.valueOf = z2;
        this.toString = z3;
        this.ah$a = z4;
    }

    public final void toString(boolean z) {
        this.ag$a = z;
    }

    public final boolean valueOf() {
        return this.ag$a;
    }

    public final boolean ah$a() {
        return this.valueOf;
    }

    public final void values(boolean z) {
        this.valueOf = z;
    }

    public final void ah$a(boolean z) {
        this.toString = z;
    }

    public final boolean values() {
        return this.toString;
    }

    public /* synthetic */ postInvalidateOnAnimation(boolean z, boolean z2, boolean z3, boolean z4, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4);
    }

    public final boolean HaptikSDK$b() {
        return this.ah$a;
    }

    public postInvalidateOnAnimation(boolean z) {
        this(z, z, z, z);
    }

    public final postInvalidateOnAnimation ag$a() {
        return new postInvalidateOnAnimation(this.ag$a, this.valueOf, this.toString, this.ah$a);
    }
}
