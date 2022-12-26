package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteDatabase;
/* loaded from: classes.dex */
public final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda5 implements Function {
    public static final /* synthetic */ AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda5 INSTANCE = new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda5();

    private /* synthetic */ AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda5() {
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        return ((SupportSQLiteDatabase) obj).getAttachedDbs();
    }
}
