package o;

import java.util.concurrent.Executor;
import java.util.logging.Level;
/* loaded from: classes7.dex */
public final class canRestoreState {
    private static final java.util.logging.Logger toString = java.util.logging.Logger.getLogger(canRestoreState.class.getName());
    private boolean ag$a;
    private toString valueOf;

    public void values(Runnable runnable, Executor executor) {
        markViewHoldersUpdated.valueOf(runnable, "Runnable was null.");
        markViewHoldersUpdated.valueOf(executor, "Executor was null.");
        synchronized (this) {
            if (!this.ag$a) {
                this.valueOf = new toString(runnable, executor, this.valueOf);
            } else {
                ag$a(runnable, executor);
            }
        }
    }

    public void valueOf() {
        synchronized (this) {
            if (this.ag$a) {
                return;
            }
            this.ag$a = true;
            toString tostring = this.valueOf;
            toString tostring2 = null;
            this.valueOf = null;
            while (tostring != null) {
                toString tostring3 = tostring.ah$a;
                tostring.ah$a = tostring2;
                tostring2 = tostring;
                tostring = tostring3;
            }
            while (tostring2 != null) {
                ag$a(tostring2.valueOf, tostring2.ag$a);
                tostring2 = tostring2.ah$a;
            }
        }
    }

    private static void ag$a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            java.util.logging.Logger logger = toString;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.log(level, sb.toString(), (Throwable) e);
        }
    }

    /* loaded from: classes7.dex */
    static final class toString {
        final Executor ag$a;
        toString ah$a;
        final Runnable valueOf;

        toString(Runnable runnable, Executor executor, toString tostring) {
            this.valueOf = runnable;
            this.ag$a = executor;
            this.ah$a = tostring;
        }
    }
}
