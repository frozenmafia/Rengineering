package com.google.common.base;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import o.hasPendingUpdates;
import o.markViewHoldersUpdated;
import o.offsetPositionsForRemovingInvisible;
import o.offsetPositionsForRemovingLaidOutOrNewView;
import o.preProcess;
import o.recycleUpdateOp;
import o.recycleUpdateOpsAndClearList;
/* loaded from: classes7.dex */
public final class Suppliers {

    /* loaded from: classes7.dex */
    static class SupplierComposition<F, T> implements offsetPositionsForRemovingLaidOutOrNewView<T>, Serializable {
        private static final long serialVersionUID = 0;
        final hasPendingUpdates<? super F, T> function;
        final offsetPositionsForRemovingLaidOutOrNewView<F> supplier;

        SupplierComposition(hasPendingUpdates<? super F, T> haspendingupdates, offsetPositionsForRemovingLaidOutOrNewView<F> offsetpositionsforremovinglaidoutornewview) {
            this.function = (hasPendingUpdates) markViewHoldersUpdated.toString(haspendingupdates);
            this.supplier = (offsetPositionsForRemovingLaidOutOrNewView) markViewHoldersUpdated.toString(offsetpositionsforremovinglaidoutornewview);
        }

        @Override // o.offsetPositionsForRemovingLaidOutOrNewView
        public T get() {
            return this.function.apply((F) this.supplier.get());
        }

        public boolean equals(Object obj) {
            if (obj instanceof SupplierComposition) {
                SupplierComposition supplierComposition = (SupplierComposition) obj;
                if (this.function.equals(supplierComposition.function) && this.supplier.equals(supplierComposition.supplier)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return recycleUpdateOp.valueOf(this.function, this.supplier);
        }

        public String toString() {
            String valueOf = String.valueOf(this.function);
            String valueOf2 = String.valueOf(this.supplier);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(valueOf2).length());
            sb.append("Suppliers.compose(");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    /* loaded from: classes7.dex */
    static class MemoizingSupplier<T> implements offsetPositionsForRemovingLaidOutOrNewView<T>, Serializable {
        private static final long serialVersionUID = 0;
        final offsetPositionsForRemovingLaidOutOrNewView<T> delegate;
        volatile transient boolean initialized;
        transient T value;

        MemoizingSupplier(offsetPositionsForRemovingLaidOutOrNewView<T> offsetpositionsforremovinglaidoutornewview) {
            this.delegate = (offsetPositionsForRemovingLaidOutOrNewView) markViewHoldersUpdated.toString(offsetpositionsforremovinglaidoutornewview);
        }

        @Override // o.offsetPositionsForRemovingLaidOutOrNewView
        public T get() {
            if (!this.initialized) {
                synchronized (this) {
                    if (!this.initialized) {
                        T t = this.delegate.get();
                        this.value = t;
                        this.initialized = true;
                        return t;
                    }
                }
            }
            return (T) recycleUpdateOpsAndClearList.toString(this.value);
        }

        public String toString() {
            Object obj;
            if (this.initialized) {
                String valueOf = String.valueOf(this.value);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                sb.append("<supplier that returned ");
                sb.append(valueOf);
                sb.append(">");
                obj = sb.toString();
            } else {
                obj = this.delegate;
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: classes7.dex */
    static class ExpiringMemoizingSupplier<T> implements offsetPositionsForRemovingLaidOutOrNewView<T>, Serializable {
        private static final long serialVersionUID = 0;
        final offsetPositionsForRemovingLaidOutOrNewView<T> delegate;
        final long durationNanos;
        volatile transient long expirationNanos;
        volatile transient T value;

        ExpiringMemoizingSupplier(offsetPositionsForRemovingLaidOutOrNewView<T> offsetpositionsforremovinglaidoutornewview, long j, TimeUnit timeUnit) {
            this.delegate = (offsetPositionsForRemovingLaidOutOrNewView) markViewHoldersUpdated.toString(offsetpositionsforremovinglaidoutornewview);
            this.durationNanos = timeUnit.toNanos(j);
            markViewHoldersUpdated.ah$a(j > 0, "duration (%s %s) must be > 0", j, timeUnit);
        }

        @Override // o.offsetPositionsForRemovingLaidOutOrNewView
        public T get() {
            long j = this.expirationNanos;
            long valueOf = preProcess.valueOf();
            if (j == 0 || valueOf - j >= 0) {
                synchronized (this) {
                    if (j == this.expirationNanos) {
                        T t = this.delegate.get();
                        this.value = t;
                        long j2 = valueOf + this.durationNanos;
                        if (j2 == 0) {
                            j2 = 1;
                        }
                        this.expirationNanos = j2;
                        return t;
                    }
                }
            }
            return (T) recycleUpdateOpsAndClearList.toString(this.value);
        }

        public String toString() {
            String valueOf = String.valueOf(this.delegate);
            long j = this.durationNanos;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
            sb.append("Suppliers.memoizeWithExpiration(");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(j);
            sb.append(", NANOS)");
            return sb.toString();
        }
    }

    public static <T> offsetPositionsForRemovingLaidOutOrNewView<T> toString(T t) {
        return new SupplierOfInstance(t);
    }

    /* loaded from: classes7.dex */
    static class SupplierOfInstance<T> implements offsetPositionsForRemovingLaidOutOrNewView<T>, Serializable {
        private static final long serialVersionUID = 0;
        final T instance;

        SupplierOfInstance(T t) {
            this.instance = t;
        }

        @Override // o.offsetPositionsForRemovingLaidOutOrNewView
        public T get() {
            return this.instance;
        }

        public boolean equals(Object obj) {
            if (obj instanceof SupplierOfInstance) {
                return recycleUpdateOp.values(this.instance, ((SupplierOfInstance) obj).instance);
            }
            return false;
        }

        public int hashCode() {
            return recycleUpdateOp.valueOf(this.instance);
        }

        public String toString() {
            String valueOf = String.valueOf(this.instance);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Suppliers.ofInstance(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    /* loaded from: classes7.dex */
    static class ThreadSafeSupplier<T> implements offsetPositionsForRemovingLaidOutOrNewView<T>, Serializable {
        private static final long serialVersionUID = 0;
        final offsetPositionsForRemovingLaidOutOrNewView<T> delegate;

        ThreadSafeSupplier(offsetPositionsForRemovingLaidOutOrNewView<T> offsetpositionsforremovinglaidoutornewview) {
            this.delegate = (offsetPositionsForRemovingLaidOutOrNewView) markViewHoldersUpdated.toString(offsetpositionsforremovinglaidoutornewview);
        }

        @Override // o.offsetPositionsForRemovingLaidOutOrNewView
        public T get() {
            T t;
            synchronized (this.delegate) {
                t = this.delegate.get();
            }
            return t;
        }

        public String toString() {
            String valueOf = String.valueOf(this.delegate);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("Suppliers.synchronizedSupplier(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    /* loaded from: classes7.dex */
    enum SupplierFunctionImpl implements offsetPositionsForRemovingInvisible<Object> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Suppliers.supplierFunction()";
        }

        @Override // o.hasPendingUpdates
        public Object apply(offsetPositionsForRemovingLaidOutOrNewView<Object> offsetpositionsforremovinglaidoutornewview) {
            return offsetpositionsforremovinglaidoutornewview.get();
        }
    }
}
