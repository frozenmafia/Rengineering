package kotlin.jvm.internal;

import o.TransitionSet;
import o.ViewGroupOverlayApi18;
import o.setPropagation;
/* loaded from: classes7.dex */
public abstract class PropertyReference2 extends PropertyReference implements ViewGroupOverlayApi18 {
    public PropertyReference2() {
    }

    public PropertyReference2(Class cls, String str, String str2, int i) {
        super(NO_RECEIVER, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected TransitionSet.TransitionSetListener computeReflected() {
        ViewGroupOverlayApi18 values;
        values = setPropagation.valueOf.values(this);
        return values;
    }

    @Override // o.Transition
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    @Override // o.ViewGroupOverlayApi18
    public ViewGroupOverlayApi18.toString getGetter() {
        return ((ViewGroupOverlayApi18) getReflected()).getGetter();
    }

    @Override // o.ViewGroupOverlayApi18
    public Object getDelegate(Object obj, Object obj2) {
        return ((ViewGroupOverlayApi18) getReflected()).getDelegate(obj, obj2);
    }
}
