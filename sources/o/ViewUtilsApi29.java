package o;

import java.nio.charset.Charset;
import org.apache.commons.codec.CharEncoding;
/* loaded from: classes5.dex */
public final class ViewUtilsApi29 {
    public static final Charset HaptikSDK$a;
    private static Charset HaptikSDK$c;
    public static final Charset ag$a;
    public static final Charset ah$a;
    public static final Charset ah$b;
    private static Charset invoke;
    public static final Charset toString;
    public static final ViewUtilsApi29 valueOf = new ViewUtilsApi29();
    public static final Charset values;

    private ViewUtilsApi29() {
    }

    static {
        Charset forName = Charset.forName("UTF-8");
        runAnimators.ah$a(forName, "forName(\"UTF-8\")");
        ah$b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        runAnimators.ah$a(forName2, "forName(\"UTF-16\")");
        ah$a = forName2;
        Charset forName3 = Charset.forName(CharEncoding.UTF_16BE);
        runAnimators.ah$a(forName3, "forName(\"UTF-16BE\")");
        values = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        runAnimators.ah$a(forName4, "forName(\"UTF-16LE\")");
        HaptikSDK$a = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        runAnimators.ah$a(forName5, "forName(\"US-ASCII\")");
        ag$a = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        runAnimators.ah$a(forName6, "forName(\"ISO-8859-1\")");
        toString = forName6;
    }

    public final Charset ah$a() {
        Charset charset = invoke;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32LE");
            runAnimators.ah$a(forName, "forName(\"UTF-32LE\")");
            invoke = forName;
            return forName;
        }
        return charset;
    }

    public final Charset values() {
        Charset charset = HaptikSDK$c;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32BE");
            runAnimators.ah$a(forName, "forName(\"UTF-32BE\")");
            HaptikSDK$c = forName;
            return forName;
        }
        return charset;
    }
}
