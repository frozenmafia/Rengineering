package o;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public class createQuad {
    private static final Map<String, getInitialTextBeforeCursor> toString = Collections.synchronizedMap(new HashMap());

    public static getInitialTextBeforeCursor ag$a(CleverTapInstanceConfig cleverTapInstanceConfig) {
        if (cleverTapInstanceConfig == null) {
            throw new IllegalArgumentException("Can't create task for null config");
        }
        Map<String, getInitialTextBeforeCursor> map = toString;
        getInitialTextBeforeCursor getinitialtextbeforecursor = map.get(cleverTapInstanceConfig.valueOf());
        if (getinitialtextbeforecursor == null) {
            synchronized (createQuad.class) {
                getinitialtextbeforecursor = map.get(cleverTapInstanceConfig.valueOf());
                if (getinitialtextbeforecursor == null) {
                    getinitialtextbeforecursor = new getInitialTextBeforeCursor(cleverTapInstanceConfig);
                    map.put(cleverTapInstanceConfig.valueOf(), getinitialtextbeforecursor);
                }
            }
        }
        return getinitialtextbeforecursor;
    }
}
