package o;

import com.google.android.gms.actions.SearchIntents;
import java.util.List;
import o.RxRoom;
import o.Styleable;
/* loaded from: classes7.dex */
public final class createFrameworkOpenHelper {
    public static final <RowType> RxRoom.AnonymousClass5<RowType> ag$a(int i, List<RxRoom.AnonymousClass5<?>> list, TransactionExecutor transactionExecutor, String str, String str2, String str3, Styleable.ChangeBounds<? super Transaction, ? extends RowType> changeBounds) {
        runAnimators.ag$a(list, "queries");
        runAnimators.ag$a(transactionExecutor, "driver");
        runAnimators.ag$a(str, "fileName");
        runAnimators.ag$a(str2, "label");
        runAnimators.ag$a(str3, SearchIntents.EXTRA_QUERY);
        runAnimators.ag$a(changeBounds, "mapper");
        return new setDatabaseConfiguration(i, list, transactionExecutor, str, str2, str3, changeBounds);
    }
}
