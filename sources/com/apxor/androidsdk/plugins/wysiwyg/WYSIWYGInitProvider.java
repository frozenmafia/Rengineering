package com.apxor.androidsdk.plugins.wysiwyg;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class WYSIWYGInitProvider extends ContentProvider {
    private a a;

    /* renamed from: b  reason: collision with root package name */
    private UriMatcher f402b;
    private String c;

    /* loaded from: classes6.dex */
    class a extends SQLiteOpenHelper {
        a(WYSIWYGInitProvider wYSIWYGInitProvider, Context context) {
            super(context, "ApxorApps", (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS APXORAPPS(a_id text, data BLOB);");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS APXORAPPS");
            onCreate(sQLiteDatabase);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        UriMatcher uriMatcher;
        if (this.a == null || (uriMatcher = this.f402b) == null || contentValues == null || uriMatcher.match(uri) != 1) {
            return null;
        }
        try {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app", contentValues.getAsString("app"));
            jSONObject.put("d_id", contentValues.getAsString("d_id"));
            jSONObject.put("p_value", contentValues.getAsString("p_value"));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            gZIPOutputStream.close();
            String asString = contentValues.getAsString("a_id");
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("a_id", asString);
            contentValues2.put("data", byteArrayOutputStream.toByteArray());
            if (writableDatabase.update("ApxorApps", contentValues2, "a_id=?", new String[]{asString}) == 0) {
                writableDatabase.insert("ApxorApps", null, contentValues2);
            }
        } catch (SQLiteException | IOException | IllegalArgumentException | JSONException unused) {
        }
        return Uri.parse("content://" + this.c + "/ApxorApps");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        try {
            this.c = getContext().getPackageName() + ".apxorsdk";
            UriMatcher uriMatcher = new UriMatcher(-1);
            this.f402b = uriMatcher;
            uriMatcher.addURI(this.c, "ApxorApps", 1);
            this.a = new a(this, getContext());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        UriMatcher uriMatcher;
        if (this.a == null || (uriMatcher = this.f402b) == null || uriMatcher.match(uri) != 1) {
            return null;
        }
        try {
            return this.a.getReadableDatabase().query("ApxorApps", strArr, str, strArr2, null, null, str2);
        } catch (SQLiteException | IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
