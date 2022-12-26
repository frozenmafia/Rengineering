package com.apollographql.apollo.api.internal;

import java.util.Collections;
import java.util.Set;
import o.ImmLeaksCleaner;
import o.OnBackPressedDispatcherKt;
import o.handleOnBackPressed;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Absent<T> extends Optional<T> {
    static final Absent<Object> INSTANCE = new Absent<>();
    private static final long serialVersionUID = 0;

    @Override // com.apollographql.apollo.api.internal.Optional
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.apollographql.apollo.api.internal.Optional
    public int hashCode() {
        return 2040732332;
    }

    @Override // com.apollographql.apollo.api.internal.Optional
    public boolean isPresent() {
        return false;
    }

    @Override // com.apollographql.apollo.api.internal.Optional
    public T orNull() {
        return null;
    }

    @Override // com.apollographql.apollo.api.internal.Optional
    public String toString() {
        return "Optional.absent()";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> Optional<T> withType() {
        return INSTANCE;
    }

    private Absent() {
    }

    @Override // com.apollographql.apollo.api.internal.Optional
    public T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.apollographql.apollo.api.internal.Optional
    public T or(T t) {
        return (T) OnBackPressedDispatcherKt.values(t, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // com.apollographql.apollo.api.internal.Optional
    public Optional<T> or(Optional<? extends T> optional) {
        return (Optional) OnBackPressedDispatcherKt.ag$a(optional);
    }

    @Override // com.apollographql.apollo.api.internal.Optional
    public <V> Optional<V> transform(handleOnBackPressed<? super T, V> handleonbackpressed) {
        OnBackPressedDispatcherKt.ag$a(handleonbackpressed);
        return Optional.absent();
    }

    @Override // com.apollographql.apollo.api.internal.Optional
    public <V> Optional<V> map(handleOnBackPressed<? super T, V> handleonbackpressed) {
        OnBackPressedDispatcherKt.ag$a(handleonbackpressed);
        return Optional.absent();
    }

    @Override // com.apollographql.apollo.api.internal.Optional
    public <V> Optional<V> flatMap(handleOnBackPressed<? super T, Optional<V>> handleonbackpressed) {
        OnBackPressedDispatcherKt.ag$a(handleonbackpressed);
        return Optional.absent();
    }

    @Override // com.apollographql.apollo.api.internal.Optional
    public Optional<T> apply(ImmLeaksCleaner<T> immLeaksCleaner) {
        OnBackPressedDispatcherKt.ag$a(immLeaksCleaner);
        return Optional.absent();
    }

    @Override // com.apollographql.apollo.api.internal.Optional
    public Set<T> asSet() {
        return Collections.emptySet();
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
