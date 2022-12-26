package io.reactivex.internal.subscriptions;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.getSidecarVersion;
/* loaded from: classes7.dex */
public final class AsyncSubscription extends AtomicLong implements getSidecarVersion, FrameworkSQLiteDatabase.AnonymousClass2 {
    private static final long serialVersionUID = 7028635084060361255L;
    final AtomicReference<getSidecarVersion> actual;
    final AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> resource;

    public AsyncSubscription() {
        this.resource = new AtomicReference<>();
        this.actual = new AtomicReference<>();
    }

    public AsyncSubscription(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        this();
        this.resource.lazySet(anonymousClass2);
    }

    @Override // o.getSidecarVersion
    public void request(long j) {
        SubscriptionHelper.deferredRequest(this.actual, this, j);
    }

    @Override // o.getSidecarVersion
    public void cancel() {
        dispose();
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        SubscriptionHelper.cancel(this.actual);
        DisposableHelper.dispose(this.resource);
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return this.actual.get() == SubscriptionHelper.CANCELLED;
    }

    public boolean setResource(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        return DisposableHelper.set(this.resource, anonymousClass2);
    }

    public boolean replaceResource(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        return DisposableHelper.replace(this.resource, anonymousClass2);
    }

    public void setSubscription(getSidecarVersion getsidecarversion) {
        SubscriptionHelper.deferredSetOnce(this.actual, this, getsidecarversion);
    }
}
