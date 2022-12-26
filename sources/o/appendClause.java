package o;

import o.FrameworkSQLiteDatabase;
/* loaded from: classes.dex */
public interface appendClause<T> {
    void onError(Throwable th);

    void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2);

    void onSuccess(T t);
}
