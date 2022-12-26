package o;
/* loaded from: classes7.dex */
public final class getStrokeColor extends printVPath {
    private final getStrokeLineCap ag$a;

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        values(th);
        return setAnimationMatrix.ag$a;
    }

    public getStrokeColor(getStrokeLineCap getstrokelinecap) {
        this.ag$a = getstrokelinecap;
    }

    @Override // o.AnimatorInflaterCompat.PathDataEvaluator
    public void values(Throwable th) {
        this.ag$a.u_();
    }
}
