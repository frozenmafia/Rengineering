package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteDatabase;
/* loaded from: classes6.dex */
public final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda9 implements Function {
    public static final /* synthetic */ AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda9 INSTANCE = new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda9();

    private /* synthetic */ AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda9() {
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SupportSQLiteDatabase) obj).isDatabaseIntegrityOk());
    }
}
