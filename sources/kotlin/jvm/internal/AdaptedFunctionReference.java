package kotlin.jvm.internal;

import java.io.Serializable;
import o.TransitionValuesMaps;
import o.getTargetNames;
import o.runAnimators;
import o.setPropagation;
/* loaded from: classes7.dex */
public class AdaptedFunctionReference implements getTargetNames, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public AdaptedFunctionReference(int i, Class cls, String str, String str2, int i2) {
        this(i, CallableReference.NO_RECEIVER, cls, str, str2, i2);
    }

    public AdaptedFunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i2 & 1) == 1;
        this.arity = i;
        this.flags = i2 >> 1;
    }

    @Override // o.getTargetNames
    public int getArity() {
        return this.arity;
    }

    public TransitionValuesMaps getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? setPropagation.toString(cls) : setPropagation.values(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdaptedFunctionReference) {
            AdaptedFunctionReference adaptedFunctionReference = (AdaptedFunctionReference) obj;
            return this.isTopLevel == adaptedFunctionReference.isTopLevel && this.arity == adaptedFunctionReference.arity && this.flags == adaptedFunctionReference.flags && runAnimators.values(this.receiver, adaptedFunctionReference.receiver) && runAnimators.values(this.owner, adaptedFunctionReference.owner) && this.name.equals(adaptedFunctionReference.name) && this.signature.equals(adaptedFunctionReference.signature);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.receiver;
        int hashCode = obj != null ? obj.hashCode() : 0;
        Class cls = this.owner;
        int hashCode2 = cls != null ? cls.hashCode() : 0;
        int hashCode3 = this.name.hashCode();
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + this.signature.hashCode()) * 31) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return setPropagation.valueOf(this);
    }
}
