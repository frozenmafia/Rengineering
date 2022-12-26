package o;

import java.io.File;
import java.util.Comparator;
/* loaded from: classes5.dex */
public final /* synthetic */ class getPreserveFocusAfterLayout implements Comparator {
    public static final /* synthetic */ getPreserveFocusAfterLayout values = new getPreserveFocusAfterLayout();

    private /* synthetic */ getPreserveFocusAfterLayout() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compareTo;
        compareTo = ((File) obj2).getName().compareTo(((File) obj).getName());
        return compareTo;
    }
}
