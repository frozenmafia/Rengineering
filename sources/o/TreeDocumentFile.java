package o;

import org.json.JSONArray;
/* loaded from: classes4.dex */
public final class TreeDocumentFile {
    @isFullSpan(valueOf = "batch")
    private final JSONArray valueOf;

    public TreeDocumentFile() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof TreeDocumentFile) && runAnimators.values(this.valueOf, ((TreeDocumentFile) obj).valueOf);
        }
        return true;
    }

    public int hashCode() {
        JSONArray jSONArray = this.valueOf;
        if (jSONArray != null) {
            return jSONArray.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "EventBatchInternal(events=" + this.valueOf + ")";
    }

    public TreeDocumentFile(JSONArray jSONArray) {
        runAnimators.valueOf(jSONArray, com.apxor.androidsdk.core.Constants.EVENTS_TABLE);
        this.valueOf = jSONArray;
    }

    public /* synthetic */ TreeDocumentFile(JSONArray jSONArray, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? new JSONArray() : jSONArray);
    }
}
