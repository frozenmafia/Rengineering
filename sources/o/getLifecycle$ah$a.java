package o;

import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class getLifecycle$ah$a implements getViewModelStore {
    private final String toString;
    private final JSONObject values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getLifecycle$ah$a(String str) {
        this(str, null);
    }

    getLifecycle$ah$a(String str, JSONObject jSONObject) {
        if (str == null) {
            throw new IllegalArgumentException("Scope must have a name");
        }
        this.toString = str;
        this.values = jSONObject;
    }

    @Override // o.getViewModelStore
    public JSONObject ah$a() {
        return this.values;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            getLifecycle$ah$a getlifecycle_ah_a = (getLifecycle$ah$a) obj;
            String str = this.toString;
            if (str == null) {
                if (getlifecycle_ah_a.toString != null) {
                    return false;
                }
            } else if (!str.equals(getlifecycle_ah_a.toString)) {
                return false;
            }
            JSONObject jSONObject = this.values;
            JSONObject jSONObject2 = getlifecycle_ah_a.values;
            if (jSONObject == null) {
                if (jSONObject2 != null) {
                    return false;
                }
            } else if (!jSONObject.equals(jSONObject2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.toString;
        int hashCode = str == null ? 0 : str.hashCode();
        JSONObject jSONObject = this.values;
        return ((hashCode + 31) * 31) + (jSONObject != null ? jSONObject.hashCode() : 0);
    }

    @Override // o.getViewModelStore
    public String values() {
        return this.toString;
    }
}
