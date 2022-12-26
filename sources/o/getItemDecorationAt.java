package o;

import java.io.File;
import java.util.Comparator;
/* loaded from: classes5.dex */
public final /* synthetic */ class getItemDecorationAt implements Comparator {
    public static final /* synthetic */ getItemDecorationAt values = new getItemDecorationAt();

    private /* synthetic */ getItemDecorationAt() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int ag$a;
        ag$a = getItemDecorInsetsForChild.ag$a((File) obj, (File) obj2);
        return ag$a;
    }
}
