package kotlin.jvm.internal;

import o.TransitionValuesMaps;
import o.copyViewImage;
import o.getMatchedTransitionValues;
/* loaded from: classes7.dex */
public class MutablePropertyReference2Impl extends MutablePropertyReference2 {
    public MutablePropertyReference2Impl(TransitionValuesMaps transitionValuesMaps, String str, String str2) {
        super(((getMatchedTransitionValues) transitionValuesMaps).valueOf(), str, str2, !(transitionValuesMaps instanceof copyViewImage) ? 1 : 0);
    }

    public MutablePropertyReference2Impl(Class cls, String str, String str2, int i) {
        super(cls, str, str2, i);
    }

    @Override // o.ViewGroupOverlayApi18
    public Object get(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }

    public void set(Object obj, Object obj2, Object obj3) {
        getSetter().call(obj, obj2, obj3);
    }
}
