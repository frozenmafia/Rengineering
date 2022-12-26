package com.apollographql.apollo.api.internal;

import java.io.Serializable;
import java.util.Set;
import o.ImmLeaksCleaner;
import o.OnBackPressedDispatcherKt;
import o.handleOnBackPressed;
/* loaded from: classes.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public abstract Optional<T> apply(ImmLeaksCleaner<T> immLeaksCleaner);

    public abstract Set<T> asSet();

    public abstract boolean equals(Object obj);

    public abstract <V> Optional<V> flatMap(handleOnBackPressed<? super T, Optional<V>> handleonbackpressed);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract <V> Optional<V> map(handleOnBackPressed<? super T, V> handleonbackpressed);

    public abstract Optional<T> or(Optional<? extends T> optional);

    public abstract T or(T t);

    public abstract T orNull();

    public abstract String toString();

    public abstract <V> Optional<V> transform(handleOnBackPressed<? super T, V> handleonbackpressed);

    public static <T> Optional<T> absent() {
        return Absent.withType();
    }

    public static <T> Optional<T> of(T t) {
        return new Present(OnBackPressedDispatcherKt.ag$a(t));
    }

    public static <T> Optional<T> fromNullable(T t) {
        return t == null ? absent() : new Present(t);
    }
}
