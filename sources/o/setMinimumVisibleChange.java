package o;

import com.dreampay.commons.cards.SavedCardDetails;
/* loaded from: classes4.dex */
public final /* synthetic */ class setMinimumVisibleChange implements FrameworkSQLiteOpenHelper {
    public static final /* synthetic */ setMinimumVisibleChange ag$a = new setMinimumVisibleChange();

    private /* synthetic */ setMinimumVisibleChange() {
    }

    @Override // o.FrameworkSQLiteOpenHelper
    public final Object apply(Object obj, Object obj2) {
        kotlin.Pair values;
        values = setStartValue.values((SavedCardDetails) obj, (Boolean) obj2);
        return values;
    }
}
