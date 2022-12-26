package o;

import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes3.dex */
public final class SimpleArrayMap {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int ag$a(ReadableMap readableMap, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        return ag$a(readableMap, str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ag$a(ReadableMap readableMap, String str, int i) {
        return (readableMap == null || !readableMap.hasKey(str)) ? i : readableMap.getInt(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String values(ReadableMap readableMap, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return values(readableMap, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String values(ReadableMap readableMap, String str, String str2) {
        String string;
        if (readableMap != null && readableMap.hasKey(str) && (string = readableMap.getString(str)) != null) {
            str2 = string;
        }
        runAnimators.ah$a(str2, "if (this != null && hasK…) ?: default else default");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean ah$a(ReadableMap readableMap, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return toString(readableMap, str, z);
    }

    private static final boolean toString(ReadableMap readableMap, String str, boolean z) {
        return (readableMap == null || !readableMap.hasKey(str)) ? z : readableMap.getBoolean(str);
    }
}
