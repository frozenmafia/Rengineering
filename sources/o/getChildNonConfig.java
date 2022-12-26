package o;

import java.io.File;
import java.io.FilenameFilter;
import o.findViewFragment;
/* loaded from: classes6.dex */
public final /* synthetic */ class getChildNonConfig implements FilenameFilter {
    public static final /* synthetic */ getChildNonConfig valueOf = new getChildNonConfig();

    private /* synthetic */ getChildNonConfig() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean ah$a;
        ah$a = findViewFragment.valueOf.ah$a(file, str);
        return ah$a;
    }
}
