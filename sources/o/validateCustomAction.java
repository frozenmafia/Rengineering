package o;

import java.io.Closeable;
/* loaded from: classes.dex */
public class validateCustomAction implements Closeable {
    private boolean ag$a;
    private final Object toString;
    private Runnable valueOf;
    private getMediaController values;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.toString) {
            if (this.ag$a) {
                return;
            }
            this.ag$a = true;
            this.values.valueOf(this);
            this.values = null;
            this.valueOf = null;
        }
    }
}
