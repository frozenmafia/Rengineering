package o;

import android.text.TextUtils;
import android.widget.ExpandableListView;
import com.app.dream11.dream11.DreamApplication;
import com.app.dream11.model.VersionUpdateModel;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class Chain {
    private static int toString = 1;
    private static int values;
    private static long ah$a = 7002524716036592383L;
    public static final Chain ag$a = new Chain();

    static {
        int i = values + 13;
        toString = i % 128;
        if ((i % 2 == 0 ? (char) 17 : ']') != 17) {
            return;
        }
        Object[] objArr = null;
        int length = objArr.length;
    }

    private Chain() {
    }

    public static final boolean ah$a(VersionUpdateModel versionUpdateModel) {
        int i = values + 37;
        toString = i % 128;
        int i2 = i % 2;
        boolean ag$a2 = DreamApplication.valueOf().aj$a().aj$a().ag$a(versionUpdateModel);
        int i3 = toString + 11;
        values = i3 % 128;
        int i4 = i3 % 2;
        return ag$a2;
    }

    public static final boolean toString(VersionUpdateModel versionUpdateModel) {
        try {
            int i = values + 99;
            try {
                toString = i % 128;
                int i2 = i % 2;
                boolean valueOf = DreamApplication.valueOf().aj$a().aj$a().valueOf(versionUpdateModel);
                int i3 = toString + 1;
                values = i3 % 128;
                int i4 = i3 % 2;
                return valueOf;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static final Map<String, Serializable> values(String str, String str2, String str3, String str4, String str5, boolean z) {
        runAnimators.ag$a(str, values(new char[]{7358, 40705, 49566, 11531, 7370, 36247, 58388, 5530, 22311}, TextUtils.getTrimmedLength("") + 1).intern());
        runAnimators.ag$a(str2, "message");
        runAnimators.ag$a(str3, "imageUrl");
        runAnimators.ag$a(str4, "appUrl");
        runAnimators.ag$a(str5, values(new char[]{38210, 45931, 63926, 14805, 38193, 41467, 56381, 346, 57053, 60917}, 1 - ExpandableListView.getPackedPositionGroup(0L)).intern());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(values(new char[]{7358, 40705, 49566, 11531, 7370, 36247, 58388, 5530, 22311}, 1 - ExpandableListView.getPackedPositionType(0L)).intern(), str);
        linkedHashMap.put("message", str2);
        linkedHashMap.put("imageUrl", str3);
        linkedHashMap.put("appUrl", str4);
        linkedHashMap.put(values(new char[]{38210, 45931, 63926, 14805, 38193, 41467, 56381, 346, 57053, 60917}, 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), str5);
        linkedHashMap.put("dismissible", Boolean.valueOf(z));
        int i = values + 115;
        toString = i % 128;
        int i2 = i % 2;
        return linkedHashMap;
    }

    private static String values(char[] cArr, int i) {
        String str;
        synchronized (getWantsAllOnMoveCalls.ag$a) {
            char[] getwantsallonmovecalls = getWantsAllOnMoveCalls.toString(ah$a, cArr, i);
            getWantsAllOnMoveCalls.values = 4;
            while (getWantsAllOnMoveCalls.values < getwantsallonmovecalls.length) {
                getWantsAllOnMoveCalls.toString = getWantsAllOnMoveCalls.values - 4;
                getwantsallonmovecalls[getWantsAllOnMoveCalls.values] = (char) ((getwantsallonmovecalls[getWantsAllOnMoveCalls.values] ^ getwantsallonmovecalls[getWantsAllOnMoveCalls.values % 4]) ^ (getWantsAllOnMoveCalls.toString * ah$a));
                getWantsAllOnMoveCalls.values++;
            }
            str = new String(getwantsallonmovecalls, 4, getwantsallonmovecalls.length - 4);
        }
        return str;
    }
}
