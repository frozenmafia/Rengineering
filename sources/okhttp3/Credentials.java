package okhttp3;

import androidx.autofill.HintConstants;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import o.runAnimators;
import okio.ByteString;
/* loaded from: classes5.dex */
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    public static final String basic(String str, String str2) {
        return basic$default(str, str2, null, 4, null);
    }

    private Credentials() {
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i, Object obj) {
        if ((i & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            runAnimators.ah$a(charset, "ISO_8859_1");
        }
        return basic(str, str2, charset);
    }

    public static final String basic(String str, String str2, Charset charset) {
        runAnimators.ag$a(str, HintConstants.AUTOFILL_HINT_USERNAME);
        runAnimators.ag$a(str2, HintConstants.AUTOFILL_HINT_PASSWORD);
        runAnimators.ag$a(charset, "charset");
        String base64 = ByteString.Companion.valueOf(str + ':' + str2, charset).base64();
        return "Basic " + base64;
    }
}
