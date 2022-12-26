package o;

import android.content.Context;
import com.clevertap.android.sdk.db.DBAdapter;
import com.clevertap.android.sdk.events.EventGroup;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public abstract class setHintText {
    public abstract void ag$a(Context context);

    abstract setLabeledBy ah$a(Context context, int i, setLabeledBy setlabeledby);

    public abstract void ah$a(Context context, JSONObject jSONObject);

    public abstract setLabeledBy toString(Context context, int i, setLabeledBy setlabeledby, EventGroup eventGroup);

    abstract setLabeledBy toString(Context context, DBAdapter.Table table, int i, setLabeledBy setlabeledby);

    public abstract void toString(Context context, JSONObject jSONObject, int i);

    public abstract DBAdapter valueOf(Context context);

    abstract setLabeledBy valueOf(JSONObject jSONObject, setLabeledBy setlabeledby);

    abstract setLabeledBy values(Context context, int i, setLabeledBy setlabeledby);
}
