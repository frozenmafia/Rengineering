package com.google.ads.interactivemedia.v3.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes4.dex */
final class bjo implements bkf {
    final /* synthetic */ Class a;

    /* renamed from: b  reason: collision with root package name */
    private final bko f853b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bjo(Class cls) {
        bko bknVar;
        this.a = cls;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            bknVar = new bkk(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    bknVar = new bkl(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    bknVar = new bkm(declaredMethod3);
                }
            } catch (Exception unused3) {
                bknVar = new bkn();
            }
        }
        this.f853b = bknVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkf
    public final Object a() {
        try {
            return this.f853b.a(this.a);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + this.a + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }
}
