package o;

import com.sendbird.android.constant.StringSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import o.Visibility;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public final class getExitTransition {
    private final List<String> ag$a;
    private final String ah$a;
    private final String valueOf;
    public static final valueOf values = new valueOf(null);
    private static final Set<getExitTransition> toString = new CopyOnWriteArraySet();

    public /* synthetic */ getExitTransition(String str, List list, String str2, getTargetTypes gettargettypes) {
        this(str, list, str2);
    }

    private getExitTransition(String str, List<String> list, String str2) {
        this.ah$a = str;
        this.valueOf = str2;
        this.ag$a = list;
    }

    public static final /* synthetic */ Set values() {
        if (isStateAtLeast.values(getExitTransition.class)) {
            return null;
        }
        try {
            return toString;
        } catch (Throwable th) {
            isStateAtLeast.values(th, getExitTransition.class);
            return null;
        }
    }

    public final String ah$a() {
        if (isStateAtLeast.values(this)) {
            return null;
        }
        try {
            return this.valueOf;
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return null;
        }
    }

    public final String valueOf() {
        if (isStateAtLeast.values(this)) {
            return null;
        }
        try {
            return this.ah$a;
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class valueOf {
        public /* synthetic */ valueOf(getTargetTypes gettargettypes) {
            this();
        }

        private valueOf() {
        }

        public final Set<getExitTransition> values() {
            return new HashSet(getExitTransition.values());
        }

        public final void ah$a(String str) {
            runAnimators.ag$a(str, "rulesFromServer");
            try {
                getExitTransition.values().clear();
                valueOf(new JSONObject(str));
            } catch (JSONException unused) {
            }
        }

        public final Set<String> valueOf() {
            HashSet hashSet = new HashSet();
            for (getExitTransition getexittransition : getExitTransition.values()) {
                hashSet.add(getexittransition.valueOf());
            }
            return hashSet;
        }

        private final void valueOf(JSONObject jSONObject) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("k");
                    String optString2 = optJSONObject.optString("v");
                    runAnimators.ah$a(optString, "k");
                    String str = optString;
                    if (!(str.length() == 0)) {
                        Set values = getExitTransition.values();
                        runAnimators.ah$a(next, StringSet.key);
                        List mode = Visibility.Mode.toString((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null);
                        runAnimators.ah$a(optString2, "v");
                        values.add(new getExitTransition(next, mode, optString2, null));
                    }
                }
            }
        }
    }

    public final List<String> ag$a() {
        if (isStateAtLeast.values(this)) {
            return null;
        }
        try {
            return new ArrayList(this.ag$a);
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
            return null;
        }
    }
}
