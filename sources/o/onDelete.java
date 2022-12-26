package o;

import android.content.Context;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class onDelete {
    JSONObject ag$a;
    Context ah$a;
    protected long valueOf;
    protected unique values = new unique();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void toString(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback);

    public abstract String valueOf();

    public abstract void valueOf(Index index);

    /* JADX INFO: Access modifiers changed from: package-private */
    public onDelete(Context context, JSONObject jSONObject) {
        this.ah$a = context;
        this.ag$a = jSONObject;
    }
}
