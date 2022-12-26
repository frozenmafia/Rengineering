package o;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o.LocalBroadcastManager;
/* loaded from: classes6.dex */
public final class sendBroadcastSync<K, V> extends LocalBroadcastManager.AnonymousClass1<K, V> {
    private final long ag$a;
    private final HashMap<K, Long> valueOf;

    public sendBroadcastSync() {
        this(0L, 1, null);
    }

    public /* synthetic */ sendBroadcastSync(long j, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? TimeUnit.MINUTES.toMillis(1L) : j);
    }

    public sendBroadcastSync(long j) {
        this.ag$a = j;
        this.valueOf = new HashMap<>();
    }

    @Override // o.LocalBroadcastManager.AnonymousClass1
    public void values(K k, V v) {
        ag$a();
        this.valueOf.put(k, Long.valueOf(System.nanoTime()));
        ah$a().put(k, v);
    }

    @Override // o.LocalBroadcastManager.AnonymousClass1
    public V ah$a(K k) {
        ag$a();
        return ah$a().get(k);
    }

    private final void ag$a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, Long> entry : this.valueOf.entrySet()) {
            if (System.nanoTime() - entry.getValue().longValue() > TimeUnit.MILLISECONDS.toNanos(this.ag$a)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<K, V> entry2 : linkedHashMap.entrySet()) {
            ah$a().remove(entry2.getKey());
            this.valueOf.remove(entry2.getKey());
        }
    }
}
