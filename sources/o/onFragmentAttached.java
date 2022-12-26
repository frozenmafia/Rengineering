package o;

import o.Visibility;
import org.apache.http.message.TokenParser;
/* loaded from: classes4.dex */
public final class onFragmentAttached {
    public static final onFragmentAttached values = new onFragmentAttached();

    private onFragmentAttached() {
    }

    public static final boolean toString(String str) {
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            return false;
        }
        return true ^ (Visibility.Mode.ah$a((CharSequence) str2, (char) TokenParser.SP, 0, false, 6, (Object) null) >= 0);
    }
}
