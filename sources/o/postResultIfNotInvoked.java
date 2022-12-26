package o;

import android.app.Service;
import android.content.Context;
/* loaded from: classes4.dex */
public final class postResultIfNotInvoked {
    public static final postResultIfNotInvoked toString = new postResultIfNotInvoked();

    private postResultIfNotInvoked() {
    }

    public final boolean ah$a(Context context) {
        runAnimators.ag$a(context, "context");
        if (context instanceof android.view.ContextThemeWrapper) {
            context = ((android.view.ContextThemeWrapper) context).getBaseContext();
        }
        return Service.class.isInstance(context);
    }
}
