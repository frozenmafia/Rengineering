package o;

import android.content.Context;
import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class isAdjustable {
    private final Context valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public isAdjustable(Context context) {
        this.valueOf = context;
    }

    private static long toString(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j += toString(file2);
            }
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long valueOf() {
        return toString(new File(this.valueOf.getFilesDir(), "assetpacks"));
    }
}
