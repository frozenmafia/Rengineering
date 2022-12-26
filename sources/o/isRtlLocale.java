package o;

import com.appsamurai.storyly.exoplayer2.common.ParserException;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;
/* loaded from: classes3.dex */
public final class isRtlLocale {
    @Pure
    public static void values(boolean z, String str) throws ParserException {
        if (!z) {
            throw ParserException.createForMalformedContainer(str, null);
        }
    }

    public static int valueOf(getExitDir getexitdir, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int valueOf = getexitdir.valueOf(bArr, i + i3, i2 - i3);
            if (valueOf == -1) {
                break;
            }
            i3 += valueOf;
        }
        return i3;
    }

    public static boolean values(getExitDir getexitdir, byte[] bArr, int i, int i2) throws IOException {
        try {
            getexitdir.ah$a(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean ah$a(getExitDir getexitdir, int i) throws IOException {
        try {
            getexitdir.values(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean valueOf(getExitDir getexitdir, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return getexitdir.values(bArr, i, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }
}
