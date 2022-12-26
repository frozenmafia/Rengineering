package androidx.room.migration;

import androidx.sqlite.db.SupportSQLiteDatabase;
/* loaded from: classes6.dex */
public interface AutoMigrationCallback {

    /* renamed from: androidx.room.migration.AutoMigrationCallback$-CC  reason: invalid class name */
    /* loaded from: classes6.dex */
    public final /* synthetic */ class CC {
        public static void $default$onPostMigrate(AutoMigrationCallback autoMigrationCallback, SupportSQLiteDatabase supportSQLiteDatabase) {
        }
    }

    void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase);
}
