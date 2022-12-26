package o;

import com.android.volley.Response;
import com.android.volley.VolleyError;
/* loaded from: classes3.dex */
public final /* synthetic */ class toRectF implements Response.ErrorListener {
    public static final /* synthetic */ toRectF ag$a = new toRectF();

    private /* synthetic */ toRectF() {
    }

    @Override // com.android.volley.Response.ErrorListener
    public final void onErrorResponse(VolleyError volleyError) {
        toColorFilter.ah$a(volleyError);
    }
}
