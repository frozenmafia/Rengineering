package o;

import java.util.Comparator;
import o.writeText;
/* loaded from: classes3.dex */
public final /* synthetic */ class LogWriter implements Comparator {
    public static final /* synthetic */ LogWriter ag$a = new LogWriter();

    private /* synthetic */ LogWriter() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare;
        compare = Integer.compare(((writeText.Cdefault.values) obj2).ah$a, ((writeText.Cdefault.values) obj).ah$a);
        return compare;
    }
}
