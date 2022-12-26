package o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.react.bridge.ReadableArray;
import com.sendbird.android.constant.StringSet;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class FragmentTransaction {

    /* loaded from: classes4.dex */
    public class Op {
        private ImagePipelineConfig toString;

        public ImagePipelineConfig values() {
            return this.toString;
        }
    }

    public static String values(int i) {
        String[] strArr = new String[i];
        Arrays.fill(strArr, "?");
        return "key IN (" + TextUtils.join(", ", strArr) + ")";
    }

    public static String[] ag$a(ReadableArray readableArray, int i, int i2) {
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = readableArray.getString(i + i3);
        }
        return strArr;
    }

    public static String valueOf(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query("catalystLocalStorage", new String[]{"value"}, "key=?", new String[]{str}, null, null, null);
        try {
            if (query.moveToFirst()) {
                return query.getString(0);
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    static boolean values(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(StringSet.key, str);
        contentValues.put("value", str2);
        return -1 != sQLiteDatabase.insertWithOnConflict("catalystLocalStorage", null, contentValues, 5);
    }

    public static boolean ah$a(SQLiteDatabase sQLiteDatabase, String str, String str2) throws JSONException {
        String valueOf = valueOf(sQLiteDatabase, str);
        if (valueOf != null) {
            JSONObject jSONObject = new JSONObject(valueOf);
            toString(jSONObject, new JSONObject(str2));
            str2 = jSONObject.toString();
        }
        return values(sQLiteDatabase, str, str2);
    }

    private static void toString(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject = jSONObject2.optJSONObject(next);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(next);
            if (optJSONObject != null && optJSONObject2 != null) {
                toString(optJSONObject2, optJSONObject);
                jSONObject.put(next, optJSONObject2);
            } else {
                jSONObject.put(next, jSONObject2.get(next));
            }
        }
    }
}
