package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import o.ensureSize;
import okhttp3.HttpUrl;
/* renamed from: com.google.gson.internal.$Gson$Types  reason: invalid class name */
/* loaded from: classes5.dex */
public final class C$Gson$Types {
    static final Type[] ah$a = new Type[0];

    public static ParameterizedType ah$a(Type type, Type type2, Type... typeArr) {
        return new ParameterizedTypeImpl(type, type2, typeArr);
    }

    public static GenericArrayType valueOf(Type type) {
        return new GenericArrayTypeImpl(type);
    }

    public static WildcardType HaptikSDK$b(Type type) {
        return new WildcardTypeImpl(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, ah$a);
    }

    public static WildcardType ah$b(Type type) {
        return new WildcardTypeImpl(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl] */
    public static Type toString(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                cls = new GenericArrayTypeImpl(toString(cls.getComponentType()));
            }
            return cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new GenericArrayTypeImpl(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return new WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
            }
            return type;
        }
    }

    public static Class<?> ah$a(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            ensureSize.ag$a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(ah$a(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return ah$a(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    static boolean ah$a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
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
                return ah$a(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
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

    static int ah$a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static String HaptikSDK$a(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    static Type toString(Type type, Class<?> cls, Class<?> cls2) {
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
                    return toString(cls.getGenericInterfaces()[i], interfaces[i], cls2);
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
                    return toString(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    static Type ag$a(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        ensureSize.ag$a(cls2.isAssignableFrom(cls));
        return valueOf(type, cls, toString(type, cls, cls2));
    }

    public static Type ag$a(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    public static Type toString(Type type, Class<?> cls) {
        Type ag$a = ag$a(type, cls, Collection.class);
        if (ag$a instanceof WildcardType) {
            ag$a = ((WildcardType) ag$a).getUpperBounds()[0];
        }
        if (ag$a instanceof ParameterizedType) {
            return ((ParameterizedType) ag$a).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    public static Type[] valueOf(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type ag$a = ag$a(type, cls, Map.class);
        return ag$a instanceof ParameterizedType ? ((ParameterizedType) ag$a).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static Type valueOf(Type type, Class<?> cls, Type type2) {
        return values(type, cls, type2, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00df, code lost:
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e1, code lost:
        r12.put(r0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e4, code lost:
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.reflect.Type, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.reflect.Type values(java.lang.reflect.Type r9, java.lang.Class<?> r10, java.lang.reflect.Type r11, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r12) {
        /*
            r0 = 0
        L1:
            boolean r1 = r11 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L27
            r1 = r11
            java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
            java.lang.Object r2 = r12.get(r1)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            if (r2 == 0) goto L17
            java.lang.Class r9 = java.lang.Void.TYPE
            if (r2 != r9) goto L15
            goto L16
        L15:
            r11 = r2
        L16:
            return r11
        L17:
            java.lang.Class r11 = java.lang.Void.TYPE
            r12.put(r1, r11)
            if (r0 != 0) goto L1f
            r0 = r1
        L1f:
            java.lang.reflect.Type r11 = ag$a(r9, r10, r1)
            if (r11 != r1) goto L1
            goto Ldf
        L27:
            boolean r1 = r11 instanceof java.lang.Class
            if (r1 == 0) goto L4a
            r1 = r11
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r2 = r1.isArray()
            if (r2 == 0) goto L4a
            java.lang.Class r11 = r1.getComponentType()
            java.lang.reflect.Type r9 = values(r9, r10, r11, r12)
            boolean r10 = ah$a(r11, r9)
            if (r10 == 0) goto L45
            r11 = r1
            goto Ldf
        L45:
            java.lang.reflect.GenericArrayType r9 = valueOf(r9)
            goto L64
        L4a:
            boolean r1 = r11 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L67
            java.lang.reflect.GenericArrayType r11 = (java.lang.reflect.GenericArrayType) r11
            java.lang.reflect.Type r1 = r11.getGenericComponentType()
            java.lang.reflect.Type r9 = values(r9, r10, r1, r12)
            boolean r10 = ah$a(r1, r9)
            if (r10 == 0) goto L60
            goto Ldf
        L60:
            java.lang.reflect.GenericArrayType r9 = valueOf(r9)
        L64:
            r11 = r9
            goto Ldf
        L67:
            boolean r1 = r11 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Lab
            java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
            java.lang.reflect.Type r1 = r11.getOwnerType()
            java.lang.reflect.Type r4 = values(r9, r10, r1, r12)
            boolean r1 = ah$a(r4, r1)
            r1 = r1 ^ r2
            java.lang.reflect.Type[] r5 = r11.getActualTypeArguments()
            int r6 = r5.length
        L81:
            if (r3 >= r6) goto La0
            r7 = r5[r3]
            java.lang.reflect.Type r7 = values(r9, r10, r7, r12)
            r8 = r5[r3]
            boolean r8 = ah$a(r7, r8)
            if (r8 != 0) goto L9d
            if (r1 != 0) goto L9b
            java.lang.Object r1 = r5.clone()
            r5 = r1
            java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
            r1 = 1
        L9b:
            r5[r3] = r7
        L9d:
            int r3 = r3 + 1
            goto L81
        La0:
            if (r1 == 0) goto Ldf
            java.lang.reflect.Type r9 = r11.getRawType()
            java.lang.reflect.ParameterizedType r9 = ah$a(r4, r9, r5)
            goto L64
        Lab:
            boolean r1 = r11 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto Ldf
            java.lang.reflect.WildcardType r11 = (java.lang.reflect.WildcardType) r11
            java.lang.reflect.Type[] r1 = r11.getLowerBounds()
            java.lang.reflect.Type[] r4 = r11.getUpperBounds()
            int r5 = r1.length
            if (r5 != r2) goto Lcb
            r2 = r1[r3]
            java.lang.reflect.Type r9 = values(r9, r10, r2, r12)
            r10 = r1[r3]
            if (r9 == r10) goto Ldf
            java.lang.reflect.WildcardType r11 = ah$b(r9)
            goto Ldf
        Lcb:
            int r1 = r4.length
            if (r1 != r2) goto Ldf
            r1 = r4[r3]
            java.lang.reflect.Type r9 = values(r9, r10, r1, r12)     // Catch: java.lang.Throwable -> Ldd
            r10 = r4[r3]
            if (r9 == r10) goto Ldf
            java.lang.reflect.WildcardType r11 = HaptikSDK$b(r9)
            goto Ldf
        Ldd:
            r9 = move-exception
            throw r9
        Ldf:
            if (r0 == 0) goto Le4
            r12.put(r0, r11)
        Le4:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C$Gson$Types.values(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Map):java.lang.reflect.Type");
    }

    static Type ag$a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> values = values(typeVariable);
        if (values == null) {
            return typeVariable;
        }
        Type c$Gson$Types = toString(type, cls, values);
        if (c$Gson$Types instanceof ParameterizedType) {
            return ((ParameterizedType) c$Gson$Types).getActualTypeArguments()[ah$a((Object[]) values.getTypeParameters(), (Object) typeVariable)];
        }
        return typeVariable;
    }

    private static int ah$a(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    private static Class<?> values(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    static void values(Type type) {
        ensureSize.ag$a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.$Gson$Types$ParameterizedTypeImpl */
    /* loaded from: classes5.dex */
    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type ownerType;
        private final Type rawType;
        private final Type[] typeArguments;

        public ParameterizedTypeImpl(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                ensureSize.ag$a(z);
            }
            this.ownerType = type == null ? null : C$Gson$Types.toString(type);
            this.rawType = C$Gson$Types.toString(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.typeArguments = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                this.typeArguments[i].getClass();
                C$Gson$Types.values(this.typeArguments[i]);
                Type[] typeArr3 = this.typeArguments;
                typeArr3[i] = C$Gson$Types.toString(typeArr3[i]);
            }
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.rawType;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.ownerType;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C$Gson$Types.ag$a(this, (ParameterizedType) obj);
        }

        public int hashCode() {
            return (Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode()) ^ C$Gson$Types.ah$a((Object) this.ownerType);
        }

        public String toString() {
            int length = this.typeArguments.length;
            if (length == 0) {
                return C$Gson$Types.HaptikSDK$a(this.rawType);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C$Gson$Types.HaptikSDK$a(this.rawType));
            sb.append("<");
            sb.append(C$Gson$Types.HaptikSDK$a(this.typeArguments[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(C$Gson$Types.HaptikSDK$a(this.typeArguments[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl */
    /* loaded from: classes5.dex */
    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        public GenericArrayTypeImpl(Type type) {
            this.componentType = C$Gson$Types.toString(type);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.componentType;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C$Gson$Types.ag$a(this, (GenericArrayType) obj);
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public String toString() {
            return C$Gson$Types.HaptikSDK$a(this.componentType) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.$Gson$Types$WildcardTypeImpl */
    /* loaded from: classes5.dex */
    public static final class WildcardTypeImpl implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type lowerBound;
        private final Type upperBound;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            ensureSize.ag$a(typeArr2.length <= 1);
            ensureSize.ag$a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                typeArr2[0].getClass();
                C$Gson$Types.values(typeArr2[0]);
                ensureSize.ag$a(typeArr[0] == Object.class);
                this.lowerBound = C$Gson$Types.toString(typeArr2[0]);
                this.upperBound = Object.class;
                return;
            }
            typeArr[0].getClass();
            C$Gson$Types.values(typeArr[0]);
            this.lowerBound = null;
            this.upperBound = C$Gson$Types.toString(typeArr[0]);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.upperBound};
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.lowerBound;
            return type != null ? new Type[]{type} : C$Gson$Types.ah$a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C$Gson$Types.ag$a(this, (WildcardType) obj);
        }

        public int hashCode() {
            Type type = this.lowerBound;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.upperBound.hashCode() + 31);
        }

        public String toString() {
            if (this.lowerBound != null) {
                return "? super " + C$Gson$Types.HaptikSDK$a(this.lowerBound);
            } else if (this.upperBound == Object.class) {
                return "?";
            } else {
                return "? extends " + C$Gson$Types.HaptikSDK$a(this.upperBound);
            }
        }
    }
}
