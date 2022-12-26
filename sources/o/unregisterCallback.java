package o;

import android.content.Context;
/* loaded from: classes.dex */
public final class unregisterCallback {
    private static final previous valueOf = new previous();

    public static void ag$a(Context context) throws RuntimeException {
        previous previousVar = valueOf;
        ag$a(previousVar.ah$a(context), previousVar.ag$a(context));
    }

    static void ag$a(boolean z, boolean z2) {
        if (z && z2) {
            throw new RuntimeException("Both AuthorizationActivity and WorkflowActivity are declared in your AndroidManifest.xml. This will cause your users to have to pick from the Android activity chooser when they are redirected back from the browser, and the SDK may not behave as expected. Please remove the deprecated AuthorizationActivity from the manifest.");
        }
        if (!z && !z2) {
            throw new RuntimeException("WorkflowActivity is not declared in your app's AndroidManifest.xml Enable manifest merging or refer to the integration guide to manually add WorkflowActivity to your manifest.");
        }
    }
}
