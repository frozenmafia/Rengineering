package o;

import java.io.File;
import java.io.FilenameFilter;
/* loaded from: classes4.dex */
public final /* synthetic */ class checkForMenus implements FilenameFilter {
    public static final /* synthetic */ checkForMenus values = new checkForMenus();

    private /* synthetic */ checkForMenus() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return addRetainedFragment.toString(file, str);
    }
}
