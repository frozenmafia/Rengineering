package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
/* loaded from: classes3.dex */
public final class insetInsets {
    private static volatile boolean ah$a = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static Drawable toString(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (ah$a) {
                return valueOf(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return androidx.core.content.ContextCompat.getDrawable(context2, i);
        } catch (NoClassDefFoundError unused2) {
            ah$a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return toString(context2, i, theme);
    }

    private static Drawable valueOf(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            context = new androidx.appcompat.view.ContextThemeWrapper(context, theme);
        }
        return androidx.appcompat.content.res.AppCompatResources.getDrawable(context, i);
    }

    private static Drawable toString(Context context, int i, Resources.Theme theme) {
        return androidx.core.content.res.ResourcesCompat.getDrawable(context.getResources(), i, theme);
    }
}
