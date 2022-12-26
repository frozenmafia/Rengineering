package o;

import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class getTranslateX extends printVPath {
    private final Styleable.ChangeBounds<Throwable, setAnimationMatrix> valueOf;

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        values(th);
        return setAnimationMatrix.ag$a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getTranslateX(Styleable.ChangeBounds<? super Throwable, setAnimationMatrix> changeBounds) {
        this.valueOf = changeBounds;
    }

    @Override // o.AnimatorInflaterCompat.PathDataEvaluator
    public void values(Throwable th) {
        this.valueOf.invoke(th);
    }
}
