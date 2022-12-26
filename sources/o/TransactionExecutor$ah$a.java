package o;

import o.Styleable;
/* loaded from: classes7.dex */
public final class TransactionExecutor$ah$a {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Transaction ag$a(TransactionExecutor transactionExecutor, Integer num, String str, int i, Styleable.ChangeBounds changeBounds, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 8) != 0) {
                changeBounds = null;
            }
            return transactionExecutor.toString(num, str, i, changeBounds);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeQuery");
    }
}
