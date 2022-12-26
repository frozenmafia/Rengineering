package o;

import o.AnimatedVectorDrawableCompat;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class createCachedBitmapIfNeeded extends AnimatedVectorDrawableCompat.AnimatedVectorDrawableCompatState {
    private final recomputeScrollPosition toString;

    public createCachedBitmapIfNeeded(recomputeScrollPosition recomputescrollposition) {
        this.toString = recomputescrollposition;
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        valueOf(th);
        return setAnimationMatrix.ag$a;
    }

    @Override // o.createNewKeyframe
    public void valueOf(Throwable th) {
        this.toString.t_();
    }

    public String toString() {
        return "RemoveOnCancel[" + this.toString + ']';
    }
}
