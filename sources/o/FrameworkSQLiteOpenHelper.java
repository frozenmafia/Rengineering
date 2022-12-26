package o;
/* loaded from: classes.dex */
public interface FrameworkSQLiteOpenHelper<T1, T2, R> {

    /* loaded from: classes.dex */
    public interface OpenHelper {

        /* renamed from: o.FrameworkSQLiteOpenHelper$OpenHelper$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public interface AnonymousClass1<T1, T2, T3, R> {
            R apply(T1 t1, T2 t2, T3 t3) throws Exception;
        }

        void run() throws Exception;
    }

    R apply(T1 t1, T2 t2) throws Exception;
}
