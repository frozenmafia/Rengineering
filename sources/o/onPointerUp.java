package o;

import android.content.Context;
/* loaded from: classes7.dex */
class onPointerUp {
    private String ag$a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public String values(Context context) {
        String str;
        synchronized (this) {
            if (this.ag$a == null) {
                this.ag$a = ag$a(context);
            }
            str = "".equals(this.ag$a) ? null : this.ag$a;
        }
        return str;
    }

    private static String ag$a(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }
}
