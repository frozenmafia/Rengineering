package kotlin.jvm.internal;

import o.TransitionSet;
import o.TransitionValues;
import o.ViewGroupOverlayImpl;
import o.setPropagation;
/* loaded from: classes5.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements TransitionValues {
    public MutablePropertyReference1() {
    }

    public MutablePropertyReference1(Object obj) {
        super(obj);
    }

    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected TransitionSet.TransitionSetListener computeReflected() {
        return setPropagation.toString(this);
    }

    @Override // o.Styleable.ChangeBounds
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // o.ViewGroupOverlayImpl
    public ViewGroupOverlayImpl.valueOf getGetter() {
        return ((TransitionValues) getReflected()).getGetter();
    }

    @Override // o.TransitionValues
    public TransitionValues.valueOf getSetter() {
        return ((TransitionValues) getReflected()).getSetter();
    }

    @Override // o.ViewGroupOverlayImpl
    public Object getDelegate(Object obj) {
        return ((TransitionValues) getReflected()).getDelegate(obj);
    }
}
