package o;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/* loaded from: classes7.dex */
public final class dispatchSetPressed {
    public static final String ah$a;
    public static final String values;
    private PrintHelper valueOf;

    static {
        String ag$a = ag$a();
        values = ag$a;
        ah$a = "Google-HTTP-Java-Client/" + ag$a + " (gzip)";
    }

    public PrintHelper valueOf() {
        return this.valueOf;
    }

    private static String ag$a() {
        String str = "unknown-version";
        try {
            InputStream resourceAsStream = dispatchSetPressed.class.getResourceAsStream("/google-http-client.properties");
            if (resourceAsStream != null) {
                Properties properties = new Properties();
                properties.load(resourceAsStream);
                str = properties.getProperty("google-http-client.version");
            }
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
        } catch (IOException unused) {
        }
        return str;
    }
}
