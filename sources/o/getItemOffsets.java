package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
/* loaded from: classes7.dex */
public class getItemOffsets {
    public static Activity toString(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
