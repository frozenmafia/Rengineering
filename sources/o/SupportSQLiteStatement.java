package o;

import java.util.Objects;
import java.util.concurrent.Callable;
/* loaded from: classes5.dex */
public final class SupportSQLiteStatement {
    private static volatile FrameworkSQLiteOpenHelperFactory<Callable<appendColumns>, appendColumns> ah$a;
    private static volatile FrameworkSQLiteOpenHelperFactory<appendColumns, appendColumns> values;

    public static appendColumns toString(Callable<appendColumns> callable) {
        Objects.requireNonNull(callable, "scheduler == null");
        FrameworkSQLiteOpenHelperFactory<Callable<appendColumns>, appendColumns> frameworkSQLiteOpenHelperFactory = ah$a;
        if (frameworkSQLiteOpenHelperFactory == null) {
            return ah$a(callable);
        }
        return toString(frameworkSQLiteOpenHelperFactory, callable);
    }

    public static appendColumns ag$a(appendColumns appendcolumns) {
        Objects.requireNonNull(appendcolumns, "scheduler == null");
        FrameworkSQLiteOpenHelperFactory<appendColumns, appendColumns> frameworkSQLiteOpenHelperFactory = values;
        return frameworkSQLiteOpenHelperFactory == null ? appendcolumns : (appendColumns) ah$a(frameworkSQLiteOpenHelperFactory, appendcolumns);
    }

    static appendColumns ah$a(Callable<appendColumns> callable) {
        try {
            appendColumns call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw FrameworkSQLiteDatabase.ag$a(th);
        }
    }

    static appendColumns toString(FrameworkSQLiteOpenHelperFactory<Callable<appendColumns>, appendColumns> frameworkSQLiteOpenHelperFactory, Callable<appendColumns> callable) {
        appendColumns appendcolumns = (appendColumns) ah$a(frameworkSQLiteOpenHelperFactory, callable);
        Objects.requireNonNull(appendcolumns, "Scheduler Callable returned null");
        return appendcolumns;
    }

    static <T, R> R ah$a(FrameworkSQLiteOpenHelperFactory<T, R> frameworkSQLiteOpenHelperFactory, T t) {
        try {
            return frameworkSQLiteOpenHelperFactory.apply(t);
        } catch (Throwable th) {
            throw FrameworkSQLiteDatabase.ag$a(th);
        }
    }
}
