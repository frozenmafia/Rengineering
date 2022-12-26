package o;

import android.view.Choreographer;
/* loaded from: classes4.dex */
public abstract class burpActive$ag$a {
    private Choreographer.FrameCallback mFrameCallback;
    private Runnable mRunnable;

    public abstract void doFrame(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public Choreographer.FrameCallback getFrameCallback() {
        if (this.mFrameCallback == null) {
            this.mFrameCallback = new Choreographer.FrameCallback() { // from class: o.burpActive$ag$a.3
                @Override // android.view.Choreographer.FrameCallback
                public void doFrame(long j) {
                    burpActive$ag$a.this.doFrame(j);
                }
            };
        }
        return this.mFrameCallback;
    }

    Runnable getRunnable() {
        if (this.mRunnable == null) {
            this.mRunnable = new Runnable() { // from class: o.burpActive$ag$a.4
                @Override // java.lang.Runnable
                public void run() {
                    burpActive$ag$a.this.doFrame(System.nanoTime());
                }
            };
        }
        return this.mRunnable;
    }
}
