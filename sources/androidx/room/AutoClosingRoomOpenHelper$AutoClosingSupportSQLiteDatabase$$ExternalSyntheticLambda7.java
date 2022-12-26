package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.db.SupportSQLiteDatabase;
/* loaded from: classes6.dex */
public final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda7 implements Function {
    public static final /* synthetic */ AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda7 INSTANCE = new AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda7();

    private /* synthetic */ AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda7() {
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        return Integer.valueOf(((SupportSQLiteDatabase) obj).getVersion());
    }
}
