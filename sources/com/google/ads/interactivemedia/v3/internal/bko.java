package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Modifier;
/* loaded from: classes4.dex */
public abstract class bko {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(String.valueOf(cls.getName()));
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(String.valueOf(cls.getName()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c(Class cls) {
        String b2 = b(cls);
        if (b2 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(b2));
        }
    }

    public abstract Object a(Class cls) throws Exception;
}
