package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class getStrokeAlpha extends AnimatorInflaterCompat {
    private final getStrokeLineCap ag$a;

    public getStrokeAlpha(getStrokeLineCap getstrokelinecap) {
        this.ag$a = getstrokelinecap;
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ setAnimationMatrix invoke(Throwable th) {
        valueOf(th);
        return setAnimationMatrix.ag$a;
    }

    @Override // o.createNewKeyframe
    public void valueOf(Throwable th) {
        this.ag$a.u_();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.ag$a + ']';
    }
}
