package o;

import android.content.Context;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
/* loaded from: classes5.dex */
public class setUserAuthenticationRequired extends androidx.loader.content.CursorLoader {
    private static long ag$a = 2752736060240544590L;
    private static char[] ah$a = {38139, 22440, 4711, 56585, 39378};
    private static int toString = 0;
    private static int valueOf = 1;
    final String[] values;

    public setUserAuthenticationRequired(Context context, Bundle bundle) {
        super(context);
        Object obj = null;
        this.values = new String[]{"_id", "_data", "bucket_id", "bucket_display_name", "date_added", toString((ViewConfiguration.getScrollBarSize() >> 8) + 5, TextUtils.lastIndexOf("", '0', 0, 0) + 1, (char) (38031 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern()};
        String string = bundle.getString("EXTRA_BUCKET_ID", null);
        int i = bundle.getInt("EXTRA_FILE_TYPE", 1);
        setProjection(null);
        setUri(MediaStore.Files.getContentUri("external"));
        setSortOrder("_id DESC");
        String str = i == 3 ? "media_type=3" : "media_type=1";
        if (string != null) {
            str = str + " AND bucket_id='" + string + "'";
            int i2 = valueOf + 33;
            toString = i2 % 128;
            int i3 = i2 % 2;
        }
        setSelection(str);
        int i4 = toString + 107;
        valueOf = i4 % 128;
        if ((i4 % 2 == 0 ? (char) 15 : (char) 22) != 15) {
            return;
        }
        super.hashCode();
    }

    private static String toString(int i, int i2, char c) {
        String str;
        synchronized (move.valueOf) {
            char[] cArr = new char[i];
            move.values = 0;
            while (move.values < i) {
                cArr[move.values] = (char) ((ah$a[move.values + i2] ^ (move.values * ag$a)) ^ c);
                move.values++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
