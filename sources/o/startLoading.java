package o;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class startLoading {
    private final Object ah$a = new Object();
    private final Map<SoftReference<unregisterListener>, Boolean> valueOf = new ConcurrentHashMap();
    private final ReferenceQueue<unregisterListener> values = new ReferenceQueue<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class valueOf {
        static final startLoading values = new startLoading();
    }

    startLoading() {
    }

    public SoftReference<unregisterListener> values(unregisterListener unregisterlistener) {
        SoftReference<unregisterListener> softReference = new SoftReference<>(unregisterlistener, this.values);
        this.valueOf.put(softReference, true);
        valueOf();
        return softReference;
    }

    private void valueOf() {
        while (true) {
            SoftReference softReference = (SoftReference) this.values.poll();
            if (softReference == null) {
                return;
            }
            this.valueOf.remove(softReference);
        }
    }
}
