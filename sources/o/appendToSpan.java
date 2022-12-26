package o;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import o.StaggeredGridLayoutManager;
/* loaded from: classes5.dex */
final class appendToSpan extends StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem {
    private static Class ag$a;
    private final Object valueOf = values();
    private final Field ah$a = ag$a();

    @Override // o.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem
    public void values(AccessibleObject accessibleObject) {
        if (toString(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e) {
            throw new JsonIOException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
        }
    }

    boolean toString(AccessibleObject accessibleObject) {
        if (this.valueOf != null && this.ah$a != null) {
            try {
                ag$a.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.valueOf, accessibleObject, Long.valueOf(((Long) ag$a.getMethod("objectFieldOffset", Field.class).invoke(this.valueOf, this.ah$a)).longValue()), true);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private static Object values() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            ag$a = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Field ag$a() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (Exception unused) {
            return null;
        }
    }
}
