package o;

import android.os.Handler;
import java.util.concurrent.Executor;
/* loaded from: classes3.dex */
public final /* synthetic */ class untagSocket implements Executor {
    public final /* synthetic */ Handler ah$a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.ah$a.post(runnable);
    }
}
