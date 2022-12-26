package o;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
/* loaded from: classes.dex */
public class getMediaController implements Closeable {
    private boolean ah$a;
    private ScheduledFuture<?> ah$b;
    private boolean toString;
    private final Object values = new Object();
    private final List<validateCustomAction> valueOf = new ArrayList();
    private final ScheduledExecutorService ag$a = skipToQueueItem.ag$a();

    public boolean ah$a() {
        boolean z;
        synchronized (this.values) {
            ag$a();
            z = this.toString;
        }
        return z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.values) {
            if (this.ah$a) {
                return;
            }
            valueOf();
            for (validateCustomAction validatecustomaction : this.valueOf) {
                validatecustomaction.close();
            }
            this.valueOf.clear();
            this.ah$a = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void valueOf(validateCustomAction validatecustomaction) {
        synchronized (this.values) {
            ag$a();
            this.valueOf.remove(validatecustomaction);
        }
    }

    public String toString() {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(ah$a()));
    }

    private void ag$a() {
        if (this.ah$a) {
            throw new IllegalStateException("Object already closed");
        }
    }

    private void valueOf() {
        ScheduledFuture<?> scheduledFuture = this.ah$b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.ah$b = null;
        }
    }
}
