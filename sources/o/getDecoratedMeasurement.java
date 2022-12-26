package o;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class getDecoratedMeasurement<T> implements quickRecycleScrapView<Set<T>> {
    private volatile Set<T> ah$a = null;
    private volatile Set<quickRecycleScrapView<T>> values = Collections.newSetFromMap(new ConcurrentHashMap());

    getDecoratedMeasurement(Collection<quickRecycleScrapView<T>> collection) {
        this.values.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static getDecoratedMeasurement<?> toString(Collection<quickRecycleScrapView<?>> collection) {
        return new getDecoratedMeasurement<>((Set) collection);
    }

    @Override // o.quickRecycleScrapView
    /* renamed from: ah$a */
    public Set<T> ag$a() {
        if (this.ah$a == null) {
            synchronized (this) {
                if (this.ah$a == null) {
                    this.ah$a = Collections.newSetFromMap(new ConcurrentHashMap());
                    valueOf();
                }
            }
        }
        return Collections.unmodifiableSet(this.ah$a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a(quickRecycleScrapView<T> quickrecyclescrapview) {
        synchronized (this) {
            if (this.ah$a == null) {
                this.values.add(quickrecyclescrapview);
            } else {
                this.ah$a.add(quickrecyclescrapview.ag$a());
            }
        }
    }

    private void valueOf() {
        synchronized (this) {
            for (quickRecycleScrapView<T> quickrecyclescrapview : this.values) {
                this.ah$a.add(quickrecyclescrapview.ag$a());
            }
            this.values = null;
        }
    }
}
