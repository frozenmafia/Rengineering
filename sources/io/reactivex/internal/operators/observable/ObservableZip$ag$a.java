package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.observable.ObservableZip;
import java.util.concurrent.atomic.AtomicReference;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.setColors;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class ObservableZip$ag$a<T, R> implements SupportSQLiteOpenHelper.Factory<T> {
    final AtomicReference<FrameworkSQLiteDatabase.AnonymousClass2> ag$a = new AtomicReference<>();
    volatile boolean ah$a;
    final setColors<T> toString;
    final ObservableZip.ZipCoordinator<T, R> valueOf;
    Throwable values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ObservableZip$ag$a(ObservableZip.ZipCoordinator<T, R> zipCoordinator, int i) {
        this.valueOf = zipCoordinator;
        this.toString = new setColors<>(i);
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        DisposableHelper.setOnce(this.ag$a, anonymousClass2);
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onNext(T t) {
        this.toString.offer(t);
        this.valueOf.drain();
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onError(Throwable th) {
        this.values = th;
        this.ah$a = true;
        this.valueOf.drain();
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onComplete() {
        this.ah$a = true;
        this.valueOf.drain();
    }

    public void valueOf() {
        DisposableHelper.dispose(this.ag$a);
    }
}
