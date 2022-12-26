package o;

import android.util.Base64;
import com.google.android.datatransport.Priority;
import o.getDialogTitle;
/* loaded from: classes7.dex */
public abstract class findPreference {

    /* loaded from: classes7.dex */
    public static abstract class toString {
        public abstract toString ag$a(Priority priority);

        public abstract toString toString(byte[] bArr);

        public abstract toString values(String str);

        public abstract findPreference values();
    }

    public abstract byte[] ag$a();

    public abstract String ah$a();

    public abstract Priority values();

    public boolean ah$b() {
        return ag$a() != null;
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = ah$a();
        objArr[1] = values();
        objArr[2] = ag$a() == null ? "" : Base64.encodeToString(ag$a(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }

    public static toString valueOf() {
        return new getDialogTitle.valueOf().ag$a(Priority.DEFAULT);
    }

    public findPreference toString(Priority priority) {
        return valueOf().values(ah$a()).ag$a(priority).toString(ag$a()).values();
    }
}
