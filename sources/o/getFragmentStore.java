package o;

import java.io.File;
import java.io.FilenameFilter;
/* loaded from: classes4.dex */
public final /* synthetic */ class getFragmentStore implements FilenameFilter {
    public static final /* synthetic */ getFragmentStore valueOf = new getFragmentStore();

    private /* synthetic */ getFragmentStore() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean values;
        values = findFragmentById.values(file, str);
        return values;
    }
}
