package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
/* loaded from: classes.dex */
public final class isNullOrEmpty {
    public static ColorStateList valueOf(Context context) {
        return valueOf(context, 16842904);
    }

    public static int values(Context context) {
        return valueOf(context, 16842905).getDefaultColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ColorStateList valueOf(Context context, int i) {
        TypedArray typedArray = null;
        try {
            typedArray = context.getTheme().obtainStyledAttributes(new int[]{i});
            return typedArray.getColorStateList(0);
        } finally {
            if (typedArray != null) {
                typedArray.recycle();
            }
        }
    }
}
