package o;

import com.swmansion.gesturehandler.GestureHandler;
import java.util.Comparator;
/* loaded from: classes5.dex */
public final /* synthetic */ class loadRange implements Comparator {
    public static final /* synthetic */ loadRange toString = new loadRange();

    private /* synthetic */ loadRange() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int values;
        values = loadInitial.values((GestureHandler) obj, (GestureHandler) obj2);
        return values;
    }
}
