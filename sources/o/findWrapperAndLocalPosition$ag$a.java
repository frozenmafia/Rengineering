package o;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
/* loaded from: classes7.dex */
public final class findWrapperAndLocalPosition$ag$a {
    private final TypeVariable<?> toString;

    public findWrapperAndLocalPosition$ag$a(TypeVariable<?> typeVariable) {
        this.toString = (TypeVariable) markViewHoldersUpdated.toString(typeVariable);
    }

    public int hashCode() {
        return recycleUpdateOp.valueOf(this.toString.getGenericDeclaration(), this.toString.getName());
    }

    public boolean equals(Object obj) {
        if (obj instanceof findWrapperAndLocalPosition$ag$a) {
            return valueOf(((findWrapperAndLocalPosition$ag$a) obj).toString);
        }
        return false;
    }

    public String toString() {
        return this.toString.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static findWrapperAndLocalPosition$ag$a ah$a(Type type) {
        if (type instanceof TypeVariable) {
            return new findWrapperAndLocalPosition$ag$a((TypeVariable) type);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean ag$a(Type type) {
        if (type instanceof TypeVariable) {
            return valueOf((TypeVariable) type);
        }
        return false;
    }

    private boolean valueOf(TypeVariable<?> typeVariable) {
        return this.toString.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.toString.getName().equals(typeVariable.getName());
    }
}
