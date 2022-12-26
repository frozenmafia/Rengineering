package o;

import o.Styleable;
/* loaded from: classes2.dex */
public final class setAutoCancel {
    private final String ah$a;
    private final Styleable.ArcMotion<setAnimationMatrix> valueOf;
    private final int values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setAutoCancel) {
            setAutoCancel setautocancel = (setAutoCancel) obj;
            return this.values == setautocancel.values && runAnimators.values((Object) this.ah$a, (Object) setautocancel.ah$a) && runAnimators.values(this.valueOf, setautocancel.valueOf);
        }
        return false;
    }

    public int hashCode() {
        return (((this.values * 31) + this.ah$a.hashCode()) * 31) + this.valueOf.hashCode();
    }

    public String toString() {
        int i = this.values;
        String str = this.ah$a;
        Styleable.ArcMotion<setAnimationMatrix> arcMotion = this.valueOf;
        return "TextAndDrawableButtonVM(drawable=" + i + ", text=" + str + ", onClick=" + arcMotion + ")";
    }

    public setAutoCancel(int i, String str, Styleable.ArcMotion<setAnimationMatrix> arcMotion) {
        runAnimators.ag$a(str, "text");
        runAnimators.ag$a(arcMotion, "onClick");
        this.values = i;
        this.ah$a = str;
        this.valueOf = arcMotion;
    }

    public final int ah$a() {
        return this.values;
    }

    public final String valueOf() {
        return this.ah$a;
    }

    public final Styleable.ArcMotion<setAnimationMatrix> values() {
        return this.valueOf;
    }
}
