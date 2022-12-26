package o;

import com.google.firebase.database.DatabaseException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes5.dex */
public class offsetPositionRecordsForInsert {
    private static final Map<Integer, String> ag$a;
    private static final Map<String, Integer> valueOf;
    private final int ah$a;
    private final String toString;
    private final String values;

    static {
        HashMap hashMap = new HashMap();
        ag$a = hashMap;
        hashMap.put(-1, "The transaction needs to be run again with current data");
        hashMap.put(-2, "The server indicated that this operation failed");
        hashMap.put(-3, "This client does not have permission to perform this operation");
        hashMap.put(-4, "The operation had to be aborted due to a network disconnect");
        hashMap.put(-6, "The supplied auth token has expired");
        hashMap.put(-7, "The supplied auth token was invalid");
        hashMap.put(-8, "The transaction had too many retries");
        hashMap.put(-9, "The transaction was overridden by a subsequent set");
        hashMap.put(-10, "The service is unavailable");
        hashMap.put(-11, "User code called from the Firebase Database runloop threw an exception:\n");
        hashMap.put(-24, "The operation could not be performed due to a network error");
        hashMap.put(-25, "The write was canceled by the user.");
        hashMap.put(-999, "An unknown error occurred");
        HashMap hashMap2 = new HashMap();
        valueOf = hashMap2;
        hashMap2.put("datastale", -1);
        hashMap2.put("failure", -2);
        hashMap2.put("permission_denied", -3);
        hashMap2.put("disconnected", -4);
        hashMap2.put("expired_token", -6);
        hashMap2.put("invalid_token", -7);
        hashMap2.put("maxretries", -8);
        hashMap2.put("overriddenbyset", -9);
        hashMap2.put("unavailable", -10);
        hashMap2.put("network_error", -24);
        hashMap2.put("write_canceled", -25);
    }

    public static offsetPositionRecordsForInsert values(String str) {
        return values(str, null, null);
    }

    public static offsetPositionRecordsForInsert toString(int i) {
        Map<Integer, String> map = ag$a;
        if (!map.containsKey(Integer.valueOf(i))) {
            throw new IllegalArgumentException("Invalid Firebase Database error code: " + i);
        }
        return new offsetPositionRecordsForInsert(i, map.get(Integer.valueOf(i)), null);
    }

    public static offsetPositionRecordsForInsert values(String str, String str2, String str3) {
        Integer num = valueOf.get(str.toLowerCase(Locale.US));
        if (num == null) {
            num = -999;
        }
        if (str2 == null) {
            str2 = ag$a.get(num);
        }
        return new offsetPositionRecordsForInsert(num.intValue(), str2, str3);
    }

    public static offsetPositionRecordsForInsert ah$a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return new offsetPositionRecordsForInsert(-11, ag$a.get(-11) + stringWriter.toString());
    }

    private offsetPositionRecordsForInsert(int i, String str) {
        this(i, str, null);
    }

    private offsetPositionRecordsForInsert(int i, String str, String str2) {
        this.ah$a = i;
        this.values = str;
        this.toString = str2 == null ? "" : str2;
    }

    public int ag$a() {
        return this.ah$a;
    }

    public String toString() {
        return "DatabaseError: " + this.values;
    }

    public DatabaseException ah$a() {
        return new DatabaseException("Firebase Database error: " + this.values);
    }
}
