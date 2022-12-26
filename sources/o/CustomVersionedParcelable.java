package o;

import o.Styleable;
import o.ViewPager;
/* loaded from: classes7.dex */
final class CustomVersionedParcelable<R> extends printVPath {
    private final ViewPager.PageTransformer<R> ag$a;
    private final Styleable.ChangeBounds<setPatternPath<? super R>, Object> valueOf;

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        values(th);
        return setAnimationMatrix.ag$a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomVersionedParcelable(ViewPager.PageTransformer<? super R> pageTransformer, Styleable.ChangeBounds<? super setPatternPath<? super R>, ? extends Object> changeBounds) {
        this.ag$a = pageTransformer;
        this.valueOf = changeBounds;
    }

    @Override // o.AnimatorInflaterCompat.PathDataEvaluator
    public void values(Throwable th) {
        if (this.ag$a.HaptikSDK$c()) {
            pageRight.ah$a(this.valueOf, this.ag$a.values());
        }
    }
}
