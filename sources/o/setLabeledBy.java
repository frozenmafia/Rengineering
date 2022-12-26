package o;

import com.clevertap.android.sdk.db.DBAdapter;
import org.json.JSONArray;
/* loaded from: classes4.dex */
public final class setLabeledBy {
    private String ag$a;
    private DBAdapter.Table valueOf;
    private JSONArray values;

    public String toString() {
        if (values().booleanValue()) {
            return "tableName: " + this.valueOf + " | numItems: 0";
        }
        return "tableName: " + this.valueOf + " | lastId: " + this.ag$a + " | numItems: " + this.values.length() + " | items: " + this.values.toString();
    }

    public JSONArray ah$a() {
        return this.values;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a(JSONArray jSONArray) {
        this.values = jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String valueOf() {
        return this.ag$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void valueOf(String str) {
        this.ag$a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DBAdapter.Table ag$a() {
        return this.valueOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a(DBAdapter.Table table) {
        this.valueOf = table;
    }

    public Boolean values() {
        JSONArray jSONArray;
        return Boolean.valueOf(this.ag$a == null || (jSONArray = this.values) == null || jSONArray.length() <= 0);
    }
}
