package kotlin.jvm.internal;

import o.TransitionValuesMaps;
import o.copyViewImage;
import o.getMatchedTransitionValues;
/* loaded from: classes5.dex */
public class MutablePropertyReference1Impl extends MutablePropertyReference1 {
    public MutablePropertyReference1Impl(TransitionValuesMaps transitionValuesMaps, String str, String str2) {
        super(NO_RECEIVER, ((getMatchedTransitionValues) transitionValuesMaps).valueOf(), str, str2, !(transitionValuesMaps instanceof copyViewImage) ? 1 : 0);
    }

    public MutablePropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(NO_RECEIVER, cls, str, str2, i);
    }

    public MutablePropertyReference1Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // o.ViewGroupOverlayImpl
    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public void set(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }
}
