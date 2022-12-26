package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import o.hasPendingUpdates;
import o.markViewHoldersUpdated;
import o.offsetPositionsForRemovingLaidOutOrNewView;
/* loaded from: classes.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public abstract Set<T> asSet();

    public abstract boolean equals(Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract Optional<T> or(Optional<? extends T> optional);

    public abstract T or(T t);

    public abstract T or(offsetPositionsForRemovingLaidOutOrNewView<? extends T> offsetpositionsforremovinglaidoutornewview);

    public abstract T orNull();

    public abstract String toString();

    public abstract <V> Optional<V> transform(hasPendingUpdates<? super T, V> haspendingupdates);

    public static <T> Optional<T> absent() {
        return Absent.withType();
    }

    public static <T> Optional<T> of(T t) {
        return new Present(markViewHoldersUpdated.toString(t));
    }

    public static <T> Optional<T> fromNullable(T t) {
        return t == null ? absent() : new Present(t);
    }

    public static <T> Iterable<T> presentInstances(final Iterable<? extends Optional<? extends T>> iterable) {
        markViewHoldersUpdated.toString(iterable);
        return new Iterable<T>() { // from class: com.google.common.base.Optional.5
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return new AbstractIterator<T>() { // from class: com.google.common.base.Optional.5.1
                    private final Iterator<? extends Optional<? extends T>> ah$a;

                    {
                        this.ah$a = (Iterator) markViewHoldersUpdated.toString(iterable.iterator());
                    }

                    @Override // com.google.common.base.AbstractIterator
                    protected T values() {
                        while (this.ah$a.hasNext()) {
                            Optional<? extends T> next = this.ah$a.next();
                            if (next.isPresent()) {
                                return next.get();
                            }
                        }
                        return ah$a();
                    }
                };
            }
        };
    }
}
