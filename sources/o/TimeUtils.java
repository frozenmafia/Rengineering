package o;

import android.net.Uri;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes3.dex */
class TimeUtils implements computeDecorFitsWindow {
    private static long HaptikSDK$c = -6111473044748687058L;
    private static int ah$b = 1;
    private static int invoke;
    private static char[] valueOf = {'A', 10603, 21007};
    private final byte[] ag$a;
    private final computeDecorFitsWindow ah$a;
    private CipherInputStream toString;
    private final byte[] values;

    public TimeUtils(computeDecorFitsWindow computedecorfitswindow, byte[] bArr, byte[] bArr2) {
        this.ah$a = computedecorfitswindow;
        this.ag$a = bArr;
        this.values = bArr2;
    }

    @Override // o.computeDecorFitsWindow
    public final void ah$a(createSplashScreenView createsplashscreenview) {
        int i = invoke + 61;
        ah$b = i % 128;
        int i2 = i % 2;
        try {
            FingerprintManagerCompat.toString(createsplashscreenview);
            try {
                this.ah$a.ah$a(createsplashscreenview);
                int i3 = invoke + 61;
                ah$b = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // o.computeDecorFitsWindow
    public final long valueOf(SplashScreen$Impl31$hierarchyListener$1 splashScreen$Impl31$hierarchyListener$1) throws IOException {
        try {
            Cipher values = values();
            try {
                values.init(2, new SecretKeySpec(this.ag$a, values(3 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.MeasureSpec.getMode(0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern()), new IvParameterSpec(this.values));
                getPreDrawListener getpredrawlistener = new getPreDrawListener(this.ah$a, splashScreen$Impl31$hierarchyListener$1);
                this.toString = new CipherInputStream(getpredrawlistener, values);
                getpredrawlistener.valueOf();
                int i = invoke + 47;
                ah$b = i % 128;
                int i2 = i % 2;
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // o.unwrapCryptoObject
    public final int values(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ah$b + 71;
        invoke = i3 % 128;
        int i4 = i3 % 2;
        try {
            FingerprintManagerCompat.toString(this.toString);
            int read = this.toString.read(bArr, i, i2);
            if ((read < 0 ? 'L' : '_') != '_') {
                int i5 = invoke + 37;
                ah$b = i5 % 128;
                int i6 = i5 % 2;
                return -1;
            }
            return read;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // o.computeDecorFitsWindow
    public final Uri ah$a() {
        Uri ah$a;
        int i = ah$b + 113;
        invoke = i % 128;
        if (!(i % 2 != 0)) {
            try {
                ah$a = this.ah$a.ah$a();
            } catch (Exception e) {
                throw e;
            }
        } else {
            ah$a = this.ah$a.ah$a();
            Object obj = null;
            super.hashCode();
        }
        int i2 = ah$b + 37;
        invoke = i2 % 128;
        if (!(i2 % 2 != 0)) {
            return ah$a;
        }
        int i3 = 12 / 0;
        return ah$a;
    }

    @Override // o.computeDecorFitsWindow
    public final Map<String, List<String>> ag$a() {
        try {
            int i = ah$b + 29;
            invoke = i % 128;
            int i2 = i % 2;
            Map<String, List<String>> ag$a = this.ah$a.ag$a();
            int i3 = invoke + 99;
            ah$b = i3 % 128;
            int i4 = i3 % 2;
            return ag$a;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // o.computeDecorFitsWindow
    public void valueOf() throws IOException {
        int i = invoke + 69;
        ah$b = i % 128;
        if (i % 2 == 0) {
            int i2 = 30 / 0;
            if (this.toString == null) {
                return;
            }
        } else {
            if (!(this.toString != null)) {
                return;
            }
        }
        this.toString = null;
        this.ah$a.valueOf();
        int i3 = ah$b + 119;
        invoke = i3 % 128;
        int i4 = i3 % 2;
    }

    protected Cipher values() throws NoSuchPaddingException, NoSuchAlgorithmException {
        int i = invoke + 89;
        ah$b = i % 128;
        int i2 = i % 2;
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        int i3 = invoke + 107;
        ah$b = i3 % 128;
        if ((i3 % 2 == 0 ? '`' : '\t') != '`') {
            return cipher;
        }
        Object obj = null;
        super.hashCode();
        return cipher;
    }

    private static String values(int i, int i2, char c) {
        String str;
        synchronized (move.valueOf) {
            char[] cArr = new char[i];
            move.values = 0;
            while (move.values < i) {
                cArr[move.values] = (char) ((valueOf[move.values + i2] ^ (move.values * HaptikSDK$c)) ^ c);
                move.values++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
