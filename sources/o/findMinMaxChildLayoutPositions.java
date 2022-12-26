package o;

import java.io.File;
import java.io.FilenameFilter;
/* loaded from: classes5.dex */
public final /* synthetic */ class findMinMaxChildLayoutPositions implements FilenameFilter {
    public static final /* synthetic */ findMinMaxChildLayoutPositions ag$a = new findMinMaxChildLayoutPositions();

    private /* synthetic */ findMinMaxChildLayoutPositions() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean startsWith;
        startsWith = str.startsWith(".ae");
        return startsWith;
    }
}
