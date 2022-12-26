package org.apache.http.impl.conn;

import android.view.ViewConfiguration;
import androidx.databinding.library.baseAdapters.BR;
import o.isBeforeFirst;
import org.apache.http.HttpHost;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.conn.UnsupportedSchemeException;
import org.apache.http.util.Args;
/* loaded from: classes5.dex */
public class DefaultSchemePortResolver implements SchemePortResolver {
    private static int ag$a = 1;
    private static int valueOf;
    private static long values = -7247908952536088817L;
    public static final DefaultSchemePortResolver INSTANCE = new DefaultSchemePortResolver();

    static {
        int i = ag$a + 41;
        valueOf = i % 128;
        if (i % 2 != 0) {
            int i2 = 10 / 0;
        }
    }

    @Override // org.apache.http.conn.SchemePortResolver
    public int resolve(HttpHost httpHost) throws UnsupportedSchemeException {
        Args.notNull(httpHost, "HTTP host");
        int port = httpHost.getPort();
        if (port <= 0) {
            String schemeName = httpHost.getSchemeName();
            if (schemeName.equalsIgnoreCase(HttpHost.DEFAULT_SCHEME_NAME)) {
                return 80;
            }
            if ((schemeName.equalsIgnoreCase(toString(new char[]{32615, 27342, 21521, 15968, 10664}, 5557 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern()) ? '.' : (char) 16) != '.') {
                throw new UnsupportedSchemeException(schemeName + " protocol is not supported");
            }
            int i = ag$a + 109;
            valueOf = i % 128;
            if ((i % 2 != 0 ? (char) 25 : '9') != '9') {
                return 22259;
            }
            return BR.sortFilterHandler;
        }
        int i2 = valueOf + 67;
        ag$a = i2 % 128;
        int i3 = i2 % 2;
        return port;
    }

    private static String toString(char[] cArr, int i) {
        String str;
        synchronized (isBeforeFirst.toString) {
            isBeforeFirst.ah$a = i;
            char[] cArr2 = new char[cArr.length];
            isBeforeFirst.valueOf = 0;
            while (isBeforeFirst.valueOf < cArr.length) {
                cArr2[isBeforeFirst.valueOf] = (char) ((cArr[isBeforeFirst.valueOf] ^ (isBeforeFirst.valueOf * isBeforeFirst.ah$a)) ^ values);
                isBeforeFirst.valueOf++;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
