package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.EmptyCoroutineContext;
import o.PropertyValuesHolderUtils;
import o.setPatternPath;
/* loaded from: classes5.dex */
public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
    public RestrictedContinuationImpl(setPatternPath<Object> setpatternpath) {
        super(setpatternpath);
        if (setpatternpath != null) {
            if (!(setpatternpath.getContext() == EmptyCoroutineContext.INSTANCE)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // o.setPatternPath
    public PropertyValuesHolderUtils getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }
}
