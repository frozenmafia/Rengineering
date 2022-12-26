package o;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
/* loaded from: classes5.dex */
public class setInitialExpandedChildrenCount {
    public static TypedValue toString(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static int values(Context context, int i, String str) {
        TypedValue setinitialexpandedchildrencount = toString(context, i);
        if (setinitialexpandedchildrencount == null) {
            throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
        }
        return setinitialexpandedchildrencount.data;
    }

    public static int toString(View view, int i) {
        return values(view.getContext(), i, view.getClass().getCanonicalName());
    }

    public static boolean values(Context context, int i, boolean z) {
        TypedValue setinitialexpandedchildrencount = toString(context, i);
        return (setinitialexpandedchildrencount == null || setinitialexpandedchildrencount.type != 18) ? z : setinitialexpandedchildrencount.data != 0;
    }

    public static int valueOf(Context context, int i, int i2) {
        TypedValue setinitialexpandedchildrencount = toString(context, i);
        return (setinitialexpandedchildrencount == null || setinitialexpandedchildrencount.type != 16) ? i2 : setinitialexpandedchildrencount.data;
    }
}
