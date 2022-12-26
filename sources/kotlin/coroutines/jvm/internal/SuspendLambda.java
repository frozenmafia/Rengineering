package kotlin.coroutines.jvm.internal;

import o.getTargetNames;
import o.runAnimators;
import o.setPatternPath;
import o.setPropagation;
/* loaded from: classes5.dex */
public abstract class SuspendLambda extends ContinuationImpl implements getTargetNames<Object> {
    private final int arity;

    @Override // o.getTargetNames
    public int getArity() {
        return this.arity;
    }

    public SuspendLambda(int i, setPatternPath<Object> setpatternpath) {
        super(setpatternpath);
        this.arity = i;
    }

    public SuspendLambda(int i) {
        this(i, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public String toString() {
        if (getCompletion() == null) {
            String valueOf = setPropagation.valueOf(this);
            runAnimators.ah$a(valueOf, "renderLambdaToString(this)");
            return valueOf;
        }
        return super.toString();
    }
}
