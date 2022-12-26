package o;

import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
/* loaded from: classes.dex */
public final class getColorSchemeColors<T> extends SimpleSQLiteQuery<T> {
    private final SupportSQLiteQuery<T> valueOf;

    public getColorSchemeColors(SupportSQLiteQuery<T> supportSQLiteQuery) {
        this.valueOf = supportSQLiteQuery;
    }

    @Override // o.SimpleSQLiteQuery
    protected void values(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        this.valueOf.subscribe(new valueOf(registerconfigurationchangelistener));
    }

    /* loaded from: classes5.dex */
    static final class valueOf<T> implements SupportSQLiteOpenHelper.Factory<T>, getSidecarVersion {
        final registerConfigurationChangeListener<? super T> toString;
        FrameworkSQLiteDatabase.AnonymousClass2 valueOf;

        @Override // o.getSidecarVersion
        public void request(long j) {
        }

        valueOf(registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
            this.toString = registerconfigurationchangelistener;
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onComplete() {
            this.toString.onComplete();
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onError(Throwable th) {
            this.toString.onError(th);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onNext(T t) {
            this.toString.onNext(t);
        }

        @Override // o.SupportSQLiteOpenHelper.Factory
        public void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            this.valueOf = anonymousClass2;
            this.toString.onSubscribe(this);
        }

        @Override // o.getSidecarVersion
        public void cancel() {
            this.valueOf.dispose();
        }
    }
}
