package kotlin.jvm.internal;

import o.TransitionValuesMaps;
import o.copyViewImage;
import o.getMatchedTransitionValues;
/* loaded from: classes5.dex */
public class PropertyReference0Impl extends PropertyReference0 {
    public PropertyReference0Impl(TransitionValuesMaps transitionValuesMaps, String str, String str2) {
        super(NO_RECEIVER, ((getMatchedTransitionValues) transitionValuesMaps).valueOf(), str, str2, !(transitionValuesMaps instanceof copyViewImage) ? 1 : 0);
    }

    public PropertyReference0Impl(Class cls, String str, String str2, int i) {
        super(NO_RECEIVER, cls, str, str2, i);
    }

    public PropertyReference0Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // o.createFrom
    public Object get() {
        return getGetter().call(new Object[0]);
    }
}
