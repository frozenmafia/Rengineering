package io.reactivex.internal.subscribers;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
/* loaded from: classes7.dex */
public final class SubscriberResourceWrapper<T> extends AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> implements SupportSQLiteOpenHelper<T>, FrameworkSQLiteDatabase.AnonymousClass2, getSidecarVersion {
    private static final long serialVersionUID = -8612022020200669122L;
    final registerConfigurationChangeListener<? super T> downstream;
    final AtomicReference<getSidecarVersion> upstream = new AtomicReference<>();

    public SubscriberResourceWrapper(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.downstream = registerconfigurationchangelistener;
    }

    @Override // o.SupportSQLiteOpenHelper, o.registerConfigurationChangeListener
    public void onSubscribe(getSidecarVersion getsidecarversion) {
        if (SubscriptionHelper.setOnce(this.upstream, getsidecarversion)) {
            this.downstream.onSubscribe(this);
        }
    }

    @Override // o.registerConfigurationChangeListener
    public void onNext(T t) {
        this.downstream.onNext(t);
    }

    @Override // o.registerConfigurationChangeListener
    public void onError(Throwable th) {
        DisposableHelper.dispose(this);
        this.downstream.onError(th);
    }

    @Override // o.registerConfigurationChangeListener
    public void onComplete() {
        DisposableHelper.dispose(this);
        this.downstream.onComplete();
    }

    @Override // o.getSidecarVersion
    public void request(long j) {
        if (SubscriptionHelper.validate(j)) {
            this.upstream.get().request(j);
        }
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        SubscriptionHelper.cancel(this.upstream);
        DisposableHelper.dispose(this);
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return this.upstream.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // o.getSidecarVersion
    public void cancel() {
        dispose();
    }

    public void setResource(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        DisposableHelper.set(this, anonymousClass2);
    }
}
