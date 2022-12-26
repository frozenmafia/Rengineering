package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class isItemChanged {
    private final SharedPreferences toString;

    public isItemChanged(Context context, String str) {
        this.toString = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a() {
        synchronized (this) {
            SharedPreferences.Editor edit = this.toString.edit();
            for (Map.Entry<String, ?> entry : this.toString.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    edit.remove(entry.getKey());
                }
            }
            edit.remove("fire-count");
            edit.commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<isItemRemoved> valueOf() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.toString.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    arrayList.add(isItemRemoved.ag$a(entry.getKey(), new ArrayList((Set) entry.getValue())));
                }
            }
            ah$a(System.currentTimeMillis());
        }
        return arrayList;
    }

    private String ag$a(String str) {
        synchronized (this) {
            for (Map.Entry<String, ?> entry : this.toString.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str.equals(str2)) {
                            return entry.getKey();
                        }
                    }
                    continue;
                }
            }
            return null;
        }
    }

    private void ah$a(String str) {
        synchronized (this) {
            String ag$a = ag$a(str);
            if (ag$a == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.toString.getStringSet(ag$a, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.toString.edit().remove(ag$a).commit();
            } else {
                this.toString.edit().putStringSet(ag$a, hashSet).commit();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a() {
        synchronized (this) {
            String isitemchanged = toString(System.currentTimeMillis());
            this.toString.edit().putString("last-used-date", isitemchanged).commit();
            ah$a(isitemchanged);
        }
    }

    private String toString(long j) {
        synchronized (this) {
            if (Build.VERSION.SDK_INT >= 26) {
                return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
            }
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void toString(long j, String str) {
        synchronized (this) {
            String isitemchanged = toString(j);
            if (this.toString.getString("last-used-date", "").equals(isitemchanged)) {
                return;
            }
            long j2 = this.toString.getLong("fire-count", 0L);
            if (j2 + 1 == 30) {
                values();
                j2 = this.toString.getLong("fire-count", 0L);
            }
            HashSet hashSet = new HashSet(this.toString.getStringSet(str, new HashSet()));
            hashSet.add(isitemchanged);
            this.toString.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", isitemchanged).commit();
        }
    }

    private void values() {
        synchronized (this) {
            long j = this.toString.getLong("fire-count", 0L);
            String str = null;
            String str2 = "";
            for (Map.Entry<String, ?> entry : this.toString.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str3) > 0) {
                            str2 = entry.getKey();
                            str = str3;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(this.toString.getStringSet(str2, new HashSet()));
            hashSet.remove(str);
            this.toString.edit().putStringSet(str2, hashSet).putLong("fire-count", j - 1).commit();
        }
    }

    void ah$a(long j) {
        synchronized (this) {
            this.toString.edit().putLong("fire-global", j).commit();
        }
    }

    boolean toString(long j, long j2) {
        boolean equals;
        synchronized (this) {
            equals = toString(j).equals(toString(j2));
        }
        return equals;
    }

    boolean toString(String str, long j) {
        synchronized (this) {
            if (this.toString.contains(str)) {
                if (toString(this.toString.getLong(str, -1L), j)) {
                    return false;
                }
                this.toString.edit().putLong(str, j).commit();
                return true;
            }
            this.toString.edit().putLong(str, j).commit();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean values(long j) {
        boolean isitemchanged;
        synchronized (this) {
            isitemchanged = toString("fire-global", j);
        }
        return isitemchanged;
    }
}
