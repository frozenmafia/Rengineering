package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.EnumSet;
/* loaded from: classes4.dex */
final class bjq implements bkf {
    final /* synthetic */ Object a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f855b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bjq(String str, int i) {
        this.f855b = i;
        this.a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bjq(Constructor constructor, int i) {
        this.f855b = i;
        this.a = constructor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bjq(Type type, int i) {
        this.f855b = i;
        this.a = type;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkf
    public final Object a() {
        switch (this.f855b) {
            case 0:
                throw new bit((String) this.a);
            case 1:
                throw new bit((String) this.a);
            case 2:
                throw new bit((String) this.a);
            case 3:
                Object obj = this.a;
                if (obj instanceof ParameterizedType) {
                    Type type = ((ParameterizedType) obj).getActualTypeArguments()[0];
                    if (type instanceof Class) {
                        return EnumSet.noneOf((Class) type);
                    }
                    throw new bit("Invalid EnumSet type: ".concat(String.valueOf(this.a.toString())));
                }
                throw new bit("Invalid EnumSet type: ".concat(String.valueOf(obj.toString())));
            case 4:
                Object obj2 = this.a;
                if (obj2 instanceof ParameterizedType) {
                    Type type2 = ((ParameterizedType) obj2).getActualTypeArguments()[0];
                    if (type2 instanceof Class) {
                        return new EnumMap((Class) type2);
                    }
                    throw new bit("Invalid EnumMap type: ".concat(String.valueOf(this.a.toString())));
                }
                throw new bit("Invalid EnumMap type: ".concat(String.valueOf(obj2.toString())));
            case 5:
                throw new bit((String) this.a);
            case 6:
                throw new bit((String) this.a);
            default:
                try {
                    return ((Constructor) this.a).newInstance(new Object[0]);
                } catch (IllegalAccessException e) {
                    throw bkj.c(e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Failed to invoke " + this.a + " with no args", e2);
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException("Failed to invoke " + this.a + " with no args", e3.getTargetException());
                }
        }
    }
}
