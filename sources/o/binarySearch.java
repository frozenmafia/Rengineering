package o;

import com.app.dream11.model.QuickCheckResponse;
import java.util.List;
/* loaded from: classes3.dex */
public final /* synthetic */ class binarySearch implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ binarySearch ag$a = new binarySearch();

    private /* synthetic */ binarySearch() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        List valueOf;
        valueOf = removeFromEnd.valueOf((QuickCheckResponse) obj);
        return valueOf;
    }
}
