package o;

import android.content.Context;
import android.graphics.Typeface;
import java.util.Hashtable;
/* loaded from: classes6.dex */
public final class resolveShadowDrawables {
    public static final resolveShadowDrawables ag$a = new resolveShadowDrawables();
    private static final Hashtable<String, Typeface> toString = new Hashtable<>();

    private resolveShadowDrawables() {
    }

    public final Typeface values(Context context, String str) {
        runAnimators.ag$a(context, "c");
        runAnimators.ag$a(str, "name");
        Hashtable<String, Typeface> hashtable = toString;
        synchronized (hashtable) {
            if (!hashtable.containsKey(str)) {
                hashtable.put(str, Typeface.createFromAsset(context.getAssets(), str));
            }
            setAnimationMatrix setanimationmatrix = setAnimationMatrix.ag$a;
        }
        return hashtable.get(str);
    }
}
