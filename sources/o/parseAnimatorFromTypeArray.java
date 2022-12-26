package o;

import o.Styleable;
/* loaded from: classes5.dex */
final class parseAnimatorFromTypeArray {
    public final AnimatorInflaterCompat ag$a;
    public final Object ah$a;
    public final Throwable toString;
    public final Styleable.ChangeBounds<Throwable, setAnimationMatrix> valueOf;
    public final Object values;

    public static /* synthetic */ parseAnimatorFromTypeArray valueOf(parseAnimatorFromTypeArray parseanimatorfromtypearray, Object obj, AnimatorInflaterCompat animatorInflaterCompat, Styleable.ChangeBounds changeBounds, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = parseanimatorfromtypearray.values;
        }
        if ((i & 2) != 0) {
            animatorInflaterCompat = parseanimatorfromtypearray.ag$a;
        }
        AnimatorInflaterCompat animatorInflaterCompat2 = animatorInflaterCompat;
        Styleable.ChangeBounds<Throwable, setAnimationMatrix> changeBounds2 = changeBounds;
        if ((i & 4) != 0) {
            changeBounds2 = parseanimatorfromtypearray.valueOf;
        }
        Styleable.ChangeBounds changeBounds3 = changeBounds2;
        if ((i & 8) != 0) {
            obj2 = parseanimatorfromtypearray.ah$a;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = parseanimatorfromtypearray.toString;
        }
        return parseanimatorfromtypearray.toString(obj, animatorInflaterCompat2, changeBounds3, obj4, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof parseAnimatorFromTypeArray) {
            parseAnimatorFromTypeArray parseanimatorfromtypearray = (parseAnimatorFromTypeArray) obj;
            return runAnimators.values(this.values, parseanimatorfromtypearray.values) && runAnimators.values(this.ag$a, parseanimatorfromtypearray.ag$a) && runAnimators.values(this.valueOf, parseanimatorfromtypearray.valueOf) && runAnimators.values(this.ah$a, parseanimatorfromtypearray.ah$a) && runAnimators.values(this.toString, parseanimatorfromtypearray.toString);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.values;
        int hashCode = obj == null ? 0 : obj.hashCode();
        AnimatorInflaterCompat animatorInflaterCompat = this.ag$a;
        int hashCode2 = animatorInflaterCompat == null ? 0 : animatorInflaterCompat.hashCode();
        Styleable.ChangeBounds<Throwable, setAnimationMatrix> changeBounds = this.valueOf;
        int hashCode3 = changeBounds == null ? 0 : changeBounds.hashCode();
        Object obj2 = this.ah$a;
        int hashCode4 = obj2 == null ? 0 : obj2.hashCode();
        Throwable th = this.toString;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.values + ", cancelHandler=" + this.ag$a + ", onCancellation=" + this.valueOf + ", idempotentResume=" + this.ah$a + ", cancelCause=" + this.toString + ')';
    }

    public final parseAnimatorFromTypeArray toString(Object obj, AnimatorInflaterCompat animatorInflaterCompat, Styleable.ChangeBounds<? super Throwable, setAnimationMatrix> changeBounds, Object obj2, Throwable th) {
        return new parseAnimatorFromTypeArray(obj, animatorInflaterCompat, changeBounds, obj2, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public parseAnimatorFromTypeArray(Object obj, AnimatorInflaterCompat animatorInflaterCompat, Styleable.ChangeBounds<? super Throwable, setAnimationMatrix> changeBounds, Object obj2, Throwable th) {
        this.values = obj;
        this.ag$a = animatorInflaterCompat;
        this.valueOf = changeBounds;
        this.ah$a = obj2;
        this.toString = th;
    }

    public /* synthetic */ parseAnimatorFromTypeArray(Object obj, AnimatorInflaterCompat animatorInflaterCompat, Styleable.ChangeBounds changeBounds, Object obj2, Throwable th, int i, getTargetTypes gettargettypes) {
        this(obj, (i & 2) != 0 ? null : animatorInflaterCompat, (i & 4) != 0 ? null : changeBounds, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }

    public final boolean values() {
        return this.toString != null;
    }

    public final void values(getPVH<?> getpvh, Throwable th) {
        AnimatorInflaterCompat animatorInflaterCompat = this.ag$a;
        if (animatorInflaterCompat != null) {
            getpvh.valueOf(animatorInflaterCompat, th);
        }
        Styleable.ChangeBounds<Throwable, setAnimationMatrix> changeBounds = this.valueOf;
        if (changeBounds != null) {
            getpvh.ag$a(changeBounds, th);
        }
    }
}
