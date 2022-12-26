package o;

import java.io.File;
import java.io.FilenameFilter;
/* loaded from: classes4.dex */
public final /* synthetic */ class getFragment implements FilenameFilter {
    public static final /* synthetic */ getFragment valueOf = new getFragment();

    private /* synthetic */ getFragment() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean invoke;
        invoke = findFragmentById.invoke(file, str);
        return invoke;
    }
}
