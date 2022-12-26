package o;

import android.app.PendingIntent;
import android.content.Context;
import java.util.UUID;
/* loaded from: classes.dex */
public final class addContentView {
    public final PendingIntent ag$a;
    public final String ah$a;
    public final androidx.browser.customtabs.CustomTabsIntent ah$b;
    public final Context toString;
    public final UUID valueOf;
    public final PendingIntent values;

    public addContentView(Context context, String str, PendingIntent pendingIntent, PendingIntent pendingIntent2, androidx.browser.customtabs.CustomTabsIntent customTabsIntent) {
        onFoldingFeatureChange.valueOf(context);
        onFoldingFeatureChange.toString(str, "clientId");
        this.valueOf = UUID.randomUUID();
        this.toString = context;
        this.ah$a = str;
        this.ag$a = pendingIntent;
        this.values = pendingIntent2;
        this.ah$b = customTabsIntent;
    }

    public static addContentView toString(Context context, String str, PendingIntent pendingIntent, PendingIntent pendingIntent2, androidx.browser.customtabs.CustomTabsIntent customTabsIntent) {
        return new addContentView(context, str, pendingIntent, pendingIntent2, customTabsIntent);
    }

    public String ag$a() {
        return this.ah$a;
    }

    public androidx.browser.customtabs.CustomTabsIntent ah$a() {
        return this.ah$b;
    }

    public String valueOf() {
        return this.valueOf.toString();
    }

    public Context values() {
        return this.toString;
    }

    public static addContentView values(Context context, String str, androidx.browser.customtabs.CustomTabsIntent customTabsIntent) {
        return toString(context, str, null, null, customTabsIntent);
    }
}
