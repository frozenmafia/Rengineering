package o;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o.FontsContractCompat;
/* loaded from: classes3.dex */
public final /* synthetic */ class getStatusCode implements Comparator {
    public static final /* synthetic */ getStatusCode toString = new getStatusCode();

    private /* synthetic */ getStatusCode() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compareTo;
        compareTo = ((FontsContractCompat.values) Collections.max((List) obj)).compareTo((FontsContractCompat.values) Collections.max((List) obj2));
        return compareTo;
    }
}
