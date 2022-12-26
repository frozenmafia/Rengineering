package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import defpackage.ah;
import o.MediaControllerCompat;
import o.ah$b;
import o.extraCallback;
import o.extraCallbackWithResult;
import o.putEncryptedObject;
/* renamed from: an  reason: default package */
/* loaded from: classes.dex */
public final class an extends extraCallback<ah> {
    private static final String[] ah$a = ah.toString;
    private static final String toString = "an";
    private static an valueOf;

    private an(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    public static an valueOf(Context context) {
        an anVar;
        synchronized (an.class) {
            if (valueOf == null) {
                valueOf = new an(MediaControllerCompat.Callback.StubCompat.values(context));
            }
            anVar = valueOf;
        }
        return anVar;
    }

    @Override // o.extraCallback
    public String HaptikSDK$b() {
        return "AuthorizationToken";
    }

    public ah ag$a(long j) {
        return toString(j);
    }

    @Override // o.extraCallback
    public String[] ah$a() {
        return ah$a;
    }

    @Override // o.extraCallback
    /* renamed from: valueOf */
    public ah ah$a(Cursor cursor) {
        if (cursor == null || cursor.getCount() == 0) {
            return null;
        }
        try {
            ah valueOf2 = ah$b.valueOf(ah.a.values()[cursor.getInt(values(cursor, ah.b.TYPE.f5a))]);
            valueOf2.valueOf(cursor.getLong(values(cursor, ah.b.ID.f5a)));
            valueOf2.values(cursor.getString(values(cursor, ah.b.APP_FAMILY_ID.f5a)));
            valueOf2.ag$a(cursor.getString(values(cursor, ah.b.TOKEN.f5a)));
            valueOf2.toString(extraCallbackWithResult.valueOf(cursor.getString(values(cursor, ah.b.CREATION_TIME.f5a))));
            valueOf2.valueOf(extraCallbackWithResult.valueOf(cursor.getString(values(cursor, ah.b.EXPIRATION_TIME.f5a))));
            valueOf2.valueOf(cursor.getBlob(values(cursor, ah.b.MISC_DATA.f5a)));
            valueOf2.toString(cursor.getString(values(cursor, ah.b.DIRECTED_ID.f5a)));
            return valueOf2;
        } catch (Exception e) {
            String str = toString;
            putEncryptedObject.values(str, "" + e.getMessage(), e);
            return null;
        }
    }

    @Override // o.extraCallback
    public String values() {
        return toString;
    }
}
