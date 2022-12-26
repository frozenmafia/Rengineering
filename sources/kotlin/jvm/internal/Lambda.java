package kotlin.jvm.internal;

import java.io.Serializable;
import o.getTargetNames;
import o.runAnimators;
import o.setPropagation;
/* loaded from: classes.dex */
public abstract class Lambda<R> implements getTargetNames<R>, Serializable {
    private final int arity;

    public Lambda(int i) {
        this.arity = i;
    }

    @Override // o.getTargetNames
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String setpropagation = setPropagation.toString(this);
        runAnimators.ah$a(setpropagation, "renderLambdaToString(this)");
        return setpropagation;
    }
}
