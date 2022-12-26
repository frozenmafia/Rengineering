package o;
/* loaded from: classes3.dex */
public final class computeVerticalScrollExtent {
    public float ag$a;
    public float toString;

    public computeVerticalScrollExtent() {
        this(0.0f, 0.0f, 3);
    }

    public computeVerticalScrollExtent(float f, float f2) {
        this.ag$a = f;
        this.toString = f2;
    }

    public static computeVerticalScrollExtent valueOf(computeVerticalScrollExtent computeverticalscrollextent, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = computeverticalscrollextent.ag$a;
        }
        if ((i & 2) != 0) {
            f2 = computeverticalscrollextent.toString;
        }
        computeverticalscrollextent.getClass();
        return new computeVerticalScrollExtent(f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof computeVerticalScrollExtent) {
            computeVerticalScrollExtent computeverticalscrollextent = (computeVerticalScrollExtent) obj;
            return runAnimators.values(Float.valueOf(this.ag$a), Float.valueOf(computeverticalscrollextent.ag$a)) && runAnimators.values(Float.valueOf(this.toString), Float.valueOf(computeverticalscrollextent.toString));
        }
        return false;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.ag$a) * 31) + Float.floatToIntBits(this.toString);
    }

    public String toString() {
        return "Vector(x=" + this.ag$a + ", y=" + this.toString + ')';
    }

    public /* synthetic */ computeVerticalScrollExtent(float f, float f2, int i) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }

    public final void toString(computeVerticalScrollExtent computeverticalscrollextent) {
        runAnimators.ag$a(computeverticalscrollextent, "v");
        this.ag$a += computeverticalscrollextent.ag$a;
        this.toString += computeverticalscrollextent.toString;
    }
}
