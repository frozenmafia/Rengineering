package o;

import java.util.concurrent.Future;
/* loaded from: classes7.dex */
final class getFillColor implements getStrokeLineCap {
    private final Future<?> valueOf;

    public getFillColor(Future<?> future) {
        this.valueOf = future;
    }

    @Override // o.getStrokeLineCap
    public void u_() {
        this.valueOf.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.valueOf + ']';
    }
}
