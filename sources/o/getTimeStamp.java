package o;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes7.dex */
public final class getTimeStamp {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.getTimeStamp$4  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[ReadableType.values().length];
            values = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                values[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                values[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                values[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                values[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                values[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static Object values(ReadableMap readableMap, String str) {
        if (readableMap == null) {
            return null;
        }
        switch (AnonymousClass4.values[readableMap.getType(str).ordinal()]) {
            case 1:
                return str;
            case 2:
                return Boolean.valueOf(readableMap.getBoolean(str));
            case 3:
                double d = readableMap.getDouble(str);
                int i = (int) d;
                if (d == i) {
                    return Integer.valueOf(i);
                }
                return Double.valueOf(d);
            case 4:
                return readableMap.getString(str);
            case 5:
                return ag$a(readableMap.getMap(str));
            case 6:
                return values(readableMap.getArray(str));
            default:
                throw new IllegalArgumentException("Could not convert object with key: " + str + ".");
        }
    }

    public static Map<String, Object> ag$a(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        if (keySetIterator.hasNextKey()) {
            HashMap hashMap = new HashMap();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                hashMap.put(nextKey, values(readableMap, nextKey));
            }
            return hashMap;
        }
        return null;
    }

    public static List<Object> values(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        List<Object> arrayList = new ArrayList<>(readableArray.size());
        for (int i = 0; i < readableArray.size(); i++) {
            switch (AnonymousClass4.values[readableArray.getType(i).ordinal()]) {
                case 1:
                    arrayList.add(String.valueOf(i));
                    break;
                case 2:
                    arrayList.add(Boolean.valueOf(readableArray.getBoolean(i)));
                    break;
                case 3:
                    double d = readableArray.getDouble(i);
                    int i2 = (int) d;
                    if (d == i2) {
                        arrayList.add(Integer.valueOf(i2));
                        break;
                    } else {
                        arrayList.add(Double.valueOf(d));
                        break;
                    }
                case 4:
                    arrayList.add(readableArray.getString(i));
                    break;
                case 5:
                    arrayList.add(ag$a(readableArray.getMap(i)));
                    break;
                case 6:
                    arrayList = values(readableArray.getArray(i));
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object with index: " + i + ".");
            }
        }
        return arrayList;
    }
}
