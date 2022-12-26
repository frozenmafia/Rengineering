package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.amazon.identity.auth.device.AuthError;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class onActivityResult$ag$a implements onActivityResult$ah$a {
    private static final String valueOf = "com.amazon.identity.auth.internal.BrowsingExperienceManager$b";

    private onActivityResult$ag$a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean valueOf(Context context) {
        Intent intent = new Intent(androidx.browser.customtabs.CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
        intent.setPackage("com.android.chrome");
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        return (queryIntentServices == null || queryIntentServices.isEmpty()) ? false : true;
    }

    private androidx.browser.customtabs.CustomTabsIntent values(getOnBackPressedDispatcher getonbackpresseddispatcher) {
        androidx.browser.customtabs.CustomTabsIntent valueOf2 = getonbackpresseddispatcher.valueOf();
        valueOf2.intent.setPackage("com.android.chrome");
        return valueOf2;
    }

    @Override // o.onActivityResult$ah$a
    public void toString(String str, getOnBackPressedDispatcher getonbackpresseddispatcher) throws AuthError {
        putEncryptedObject.valueOf(valueOf, "Starting custom tab");
        try {
            values(getonbackpresseddispatcher).launchUrl(getonbackpresseddispatcher.ah$a(), Uri.parse(str));
        } catch (Exception e) {
            throw new AuthError("Unable to Launch custom tab.", e, AuthError.ERROR_TYPE.ERROR_UNKNOWN);
        } catch (NoSuchMethodError e2) {
            throw new AuthError("The current version of chrome custom tabs being used by your application is not compatible with the sdk. Please use version 25+.", e2, AuthError.ERROR_TYPE.ERROR_UNKNOWN);
        }
    }
}
