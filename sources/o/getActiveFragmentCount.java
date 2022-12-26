package o;

import java.io.File;
import java.io.FilenameFilter;
/* loaded from: classes4.dex */
public final /* synthetic */ class getActiveFragmentCount implements FilenameFilter {
    public static final /* synthetic */ getActiveFragmentCount toString = new getActiveFragmentCount();

    private /* synthetic */ getActiveFragmentCount() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean ag$a;
        ag$a = findFragmentById.ag$a(file, str);
        return ag$a;
    }
}
