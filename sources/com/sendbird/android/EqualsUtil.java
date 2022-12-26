package com.sendbird.android;
/* loaded from: classes5.dex */
final class EqualsUtil {
    private EqualsUtil() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean equals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        return obj.equals(obj2);
    }
}
