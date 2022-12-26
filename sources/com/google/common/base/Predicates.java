package com.google.common.base;

import com.sendbird.android.constant.StringSet;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import o.findPositionOffset;
import o.findViewHolder;
import o.hasPendingUpdates;
import o.hasUpdates;
import o.markViewHoldersUpdated;
import o.preProcess;
import o.recycleUpdateOp;
/* loaded from: classes5.dex */
public final class Predicates {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public enum ObjectPredicate implements findViewHolder<Object> {
        ALWAYS_TRUE { // from class: com.google.common.base.Predicates.ObjectPredicate.1
            @Override // o.findViewHolder
            public boolean apply(Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE { // from class: com.google.common.base.Predicates.ObjectPredicate.2
            @Override // o.findViewHolder
            public boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL { // from class: com.google.common.base.Predicates.ObjectPredicate.3
            @Override // o.findViewHolder
            public boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL { // from class: com.google.common.base.Predicates.ObjectPredicate.4
            @Override // o.findViewHolder
            public boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        };

        <T> findViewHolder<T> withNarrowedType() {
            return this;
        }
    }

    public static <T> findViewHolder<T> values() {
        return ObjectPredicate.ALWAYS_TRUE.withNarrowedType();
    }

    public static <T> findViewHolder<T> ag$a() {
        return ObjectPredicate.IS_NULL.withNarrowedType();
    }

    public static <T> findViewHolder<T> ah$a(findViewHolder<T> findviewholder) {
        return new NotPredicate(findviewholder);
    }

    public static <T> findViewHolder<T> ag$a(findViewHolder<? super T> findviewholder, findViewHolder<? super T> findviewholder2) {
        return new AndPredicate(values((findViewHolder) markViewHoldersUpdated.toString(findviewholder), (findViewHolder) markViewHoldersUpdated.toString(findviewholder2)));
    }

    public static <T> findViewHolder<T> ag$a(T t) {
        if (t == null) {
            return ag$a();
        }
        return new IsEqualToPredicate(t).withNarrowedType();
    }

    public static <T> findViewHolder<T> values(Class<?> cls) {
        return new InstanceOfPredicate(cls);
    }

    public static <T> findViewHolder<T> toString(Collection<? extends T> collection) {
        return new InPredicate(collection);
    }

    public static <A, B> findViewHolder<A> values(findViewHolder<B> findviewholder, hasPendingUpdates<A, ? extends B> haspendingupdates) {
        return new CompositionPredicate(findviewholder, haspendingupdates);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class NotPredicate<T> implements findViewHolder<T>, Serializable {
        private static final long serialVersionUID = 0;
        final findViewHolder<T> predicate;

        NotPredicate(findViewHolder<T> findviewholder) {
            this.predicate = (findViewHolder) markViewHoldersUpdated.toString(findviewholder);
        }

        @Override // o.findViewHolder
        public boolean apply(T t) {
            return !this.predicate.apply(t);
        }

        public int hashCode() {
            return ~this.predicate.hashCode();
        }

        @Override // o.findViewHolder
        public boolean equals(Object obj) {
            if (obj instanceof NotPredicate) {
                return this.predicate.equals(((NotPredicate) obj).predicate);
            }
            return false;
        }

        public String toString() {
            String valueOf = String.valueOf(this.predicate);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("Predicates.not(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class AndPredicate<T> implements findViewHolder<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends findViewHolder<? super T>> components;

        private AndPredicate(List<? extends findViewHolder<? super T>> list) {
            this.components = list;
        }

        @Override // o.findViewHolder
        public boolean apply(T t) {
            for (int i = 0; i < this.components.size(); i++) {
                if (!this.components.get(i).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            return this.components.hashCode() + 306654252;
        }

        @Override // o.findViewHolder
        public boolean equals(Object obj) {
            if (obj instanceof AndPredicate) {
                return this.components.equals(((AndPredicate) obj).components);
            }
            return false;
        }

        public String toString() {
            return Predicates.ah$a(StringSet.and, this.components);
        }
    }

    /* loaded from: classes7.dex */
    static class OrPredicate<T> implements findViewHolder<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends findViewHolder<? super T>> components;

        private OrPredicate(List<? extends findViewHolder<? super T>> list) {
            this.components = list;
        }

        @Override // o.findViewHolder
        public boolean apply(T t) {
            for (int i = 0; i < this.components.size(); i++) {
                if (this.components.get(i).apply(t)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.components.hashCode() + 87855567;
        }

        @Override // o.findViewHolder
        public boolean equals(Object obj) {
            if (obj instanceof OrPredicate) {
                return this.components.equals(((OrPredicate) obj).components);
            }
            return false;
        }

        public String toString() {
            return Predicates.ah$a(StringSet.or, this.components);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String ah$a(String str, Iterable<?> iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z = true;
        for (Object obj : iterable) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class IsEqualToPredicate implements findViewHolder<Object>, Serializable {
        private static final long serialVersionUID = 0;
        private final Object target;

        <T> findViewHolder<T> withNarrowedType() {
            return this;
        }

        private IsEqualToPredicate(Object obj) {
            this.target = obj;
        }

        @Override // o.findViewHolder
        public boolean apply(Object obj) {
            return this.target.equals(obj);
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        @Override // o.findViewHolder
        public boolean equals(Object obj) {
            if (obj instanceof IsEqualToPredicate) {
                return this.target.equals(((IsEqualToPredicate) obj).target);
            }
            return false;
        }

        public String toString() {
            String valueOf = String.valueOf(this.target);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Predicates.equalTo(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    /* loaded from: classes7.dex */
    static class InstanceOfPredicate<T> implements findViewHolder<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Class<?> clazz;

        private InstanceOfPredicate(Class<?> cls) {
            this.clazz = (Class) markViewHoldersUpdated.toString(cls);
        }

        @Override // o.findViewHolder
        public boolean apply(T t) {
            return this.clazz.isInstance(t);
        }

        public int hashCode() {
            return this.clazz.hashCode();
        }

        @Override // o.findViewHolder
        public boolean equals(Object obj) {
            return (obj instanceof InstanceOfPredicate) && this.clazz == ((InstanceOfPredicate) obj).clazz;
        }

        public String toString() {
            String name = this.clazz.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 23);
            sb.append("Predicates.instanceOf(");
            sb.append(name);
            sb.append(")");
            return sb.toString();
        }
    }

    /* loaded from: classes7.dex */
    static class SubtypeOfPredicate implements findViewHolder<Class<?>>, Serializable {
        private static final long serialVersionUID = 0;
        private final Class<?> clazz;

        private SubtypeOfPredicate(Class<?> cls) {
            this.clazz = (Class) markViewHoldersUpdated.toString(cls);
        }

        @Override // o.findViewHolder
        public boolean apply(Class<?> cls) {
            return this.clazz.isAssignableFrom(cls);
        }

        public int hashCode() {
            return this.clazz.hashCode();
        }

        @Override // o.findViewHolder
        public boolean equals(Object obj) {
            return (obj instanceof SubtypeOfPredicate) && this.clazz == ((SubtypeOfPredicate) obj).clazz;
        }

        public String toString() {
            String name = this.clazz.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 22);
            sb.append("Predicates.subtypeOf(");
            sb.append(name);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class InPredicate<T> implements findViewHolder<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Collection<?> target;

        private InPredicate(Collection<?> collection) {
            this.target = (Collection) markViewHoldersUpdated.toString(collection);
        }

        @Override // o.findViewHolder
        public boolean apply(T t) {
            try {
                return this.target.contains(t);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // o.findViewHolder
        public boolean equals(Object obj) {
            if (obj instanceof InPredicate) {
                return this.target.equals(((InPredicate) obj).target);
            }
            return false;
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.target);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("Predicates.in(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class CompositionPredicate<A, B> implements findViewHolder<A>, Serializable {
        private static final long serialVersionUID = 0;
        final hasPendingUpdates<A, ? extends B> f;
        final findViewHolder<B> p;

        private CompositionPredicate(findViewHolder<B> findviewholder, hasPendingUpdates<A, ? extends B> haspendingupdates) {
            this.p = (findViewHolder) markViewHoldersUpdated.toString(findviewholder);
            this.f = (hasPendingUpdates) markViewHoldersUpdated.toString(haspendingupdates);
        }

        @Override // o.findViewHolder
        public boolean apply(A a) {
            return this.p.apply(this.f.apply(a));
        }

        @Override // o.findViewHolder
        public boolean equals(Object obj) {
            if (obj instanceof CompositionPredicate) {
                CompositionPredicate compositionPredicate = (CompositionPredicate) obj;
                if (this.f.equals(compositionPredicate.f) && this.p.equals(compositionPredicate.p)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f.hashCode() ^ this.p.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.p);
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
    static class ContainsPatternPredicate implements findViewHolder<CharSequence>, Serializable {
        private static final long serialVersionUID = 0;
        final findPositionOffset pattern;

        ContainsPatternPredicate(findPositionOffset findpositionoffset) {
            this.pattern = (findPositionOffset) markViewHoldersUpdated.toString(findpositionoffset);
        }

        @Override // o.findViewHolder
        public boolean apply(CharSequence charSequence) {
            return this.pattern.matcher(charSequence).ah$a();
        }

        public int hashCode() {
            return recycleUpdateOp.valueOf(this.pattern.pattern(), Integer.valueOf(this.pattern.flags()));
        }

        @Override // o.findViewHolder
        public boolean equals(Object obj) {
            if (obj instanceof ContainsPatternPredicate) {
                ContainsPatternPredicate containsPatternPredicate = (ContainsPatternPredicate) obj;
                if (recycleUpdateOp.values(this.pattern.pattern(), containsPatternPredicate.pattern.pattern()) && this.pattern.flags() == containsPatternPredicate.pattern.flags()) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            String tostring = hasUpdates.valueOf(this.pattern).toString("pattern", this.pattern.pattern()).ag$a("pattern.flags", this.pattern.flags()).toString();
            StringBuilder sb = new StringBuilder(String.valueOf(tostring).length() + 21);
            sb.append("Predicates.contains(");
            sb.append(tostring);
            sb.append(")");
            return sb.toString();
        }
    }

    /* loaded from: classes7.dex */
    static class ContainsPatternFromStringPredicate extends ContainsPatternPredicate {
        private static final long serialVersionUID = 0;

        ContainsPatternFromStringPredicate(String str) {
            super(preProcess.toString(str));
        }

        @Override // com.google.common.base.Predicates.ContainsPatternPredicate
        public String toString() {
            String pattern = this.pattern.pattern();
            StringBuilder sb = new StringBuilder(String.valueOf(pattern).length() + 28);
            sb.append("Predicates.containsPattern(");
            sb.append(pattern);
            sb.append(")");
            return sb.toString();
        }
    }

    private static <T> List<findViewHolder<? super T>> values(findViewHolder<? super T> findviewholder, findViewHolder<? super T> findviewholder2) {
        return Arrays.asList(findviewholder, findviewholder2);
    }
}
