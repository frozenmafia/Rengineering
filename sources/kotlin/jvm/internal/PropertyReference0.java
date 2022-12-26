package kotlin.jvm.internal;

import o.TransitionSet;
import o.createFrom;
import o.setPropagation;
/* loaded from: classes5.dex */
public abstract class PropertyReference0 extends PropertyReference implements createFrom {
    public PropertyReference0() {
    }

    public PropertyReference0(Object obj) {
        super(obj);
    }

    public PropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected TransitionSet.TransitionSetListener computeReflected() {
        return setPropagation.values(this);
    }

    @Override // o.Styleable.ArcMotion
    public Object invoke() {
        return get();
    }

    @Override // o.createFrom
    public createFrom.valueOf getGetter() {
        return ((createFrom) getReflected()).getGetter();
    }

    @Override // o.createFrom
    public Object getDelegate() {
        return ((createFrom) getReflected()).getDelegate();
    }
}
