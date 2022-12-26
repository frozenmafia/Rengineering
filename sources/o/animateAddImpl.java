package o;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* loaded from: classes5.dex */
public interface animateAddImpl<V> extends Future<V> {
    void addListener(Runnable runnable, Executor executor);
}
