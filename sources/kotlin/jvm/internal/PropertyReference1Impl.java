package kotlin.jvm.internal;

import o.TransitionValuesMaps;
import o.copyViewImage;
import o.getMatchedTransitionValues;
/* loaded from: classes5.dex */
public class PropertyReference1Impl extends PropertyReference1 {
    public PropertyReference1Impl(TransitionValuesMaps transitionValuesMaps, String str, String str2) {
        super(NO_RECEIVER, ((getMatchedTransitionValues) transitionValuesMaps).valueOf(), str, str2, !(transitionValuesMaps instanceof copyViewImage) ? 1 : 0);
    }

    public PropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(NO_RECEIVER, cls, str, str2, i);
    }

    public PropertyReference1Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // o.ViewGroupOverlayImpl
    public Object get(Object obj) {
        return getGetter().call(obj);
    }
}
