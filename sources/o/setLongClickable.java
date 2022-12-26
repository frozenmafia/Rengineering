package o;

import android.text.TextUtils;
import com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public class setLongClickable {
    final HashMap<String, CleverTapDisplayUnit> values = new HashMap<>();

    public ArrayList<CleverTapDisplayUnit> ah$a() {
        synchronized (this) {
            if (!this.values.isEmpty()) {
                return new ArrayList<>(this.values.values());
            }
            setBoundsInScreen.values("DisplayUnit : ", "Failed to return Display Units, nothing found in the cache");
            return null;
        }
    }

    public CleverTapDisplayUnit values(String str) {
        synchronized (this) {
            if (!TextUtils.isEmpty(str)) {
                return this.values.get(str);
            }
            setBoundsInScreen.values("DisplayUnit : ", "Can't return Display Unit, id was null");
            return null;
        }
    }

    public void ag$a() {
        synchronized (this) {
            this.values.clear();
            setBoundsInScreen.values("DisplayUnit : ", "Cleared Display Units Cache");
        }
    }

    public ArrayList<CleverTapDisplayUnit> values(JSONArray jSONArray) {
        synchronized (this) {
            ag$a();
            if (jSONArray != null && jSONArray.length() > 0) {
                ArrayList<CleverTapDisplayUnit> arrayList = new ArrayList<>();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        CleverTapDisplayUnit valueOf = CleverTapDisplayUnit.valueOf((JSONObject) jSONArray.get(i));
                        if (TextUtils.isEmpty(valueOf.ag$a())) {
                            this.values.put(valueOf.values(), valueOf);
                            arrayList.add(valueOf);
                        } else {
                            setBoundsInScreen.values("DisplayUnit : ", "Failed to convert JsonArray item at index:" + i + " to Display Unit");
                        }
                    } catch (Exception e) {
                        setBoundsInScreen.values("DisplayUnit : ", "Failed while parsing Display Unit:" + e.getLocalizedMessage());
                        return null;
                    }
                }
                return arrayList.isEmpty() ? null : arrayList;
            }
            setBoundsInScreen.values("DisplayUnit : ", "Null json array response can't parse Display Units ");
            return null;
        }
    }
}
