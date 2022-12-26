package kotlin;

import java.io.Serializable;
import o.ChangeTransform;
import o.Styleable;
import o.getTargetTypes;
import o.runAnimators;
import o.setIdentityTransforms;
/* loaded from: classes5.dex */
public final class SynchronizedLazyImpl<T> implements setIdentityTransforms<T>, Serializable {
    private volatile Object _value;
    private Styleable.ArcMotion<? extends T> initializer;
    private final Object lock;

    public SynchronizedLazyImpl(Styleable.ArcMotion<? extends T> arcMotion, Object obj) {
        runAnimators.ag$a(arcMotion, "initializer");
        this.initializer = arcMotion;
        this._value = ChangeTransform.AnonymousClass2.values;
        this.lock = obj == null ? this : obj;
    }

    public /* synthetic */ SynchronizedLazyImpl(Styleable.ArcMotion arcMotion, Object obj, int i, getTargetTypes gettargettypes) {
        this(arcMotion, (i & 2) != 0 ? null : obj);
    }

    @Override // o.setIdentityTransforms
    public T getValue() {
        T t;
        T t2 = (T) this._value;
        if (t2 != ChangeTransform.AnonymousClass2.values) {
            return t2;
        }
        synchronized (this.lock) {
            t = (T) this._value;
            if (t == ChangeTransform.AnonymousClass2.values) {
                Styleable.ArcMotion<? extends T> arcMotion = this.initializer;
                runAnimators.toString(arcMotion);
                t = arcMotion.invoke();
                this._value = t;
                this.initializer = null;
            }
        }
        return t;
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
