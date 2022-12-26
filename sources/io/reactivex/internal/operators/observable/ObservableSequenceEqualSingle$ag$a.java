package io.reactivex.internal.operators.observable;

import io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.setColors;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class ObservableSequenceEqualSingle$ag$a<T> implements SupportSQLiteOpenHelper.Factory<T> {
    final ObservableSequenceEqualSingle.EqualCoordinator<T> ag$a;
    volatile boolean ah$a;
    final int toString;
    Throwable valueOf;
    final setColors<T> values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ObservableSequenceEqualSingle$ag$a(ObservableSequenceEqualSingle.EqualCoordinator<T> equalCoordinator, int i, int i2) {
        this.ag$a = equalCoordinator;
        this.toString = i;
        this.values = new setColors<>(i2);
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        this.ag$a.setDisposable(anonymousClass2, this.toString);
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onNext(T t) {
        this.values.offer(t);
        this.ag$a.drain();
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onError(Throwable th) {
        this.valueOf = th;
        this.ah$a = true;
        this.ag$a.drain();
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onComplete() {
        this.ah$a = true;
        this.ag$a.drain();
    }
}
