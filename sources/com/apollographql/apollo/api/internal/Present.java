package com.apollographql.apollo.api.internal;

import java.util.Collections;
import java.util.Set;
import o.ImmLeaksCleaner;
import o.OnBackPressedDispatcherKt;
import o.handleOnBackPressed;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Present<T> extends Optional<T> {
    private static final long serialVersionUID = 0;
    private final T reference;

    @Override // com.apollographql.apollo.api.internal.Optional
    public boolean isPresent() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Present(T t) {
        this.reference = t;
    }

    @Override // com.apollographql.apollo.api.internal.Optional
    public T get() {
        return this.reference;
    }

    @Override // com.apollographql.apollo.api.internal.Optional
    public T or(T t) {
        OnBackPressedDispatcherKt.values(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.reference;
    }

    @Override // com.apollographql.apollo.api.internal.Optional
    public Optional<T> or(Optional<? extends T> optional) {
        OnBackPressedDispatcherKt.ag$a(optional);
        return this;
    }

    @Override // com.apollographql.apollo.api.internal.Optional
    public <V> Optional<V> transform(handleOnBackPressed<? super T, V> handleonbackpressed) {
        return new Present(OnBackPressedDispatcherKt.values(handleonbackpressed.apply((T) this.reference), "the Function passed to Optional.transform() must not return null."));
    }

    @Override // com.apollographql.apollo.api.internal.Optional
    public <V> Optional<V> map(handleOnBackPressed<? super T, V> handleonbackpressed) {
        return new Present(OnBackPressedDispatcherKt.values(handleonbackpressed.apply((T) this.reference), "the Function passed to Optional.map() must not return null."));
    }

    @Override // com.apollographql.apollo.api.internal.Optional
    public <V> Optional<V> flatMap(handleOnBackPressed<? super T, Optional<V>> handleonbackpressed) {
        OnBackPressedDispatcherKt.ag$a(handleonbackpressed);
        return (Optional) OnBackPressedDispatcherKt.values(handleonbackpressed.apply((T) this.reference), "the Function passed to Optional.flatMap() must not return null.");
    }

    @Override // com.apollographql.apollo.api.internal.Optional
    public Optional<T> apply(final ImmLeaksCleaner<T> immLeaksCleaner) {
        OnBackPressedDispatcherKt.ag$a(immLeaksCleaner);
        return (Optional<T>) map((handleOnBackPressed<T, T>) new handleOnBackPressed<T, T>() { // from class: com.apollographql.apollo.api.internal.Present.4
            @Override // o.handleOnBackPressed
            public T apply(T t) {
                immLeaksCleaner.toString(t);
                return t;
            }
        });
    }

    @Override // com.apollographql.apollo.api.internal.Optional
    public T orNull() {
        return this.reference;
    }

    @Override // com.apollographql.apollo.api.internal.Optional
    public Set<T> asSet() {
        return Collections.singleton(this.reference);
    }

    @Override // com.apollographql.apollo.api.internal.Optional
    public boolean equals(Object obj) {
        if (obj instanceof Present) {
            return this.reference.equals(((Present) obj).reference);
        }
        return false;
    }

    @Override // com.apollographql.apollo.api.internal.Optional
    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    @Override // com.apollographql.apollo.api.internal.Optional
    public String toString() {
        return "Optional.of(" + this.reference + ")";
    }
}
