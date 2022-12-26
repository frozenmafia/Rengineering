package androidx.core.splashscreen;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class ThemeUtils {
    public static final ThemeUtils INSTANCE = new ThemeUtils();

    private ThemeUtils() {
    }

    /* loaded from: classes6.dex */
    public static final class Api31 {
        public static final Api31 INSTANCE = new Api31();

        public static final void applyThemesSystemBarAppearance(Resources.Theme theme, View view) {
            runAnimators.ag$a(theme, "theme");
            runAnimators.ag$a(view, "decor");
            applyThemesSystemBarAppearance$default(theme, view, null, 4, null);
        }

        private Api31() {
        }

        public static /* synthetic */ void applyThemesSystemBarAppearance$default(Resources.Theme theme, View view, TypedValue typedValue, int i, Object obj) {
            if ((i & 4) != 0) {
                typedValue = new TypedValue();
            }
            applyThemesSystemBarAppearance(theme, view, typedValue);
        }

        public static final void applyThemesSystemBarAppearance(Resources.Theme theme, View view, TypedValue typedValue) {
            runAnimators.ag$a(theme, "theme");
            runAnimators.ag$a(view, "decor");
            runAnimators.ag$a(typedValue, "tv");
            int i = (!theme.resolveAttribute(16844000, typedValue, true) || typedValue.data == 0) ? 0 : 8;
            if (theme.resolveAttribute(16844140, typedValue, true) && typedValue.data != 0) {
                i |= 16;
            }
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            runAnimators.toString(windowInsetsController);
            windowInsetsController.setSystemBarsAppearance(i, 24);
        }
    }
}
