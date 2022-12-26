package o;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import java.util.Objects;
/* loaded from: classes4.dex */
public final class updateChildAccessibilityAction {
    public static final updateChildAccessibilityAction valueOf = new updateChildAccessibilityAction();
    private static long values;

    private updateChildAccessibilityAction() {
    }

    public static final void ag$a(Context context, String str, String str2) {
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(str, "fileName");
        runAnimators.ag$a(str2, "url");
        Object systemService = context.getSystemService("download");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        values = ((DownloadManager) systemService).enqueue(new DownloadManager.Request(Uri.parse(str2)).setNotificationVisibility(1).setAllowedNetworkTypes(3).setAllowedOverMetered(true).setAllowedOverRoaming(true).setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str).setTitle(str));
    }
}
