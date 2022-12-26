package kotlin.jvm.internal;

import o.TransitionSet;
import o.ViewGroupOverlayImpl;
import o.setPropagation;
/* loaded from: classes5.dex */
public abstract class PropertyReference1 extends PropertyReference implements ViewGroupOverlayImpl {
    public PropertyReference1() {
    }

    public PropertyReference1(Object obj) {
        super(obj);
    }

    public PropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected TransitionSet.TransitionSetListener computeReflected() {
        return setPropagation.values(this);
    }

    @Override // o.Styleable.ChangeBounds
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // o.ViewGroupOverlayImpl
    public ViewGroupOverlayImpl.valueOf getGetter() {
        return ((ViewGroupOverlayImpl) getReflected()).getGetter();
    }

    @Override // o.ViewGroupOverlayImpl
    public Object getDelegate(Object obj) {
        return ((ViewGroupOverlayImpl) getReflected()).getDelegate(obj);
    }
}
