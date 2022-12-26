package com.dreampay.commons;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public abstract class Response<T> {
    public /* synthetic */ Response(getTargetTypes gettargettypes) {
        this();
    }

    /* loaded from: classes4.dex */
    public static final class Loading extends Response {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    private Response() {
    }

    /* loaded from: classes4.dex */
    public static final class Error extends Response {
        private final Throwable throwable;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        public final Throwable component1() {
            return this.throwable;
        }

        public final Error copy(Throwable th) {
            runAnimators.ag$a(th, "throwable");
            return new Error(th);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && runAnimators.values(this.throwable, ((Error) obj).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable th) {
            super(null);
            runAnimators.ag$a(th, "throwable");
            this.throwable = th;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Complete<T> extends Response<T> {
        private final T data;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Complete copy$default(Complete complete, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = complete.data;
            }
            return complete.copy(obj);
        }

        public final T component1() {
            return this.data;
        }

        public final Complete<T> copy(T t) {
            return new Complete<>(t);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Complete) && runAnimators.values(this.data, ((Complete) obj).data);
        }

        public int hashCode() {
            T t = this.data;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            return "Complete(data=" + this.data + ')';
        }

        public Complete(T t) {
            super(null);
            this.data = t;
        }

        public final T getData() {
            return this.data;
        }
    }
}
