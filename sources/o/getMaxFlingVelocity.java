package o;

import java.io.File;
import java.io.FilenameFilter;
/* loaded from: classes5.dex */
public final /* synthetic */ class getMaxFlingVelocity implements FilenameFilter {
    public static final /* synthetic */ getMaxFlingVelocity values = new getMaxFlingVelocity();

    private /* synthetic */ getMaxFlingVelocity() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean startsWith;
        startsWith = str.startsWith(androidx.core.app.NotificationCompat.CATEGORY_EVENT);
        return startsWith;
    }
}
