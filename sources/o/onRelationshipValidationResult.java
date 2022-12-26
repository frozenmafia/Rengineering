package o;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import defpackage.ak;
import java.util.List;
import o.MediaControllerCompat;
/* loaded from: classes.dex */
public final class onRelationshipValidationResult extends extraCallback<defpackage.ak> {
    private static final String ah$a = "aq";
    private static onRelationshipValidationResult toString;
    private static final String[] valueOf = defpackage.ak.toString;

    private onRelationshipValidationResult(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    public static onRelationshipValidationResult valueOf(Context context) {
        onRelationshipValidationResult onrelationshipvalidationresult;
        synchronized (onRelationshipValidationResult.class) {
            if (toString == null) {
                toString = new onRelationshipValidationResult(MediaControllerCompat.Callback.StubCompat.values(context));
            }
            onrelationshipvalidationresult = toString;
        }
        return onrelationshipvalidationresult;
    }

    @Override // o.extraCallback
    public String HaptikSDK$b() {
        return "RequestedScope";
    }

    public defpackage.ak ah$a(String str, String str2, String str3) {
        String[] strArr = valueOf;
        return toString(new String[]{strArr[ak.a.SCOPE.f9a], strArr[ak.a.APP_FAMILY_ID.f9a], strArr[ak.a.DIRECTED_ID.f9a]}, new String[]{str, str2, str3});
    }

    public List<defpackage.ak> ah$a(String str) {
        return toString(valueOf[ak.a.APP_FAMILY_ID.f9a], str);
    }

    @Override // o.extraCallback
    public String[] ah$a() {
        return valueOf;
    }

    @Override // o.extraCallback
    /* renamed from: valueOf */
    public defpackage.ak ah$a(Cursor cursor) {
        if (cursor == null || cursor.getCount() == 0) {
            return null;
        }
        try {
            defpackage.ak akVar = new defpackage.ak();
            akVar.ag$a(cursor.getLong(values(cursor, ak.a.ROW_ID.f9a)));
            akVar.valueOf(cursor.getString(values(cursor, ak.a.SCOPE.f9a)));
            akVar.ah$a(cursor.getString(values(cursor, ak.a.APP_FAMILY_ID.f9a)));
            akVar.values(cursor.getString(values(cursor, ak.a.DIRECTED_ID.f9a)));
            akVar.toString(cursor.getLong(values(cursor, ak.a.AUTHORIZATION_ACCESS_TOKEN_ID.f9a)));
            akVar.values(cursor.getLong(values(cursor, ak.a.AUTHORIZATION_REFRESH_TOKEN_ID.f9a)));
            return akVar;
        } catch (Exception e) {
            String str = ah$a;
            putEncryptedObject.values(str, "" + e.getMessage(), e);
            return null;
        }
    }

    @Override // o.extraCallback
    public String values() {
        return ah$a;
    }
}
