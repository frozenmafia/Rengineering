package o;

import com.appsamurai.storyly.exoplayer2.common.ParserException;
import com.google.android.exoplayer2.audio.WavUtil;
import java.io.IOException;
/* loaded from: classes3.dex */
public final class TransitionKt$doOnCancel$$inlined$addListener$default$1 {
    public static boolean ah$a(getExitDir getexitdir) throws IOException {
        C$default$setContentDescription c$default$setContentDescription = new C$default$setContentDescription(8);
        valueOf ah$a = valueOf.ah$a(getexitdir, c$default$setContentDescription);
        if (ah$a.ah$a == 1380533830 || ah$a.ah$a == 1380333108) {
            getexitdir.ag$a(c$default$setContentDescription.ah$a(), 0, 4);
            c$default$setContentDescription.HaptikSDK$b(0);
            int signupData = c$default$setContentDescription.getSignupData();
            if (signupData != 1463899717) {
                SupportMenuItem.valueOf("WavHeaderReader", "Unsupported form type: " + signupData);
                return false;
            }
            return true;
        }
        return false;
    }

    public static long toString(getExitDir getexitdir) throws IOException {
        C$default$setContentDescription c$default$setContentDescription = new C$default$setContentDescription(8);
        valueOf ah$a = valueOf.ah$a(getexitdir, c$default$setContentDescription);
        if (ah$a.ah$a != 1685272116) {
            getexitdir.valueOf();
            return -1L;
        }
        getexitdir.ah$a(8);
        c$default$setContentDescription.HaptikSDK$b(0);
        getexitdir.ag$a(c$default$setContentDescription.ah$a(), 0, 8);
        long HaptikSDK$e = c$default$setContentDescription.HaptikSDK$e();
        getexitdir.values(((int) ah$a.valueOf) + 8);
        return HaptikSDK$e;
    }

    public static TransitionKt$doOnEnd$$inlined$addListener$default$1 valueOf(getExitDir getexitdir) throws IOException {
        byte[] bArr;
        C$default$setContentDescription c$default$setContentDescription = new C$default$setContentDescription(16);
        valueOf valueOf2 = valueOf(WavUtil.FMT_FOURCC, getexitdir, c$default$setContentDescription);
        FingerprintManagerCompat.ah$a(valueOf2.valueOf >= 16);
        getexitdir.ag$a(c$default$setContentDescription.ah$a(), 0, 16);
        c$default$setContentDescription.HaptikSDK$b(0);
        int aj$a = c$default$setContentDescription.aj$a();
        int aj$a2 = c$default$setContentDescription.aj$a();
        int a = c$default$setContentDescription.a();
        int a2 = c$default$setContentDescription.a();
        int aj$a3 = c$default$setContentDescription.aj$a();
        int aj$a4 = c$default$setContentDescription.aj$a();
        int i = ((int) valueOf2.valueOf) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            getexitdir.ag$a(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = getElevationDegrees.values;
        }
        getexitdir.values((int) (getexitdir.ag$a() - getexitdir.values()));
        return new TransitionKt$doOnEnd$$inlined$addListener$default$1(aj$a, aj$a2, a, a2, aj$a3, aj$a4, bArr);
    }

    public static android.util.Pair<Long, Long> values(getExitDir getexitdir) throws IOException {
        getexitdir.valueOf();
        valueOf valueOf2 = valueOf(1684108385, getexitdir, new C$default$setContentDescription(8));
        getexitdir.values(8);
        return android.util.Pair.create(Long.valueOf(getexitdir.values()), Long.valueOf(valueOf2.valueOf));
    }

    private static valueOf valueOf(int i, getExitDir getexitdir, C$default$setContentDescription c$default$setContentDescription) throws IOException {
        valueOf ah$a = valueOf.ah$a(getexitdir, c$default$setContentDescription);
        while (ah$a.ah$a != i) {
            SupportMenuItem.toString("WavHeaderReader", "Ignoring unknown WAV chunk: " + ah$a.ah$a);
            long j = ah$a.valueOf + 8;
            if (j > 2147483647L) {
                throw ParserException.createForUnsupportedContainerFeature("Chunk is too large (~2GB+) to skip; id: " + ah$a.ah$a);
            }
            getexitdir.values((int) j);
            ah$a = valueOf.ah$a(getexitdir, c$default$setContentDescription);
        }
        return ah$a;
    }

    /* loaded from: classes3.dex */
    public static final class valueOf {
        public final int ah$a;
        public final long valueOf;

        private valueOf(int i, long j) {
            this.ah$a = i;
            this.valueOf = j;
        }

        public static valueOf ah$a(getExitDir getexitdir, C$default$setContentDescription c$default$setContentDescription) throws IOException {
            getexitdir.ag$a(c$default$setContentDescription.ah$a(), 0, 8);
            c$default$setContentDescription.HaptikSDK$b(0);
            return new valueOf(c$default$setContentDescription.getSignupData(), c$default$setContentDescription.onXdkEvent());
        }
    }
}
