package o;
/* loaded from: classes5.dex */
public class setAddDuration implements onAnimationFinished {
    private long toString;
    private final onAnimationFinished values;

    public setAddDuration(onAnimationFinished onanimationfinished, long j) {
        this.toString = 0L;
        this.values = onanimationfinished;
        this.toString = j;
    }

    public void ag$a(long j) {
        this.toString = j;
    }

    @Override // o.onAnimationFinished
    public long valueOf() {
        return this.values.valueOf() + this.toString;
    }
}
