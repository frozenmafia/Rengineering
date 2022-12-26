package o;

import java.security.GeneralSecurityException;
/* loaded from: classes7.dex */
public final class onMove {
    public static final String valueOf = new hasSwipeFlag().valueOf();
    public static final String toString = new isItemViewSwipeEnabled().valueOf();
    @Deprecated
    public static final onLayoutCompleted ag$a = onLayoutCompleted.valueOf();
    public static final onLayoutCompleted values = onLayoutCompleted.valueOf();

    static {
        try {
            valueOf();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    @Deprecated
    public static void valueOf() throws GeneralSecurityException {
        ag$a();
    }

    public static void ag$a() throws GeneralSecurityException {
        hasSwipeFlag.toString(true);
        isItemViewSwipeEnabled.valueOf(true);
        DiffUtil.valueOf(new onSelectedChanged());
    }
}
