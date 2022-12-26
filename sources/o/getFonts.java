package o;

import java.util.Comparator;
import java.util.List;
/* loaded from: classes3.dex */
public final /* synthetic */ class getFonts implements Comparator {
    public static final /* synthetic */ getFonts ag$a = new getFonts();

    private /* synthetic */ getFonts() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return FontsContractCompat$HaptikSDK$a.valueOf((List) obj, (List) obj2);
    }
}
