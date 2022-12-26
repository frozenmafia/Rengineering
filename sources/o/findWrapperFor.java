package o;

import com.google.common.collect.Sets;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Set;
/* loaded from: classes7.dex */
public abstract class findWrapperFor {
    private final Set<Type> valueOf = Sets.valueOf();

    protected void ah$a(Class<?> cls) {
    }

    protected void ah$a(GenericArrayType genericArrayType) {
    }

    protected void ah$a(TypeVariable<?> typeVariable) {
    }

    protected void ah$a(WildcardType wildcardType) {
    }

    protected void valueOf(ParameterizedType parameterizedType) {
    }

    public final void valueOf(Type... typeArr) {
        for (Type type : typeArr) {
            if (type != null && this.valueOf.add(type)) {
                try {
                    if (type instanceof TypeVariable) {
                        ah$a((TypeVariable) type);
                    } else if (type instanceof WildcardType) {
                        ah$a((WildcardType) type);
                    } else if (type instanceof ParameterizedType) {
                        valueOf((ParameterizedType) type);
                    } else if (type instanceof Class) {
                        ah$a((Class) type);
                    } else if (type instanceof GenericArrayType) {
                        ah$a((GenericArrayType) type);
                    } else {
                        String valueOf = String.valueOf(type);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
                        sb.append("Unknown type: ");
                        sb.append(valueOf);
                        throw new AssertionError(sb.toString());
                    }
                } catch (Throwable th) {
                    this.valueOf.remove(type);
                    throw th;
                }
            }
        }
    }
}
