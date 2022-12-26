package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.observable.ObservableDebounceTimed;
import java.util.concurrent.TimeUnit;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.appendColumns;
import o.setProgressBackgroundColor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class ObservableDebounceTimed$ah$a<T> implements SupportSQLiteOpenHelper.Factory<T>, FrameworkSQLiteDatabase.AnonymousClass2 {
    FrameworkSQLiteDatabase.AnonymousClass2 HaptikSDK$a;
    volatile long ag$a;
    FrameworkSQLiteDatabase.AnonymousClass2 ah$a;
    final TimeUnit ah$b;
    final appendColumns.values invoke;
    final SupportSQLiteOpenHelper.Factory<? super T> toString;
    boolean valueOf;
    final long values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ObservableDebounceTimed$ah$a(SupportSQLiteOpenHelper.Factory<? super T> factory, long j, TimeUnit timeUnit, appendColumns.values valuesVar) {
        this.toString = factory;
        this.values = j;
        this.ah$b = timeUnit;
        this.invoke = valuesVar;
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        if (DisposableHelper.validate(this.HaptikSDK$a, anonymousClass2)) {
            this.HaptikSDK$a = anonymousClass2;
            this.toString.onSubscribe(this);
        }
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onNext(T t) {
        if (this.valueOf) {
            return;
        }
        long j = this.ag$a + 1;
        this.ag$a = j;
        FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2 = this.ah$a;
        if (anonymousClass2 != null) {
            anonymousClass2.dispose();
        }
        ObservableDebounceTimed.DebounceEmitter debounceEmitter = new ObservableDebounceTimed.DebounceEmitter(t, j, this);
        this.ah$a = debounceEmitter;
        debounceEmitter.setResource(this.invoke.ah$a(debounceEmitter, this.values, this.ah$b));
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onError(Throwable th) {
        if (this.valueOf) {
            setProgressBackgroundColor.values(th);
            return;
        }
        FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2 = this.ah$a;
        if (anonymousClass2 != null) {
            anonymousClass2.dispose();
        }
        this.valueOf = true;
        this.toString.onError(th);
        this.invoke.dispose();
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onComplete() {
        if (this.valueOf) {
            return;
        }
        this.valueOf = true;
        FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2 = this.ah$a;
        if (anonymousClass2 != null) {
            anonymousClass2.dispose();
        }
        ObservableDebounceTimed.DebounceEmitter debounceEmitter = (ObservableDebounceTimed.DebounceEmitter) anonymousClass2;
        if (debounceEmitter != null) {
            debounceEmitter.run();
        }
        this.toString.onComplete();
        this.invoke.dispose();
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
        this.HaptikSDK$a.dispose();
        this.invoke.dispose();
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return this.invoke.isDisposed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a(long j, T t, ObservableDebounceTimed.DebounceEmitter<T> debounceEmitter) {
        if (j == this.ag$a) {
            this.toString.onNext(t);
            debounceEmitter.dispose();
        }
    }
}
