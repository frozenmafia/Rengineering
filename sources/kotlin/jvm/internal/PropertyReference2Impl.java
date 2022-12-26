package kotlin.jvm.internal;

import o.TransitionValuesMaps;
import o.copyViewImage;
import o.getMatchedTransitionValues;
/* loaded from: classes7.dex */
public class PropertyReference2Impl extends PropertyReference2 {
    public PropertyReference2Impl(TransitionValuesMaps transitionValuesMaps, String str, String str2) {
        super(((getMatchedTransitionValues) transitionValuesMaps).valueOf(), str, str2, !(transitionValuesMaps instanceof copyViewImage) ? 1 : 0);
    }

    public PropertyReference2Impl(Class cls, String str, String str2, int i) {
        super(cls, str, str2, i);
    }

    @Override // o.ViewGroupOverlayApi18
    public Object get(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }
}
