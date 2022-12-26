package kotlin;

import java.io.Serializable;
import o.setIdentityTransforms;
/* loaded from: classes7.dex */
public final class InitializedLazyImpl<T> implements setIdentityTransforms<T>, Serializable {
    private final T value;

    public boolean isInitialized() {
        return true;
    }

    public InitializedLazyImpl(T t) {
        this.value = t;
    }

    @Override // o.setIdentityTransforms
    public T getValue() {
        return this.value;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
