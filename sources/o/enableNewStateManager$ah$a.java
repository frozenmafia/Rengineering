package o;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import o.Visibility;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public final class enableNewStateManager$ah$a {
    public /* synthetic */ enableNewStateManager$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private enableNewStateManager$ah$a() {
    }

    public final enableNewStateManager valueOf() {
        enableNewStateManager enablenewstatemanager;
        enableNewStateManager enablenewstatemanager2;
        synchronized (this) {
            enablenewstatemanager = enableNewStateManager.ag$a;
            if (enablenewstatemanager == null) {
                enableNewStateManager.ag$a = ag$a();
            }
            enablenewstatemanager2 = enableNewStateManager.ag$a;
            if (enablenewstatemanager2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            }
        }
        return enablenewstatemanager2;
    }

    private final enableNewStateManager ag$a() {
        return new enableNewStateManager(null, fetchDrawMatrixField.ah$a(getReparent.toString(2, null), getReparent.toString(4, null), getReparent.toString(9, null), getReparent.toString(17, null), getReparent.toString(341, null)), fetchDrawMatrixField.ah$a(getReparent.toString(102, null), getReparent.toString(190, null), getReparent.toString(412, null)), null, null, null);
    }

    private final Map<Integer, Set<Integer>> ag$a(JSONObject jSONObject) {
        int optInt;
        HashSet hashSet;
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int length = optJSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null && (optInt = optJSONObject.optInt("code")) != 0) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                    if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                        hashSet = null;
                    } else {
                        hashSet = new HashSet();
                        int length2 = optJSONArray2.length();
                        if (length2 > 0) {
                            int i3 = 0;
                            while (true) {
                                int i4 = i3 + 1;
                                int optInt2 = optJSONArray2.optInt(i3);
                                if (optInt2 != 0) {
                                    hashSet.add(Integer.valueOf(optInt2));
                                }
                                if (i4 >= length2) {
                                    break;
                                }
                                i3 = i4;
                            }
                        }
                    }
                    hashMap.put(Integer.valueOf(optInt), hashSet);
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return hashMap;
    }

    public final enableNewStateManager ag$a(JSONArray jSONArray) {
        Map<Integer, Set<Integer>> map;
        Map<Integer, Set<Integer>> map2;
        Map<Integer, Set<Integer>> map3;
        String str;
        String str2;
        String str3;
        String optString;
        if (jSONArray == null) {
            return null;
        }
        int i = 0;
        int length = jSONArray.length();
        if (length > 0) {
            Map<Integer, Set<Integer>> map4 = null;
            Map<Integer, Set<Integer>> map5 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Map<Integer, Set<Integer>> map6 = null;
            while (true) {
                int i2 = i + 1;
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null && (optString = optJSONObject.optString("name")) != null) {
                    if (Visibility.Mode.toString(optString, "other", true)) {
                        str4 = optJSONObject.optString("recovery_message", null);
                        map4 = ag$a(optJSONObject);
                    } else if (Visibility.Mode.toString(optString, "transient", true)) {
                        str5 = optJSONObject.optString("recovery_message", null);
                        map5 = ag$a(optJSONObject);
                    } else if (Visibility.Mode.toString(optString, "login_recoverable", true)) {
                        str6 = optJSONObject.optString("recovery_message", null);
                        map6 = ag$a(optJSONObject);
                    }
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
            map = map4;
            map2 = map5;
            str = str4;
            str2 = str5;
            str3 = str6;
            map3 = map6;
        } else {
            map = null;
            map2 = null;
            map3 = null;
            str = null;
            str2 = null;
            str3 = null;
        }
        return new enableNewStateManager(map, map2, map3, str, str2, str3);
    }
}
