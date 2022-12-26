package com.google.common.base;

import java.util.Collections;
import java.util.Set;
import o.hasPendingUpdates;
import o.markViewHoldersUpdated;
import o.offsetPositionsForRemovingLaidOutOrNewView;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class Present<T> extends Optional<T> {
    private static final long serialVersionUID = 0;
    private final T reference;

    @Override // com.google.common.base.Optional
    public boolean isPresent() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Present(T t) {
        this.reference = t;
    }

    @Override // com.google.common.base.Optional
    public T get() {
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public T or(T t) {
        markViewHoldersUpdated.valueOf(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public Optional<T> or(Optional<? extends T> optional) {
        markViewHoldersUpdated.toString(optional);
        return this;
    }

    @Override // com.google.common.base.Optional
    public T or(offsetPositionsForRemovingLaidOutOrNewView<? extends T> offsetpositionsforremovinglaidoutornewview) {
        markViewHoldersUpdated.toString(offsetpositionsforremovinglaidoutornewview);
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public T orNull() {
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public Set<T> asSet() {
        return Collections.singleton(this.reference);
    }

    @Override // com.google.common.base.Optional
    public <V> Optional<V> transform(hasPendingUpdates<? super T, V> haspendingupdates) {
        return new Present(markViewHoldersUpdated.valueOf(haspendingupdates.apply((T) this.reference), "the Function passed to Optional.transform() must not return null."));
    }

    @Override // com.google.common.base.Optional
    public boolean equals(Object obj) {
        if (obj instanceof Present) {
            return this.reference.equals(((Present) obj).reference);
        }
        return false;
    }

    @Override // com.google.common.base.Optional
    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    @Override // com.google.common.base.Optional
    public String toString() {
        String valueOf = String.valueOf(this.reference);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
