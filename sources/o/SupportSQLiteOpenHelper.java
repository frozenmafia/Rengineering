package o;

import o.FrameworkSQLiteDatabase;
/* loaded from: classes5.dex */
public interface SupportSQLiteOpenHelper<T> extends registerConfigurationChangeListener<T> {

    /* loaded from: classes5.dex */
    public interface Callback<T> {
        void subscribe(SupportSQLiteDatabase<T> supportSQLiteDatabase) throws Exception;
    }

    /* loaded from: classes7.dex */
    public interface Configuration<T> {

        /* loaded from: classes.dex */
        public interface Builder<T> {
            void valueOf(builder<? super T> builderVar);
        }

        void valueOf(onCorruption<T> oncorruption) throws Exception;
    }

    /* loaded from: classes.dex */
    public interface Factory<T> {
        void onComplete();

        void onError(Throwable th);

        void onNext(T t);

        void onSubscribe(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2);
    }

    @Override // o.registerConfigurationChangeListener
    void onSubscribe(getSidecarVersion getsidecarversion);
}
