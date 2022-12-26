package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class checkVerticalSwipe {
    static final Class<?> ah$a = ah$a();

    checkVerticalSwipe() {
    }

    static Class<?> ah$a() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static ItemTouchHelper values() {
        ItemTouchHelper valueOf = valueOf("getEmptyRegistry");
        return valueOf != null ? valueOf : ItemTouchHelper.toString;
    }

    private static final ItemTouchHelper valueOf(String str) {
        Class<?> cls = ah$a;
        if (cls == null) {
            return null;
        }
        try {
            return (ItemTouchHelper) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
