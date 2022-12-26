package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes4.dex */
public class scheduleHideFragmentView {
    private static volatile scheduleHideFragmentView values;
    private Map<String, Integer> valueOf = new HashMap();

    private scheduleHideFragmentView() {
    }

    public static scheduleHideFragmentView ah$a() {
        if (values == null) {
            synchronized (scheduleHideFragmentView.class) {
                if (values == null) {
                    values = new scheduleHideFragmentView();
                }
            }
        }
        return values;
    }

    public int toString(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String replace = str.toLowerCase(Locale.ROOT).replace("-", "_");
        try {
            return Integer.parseInt(replace);
        } catch (NumberFormatException unused) {
            synchronized (this) {
                if (this.valueOf.containsKey(replace)) {
                    return this.valueOf.get(replace).intValue();
                }
                int identifier = context.getResources().getIdentifier(replace, "drawable", context.getPackageName());
                this.valueOf.put(replace, Integer.valueOf(identifier));
                return identifier;
            }
        }
    }

    public Drawable valueOf(Context context, String str) {
        int schedulehidefragmentview = toString(context, str);
        if (schedulehidefragmentview > 0) {
            return context.getResources().getDrawable(schedulehidefragmentview);
        }
        return null;
    }

    public Uri ah$a(Context context, String str) {
        int schedulehidefragmentview = toString(context, str);
        if (schedulehidefragmentview > 0) {
            return new Uri.Builder().scheme("res").path(String.valueOf(schedulehidefragmentview)).build();
        }
        return Uri.EMPTY;
    }
}
