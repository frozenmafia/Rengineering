package o;

import android.content.Context;
import android.graphics.Typeface;
import java.util.Hashtable;
import o.Visibility;
/* loaded from: classes6.dex */
public final class getTargetState {
    public static final getTargetState toString = new getTargetState();
    private static final Hashtable<String, Typeface> values = new Hashtable<>();

    private getTargetState() {
    }

    public final Typeface ag$a(Context context, String str) {
        runAnimators.ag$a(context, "c");
        if (str == null || Visibility.Mode.values((CharSequence) str, (CharSequence) "null", false, 2, (Object) null)) {
            str = context.getString(FullLifecycleObserver$ah$a.Roboto);
        }
        Hashtable<String, Typeface> hashtable = values;
        synchronized (hashtable) {
            if (!hashtable.containsKey(str)) {
                hashtable.put(str, Typeface.createFromAsset(context.getAssets(), str));
            }
            setAnimationMatrix setanimationmatrix = setAnimationMatrix.ag$a;
        }
        return hashtable.get(str);
    }
}
