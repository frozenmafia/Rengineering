package o;

import android.content.Context;
import android.graphics.Typeface;
import java.util.Hashtable;
/* loaded from: classes3.dex */
public class getM {
    private static final Hashtable<String, Typeface> values = new Hashtable<>();

    public static Typeface toString(Context context, String str) {
        if (str == null || str.contains("null")) {
            str = context.getString(com.app.dream11Pro.R.string.res_0x7f12000e);
        }
        Hashtable<String, Typeface> hashtable = values;
        synchronized (hashtable) {
            if (!hashtable.containsKey(str)) {
                hashtable.put(str, Typeface.createFromAsset(context.getAssets(), str));
            }
        }
        return hashtable.get(str);
    }
}
