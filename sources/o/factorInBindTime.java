package o;

import java.util.concurrent.Executor;
/* loaded from: classes5.dex */
public final /* synthetic */ class factorInBindTime implements Executor {
    public static final Executor ag$a = new factorInBindTime();

    private factorInBindTime() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
