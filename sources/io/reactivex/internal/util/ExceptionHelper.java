package io.reactivex.internal.util;

import com.dreampay.commons.constants.Constants;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class ExceptionHelper {
    public static final Throwable values = new Termination();

    public static RuntimeException valueOf(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        }
        return new RuntimeException(th);
    }

    public static <T> boolean ah$a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        do {
            th2 = atomicReference.get();
            if (th2 == values) {
                return false;
            }
        } while (!atomicReference.compareAndSet(th2, th2 == null ? th : new CompositeException(th2, th)));
        return true;
    }

    public static <T> Throwable valueOf(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = values;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }

    public static <E extends Throwable> Exception values(Throwable th) throws Throwable {
        if (th instanceof Exception) {
            return (Exception) th;
        }
        throw th;
    }

    public static String valueOf(long j, TimeUnit timeUnit) {
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
}
