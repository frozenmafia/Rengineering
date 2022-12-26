package o;

import o.Styleable;
/* loaded from: classes5.dex */
public final class setupPathMotion {
    public final Styleable.ChangeBounds<Throwable, setAnimationMatrix> ah$a;
    public final Object values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setupPathMotion) {
            setupPathMotion setuppathmotion = (setupPathMotion) obj;
            return runAnimators.values(this.values, setuppathmotion.values) && runAnimators.values(this.ah$a, setuppathmotion.ah$a);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.values;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.ah$a.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.values + ", onCancellation=" + this.ah$a + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setupPathMotion(Object obj, Styleable.ChangeBounds<? super Throwable, setAnimationMatrix> changeBounds) {
        this.values = obj;
        this.ah$a = changeBounds;
    }
}
