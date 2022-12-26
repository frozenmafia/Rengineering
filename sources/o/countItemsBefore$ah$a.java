package o;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class countItemsBefore$ah$a {
    static final countItemsBefore$ah$a valueOf = new countItemsBefore$ah$a();
    countItemsBefore$ah$a ag$a;
    final Runnable ah$a;
    final Executor values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public countItemsBefore$ah$a(Runnable runnable, Executor executor) {
        this.ah$a = runnable;
        this.values = executor;
    }

    countItemsBefore$ah$a() {
        this.ah$a = null;
        this.values = null;
    }
}
