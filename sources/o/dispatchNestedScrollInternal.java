package o;
/* loaded from: classes3.dex */
public final class dispatchNestedScrollInternal {
    private final float ah$a;
    private final float toString;
    private final float values;

    public dispatchNestedScrollInternal() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public dispatchNestedScrollInternal(float f, float f2, float f3) {
        this.toString = f;
        this.values = f2;
        this.ah$a = f3;
    }

    public final float ag$a() {
        return this.toString;
    }

    public final float ah$a() {
        return this.ah$a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dispatchNestedScrollInternal) {
            dispatchNestedScrollInternal dispatchnestedscrollinternal = (dispatchNestedScrollInternal) obj;
            return runAnimators.values(Float.valueOf(this.toString), Float.valueOf(dispatchnestedscrollinternal.toString)) && runAnimators.values(Float.valueOf(this.values), Float.valueOf(dispatchnestedscrollinternal.values)) && runAnimators.values(Float.valueOf(this.ah$a), Float.valueOf(dispatchnestedscrollinternal.ah$a));
        }
        return false;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.toString) * 31) + Float.floatToIntBits(this.values)) * 31) + Float.floatToIntBits(this.ah$a);
    }

    public String toString() {
        return "StoryGroupIconStyling(height=" + this.toString + ", width=" + this.values + ", cornerRadius=" + this.ah$a + ')';
    }

    public final float valueOf() {
        return this.values;
    }

    public /* synthetic */ dispatchNestedScrollInternal(float f, float f2, float f3, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? addOnUnhandledKeyEventListener.values(80) : f, (i & 2) != 0 ? addOnUnhandledKeyEventListener.values(80) : f2, (i & 4) != 0 ? addOnUnhandledKeyEventListener.values(40) : f3);
    }
}
