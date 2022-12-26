package o;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* loaded from: classes7.dex */
public final class dispatchFinishedWhenDone {
    public static <V> V toString(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }
}
