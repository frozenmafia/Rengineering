package o;

import java.util.Objects;
import java.util.concurrent.Callable;
/* loaded from: classes5.dex */
public final class setProgressBackgroundColorSchemeColor {
    private static volatile addOffset<getLoopers, getLoopers> ah$a;
    private static volatile addOffset<Callable<getLoopers>, getLoopers> valueOf;

    public static getLoopers values(Callable<getLoopers> callable) {
        Objects.requireNonNull(callable, "scheduler == null");
        addOffset<Callable<getLoopers>, getLoopers> addoffset = valueOf;
        if (addoffset == null) {
            return valueOf(callable);
        }
        return ag$a(addoffset, callable);
    }

    public static getLoopers toString(getLoopers getloopers) {
        Objects.requireNonNull(getloopers, "scheduler == null");
        addOffset<getLoopers, getLoopers> addoffset = ah$a;
        return addoffset == null ? getloopers : (getLoopers) values(addoffset, getloopers);
    }

    static getLoopers valueOf(Callable<getLoopers> callable) {
        try {
            getLoopers call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw FlatBufferBuilder.valueOf(th);
        }
    }

    static getLoopers ag$a(addOffset<Callable<getLoopers>, getLoopers> addoffset, Callable<getLoopers> callable) {
        getLoopers getloopers = (getLoopers) values(addoffset, callable);
        Objects.requireNonNull(getloopers, "Scheduler Callable returned null");
        return getloopers;
    }

    static <T, R> R values(addOffset<T, R> addoffset, T t) {
        try {
            return addoffset.apply(t);
        } catch (Throwable th) {
            throw FlatBufferBuilder.valueOf(th);
        }
    }
}
