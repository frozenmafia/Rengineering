package o;

import io.reactivex.internal.util.ExceptionHelper;
/* loaded from: classes.dex */
public final class FrameworkSQLiteDatabase {

    /* renamed from: o.FrameworkSQLiteDatabase$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public abstract class AnonymousClass1<T> extends SimpleSQLiteQuery<T> {
        public abstract void valueOf(FrameworkSQLiteStatement<? super AnonymousClass2> frameworkSQLiteStatement);
    }

    /* renamed from: o.FrameworkSQLiteDatabase$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public interface AnonymousClass2 {
        void dispose();

        boolean isDisposed();
    }

    public static RuntimeException ag$a(Throwable th) {
        throw ExceptionHelper.valueOf(th);
    }

    public static void values(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
