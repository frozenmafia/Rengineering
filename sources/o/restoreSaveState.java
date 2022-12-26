package o;

import android.graphics.drawable.Drawable;
/* loaded from: classes4.dex */
public class restoreSaveState {
    public static int valueOf(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK;
        }
        return ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24) | (16777215 & i);
    }

    public static int values(int i) {
        int i2 = i >>> 24;
        if (i2 == 255) {
            return -1;
        }
        return i2 == 0 ? -2 : -3;
    }

    public static void toString(Drawable drawable, Drawable drawable2) {
        if (drawable2 == null || drawable == null || drawable == drawable2) {
            return;
        }
        drawable.setBounds(drawable2.getBounds());
        drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
        drawable.setLevel(drawable2.getLevel());
        drawable.setVisible(drawable2.isVisible(), false);
        drawable.setState(drawable2.getState());
    }

    public static void values(Drawable drawable, saveAllState saveallstate) {
        if (drawable == null || saveallstate == null) {
            return;
        }
        saveallstate.values(drawable);
    }

    public static void values(Drawable drawable, Drawable.Callback callback, clearFragmentResultListener clearfragmentresultlistener) {
        if (drawable != null) {
            drawable.setCallback(callback);
            if (drawable instanceof FragmentKt$sam$androidx_fragment_app_FragmentResultListener$0) {
                ((FragmentKt$sam$androidx_fragment_app_FragmentResultListener$0) drawable).values(clearfragmentresultlistener);
            }
        }
    }
}
