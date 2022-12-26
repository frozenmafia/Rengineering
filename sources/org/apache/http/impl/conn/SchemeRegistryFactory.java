package org.apache.http.impl.conn;

import android.graphics.ImageFormat;
import android.view.View;
import androidx.databinding.library.baseAdapters.BR;
import o.getDouble;
import org.apache.http.HttpHost;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
@Deprecated
/* loaded from: classes5.dex */
public final class SchemeRegistryFactory {
    private static int[] ag$a = {395755881, -1717527456, -2081568876, 1131771698, 671546434, 2051563499, 1702708110, -565117720, -1289394038, 222211446, -390656799, -65851547, -374707749, -1837730795, 628053733, 665701685, 2108494225, -813954391};
    private static int ah$a = 0;
    private static int valueOf = 1;

    public static SchemeRegistry createDefault() {
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme(HttpHost.DEFAULT_SCHEME_NAME, 80, PlainSocketFactory.getSocketFactory()));
        schemeRegistry.register(new Scheme(ag$a(new int[]{648816928, 1513869322, 1853640272, 743797983}, 4 - ImageFormat.getBitsPerPixel(0)).intern(), (int) BR.sortFilterHandler, SSLSocketFactory.getSocketFactory()));
        int i = ah$a + 63;
        valueOf = i % 128;
        int i2 = i % 2;
        return schemeRegistry;
    }

    public static SchemeRegistry createSystemDefault() {
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme(HttpHost.DEFAULT_SCHEME_NAME, 80, PlainSocketFactory.getSocketFactory()));
        schemeRegistry.register(new Scheme(ag$a(new int[]{648816928, 1513869322, 1853640272, 743797983}, 5 - View.combineMeasuredStates(0, 0)).intern(), (int) BR.sortFilterHandler, SSLSocketFactory.getSystemSocketFactory()));
        int i = ah$a + 61;
        valueOf = i % 128;
        if ((i % 2 == 0 ? (char) 29 : (char) 15) != 29) {
            return schemeRegistry;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return schemeRegistry;
    }

    private static String ag$a(int[] iArr, int i) {
        String str;
        synchronized (getDouble.ag$a) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) ag$a.clone();
            getDouble.toString = 0;
            while (getDouble.toString < iArr.length) {
                cArr[0] = (char) (iArr[getDouble.toString] >> 16);
                cArr[1] = (char) iArr[getDouble.toString];
                cArr[2] = (char) (iArr[getDouble.toString + 1] >> 16);
                cArr[3] = (char) iArr[getDouble.toString + 1];
                getDouble.valueOf = (cArr[0] << 16) + cArr[1];
                getDouble.values = (cArr[2] << 16) + cArr[3];
                getDouble.values(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = getDouble.valueOf ^ iArr2[i2];
                    getDouble.valueOf = i3;
                    getDouble.values = getDouble.toString(i3) ^ getDouble.values;
                    int i4 = getDouble.valueOf;
                    getDouble.valueOf = getDouble.values;
                    getDouble.values = i4;
                }
                int i5 = getDouble.valueOf;
                getDouble.valueOf = getDouble.values;
                getDouble.values = i5;
                getDouble.values = i5 ^ iArr2[16];
                getDouble.valueOf ^= iArr2[17];
                int i6 = getDouble.valueOf;
                int i7 = getDouble.values;
                cArr[0] = (char) (getDouble.valueOf >>> 16);
                cArr[1] = (char) getDouble.valueOf;
                cArr[2] = (char) (getDouble.values >>> 16);
                cArr[3] = (char) getDouble.values;
                getDouble.values(iArr2);
                cArr2[getDouble.toString << 1] = cArr[0];
                cArr2[(getDouble.toString << 1) + 1] = cArr[1];
                cArr2[(getDouble.toString << 1) + 2] = cArr[2];
                cArr2[(getDouble.toString << 1) + 3] = cArr[3];
                getDouble.toString += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
