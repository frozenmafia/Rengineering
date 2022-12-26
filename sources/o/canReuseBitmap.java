package o;

import o.ViewPager;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class canReuseBitmap<T, R> extends printVPath {
    private final Transition<T, setPatternPath<? super R>, Object> toString;
    private final ViewPager.PageTransformer<R> valueOf;

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        values(th);
        return setAnimationMatrix.ag$a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public canReuseBitmap(ViewPager.PageTransformer<? super R> pageTransformer, Transition<? super T, ? super setPatternPath<? super R>, ? extends Object> transition) {
        this.valueOf = pageTransformer;
        this.toString = transition;
    }

    @Override // o.AnimatorInflaterCompat.PathDataEvaluator
    public void values(Throwable th) {
        if (this.valueOf.HaptikSDK$c()) {
            ag$a().ag$a(this.valueOf, this.toString);
        }
    }
}
