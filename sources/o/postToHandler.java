package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import com.amazon.apay.hardened.external.model.APayError;
import java.util.List;
/* loaded from: classes.dex */
public final class postToHandler {
    public static postToHandler ah$a;
    public valueOf values;

    /* loaded from: classes.dex */
    public static class toString implements valueOf {
        public /* synthetic */ toString(postToHandler$ah$a posttohandler_ah_a) {
        }

        @Override // o.postToHandler.valueOf
        public void values(String str, addContentView addcontentview) throws APayError {
            setHandler.ag$a("ExternalBrowserInvoked");
            try {
                Context values = addcontentview.values();
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.addFlags(268435456);
                intent.addFlags(1073741824);
                intent.putExtra("com.android.browser.application_id", values.getPackageName() + ".amazon.apay");
                postToHandler.valueOf(intent);
                values.startActivity(intent);
            } catch (Exception e) {
                WindowMetricsCalculatorDecorator.valueOf(e, "Unable to launch url on browser: %s", e.getMessage());
                throw new APayError(APayError.ErrorType.BROWSING_EXPERIENCE, "ExternalBrowserError", "Unable to launch url on browser.", e);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface valueOf {
        void values(String str, addContentView addcontentview) throws APayError;
    }

    public postToHandler(valueOf valueof) {
        this.values = valueof;
    }

    public static postToHandler toString(Context context) {
        postToHandler posttohandler;
        synchronized (postToHandler.class) {
            if (ah$a == null) {
                if (values.valueOf(context)) {
                    setHandler.ag$a("ChromeCustomTabsSupported");
                    ah$a = new postToHandler(new values(null));
                } else {
                    setHandler.ag$a("ChromeCustomTabsNotSupported");
                    ah$a = new postToHandler(new toString(null));
                }
            }
            posttohandler = ah$a;
        }
        return posttohandler;
    }

    public boolean ag$a(addContentView addcontentview, String str) throws APayError {
        if (addcontentview.ah$a() != null && values.valueOf(addcontentview.values())) {
            if (!(this.values instanceof values)) {
                this.values = new values(null);
            }
        } else {
            this.values = new toString(null);
        }
        try {
            this.values.values(str, addcontentview);
            setHandler.ag$a("OpenUrlSuccess");
            return this.values instanceof values;
        } catch (APayError e) {
            if (this.values instanceof values) {
                WindowMetricsCalculatorDecorator.toString(e, "Error while opening chrome custom tab, proceeding in device browser.", new Object[0]);
                setHandler.ag$a("ExternalBrowserFallback");
                setHandler.ag$a("ExternalBrowserInvoked");
                try {
                    Context values2 = addcontentview.values();
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.addFlags(268435456);
                    intent.addFlags(1073741824);
                    intent.putExtra("com.android.browser.application_id", values2.getPackageName() + ".amazon.apay");
                    valueOf(intent);
                    values2.startActivity(intent);
                    return false;
                } catch (Exception e2) {
                    WindowMetricsCalculatorDecorator.valueOf(e2, "Unable to launch url on browser: %s", e2.getMessage());
                    throw new APayError(APayError.ErrorType.BROWSING_EXPERIENCE, "ExternalBrowserError", "Unable to launch url on browser.", e2);
                }
            }
            throw e;
        }
    }

    /* loaded from: classes.dex */
    public static class values implements valueOf {
        public /* synthetic */ values(postToHandler$ah$a posttohandler_ah_a) {
        }

        @Override // o.postToHandler.valueOf
        public void values(String str, addContentView addcontentview) throws APayError {
            setHandler.ag$a("CustomTabInvoked");
            try {
                Context values = addcontentview.values();
                androidx.browser.customtabs.CustomTabsIntent ah$a = addcontentview.ah$a();
                ah$a.intent.setPackage("com.android.chrome");
                postToHandler.valueOf(ah$a.intent);
                ah$a.launchUrl(values, Uri.parse(str));
            } catch (Exception e) {
                WindowMetricsCalculatorDecorator.valueOf(e, "Unable to launch url on custom tab: %s", e.getMessage());
                throw new APayError(APayError.ErrorType.BROWSING_EXPERIENCE, "CustomTabError", "Unable to launch url on custom tab.", e);
            } catch (NoSuchMethodError e2) {
                throw new APayError(APayError.ErrorType.BROWSING_EXPERIENCE, "CustomTabNoSuchMethodError", "The current version of chrome custom tabs being used by your application is not compatible with the sdk. Please use version 25+.", e2);
            }
        }

        public static /* synthetic */ boolean valueOf(Context context) {
            Intent intent = new Intent(androidx.browser.customtabs.CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
            intent.setPackage("com.android.chrome");
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
            return queryIntentServices != null && queryIntentServices.size() > 0;
        }
    }

    public static /* synthetic */ void valueOf(Intent intent) {
        Bundle bundle = new Bundle();
        bundle.putString("x-amz-sdk-version", "H.1.0.3");
        bundle.putString("x-amz-sdk-request-id", setHandler.values("operationId"));
        bundle.putString("x-amz-sdk-client-id", setHandler.values("clientId"));
        intent.putExtra("com.android.browser.headers", bundle);
    }
}
