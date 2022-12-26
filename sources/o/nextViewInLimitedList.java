package o;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.p003firebaseauthapi.zzi;
import java.util.concurrent.Executor;
/* loaded from: classes5.dex */
public final class nextViewInLimitedList implements Executor {
    private static final nextViewInLimitedList ag$a = new nextViewInLimitedList();
    private final Handler values = new zzi(Looper.getMainLooper());

    private nextViewInLimitedList() {
    }

    public static nextViewInLimitedList values() {
        return ag$a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.values.post(runnable);
    }
}
