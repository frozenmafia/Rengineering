package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class findOneViewWithinBoundFlags {
    static final Class<?> valueOf = values();

    findOneViewWithinBoundFlags() {
    }

    static Class<?> values() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static containsPosition valueOf() {
        containsPosition ag$a = ag$a("getEmptyRegistry");
        return ag$a != null ? ag$a : containsPosition.values;
    }

    private static final containsPosition ag$a(String str) {
        Class<?> cls = valueOf;
        if (cls == null) {
            return null;
        }
        try {
            return (containsPosition) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
