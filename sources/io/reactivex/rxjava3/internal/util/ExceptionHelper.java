package io.reactivex.rxjava3.internal.util;

import com.dreampay.commons.constants.Constants;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes5.dex */
public final class ExceptionHelper {
    public static final Throwable ag$a = new Termination();

    public static RuntimeException valueOf(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        }
        return new RuntimeException(th);
    }

    public static boolean toString(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        do {
            th2 = atomicReference.get();
            if (th2 == ag$a) {
                return false;
            }
        } while (!atomicReference.compareAndSet(th2, th2 == null ? th : new CompositeException(th2, th)));
        return true;
    }

    public static Throwable ag$a(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = ag$a;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }

    public static String ah$a(long j, TimeUnit timeUnit) {
        return "The source did not signal an event for " + j + Constants.WHITE_SPACE + timeUnit.toString().toLowerCase() + " and has been terminated.";
    }

    /* loaded from: classes5.dex */
    static final class Termination extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }

        Termination() {
            super("No further exceptions");
        }
    }

    public static String values(String str) {
        return str + " Null values are generally not allowed in 3.x operators and sources.";
    }

    public static NullPointerException toString(String str) {
        return new NullPointerException(values(str));
    }

    public static <T> T valueOf(T t, String str) {
        if (t != null) {
            return t;
        }
        throw toString(str);
    }
}
