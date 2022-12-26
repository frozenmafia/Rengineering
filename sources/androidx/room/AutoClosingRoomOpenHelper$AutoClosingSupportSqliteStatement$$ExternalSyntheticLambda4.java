package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteStatement;
/* loaded from: classes6.dex */
public final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda4 implements Function {
    public static final /* synthetic */ AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda4 INSTANCE = new AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda4();

    private /* synthetic */ AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$$ExternalSyntheticLambda4() {
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        return Long.valueOf(((SupportSQLiteStatement) obj).executeInsert());
    }
}
