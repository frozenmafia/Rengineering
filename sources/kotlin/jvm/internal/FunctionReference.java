package kotlin.jvm.internal;

import o.TransitionSet;
import o.TranslationAnimationCreator;
import o.getTargetNames;
import o.runAnimators;
import o.setPropagation;
/* loaded from: classes5.dex */
public class FunctionReference extends CallableReference implements getTargetNames, TranslationAnimationCreator {
    private final int arity;
    private final int flags;

    public FunctionReference(int i) {
        this(i, NO_RECEIVER, null, null, null, 0);
    }

    public FunctionReference(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    public FunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }

    @Override // o.getTargetNames
    public int getArity() {
        return this.arity;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.CallableReference
    public TranslationAnimationCreator getReflected() {
        return (TranslationAnimationCreator) super.getReflected();
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected TransitionSet.TransitionSetListener computeReflected() {
        return setPropagation.values(this);
    }

    @Override // o.TranslationAnimationCreator
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // o.TranslationAnimationCreator
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // o.TranslationAnimationCreator
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // o.TranslationAnimationCreator
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.jvm.internal.CallableReference, o.TransitionSet.TransitionSetListener
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && this.flags == functionReference.flags && this.arity == functionReference.arity && runAnimators.values(getBoundReceiver(), functionReference.getBoundReceiver()) && runAnimators.values(getOwner(), functionReference.getOwner());
        } else if (obj instanceof TranslationAnimationCreator) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        TransitionSet.TransitionSetListener compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
