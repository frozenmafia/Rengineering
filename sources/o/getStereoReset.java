package o;

import com.appsamurai.storyly.exoplayer2.common.ParserException;
import java.io.IOException;
/* loaded from: classes3.dex */
public final class getStereoReset {

    /* loaded from: classes3.dex */
    public static final class valueOf {
        public long values;
    }

    public static boolean valueOf(C$default$setContentDescription c$default$setContentDescription, skipEntityBackward skipentitybackward, int i, valueOf valueof) {
        int valueOf2 = c$default$setContentDescription.valueOf();
        long onPostMessage = c$default$setContentDescription.onPostMessage();
        long j = onPostMessage >>> 16;
        if (j != i) {
            return false;
        }
        return values((int) (15 & (onPostMessage >> 4)), skipentitybackward) && ag$a((int) ((onPostMessage >> 1) & 7), skipentitybackward) && !(((onPostMessage & 1) > 1L ? 1 : ((onPostMessage & 1) == 1L ? 0 : -1)) == 0) && valueOf(c$default$setContentDescription, skipentitybackward, ((j & 1) > 1L ? 1 : ((j & 1) == 1L ? 0 : -1)) == 0, valueof) && values(c$default$setContentDescription, skipentitybackward, (int) ((onPostMessage >> 12) & 15)) && ag$a(c$default$setContentDescription, skipentitybackward, (int) ((onPostMessage >> 8) & 15)) && ag$a(c$default$setContentDescription, valueOf2);
    }

    public static boolean valueOf(getExitDir getexitdir, skipEntityBackward skipentitybackward, int i, valueOf valueof) throws IOException {
        long ag$a = getexitdir.ag$a();
        byte[] bArr = new byte[2];
        getexitdir.ag$a(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            getexitdir.valueOf();
            getexitdir.ah$a((int) (ag$a - getexitdir.values()));
            return false;
        }
        C$default$setContentDescription c$default$setContentDescription = new C$default$setContentDescription(16);
        System.arraycopy(bArr, 0, c$default$setContentDescription.ah$a(), 0, 2);
        c$default$setContentDescription.values(isRtlLocale.valueOf(getexitdir, c$default$setContentDescription.ah$a(), 2, 14));
        getexitdir.valueOf();
        getexitdir.ah$a((int) (ag$a - getexitdir.values()));
        return valueOf(c$default$setContentDescription, skipentitybackward, i, valueof);
    }

    public static long ah$a(getExitDir getexitdir, skipEntityBackward skipentitybackward) throws IOException {
        getexitdir.valueOf();
        getexitdir.ah$a(1);
        byte[] bArr = new byte[1];
        getexitdir.ag$a(bArr, 0, 1);
        boolean z = (bArr[0] & 1) == 1;
        getexitdir.ah$a(2);
        int i = z ? 7 : 6;
        C$default$setContentDescription c$default$setContentDescription = new C$default$setContentDescription(i);
        c$default$setContentDescription.values(isRtlLocale.valueOf(getexitdir, c$default$setContentDescription.ah$a(), 0, i));
        getexitdir.valueOf();
        valueOf valueof = new valueOf();
        if (!valueOf(c$default$setContentDescription, skipentitybackward, z, valueof)) {
            throw ParserException.createForMalformedContainer(null, null);
        }
        return valueof.values;
    }

    public static int toString(C$default$setContentDescription c$default$setContentDescription, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return c$default$setContentDescription.extraCallbackWithResult() + 1;
            case 7:
                return c$default$setContentDescription.ICustomTabsCallback$Default() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    private static boolean values(int i, skipEntityBackward skipentitybackward) {
        return i <= 7 ? i == skipentitybackward.valueOf - 1 : i <= 10 && skipentitybackward.valueOf == 2;
    }

    private static boolean ag$a(int i, skipEntityBackward skipentitybackward) {
        return i == 0 || i == skipentitybackward.ah$a;
    }

    private static boolean valueOf(C$default$setContentDescription c$default$setContentDescription, skipEntityBackward skipentitybackward, boolean z, valueOf valueof) {
        try {
            long defaultImpl = c$default$setContentDescription.setDefaultImpl();
            if (!z) {
                defaultImpl *= skipentitybackward.toString;
            }
            valueof.values = defaultImpl;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private static boolean values(C$default$setContentDescription c$default$setContentDescription, skipEntityBackward skipentitybackward, int i) {
        int getstereoreset = toString(c$default$setContentDescription, i);
        return getstereoreset != -1 && getstereoreset <= skipentitybackward.toString;
    }

    private static boolean ag$a(C$default$setContentDescription c$default$setContentDescription, skipEntityBackward skipentitybackward, int i) {
        int i2 = skipentitybackward.HaptikSDK$c;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == skipentitybackward.HaptikSDK$a;
        } else if (i == 12) {
            return c$default$setContentDescription.extraCallbackWithResult() * 1000 == i2;
        } else if (i <= 14) {
            int ICustomTabsCallback$Default = c$default$setContentDescription.ICustomTabsCallback$Default();
            if (i == 14) {
                ICustomTabsCallback$Default *= 10;
            }
            return ICustomTabsCallback$Default == i2;
        } else {
            return false;
        }
    }

    private static boolean ag$a(C$default$setContentDescription c$default$setContentDescription, int i) {
        return c$default$setContentDescription.extraCallbackWithResult() == getElevationDegrees.values(c$default$setContentDescription.ah$a(), i, c$default$setContentDescription.valueOf() - 1, 0);
    }
}
