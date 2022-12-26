package o;

import o.FrameworkSQLiteDatabase;
/* loaded from: classes.dex */
public interface builder<T> {
    void onComplete();

    void onError(Throwable th);

    void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2);

    void onSuccess(T t);
}
