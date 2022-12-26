package kotlin.jvm.internal;

import o.TransitionSet;
import o.TranslationAnimationCreator;
import o.runAnimators;
/* loaded from: classes5.dex */
public abstract class PropertyReference extends CallableReference implements TranslationAnimationCreator.TransitionPositionListener {
    public PropertyReference() {
    }

    public PropertyReference(Object obj) {
        super(obj);
    }

    public PropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.CallableReference
    public TranslationAnimationCreator.TransitionPositionListener getReflected() {
        return (TranslationAnimationCreator.TransitionPositionListener) super.getReflected();
    }

    @Override // o.TranslationAnimationCreator.TransitionPositionListener
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    @Override // o.TranslationAnimationCreator.TransitionPositionListener
    public boolean isConst() {
        return getReflected().isConst();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            return getOwner().equals(propertyReference.getOwner()) && getName().equals(propertyReference.getName()) && getSignature().equals(propertyReference.getSignature()) && runAnimators.values(getBoundReceiver(), propertyReference.getBoundReceiver());
        } else if (obj instanceof TranslationAnimationCreator.TransitionPositionListener) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        TransitionSet.TransitionSetListener compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
