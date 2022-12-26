package o;

import com.sendbird.android.constant.StringSet;
/* loaded from: classes3.dex */
final class setAutofillHints {
    private final StringBuilder ah$a = new StringBuilder();

    public final void values(String str, Object obj) {
        runAnimators.valueOf(str, StringSet.key);
        runAnimators.valueOf(obj, "value");
        StringBuilder sb = this.ah$a;
        sb.append(str + '=' + obj);
        this.ah$a.append("\n");
    }

    public String toString() {
        String sb = this.ah$a.toString();
        runAnimators.toString(sb, "sb.toString()");
        return sb;
    }
}
