package o;

import android.os.Bundle;
import com.facebook.GraphResponse;
import com.sendbird.android.constant.StringSet;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class dispatchOnFragmentStarted$ah$a {
    List<String> ah$a;
    String valueOf;

    private dispatchOnFragmentStarted$ah$a(Bundle bundle) {
        this.valueOf = bundle.getString("request");
        this.ah$a = new ArrayList();
        while (bundle.containsKey(String.format("to[%d]", Integer.valueOf(this.ah$a.size())))) {
            List<String> list = this.ah$a;
            list.add(bundle.getString(String.format("to[%d]", Integer.valueOf(list.size()))));
        }
    }

    private dispatchOnFragmentStarted$ah$a(GraphResponse graphResponse) {
        try {
            JSONObject ah$a = graphResponse.ah$a();
            JSONObject optJSONObject = ah$a.optJSONObject("data");
            ah$a = optJSONObject != null ? optJSONObject : ah$a;
            this.valueOf = ah$a.getString(StringSet.request_id);
            this.ah$a = new ArrayList();
            JSONArray jSONArray = ah$a.getJSONArray("to");
            for (int i = 0; i < jSONArray.length(); i++) {
                this.ah$a.add(jSONArray.getString(i));
            }
        } catch (JSONException unused) {
            this.valueOf = null;
            this.ah$a = new ArrayList();
        }
    }

    public String ah$a() {
        return this.valueOf;
    }

    public List<String> valueOf() {
        return this.ah$a;
    }
}
