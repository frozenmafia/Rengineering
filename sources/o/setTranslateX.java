package o;

import o.Styleable;
/* loaded from: classes5.dex */
final class setTranslateX extends AnimatorInflaterCompat {
    private final Styleable.ChangeBounds<Throwable, setAnimationMatrix> valueOf;

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        valueOf(th);
        return setAnimationMatrix.ag$a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setTranslateX(Styleable.ChangeBounds<? super Throwable, setAnimationMatrix> changeBounds) {
        this.valueOf = changeBounds;
    }

    @Override // o.createNewKeyframe
    public void valueOf(Throwable th) {
        this.valueOf.invoke(th);
    }

    public String toString() {
        return "InvokeOnCancel[" + invalidateSelf.values(this.valueOf) + '@' + invalidateSelf.ah$a(this) + ']';
    }
}
