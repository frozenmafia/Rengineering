package o;

import android.text.TextUtils;
import java.util.HashMap;
/* renamed from: o.lambda$endTransaction$1$androidx-room-RoomDatabase  reason: invalid class name */
/* loaded from: classes5.dex */
public class lambda$endTransaction$1$androidxroomRoomDatabase {
    private HashMap<String, String> toString;

    public lambda$endTransaction$1$androidxroomRoomDatabase(String str, String str2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Invalid orderId");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Invalid mid");
        }
        if (TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Invalid txnToken");
        }
        if (TextUtils.isEmpty(str5)) {
            throw new IllegalArgumentException("Invalid callbackurl");
        }
        HashMap<String, String> hashMap = new HashMap<>();
        this.toString = hashMap;
        hashMap.put("ORDER_ID", str);
        this.toString.put("TXN_AMOUNT", str4);
        this.toString.put("MID", str2);
        this.toString.put("TXN_TOKEN", str3);
        this.toString.put("CALLBACK_URL", str5);
    }

    public HashMap<String, String> ag$a() {
        return this.toString;
    }
}
