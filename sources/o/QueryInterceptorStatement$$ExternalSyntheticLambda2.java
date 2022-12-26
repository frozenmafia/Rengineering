package o;

import com.nimbusds.jose.shaded.json.JSONObject;
import com.nimbusds.jose.util.Base64URL;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes7.dex */
public class QueryInterceptorStatement$$ExternalSyntheticLambda2 {
    public static Map<String, Object> ag$a(String str) throws java.text.ParseException {
        try {
            Object values = new QueryInterceptorDatabase$$ExternalSyntheticLambda4(640).values(str);
            if (values instanceof JSONObject) {
                return (JSONObject) values;
            }
            throw new java.text.ParseException("JSON entity is not an object", 0);
        } catch (com.nimbusds.jose.shaded.json.parser.ParseException e) {
            throw new java.text.ParseException("Invalid JSON: " + e.getMessage(), 0);
        } catch (Exception e2) {
            throw new java.text.ParseException("Unexpected exception: " + e2.getMessage(), 0);
        }
    }

    private static <T> T valueOf(Map<String, Object> map, String str, Class<T> cls) throws java.text.ParseException {
        if (map.get(str) == null) {
            return null;
        }
        T t = (T) map.get(str);
        if (cls.isAssignableFrom(t.getClass())) {
            return t;
        }
        throw new java.text.ParseException("Unexpected type of JSON object member with key \"" + str + "\"", 0);
    }

    public static boolean values(Map<String, Object> map, String str) throws java.text.ParseException {
        Boolean bool = (Boolean) valueOf(map, str, Boolean.class);
        if (bool == null) {
            throw new java.text.ParseException("JSON object member with key \"" + str + "\" is missing or null", 0);
        }
        return bool.booleanValue();
    }

    public static int ah$a(Map<String, Object> map, String str) throws java.text.ParseException {
        Number number = (Number) valueOf(map, str, Number.class);
        if (number == null) {
            throw new java.text.ParseException("JSON object member with key \"" + str + "\" is missing or null", 0);
        }
        return number.intValue();
    }

    public static long HaptikSDK$a(Map<String, Object> map, String str) throws java.text.ParseException {
        Number number = (Number) valueOf(map, str, Number.class);
        if (number == null) {
            throw new java.text.ParseException("JSON object member with key \"" + str + "\" is missing or null", 0);
        }
        return number.longValue();
    }

    public static String ah$b(Map<String, Object> map, String str) throws java.text.ParseException {
        return (String) valueOf(map, str, String.class);
    }

    public static URI HaptikSDK$c(Map<String, Object> map, String str) throws java.text.ParseException {
        String ah$b = ah$b(map, str);
        if (ah$b == null) {
            return null;
        }
        try {
            return new URI(ah$b);
        } catch (URISyntaxException e) {
            throw new java.text.ParseException(e.getMessage(), 0);
        }
    }

    public static List<Object> valueOf(Map<String, Object> map, String str) throws java.text.ParseException {
        return (List) valueOf(map, str, List.class);
    }

    public static String[] HaptikSDK$b(Map<String, Object> map, String str) throws java.text.ParseException {
        List<Object> valueOf = valueOf(map, str);
        if (valueOf == null) {
            return null;
        }
        try {
            return (String[]) valueOf.toArray(new String[0]);
        } catch (ArrayStoreException unused) {
            throw new java.text.ParseException("JSON object member with key \"" + str + "\" is not an array of strings", 0);
        }
    }

    public static List<String> invoke(Map<String, Object> map, String str) throws java.text.ParseException {
        String[] HaptikSDK$b = HaptikSDK$b(map, str);
        if (HaptikSDK$b == null) {
            return null;
        }
        return Arrays.asList(HaptikSDK$b);
    }

    public static Map<String, Object> ag$a(Map<String, Object> map, String str) throws java.text.ParseException {
        return (Map) valueOf(map, str, JSONObject.class);
    }

    public static Base64URL toString(Map<String, Object> map, String str) throws java.text.ParseException {
        String ah$b = ah$b(map, str);
        if (ah$b == null) {
            return null;
        }
        return new Base64URL(ah$b);
    }

    public static String values(Map<String, ?> map) {
        return JSONObject.toJSONString((Map<String, ? extends Object>) map);
    }

    public static Map<String, Object> values() {
        return new HashMap();
    }
}
