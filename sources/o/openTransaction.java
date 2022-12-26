package o;

import android.content.ComponentName;
import android.net.Uri;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes4.dex */
public final class openTransaction extends androidx.browser.customtabs.CustomTabsServiceConnection {
    private static androidx.browser.customtabs.CustomTabsSession ag$a;
    private static androidx.browser.customtabs.CustomTabsClient valueOf;
    public static final toString ah$a = new toString(null);
    private static final ReentrantLock values = new ReentrantLock();

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        runAnimators.ag$a(componentName, "componentName");
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public void onCustomTabsServiceConnected(ComponentName componentName, androidx.browser.customtabs.CustomTabsClient customTabsClient) {
        runAnimators.ag$a(componentName, "name");
        runAnimators.ag$a(customTabsClient, "newClient");
        customTabsClient.warmup(0L);
        toString tostring = ah$a;
        valueOf = customTabsClient;
        tostring.valueOf();
    }

    /* loaded from: classes4.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void valueOf() {
            androidx.browser.customtabs.CustomTabsClient customTabsClient;
            openTransaction.values.lock();
            if (openTransaction.ag$a == null && (customTabsClient = openTransaction.valueOf) != null) {
                toString tostring = openTransaction.ah$a;
                openTransaction.ag$a = customTabsClient.newSession(null);
            }
            openTransaction.values.unlock();
        }

        public final void ah$a(Uri uri) {
            runAnimators.ag$a(uri, "url");
            valueOf();
            openTransaction.values.lock();
            androidx.browser.customtabs.CustomTabsSession customTabsSession = openTransaction.ag$a;
            if (customTabsSession != null) {
                customTabsSession.mayLaunchUrl(uri, null, null);
            }
            openTransaction.values.unlock();
        }

        public final androidx.browser.customtabs.CustomTabsSession ag$a() {
            openTransaction.values.lock();
            androidx.browser.customtabs.CustomTabsSession customTabsSession = openTransaction.ag$a;
            openTransaction.ag$a = null;
            openTransaction.values.unlock();
            return customTabsSession;
        }
    }
}
