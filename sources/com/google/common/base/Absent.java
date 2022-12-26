package com.google.common.base;

import java.util.Collections;
import java.util.Set;
import o.hasPendingUpdates;
import o.markViewHoldersUpdated;
import o.offsetPositionsForRemovingLaidOutOrNewView;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class Absent<T> extends Optional<T> {
    static final Absent<Object> INSTANCE = new Absent<>();
    private static final long serialVersionUID = 0;

    @Override // com.google.common.base.Optional
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.google.common.base.Optional
    public int hashCode() {
        return 2040732332;
    }

    @Override // com.google.common.base.Optional
    public boolean isPresent() {
        return false;
    }

    @Override // com.google.common.base.Optional
    public T orNull() {
        return null;
    }

    @Override // com.google.common.base.Optional
    public String toString() {
        return "Optional.absent()";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> Optional<T> withType() {
        return INSTANCE;
    }

    private Absent() {
    }

    @Override // com.google.common.base.Optional
    public T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.common.base.Optional
    public T or(T t) {
        return (T) markViewHoldersUpdated.valueOf(t, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // com.google.common.base.Optional
    public Optional<T> or(Optional<? extends T> optional) {
        return (Optional) markViewHoldersUpdated.toString(optional);
    }

    @Override // com.google.common.base.Optional
    public T or(offsetPositionsForRemovingLaidOutOrNewView<? extends T> offsetpositionsforremovinglaidoutornewview) {
        return (T) markViewHoldersUpdated.valueOf(offsetpositionsforremovinglaidoutornewview.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    @Override // com.google.common.base.Optional
    public Set<T> asSet() {
        return Collections.emptySet();
    }

    @Override // com.google.common.base.Optional
    public <V> Optional<V> transform(hasPendingUpdates<? super T, V> haspendingupdates) {
        markViewHoldersUpdated.toString(haspendingupdates);
        return Optional.absent();
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
