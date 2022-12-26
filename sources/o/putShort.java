package o;

import java.util.concurrent.atomic.AtomicBoolean;
import o.SwipeRefreshLayout;
/* loaded from: classes7.dex */
public final class putShort<T> extends SwipeRefreshLayout.AnonymousClass2<T> {
    final AtomicBoolean ag$a = new AtomicBoolean();
    public final startMetadataList<T> values;

    public putShort(startMetadataList<T> startmetadatalist) {
        this.values = startmetadatalist;
    }

    @Override // o.SwipeRefreshLayout.AnonymousClass2
    protected void ag$a(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.values.subscribe(registerconfigurationchangelistener);
        this.ag$a.set(true);
    }

    public boolean valueOf() {
        return !this.ag$a.get() && this.ag$a.compareAndSet(false, true);
    }
}
