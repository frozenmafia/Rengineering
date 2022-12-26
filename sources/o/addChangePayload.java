package o;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;
/* loaded from: classes7.dex */
final class addChangePayload {
    private static final Pattern valueOf = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    private final String ag$a;
    private final String ah$a;
    private final String toString;

    private addChangePayload(String str, String str2) {
        this.ag$a = values(str2, str);
        this.ah$a = str;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("!");
        sb.append(str2);
        this.toString = sb.toString();
    }

    private static String values(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !valueOf.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static addChangePayload values(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new addChangePayload(split[0], split[1]);
    }

    public final String ag$a() {
        return this.ag$a;
    }

    public final String ah$a() {
        return this.ah$a;
    }

    public final String valueOf() {
        return this.toString;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof addChangePayload) {
            addChangePayload addchangepayload = (addChangePayload) obj;
            return this.ag$a.equals(addchangepayload.ag$a) && this.ah$a.equals(addchangepayload.ah$a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.ah$a, this.ag$a);
    }
}
