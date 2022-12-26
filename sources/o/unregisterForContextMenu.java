package o;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes4.dex */
public class unregisterForContextMenu extends setSharedElementEnterTransition {
    private static unregisterForContextMenu ag$a;

    private unregisterForContextMenu() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static unregisterForContextMenu valueOf() {
        if (ag$a == null) {
            ag$a = new unregisterForContextMenu();
        }
        return ag$a;
    }

    @Override // o.setSharedElementEnterTransition, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (ag$a()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
