package kotlin;

import java.io.Serializable;
import o.ChangeTransform;
import o.Styleable;
import o.runAnimators;
import o.setIdentityTransforms;
/* loaded from: classes5.dex */
public final class UnsafeLazyImpl<T> implements setIdentityTransforms<T>, Serializable {
    private Object _value;
    private Styleable.ArcMotion<? extends T> initializer;

    public UnsafeLazyImpl(Styleable.ArcMotion<? extends T> arcMotion) {
        runAnimators.ag$a(arcMotion, "initializer");
        this.initializer = arcMotion;
        this._value = ChangeTransform.AnonymousClass2.values;
    }

    @Override // o.setIdentityTransforms
    public T getValue() {
        if (this._value == ChangeTransform.AnonymousClass2.values) {
            Styleable.ArcMotion<? extends T> arcMotion = this.initializer;
            runAnimators.toString(arcMotion);
            this._value = arcMotion.invoke();
            this.initializer = null;
        }
        return (T) this._value;
    }

    public boolean isInitialized() {
        return this._value != ChangeTransform.AnonymousClass2.values;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }
}
