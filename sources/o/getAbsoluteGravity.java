package o;

import com.android.volley.Response;
import com.android.volley.VolleyError;
/* loaded from: classes3.dex */
public final /* synthetic */ class getAbsoluteGravity implements Response.ErrorListener {
    public static final /* synthetic */ getAbsoluteGravity valueOf = new getAbsoluteGravity();

    private /* synthetic */ getAbsoluteGravity() {
    }

    @Override // com.android.volley.Response.ErrorListener
    public final void onErrorResponse(VolleyError volleyError) {
        actionBarOnMenuKeyEventPre28.values(volleyError);
    }
}
