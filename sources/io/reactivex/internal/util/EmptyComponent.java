package io.reactivex.internal.util;

import o.FrameworkSQLiteDatabase;
import o.SlidingPaneLayout;
import o.SupportSQLiteOpenHelper;
import o.appendClause;
import o.builder;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
import o.setProgressBackgroundColor;
/* loaded from: classes7.dex */
public enum EmptyComponent implements SupportSQLiteOpenHelper<Object>, SupportSQLiteOpenHelper.Factory<Object>, builder<Object>, appendClause<Object>, SlidingPaneLayout.SavedState, getSidecarVersion, FrameworkSQLiteDatabase.AnonymousClass2 {
    INSTANCE;

    @Override // o.getSidecarVersion
    public void cancel() {
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public void dispose() {
    }

    @Override // o.FrameworkSQLiteDatabase.AnonymousClass2
    public boolean isDisposed() {
        return true;
    }

    @Override // o.registerConfigurationChangeListener
    public void onComplete() {
    }

    @Override // o.registerConfigurationChangeListener
    public void onNext(Object obj) {
    }

    @Override // o.builder
    public void onSuccess(Object obj) {
    }

    @Override // o.getSidecarVersion
    public void request(long j) {
    }

    public static <T> registerConfigurationChangeListener<T> asSubscriber() {
        return INSTANCE;
    }

    public static <T> SupportSQLiteOpenHelper.Factory<T> asObserver() {
        return INSTANCE;
    }

    @Override // o.SupportSQLiteOpenHelper.Factory
    public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        anonymousClass2.dispose();
    }

    @Override // o.SupportSQLiteOpenHelper, o.registerConfigurationChangeListener
    public void onSubscribe(getSidecarVersion getsidecarversion) {
        getsidecarversion.cancel();
    }

    @Override // o.registerConfigurationChangeListener
    public void onError(Throwable th) {
        setProgressBackgroundColor.values(th);
    }
}
