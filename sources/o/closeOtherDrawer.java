package o;

import android.content.Context;
import android.graphics.Typeface;
import java.util.Hashtable;
import o.DrawerLayout;
/* loaded from: classes.dex */
public class closeOtherDrawer {
    private static final Hashtable<String, Typeface> ag$a = new Hashtable<>();

    public static Typeface valueOf(Context context, String str) {
        if (str == null || str.contains("null")) {
            str = context.getString(DrawerLayout.DrawerListener.toString.D11Font_Regular);
        }
        Hashtable<String, Typeface> hashtable = ag$a;
        synchronized (hashtable) {
            if (!hashtable.containsKey(str)) {
                hashtable.put(str, Typeface.createFromAsset(context.getAssets(), str));
            }
        }
        return hashtable.get(str);
    }
}
