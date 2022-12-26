package o;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import okhttp3.ResponseBody;
/* loaded from: classes5.dex */
public final class SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0 {
    static final Type[] toString = new Type[0];

    public static RuntimeException toString(Method method, Throwable th, String str, Object... objArr) {
        String format = String.format(str, objArr);
        return new IllegalArgumentException(format + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), th);
    }

    public static RuntimeException toString(Method method, Throwable th, int i, String str, Object... objArr) {
        return toString(method, th, str + " (parameter #" + (i + 1) + ")", objArr);
    }

    public static RuntimeException valueOf(Method method, int i, String str, Object... objArr) {
        return toString(method, null, str + " (parameter #" + (i + 1) + ")", objArr);
    }

    public static Class<?> toString(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (!(rawType instanceof Class)) {
                throw new IllegalArgumentException();
            }
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(toString(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return toString(((WildcardType) type).getUpperBounds()[0]);
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
        }
    }

    public static boolean ag$a(Type type, Type type2) {
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
                Type ownerType = parameterizedType.getOwnerType();
                Type ownerType2 = parameterizedType2.getOwnerType();
                return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return ag$a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    static Type ag$a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return ag$a(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return ag$a(cls.getGenericSuperclass(), (Class<?>) superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    private static int values(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    public static String values(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Type toString(Type type, Class<?> cls, Class<?> cls2) {
        if (!cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException();
        }
        return ag$a(type, cls, ag$a(type, cls, cls2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
        r10 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.reflect.Type ag$a(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
        L0:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto Lf
            java.lang.reflect.TypeVariable r10 = (java.lang.reflect.TypeVariable) r10
            java.lang.reflect.Type r0 = ag$a(r8, r9, r10)
            if (r0 != r10) goto Ld
            return r0
        Ld:
            r10 = r0
            goto L0
        Lf:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L2d
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L2d
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = ag$a(r8, r9, r10)
            if (r10 != r8) goto L27
            goto L2c
        L27:
            o.SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0$ah$a r0 = new o.SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0$ah$a
            r0.<init>(r8)
        L2c:
            return r0
        L2d:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L44
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = ag$a(r8, r9, r0)
            if (r0 != r8) goto L3e
            goto L43
        L3e:
            o.SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0$ah$a r10 = new o.SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0$ah$a
            r10.<init>(r8)
        L43:
            return r10
        L44:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L86
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = ag$a(r8, r9, r0)
            if (r3 == r0) goto L58
            r0 = 1
            goto L59
        L58:
            r0 = 0
        L59:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L5e:
            if (r2 >= r5) goto L79
            r6 = r4[r2]
            java.lang.reflect.Type r6 = ag$a(r8, r9, r6)
            r7 = r4[r2]
            if (r6 == r7) goto L76
            if (r0 != 0) goto L74
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L74:
            r4[r2] = r6
        L76:
            int r2 = r2 + 1
            goto L5e
        L79:
            if (r0 == 0) goto L85
            o.SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0$valueOf r8 = new o.SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0$valueOf
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        L85:
            return r10
        L86:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto Lcc
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto Lb1
            r3 = r0[r2]
            java.lang.reflect.Type r8 = ag$a(r8, r9, r3)
            r9 = r0[r2]
            if (r8 == r9) goto Lcc
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r1]
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            r9[r2] = r10
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r1]
            r10[r2] = r8
            o.SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0$ag$a r8 = new o.SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0$ag$a
            r8.<init>(r9, r10)
            return r8
        Lb1:
            int r0 = r3.length
            if (r0 != r1) goto Lcc
            r0 = r3[r2]
            java.lang.reflect.Type r8 = ag$a(r8, r9, r0)     // Catch: java.lang.Throwable -> Lca
            r9 = r3[r2]
            if (r8 == r9) goto Lcc
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r1]
            r9[r2] = r8
            o.SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0$ag$a r8 = new o.SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0$ag$a
            java.lang.reflect.Type[] r10 = o.SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0.toString
            r8.<init>(r9, r10)
            return r8
        Lca:
            r8 = move-exception
            throw r8
        Lcc:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0.ag$a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    private static Type ag$a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> ag$a = ag$a(typeVariable);
        if (ag$a == null) {
            return typeVariable;
        }
        Type ag$a2 = ag$a(type, cls, ag$a);
        if (ag$a2 instanceof ParameterizedType) {
            return ((ParameterizedType) ag$a2).getActualTypeArguments()[values(ag$a.getTypeParameters(), typeVariable)];
        }
        return typeVariable;
    }

    private static Class<?> ag$a(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    public static void ag$a(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean ag$a(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static ResponseBody ag$a(ResponseBody responseBody) throws IOException {
        getMinSmallestWidth getminsmallestwidth = new getMinSmallestWidth();
        responseBody.source().ag$a(getminsmallestwidth);
        return ResponseBody.create(responseBody.contentType(), responseBody.contentLength(), getminsmallestwidth);
    }

    public static Type ag$a(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < 0 || i >= actualTypeArguments.length) {
            throw new IllegalArgumentException("Index " + i + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
        }
        Type type = actualTypeArguments[i];
        return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
    }

    public static Type toString(int i, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i];
        return type instanceof WildcardType ? ((WildcardType) type).getLowerBounds()[0] : type;
    }

    public static boolean valueOf(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (valueOf(type2)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return valueOf(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
        }
    }

    /* loaded from: classes5.dex */
    public static final class valueOf implements ParameterizedType {
        private final Type toString;
        private final Type valueOf;
        private final Type[] values;

        public valueOf(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0.ag$a(type3);
            }
            this.toString = type;
            this.valueOf = type2;
            this.values = (Type[]) typeArr.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.values.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.valueOf;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.toString;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0.ag$a(this, (ParameterizedType) obj);
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.values);
            int hashCode2 = this.valueOf.hashCode();
            Type type = this.toString;
            return (hashCode ^ hashCode2) ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.values;
            if (typeArr.length == 0) {
                return SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0.values(this.valueOf);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0.values(this.valueOf));
            sb.append("<");
            sb.append(SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0.values(this.values[0]));
            for (int i = 1; i < this.values.length; i++) {
                sb.append(", ");
                sb.append(SidecarWindowBackend$WindowLayoutChangeCallbackWrapper$$ExternalSyntheticLambda0.values(this.values[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    public static void ah$a(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
