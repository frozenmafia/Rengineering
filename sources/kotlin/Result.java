package kotlin;

import java.io.Serializable;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class Result<T> implements Serializable {
    public static final Result$ah$a Companion = new Result$ah$a(null);
    private final Object value;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ Result m1232boximpl(Object obj) {
        return new Result(obj);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static <T> Object m1233constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m1234equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof Result) && runAnimators.values(obj, ((Result) obj2).m1242unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m1235equalsimpl0(Object obj, Object obj2) {
        return runAnimators.values(obj, obj2);
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m1238hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean equals(Object obj) {
        return m1234equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1238hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ Object m1242unboximpl() {
        return this.value;
    }

    private /* synthetic */ Result(Object obj) {
        this.value = obj;
    }

    /* renamed from: isSuccess-impl  reason: not valid java name */
    public static final boolean m1240isSuccessimpl(Object obj) {
        return !(obj instanceof Failure);
    }

    /* renamed from: isFailure-impl  reason: not valid java name */
    public static final boolean m1239isFailureimpl(Object obj) {
        return obj instanceof Failure;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOrNull-impl  reason: not valid java name */
    private static final T m1237getOrNullimpl(Object obj) {
        if (m1239isFailureimpl(obj)) {
            return null;
        }
        return obj;
    }

    /* renamed from: exceptionOrNull-impl  reason: not valid java name */
    public static final Throwable m1236exceptionOrNullimpl(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).exception;
        }
        return null;
    }

    public String toString() {
        return m1241toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m1241toStringimpl(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    /* loaded from: classes5.dex */
    public static final class Failure implements Serializable {
        public final Throwable exception;

        public Failure(Throwable th) {
            runAnimators.ag$a(th, "exception");
            this.exception = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof Failure) && runAnimators.values(this.exception, ((Failure) obj).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "Failure(" + this.exception + ')';
        }
    }
}
