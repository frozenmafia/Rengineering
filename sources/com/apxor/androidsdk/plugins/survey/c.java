package com.apxor.androidsdk.plugins.survey;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.apxor.androidsdk.core.datahandler.databases.ApxorBaseSQLiteWrapper;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class c extends ApxorBaseSQLiteWrapper {
    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, String str) {
        super(context, str, null, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        try {
            getWritableDatabase().delete("responses", "uuid=?", new String[]{str});
        } catch (SQLiteException | IllegalStateException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, ContentValues contentValues) {
        synchronized (this) {
            upsertDataToTableInDatabase("responses", contentValues, "uuid=?", new String[]{str});
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE responses(uuid text PRIMARY KEY, response text)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS responses");
        onCreate(sQLiteDatabase);
    }
}
