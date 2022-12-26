package o;

import java.io.File;
import java.io.FilenameFilter;
/* loaded from: classes4.dex */
public final /* synthetic */ class invalidateMenuForFragment implements FilenameFilter {
    public static final /* synthetic */ invalidateMenuForFragment values = new invalidateMenuForFragment();

    private /* synthetic */ invalidateMenuForFragment() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean ag$a;
        ag$a = isParentMenuVisible.ag$a(file, str);
        return ag$a;
    }
}
