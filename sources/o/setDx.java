package o;

import java.util.concurrent.Executor;
/* loaded from: classes5.dex */
public final /* synthetic */ class setDx implements Executor {
    public static final Executor valueOf = new setDx();

    private setDx() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
