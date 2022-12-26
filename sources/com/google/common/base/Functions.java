package com.google.common.base;

import java.io.Serializable;
import java.util.Map;
import o.findViewHolder;
import o.hasPendingUpdates;
import o.markViewHoldersUpdated;
import o.offsetPositionsForRemovingLaidOutOrNewView;
import o.recycleUpdateOp;
import o.recycleUpdateOpsAndClearList;
/* loaded from: classes7.dex */
public final class Functions {

    /* loaded from: classes7.dex */
    enum IdentityFunction implements hasPendingUpdates<Object, Object> {
        INSTANCE;

        @Override // o.hasPendingUpdates
        public Object apply(Object obj) {
            return obj;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.identity()";
        }
    }

    /* loaded from: classes7.dex */
    enum ToStringFunction implements hasPendingUpdates<Object, String> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.toStringFunction()";
        }

        @Override // o.hasPendingUpdates
        public String apply(Object obj) {
            markViewHoldersUpdated.toString(obj);
            return obj.toString();
        }
    }

    /* loaded from: classes7.dex */
    static class FunctionForMapNoDefault<K, V> implements hasPendingUpdates<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        final Map<K, V> map;

        FunctionForMapNoDefault(Map<K, V> map) {
            this.map = (Map) markViewHoldersUpdated.toString(map);
        }

        @Override // o.hasPendingUpdates
        public V apply(K k) {
            V v = this.map.get(k);
            markViewHoldersUpdated.toString(v != null || this.map.containsKey(k), "Key '%s' not present in map", k);
            return (V) recycleUpdateOpsAndClearList.toString(v);
        }

        @Override // o.hasPendingUpdates
        public boolean equals(Object obj) {
            if (obj instanceof FunctionForMapNoDefault) {
                return this.map.equals(((FunctionForMapNoDefault) obj).map);
            }
            return false;
        }

        public int hashCode() {
            return this.map.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.map);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
            sb.append("Functions.forMap(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    /* loaded from: classes7.dex */
    static class ForMapWithDefault<K, V> implements hasPendingUpdates<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        final V defaultValue;
        final Map<K, ? extends V> map;

        ForMapWithDefault(Map<K, ? extends V> map, V v) {
            this.map = (Map) markViewHoldersUpdated.toString(map);
            this.defaultValue = v;
        }

        @Override // o.hasPendingUpdates
        public V apply(K k) {
            V v = this.map.get(k);
            if (v != null || this.map.containsKey(k)) {
                return (V) recycleUpdateOpsAndClearList.toString(v);
            }
            return this.defaultValue;
        }

        @Override // o.hasPendingUpdates
        public boolean equals(Object obj) {
            if (obj instanceof ForMapWithDefault) {
                ForMapWithDefault forMapWithDefault = (ForMapWithDefault) obj;
                if (this.map.equals(forMapWithDefault.map) && recycleUpdateOp.values(this.defaultValue, forMapWithDefault.defaultValue)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return recycleUpdateOp.valueOf(this.map, this.defaultValue);
        }

        public String toString() {
            String valueOf = String.valueOf(this.map);
            String valueOf2 = String.valueOf(this.defaultValue);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33 + String.valueOf(valueOf2).length());
            sb.append("Functions.forMap(");
            sb.append(valueOf);
            sb.append(", defaultValue=");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    /* loaded from: classes7.dex */
    static class FunctionComposition<A, B, C> implements hasPendingUpdates<A, C>, Serializable {
        private static final long serialVersionUID = 0;
        private final hasPendingUpdates<A, ? extends B> f;
        private final hasPendingUpdates<B, C> g;

        public FunctionComposition(hasPendingUpdates<B, C> haspendingupdates, hasPendingUpdates<A, ? extends B> haspendingupdates2) {
            this.g = (hasPendingUpdates) markViewHoldersUpdated.toString(haspendingupdates);
            this.f = (hasPendingUpdates) markViewHoldersUpdated.toString(haspendingupdates2);
        }

        @Override // o.hasPendingUpdates
        public C apply(A a) {
            return this.g.apply(this.f.apply(a));
        }

        @Override // o.hasPendingUpdates
        public boolean equals(Object obj) {
            if (obj instanceof FunctionComposition) {
                FunctionComposition functionComposition = (FunctionComposition) obj;
                if (this.f.equals(functionComposition.f) && this.g.equals(functionComposition.g)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f.hashCode() ^ this.g.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.g);
            String valueOf2 = String.valueOf(this.f);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
            sb.append(valueOf);
            sb.append("(");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    /* loaded from: classes7.dex */
    static class PredicateFunction<T> implements hasPendingUpdates<T, Boolean>, Serializable {
        private static final long serialVersionUID = 0;
        private final findViewHolder<T> predicate;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.hasPendingUpdates
        public /* bridge */ /* synthetic */ Boolean apply(Object obj) {
            return apply((PredicateFunction<T>) obj);
        }

        private PredicateFunction(findViewHolder<T> findviewholder) {
            this.predicate = (findViewHolder) markViewHoldersUpdated.toString(findviewholder);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o.hasPendingUpdates
        public Boolean apply(T t) {
            return Boolean.valueOf(this.predicate.apply(t));
        }

        @Override // o.hasPendingUpdates
        public boolean equals(Object obj) {
            if (obj instanceof PredicateFunction) {
                return this.predicate.equals(((PredicateFunction) obj).predicate);
            }
            return false;
        }

        public int hashCode() {
            return this.predicate.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.predicate);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Functions.forPredicate(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    /* loaded from: classes7.dex */
    static class ConstantFunction<E> implements hasPendingUpdates<Object, E>, Serializable {
        private static final long serialVersionUID = 0;
        private final E value;

        public ConstantFunction(E e) {
            this.value = e;
        }

        @Override // o.hasPendingUpdates
        public E apply(Object obj) {
            return this.value;
        }

        @Override // o.hasPendingUpdates
        public boolean equals(Object obj) {
            if (obj instanceof ConstantFunction) {
                return recycleUpdateOp.values(this.value, ((ConstantFunction) obj).value);
            }
            return false;
        }

        public int hashCode() {
            E e = this.value;
            if (e == null) {
                return 0;
            }
            return e.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.value);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Functions.constant(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    /* loaded from: classes7.dex */
    static class SupplierFunction<F, T> implements hasPendingUpdates<F, T>, Serializable {
        private static final long serialVersionUID = 0;
        private final offsetPositionsForRemovingLaidOutOrNewView<T> supplier;

        private SupplierFunction(offsetPositionsForRemovingLaidOutOrNewView<T> offsetpositionsforremovinglaidoutornewview) {
            this.supplier = (offsetPositionsForRemovingLaidOutOrNewView) markViewHoldersUpdated.toString(offsetpositionsforremovinglaidoutornewview);
        }

        @Override // o.hasPendingUpdates
        public T apply(F f) {
            return this.supplier.get();
        }

        @Override // o.hasPendingUpdates
        public boolean equals(Object obj) {
            if (obj instanceof SupplierFunction) {
                return this.supplier.equals(((SupplierFunction) obj).supplier);
            }
            return false;
        }

        public int hashCode() {
            return this.supplier.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.supplier);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Functions.forSupplier(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }
}
