package com.sendbird.android;
/* loaded from: classes5.dex */
class HashUtils {
    HashUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int generateHashCode(Object... objArr) {
        int length = objArr.length;
        int i = 17;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            i = (i * 31) + (obj == null ? 0 : generateSingleHashCode(obj));
        }
        return i;
    }

    private static int generateSingleHashCode(Object obj) {
        if ((obj instanceof Integer) || (obj instanceof Character) || (obj instanceof Short) || (obj instanceof Byte)) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? 1231 : 1237;
        } else if (obj instanceof Float) {
            return Float.floatToIntBits(((Float) obj).floatValue());
        } else {
            if (obj instanceof Long) {
                return generateLongHashCode((Long) obj);
            }
            if (obj instanceof Double) {
                return generateDoubleHashCode((Double) obj);
            }
            return obj.hashCode();
        }
    }

    private static int generateLongHashCode(Long l) {
        return (int) (l.longValue() ^ (l.longValue() >>> 32));
    }

    private static int generateDoubleHashCode(Double d) {
        return generateLongHashCode(Long.valueOf(Double.doubleToLongBits(d.doubleValue())));
    }
}
