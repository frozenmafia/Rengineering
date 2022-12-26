package o;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes4.dex */
public class isCutOnSurrogate extends Handler {
    private Runnable valueOf;

    public Runnable values() {
        return this.valueOf;
    }

    public void ah$a(Runnable runnable) {
        this.valueOf = runnable;
    }

    public isCutOnSurrogate() {
        super(Looper.getMainLooper());
        this.valueOf = null;
    }
}
