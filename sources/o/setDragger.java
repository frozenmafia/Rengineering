package o;

import java.lang.reflect.Field;
/* loaded from: classes6.dex */
public final class setDragger {
    public static final setDragger valueOf = new setDragger();

    private setDragger() {
    }

    public final Object ah$a(Object obj, String str) {
        runAnimators.ag$a(obj, "obj");
        runAnimators.ag$a(str, "fieldName");
        try {
            Field valueOf2 = valueOf(obj.getClass(), str);
            if (valueOf2 != null) {
                valueOf2.setAccessible(true);
                return valueOf2.get(obj);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private final Field valueOf(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Class<? super Object> superclass = cls.getSuperclass();
            runAnimators.ah$a(superclass, "clazz.superclass");
            return valueOf(superclass, str);
        } catch (Exception unused2) {
            return null;
        }
    }
}
