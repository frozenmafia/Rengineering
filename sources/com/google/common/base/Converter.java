package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;
import o.hasPendingUpdates;
import o.markViewHoldersUpdated;
import o.recycleUpdateOpsAndClearList;
/* loaded from: classes7.dex */
public abstract class Converter<A, B> implements hasPendingUpdates<A, B> {
    private final boolean handleNullAutomatically;
    private transient Converter<B, A> reverse;

    protected abstract A doBackward(B b2);

    protected abstract B doForward(A a);

    public Converter() {
        this(true);
    }

    Converter(boolean z) {
        this.handleNullAutomatically = z;
    }

    public final B convert(A a) {
        return correctedDoForward(a);
    }

    B correctedDoForward(A a) {
        if (this.handleNullAutomatically) {
            if (a == null) {
                return null;
            }
            return (B) markViewHoldersUpdated.toString(doForward(a));
        }
        return unsafeDoForward(a);
    }

    A correctedDoBackward(B b2) {
        if (this.handleNullAutomatically) {
            if (b2 == null) {
                return null;
            }
            return (A) markViewHoldersUpdated.toString(doBackward(b2));
        }
        return unsafeDoBackward(b2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private B unsafeDoForward(A a) {
        return (B) doForward(recycleUpdateOpsAndClearList.toString(a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private A unsafeDoBackward(B b2) {
        return (A) doBackward(recycleUpdateOpsAndClearList.toString(b2));
    }

    public Iterable<B> convertAll(final Iterable<? extends A> iterable) {
        markViewHoldersUpdated.valueOf(iterable, "fromIterable");
        return new Iterable<B>() { // from class: com.google.common.base.Converter.3
            @Override // java.lang.Iterable
            public Iterator<B> iterator() {
                return new Iterator<B>() { // from class: com.google.common.base.Converter.3.5
                    private final Iterator<? extends A> values;

                    {
                        this.values = iterable.iterator();
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.values.hasNext();
                    }

                    @Override // java.util.Iterator
                    public B next() {
                        return (B) Converter.this.convert(this.values.next());
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        this.values.remove();
                    }
                };
            }
        };
    }

    public Converter<B, A> reverse() {
        Converter<B, A> converter = this.reverse;
        if (converter == null) {
            ReverseConverter reverseConverter = new ReverseConverter(this);
            this.reverse = reverseConverter;
            return reverseConverter;
        }
        return converter;
    }

    /* loaded from: classes7.dex */
    static final class ReverseConverter<A, B> extends Converter<B, A> implements Serializable {
        private static final long serialVersionUID = 0;
        final Converter<A, B> original;

        ReverseConverter(Converter<A, B> converter) {
            this.original = converter;
        }

        @Override // com.google.common.base.Converter
        protected A doForward(B b2) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter
        protected B doBackward(A a) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter
        A correctedDoForward(B b2) {
            return this.original.correctedDoBackward(b2);
        }

        @Override // com.google.common.base.Converter
        B correctedDoBackward(A a) {
            return this.original.correctedDoForward(a);
        }

        @Override // com.google.common.base.Converter
        public Converter<A, B> reverse() {
            return this.original;
        }

        @Override // com.google.common.base.Converter, o.hasPendingUpdates
        public boolean equals(Object obj) {
            if (obj instanceof ReverseConverter) {
                return this.original.equals(((ReverseConverter) obj).original);
            }
            return false;
        }

        public int hashCode() {
            return ~this.original.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.original);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
            sb.append(valueOf);
            sb.append(".reverse()");
            return sb.toString();
        }
    }

    public final <C> Converter<A, C> andThen(Converter<B, C> converter) {
        return doAndThen(converter);
    }

    <C> Converter<A, C> doAndThen(Converter<B, C> converter) {
        return new ConverterComposition(this, (Converter) markViewHoldersUpdated.toString(converter));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class ConverterComposition<A, B, C> extends Converter<A, C> implements Serializable {
        private static final long serialVersionUID = 0;
        final Converter<A, B> first;
        final Converter<B, C> second;

        ConverterComposition(Converter<A, B> converter, Converter<B, C> converter2) {
            this.first = converter;
            this.second = converter2;
        }

        @Override // com.google.common.base.Converter
        protected C doForward(A a) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter
        protected A doBackward(C c) {
            throw new AssertionError();
        }

        @Override // com.google.common.base.Converter
        C correctedDoForward(A a) {
            return this.second.correctedDoForward(this.first.correctedDoForward(a));
        }

        @Override // com.google.common.base.Converter
        A correctedDoBackward(C c) {
            return this.first.correctedDoBackward(this.second.correctedDoBackward(c));
        }

        @Override // com.google.common.base.Converter, o.hasPendingUpdates
        public boolean equals(Object obj) {
            if (obj instanceof ConverterComposition) {
                ConverterComposition converterComposition = (ConverterComposition) obj;
                if (this.first.equals(converterComposition.first) && this.second.equals(converterComposition.second)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.first.hashCode() * 31) + this.second.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.first);
            String valueOf2 = String.valueOf(this.second);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10 + String.valueOf(valueOf2).length());
            sb.append(valueOf);
            sb.append(".andThen(");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    @Override // o.hasPendingUpdates
    @Deprecated
    public final B apply(A a) {
        return convert(a);
    }

    @Override // o.hasPendingUpdates
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static <A, B> Converter<A, B> from(hasPendingUpdates<? super A, ? extends B> haspendingupdates, hasPendingUpdates<? super B, ? extends A> haspendingupdates2) {
        return new FunctionBasedConverter(haspendingupdates, haspendingupdates2);
    }

    /* loaded from: classes7.dex */
    static final class FunctionBasedConverter<A, B> extends Converter<A, B> implements Serializable {
        private final hasPendingUpdates<? super B, ? extends A> backwardFunction;
        private final hasPendingUpdates<? super A, ? extends B> forwardFunction;

        private FunctionBasedConverter(hasPendingUpdates<? super A, ? extends B> haspendingupdates, hasPendingUpdates<? super B, ? extends A> haspendingupdates2) {
            this.forwardFunction = (hasPendingUpdates) markViewHoldersUpdated.toString(haspendingupdates);
            this.backwardFunction = (hasPendingUpdates) markViewHoldersUpdated.toString(haspendingupdates2);
        }

        @Override // com.google.common.base.Converter
        protected B doForward(A a) {
            return this.forwardFunction.apply(a);
        }

        @Override // com.google.common.base.Converter
        protected A doBackward(B b2) {
            return this.backwardFunction.apply(b2);
        }

        @Override // com.google.common.base.Converter, o.hasPendingUpdates
        public boolean equals(Object obj) {
            if (obj instanceof FunctionBasedConverter) {
                FunctionBasedConverter functionBasedConverter = (FunctionBasedConverter) obj;
                if (this.forwardFunction.equals(functionBasedConverter.forwardFunction) && this.backwardFunction.equals(functionBasedConverter.backwardFunction)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.forwardFunction.hashCode() * 31) + this.backwardFunction.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.forwardFunction);
            String valueOf2 = String.valueOf(this.backwardFunction);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18 + String.valueOf(valueOf2).length());
            sb.append("Converter.from(");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <T> Converter<T, T> identity() {
        return IdentityConverter.INSTANCE;
    }

    /* loaded from: classes7.dex */
    static final class IdentityConverter<T> extends Converter<T, T> implements Serializable {
        static final IdentityConverter<?> INSTANCE = new IdentityConverter<>();
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Converter
        protected T doBackward(T t) {
            return t;
        }

        @Override // com.google.common.base.Converter
        protected T doForward(T t) {
            return t;
        }

        @Override // com.google.common.base.Converter
        public IdentityConverter<T> reverse() {
            return this;
        }

        public String toString() {
            return "Converter.identity()";
        }

        private IdentityConverter() {
        }

        @Override // com.google.common.base.Converter
        <S> Converter<T, S> doAndThen(Converter<T, S> converter) {
            return (Converter) markViewHoldersUpdated.valueOf(converter, "otherConverter");
        }

        private Object readResolve() {
            return INSTANCE;
        }
    }
}
