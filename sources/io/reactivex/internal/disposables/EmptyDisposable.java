package io.reactivex.internal.disposables;

import o.SlidingPaneLayout;
import o.StartupLogger;
import o.SupportSQLiteOpenHelper;
import o.appendClause;
import o.builder;
/* loaded from: classes5.dex */
public enum EmptyDisposable implements StartupLogger<Object> {
    INSTANCE,
    NEVER;

    @Override // o.elevationSupported
    public void clear() {
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
    }

    @Override // o.elevationSupported
    public boolean isEmpty() {
        return true;
    }

    @Override // o.elevationSupported
    public Object poll() throws Exception {
        return null;
    }

    @Override // o.e
    public int requestFusion(int i) {
        return i & 2;
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return this == INSTANCE;
    }

    public static void complete(SupportSQLiteOpenHelper.Factory<?> factory) {
        factory.onSubscribe(INSTANCE);
        factory.onComplete();
    }

    public static void complete(builder<?> builderVar) {
        builderVar.onSubscribe(INSTANCE);
        builderVar.onComplete();
    }

    public static void error(Throwable th, SupportSQLiteOpenHelper.Factory<?> factory) {
        factory.onSubscribe(INSTANCE);
        factory.onError(th);
    }

    public static void complete(SlidingPaneLayout.SavedState savedState) {
        savedState.onSubscribe(INSTANCE);
        savedState.onComplete();
    }

    public static void error(Throwable th, SlidingPaneLayout.SavedState savedState) {
        savedState.onSubscribe(INSTANCE);
        savedState.onError(th);
    }

    public static void error(Throwable th, appendClause<?> appendclause) {
        appendclause.onSubscribe(INSTANCE);
        appendclause.onError(th);
    }

    public static void error(Throwable th, builder<?> builderVar) {
        builderVar.onSubscribe(INSTANCE);
        builderVar.onError(th);
    }

    @Override // o.elevationSupported
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
