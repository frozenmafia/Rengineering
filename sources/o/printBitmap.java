package o;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.api.client.util.DateTime;
import com.google.api.client.util.GenericData;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.PrintHelper;
/* loaded from: classes7.dex */
public class printBitmap {
    public static final Float HaptikSDK$a;
    public static final Integer HaptikSDK$b;
    public static final Long HaptikSDK$c;
    public static final String HaptikSDK$d;
    public static final Byte ag$a;
    public static final Character ah$a;
    public static final Double ah$b;
    public static final Short getInitSettings;
    private static final ConcurrentHashMap<Class<?>, Object> getSignupData;
    public static final DateTime invoke;
    public static final Boolean toString;
    public static final BigInteger valueOf;
    public static final BigDecimal values;

    static {
        Boolean bool = new Boolean(true);
        toString = bool;
        String str = new String();
        HaptikSDK$d = str;
        Character ch = new Character((char) 0);
        ah$a = ch;
        Byte b2 = new Byte((byte) 0);
        ag$a = b2;
        Short sh = new Short((short) 0);
        getInitSettings = sh;
        Integer num = new Integer(0);
        HaptikSDK$b = num;
        Float f = new Float(0.0f);
        HaptikSDK$a = f;
        Long l = new Long(0L);
        HaptikSDK$c = l;
        Double d = new Double(0.0d);
        ah$b = d;
        BigInteger bigInteger = new BigInteger(SessionDescription.SUPPORTED_SDP_VERSION);
        valueOf = bigInteger;
        BigDecimal bigDecimal = new BigDecimal(SessionDescription.SUPPORTED_SDP_VERSION);
        values = bigDecimal;
        DateTime dateTime = new DateTime(0L);
        invoke = dateTime;
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = new ConcurrentHashMap<>();
        getSignupData = concurrentHashMap;
        concurrentHashMap.put(Boolean.class, bool);
        concurrentHashMap.put(String.class, str);
        concurrentHashMap.put(Character.class, ch);
        concurrentHashMap.put(Byte.class, b2);
        concurrentHashMap.put(Short.class, sh);
        concurrentHashMap.put(Integer.class, num);
        concurrentHashMap.put(Float.class, f);
        concurrentHashMap.put(Long.class, l);
        concurrentHashMap.put(Double.class, d);
        concurrentHashMap.put(BigInteger.class, bigInteger);
        concurrentHashMap.put(BigDecimal.class, bigDecimal);
        concurrentHashMap.put(DateTime.class, dateTime);
    }

    public static <T> T toString(T t) {
        T t2;
        if (t == null || ah$a(t.getClass())) {
            return t;
        }
        if (t instanceof GenericData) {
            return (T) ((GenericData) t).valueOf();
        }
        Class<?> cls = t.getClass();
        if (cls.isArray()) {
            t2 = (T) Array.newInstance(cls.getComponentType(), Array.getLength(t));
        } else if (t instanceof isPortrait) {
            t2 = (T) ((isPortrait) t).clone();
        } else if ("java.util.Arrays$ArrayList".equals(cls.getName())) {
            Object[] array = ((List) t).toArray();
            ag$a(array, array);
            return (T) Arrays.asList(array);
        } else {
            t2 = (T) applyUpdate.valueOf(cls);
        }
        ag$a(t, t2);
        return t2;
    }

    public static void ag$a(Object obj, Object obj2) {
        setColorMode valueOf2;
        Class<?> cls = obj.getClass();
        int i = 0;
        markViewHoldersUpdated.values(cls == obj2.getClass());
        if (cls.isArray()) {
            markViewHoldersUpdated.values(Array.getLength(obj) == Array.getLength(obj2));
            for (Object obj3 : applyUpdate.ah$a(obj)) {
                Array.set(obj2, i, toString(obj3));
                i++;
            }
        } else if (Collection.class.isAssignableFrom(cls)) {
            Collection<Object> collection = (Collection) obj;
            if (ArrayList.class.isAssignableFrom(cls)) {
                ((ArrayList) obj2).ensureCapacity(collection.size());
            }
            Collection collection2 = (Collection) obj2;
            for (Object obj4 : collection) {
                collection2.add(toString(obj4));
            }
        } else {
            boolean isAssignableFrom = GenericData.class.isAssignableFrom(cls);
            if (isAssignableFrom || !Map.class.isAssignableFrom(cls)) {
                if (isAssignableFrom) {
                    valueOf2 = ((GenericData) obj).classInfo;
                } else {
                    valueOf2 = setColorMode.valueOf(cls);
                }
                for (String str : valueOf2.toString) {
                    PrintHelper.PrintBitmapAdapter ag$a2 = valueOf2.ag$a(str);
                    if (!ag$a2.values() && (!isAssignableFrom || !ag$a2.HaptikSDK$c())) {
                        Object ah$a2 = ag$a2.ah$a(obj);
                        if (ah$a2 != null) {
                            ag$a2.toString(obj2, toString(ah$a2));
                        }
                    }
                }
            } else if (isPortrait.class.isAssignableFrom(cls)) {
                isPortrait isportrait = (isPortrait) obj2;
                isPortrait isportrait2 = (isPortrait) obj;
                int size = isportrait2.size();
                while (i < size) {
                    isportrait.ah$a(i, toString(isportrait2.ah$a(i)));
                    i++;
                }
            } else {
                Map map = (Map) obj2;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    map.put(entry.getKey(), toString(entry.getValue()));
                }
            }
        }
    }

    public static boolean ah$a(Type type) {
        if (type instanceof WildcardType) {
            type = applyUpdate.ag$a((WildcardType) type);
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isPrimitive() || cls == Character.class || cls == String.class || cls == Integer.class || cls == Long.class || cls == Short.class || cls == Byte.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == DateTime.class || cls == Boolean.class;
        }
        return false;
    }
}
