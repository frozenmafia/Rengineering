package o;

import java.util.concurrent.Executor;
/* loaded from: classes7.dex */
public final /* synthetic */ class ensureLayoutState implements Executor {
    public static final /* synthetic */ ensureLayoutState valueOf = new ensureLayoutState();

    private /* synthetic */ ensureLayoutState() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
