package kotlin.coroutines.jvm.internal;

import o.PropertyValuesHolderUtils;
import o.RectEvaluator;
import o.getPatternPath;
import o.runAnimators;
import o.setPatternPath;
/* loaded from: classes5.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final PropertyValuesHolderUtils _context;
    private transient setPatternPath<Object> intercepted;

    public ContinuationImpl(setPatternPath<Object> setpatternpath, PropertyValuesHolderUtils propertyValuesHolderUtils) {
        super(setpatternpath);
        this._context = propertyValuesHolderUtils;
    }

    public ContinuationImpl(setPatternPath<Object> setpatternpath) {
        this(setpatternpath, setpatternpath != null ? setpatternpath.getContext() : null);
    }

    @Override // o.setPatternPath
    public PropertyValuesHolderUtils getContext() {
        PropertyValuesHolderUtils propertyValuesHolderUtils = this._context;
        runAnimators.toString(propertyValuesHolderUtils);
        return propertyValuesHolderUtils;
    }

    public final setPatternPath<Object> intercepted() {
        ContinuationImpl continuationImpl = this.intercepted;
        if (continuationImpl == null) {
            getPatternPath getpatternpath = (getPatternPath) getContext().get(getPatternPath.ag$a);
            if (getpatternpath == null || (continuationImpl = getpatternpath.interceptContinuation(this)) == null) {
                continuationImpl = this;
            }
            this.intercepted = continuationImpl;
        }
        return continuationImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        setPatternPath<?> setpatternpath = this.intercepted;
        if (setpatternpath != null && setpatternpath != this) {
            PropertyValuesHolderUtils.toString tostring = getContext().get(getPatternPath.ag$a);
            runAnimators.toString(tostring);
            ((getPatternPath) tostring).releaseInterceptedContinuation(setpatternpath);
        }
        this.intercepted = RectEvaluator.ah$a;
    }
}
