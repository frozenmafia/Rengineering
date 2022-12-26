package com.google.common.base;

import java.io.Serializable;
import o.findViewHolder;
import o.hasPendingUpdates;
import o.markViewHoldersUpdated;
import o.recycleUpdateOp;
/* loaded from: classes7.dex */
public abstract class Equivalence<T> {
    protected abstract boolean doEquivalent(T t, T t2);

    protected abstract int doHash(T t);

    public final boolean equivalent(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return doEquivalent(t, t2);
    }

    public final int hash(T t) {
        if (t == null) {
            return 0;
        }
        return doHash(t);
    }

    public final <F> Equivalence<F> onResultOf(hasPendingUpdates<? super F, ? extends T> haspendingupdates) {
        return new FunctionalEquivalence(haspendingupdates, this);
    }

    public final <S extends T> Wrapper<S> wrap(S s) {
        return new Wrapper<>(s);
    }

    /* loaded from: classes7.dex */
    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<? super T> equivalence;
        private final T reference;

        private Wrapper(Equivalence<? super T> equivalence, T t) {
            this.equivalence = (Equivalence) markViewHoldersUpdated.toString(equivalence);
            this.reference = t;
        }

        public T get() {
            return this.reference;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Wrapper) {
                Wrapper wrapper = (Wrapper) obj;
                if (this.equivalence.equals(wrapper.equivalence)) {
                    return this.equivalence.equivalent((T) this.reference, (T) wrapper.reference);
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return this.equivalence.hash((T) this.reference);
        }

        public String toString() {
            String valueOf = String.valueOf(this.equivalence);
            String valueOf2 = String.valueOf(this.reference);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7 + String.valueOf(valueOf2).length());
            sb.append(valueOf);
            sb.append(".wrap(");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    public final <S extends T> Equivalence<Iterable<S>> pairwise() {
        return new PairwiseEquivalence(this);
    }

    public final findViewHolder<T> equivalentTo(T t) {
        return new EquivalentToPredicate(this, t);
    }

    /* loaded from: classes7.dex */
    static final class EquivalentToPredicate<T> implements findViewHolder<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<T> equivalence;
        private final T target;

        EquivalentToPredicate(Equivalence<T> equivalence, T t) {
            this.equivalence = (Equivalence) markViewHoldersUpdated.toString(equivalence);
            this.target = t;
        }

        @Override // o.findViewHolder
        public boolean apply(T t) {
            return this.equivalence.equivalent(t, this.target);
        }

        @Override // o.findViewHolder
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof EquivalentToPredicate) {
                EquivalentToPredicate equivalentToPredicate = (EquivalentToPredicate) obj;
                return this.equivalence.equals(equivalentToPredicate.equivalence) && recycleUpdateOp.values(this.target, equivalentToPredicate.target);
            }
            return false;
        }

        public int hashCode() {
            return recycleUpdateOp.valueOf(this.equivalence, this.target);
        }

        public String toString() {
            String valueOf = String.valueOf(this.equivalence);
            String valueOf2 = String.valueOf(this.target);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15 + String.valueOf(valueOf2).length());
            sb.append(valueOf);
            sb.append(".equivalentTo(");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static Equivalence<Object> equals() {
        return Equals.INSTANCE;
    }

    public static Equivalence<Object> identity() {
        return Identity.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class Equals extends Equivalence<Object> implements Serializable {
        static final Equals INSTANCE = new Equals();
        private static final long serialVersionUID = 1;

        Equals() {
        }

        @Override // com.google.common.base.Equivalence
        protected boolean doEquivalent(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.google.common.base.Equivalence
        protected int doHash(Object obj) {
            return obj.hashCode();
        }

        private Object readResolve() {
            return INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class Identity extends Equivalence<Object> implements Serializable {
        static final Identity INSTANCE = new Identity();
        private static final long serialVersionUID = 1;

        @Override // com.google.common.base.Equivalence
        protected boolean doEquivalent(Object obj, Object obj2) {
            return false;
        }

        Identity() {
        }

        @Override // com.google.common.base.Equivalence
        protected int doHash(Object obj) {
            return System.identityHashCode(obj);
        }

        private Object readResolve() {
            return INSTANCE;
        }
    }
}
