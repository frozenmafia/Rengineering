package o;

import java.io.File;
import java.io.FilenameFilter;
import o.findViewFragment;
/* loaded from: classes6.dex */
public final /* synthetic */ class generateOpsForPendingActions implements FilenameFilter {
    public static final /* synthetic */ generateOpsForPendingActions toString = new generateOpsForPendingActions();

    private /* synthetic */ generateOpsForPendingActions() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean ag$a;
        ag$a = findViewFragment.valueOf.ag$a(file, str);
        return ag$a;
    }
}
