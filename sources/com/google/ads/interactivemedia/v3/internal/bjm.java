package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
/* loaded from: classes4.dex */
public final class bjm {
    static final Type[] a = new Type[0];

    public static Class a(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            bic.f(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(a(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return a(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    public static String b(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static GenericArrayType c(Type type) {
        return new bjj(type);
    }

    public static Type d(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new bjj(d(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new bjk(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new bjj(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return new bjl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
            }
            return type;
        }
    }

    public static Type e(Type type, Class cls) {
        Type k = k(type, cls, Collection.class);
        return k instanceof ParameterizedType ? ((ParameterizedType) k).getActualTypeArguments()[0] : Object.class;
    }

    public static Type f(Type type, Class cls, Type type2) {
        return l(type, cls, type2, new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(Type type) {
        bic.f(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static boolean h(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                return m(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return h(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        } else if (type instanceof WildcardType) {
            if (type2 instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                WildcardType wildcardType2 = (WildcardType) type2;
                return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
            }
            return false;
        } else if ((type instanceof TypeVariable) && (type2 instanceof TypeVariable)) {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        } else {
            return false;
        }
    }

    public static Type[] i(Type type, Class cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type k = k(type, cls, Map.class);
        return k instanceof ParameterizedType ? ((ParameterizedType) k).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    private static Type j(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 != cls2) {
                    if (cls2.isAssignableFrom(cls3)) {
                        return j(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                    }
                } else {
                    return cls.getGenericInterfaces()[i];
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass != cls2) {
                    if (cls2.isAssignableFrom(superclass)) {
                        return j(cls.getGenericSuperclass(), superclass, cls2);
                    }
                    cls = superclass;
                } else {
                    return cls.getGenericSuperclass();
                }
            }
        }
        return cls2;
    }

    private static Type k(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        bic.f(cls2.isAssignableFrom(cls));
        return f(type, cls, j(type, cls, cls2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x013f, code lost:
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0141, code lost:
        r12.put(r1, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0144, code lost:
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013f A[EDGE_INSN: B:91:0x013f->B:84:0x013f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.reflect.Type, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.google.ads.interactivemedia.v3.internal.bjl] */
    /* JADX WARN: Type inference failed for: r11v5, types: [com.google.ads.interactivemedia.v3.internal.bjl] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v7, types: [com.google.ads.interactivemedia.v3.internal.bjk] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.reflect.Type l(java.lang.reflect.Type r9, java.lang.Class r10, java.lang.reflect.Type r11, java.util.Map r12) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bjm.l(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Map):java.lang.reflect.Type");
    }

    private static boolean m(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
