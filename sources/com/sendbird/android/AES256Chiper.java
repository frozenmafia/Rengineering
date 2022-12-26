package com.sendbird.android;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.View;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import o.getShort;
/* loaded from: classes5.dex */
class AES256Chiper {
    private static final String ALGORITHM = "AES/CBC/PKCS5Padding";
    private static final String DEFAULT_CHARSET = "UTF-8";
    private static char ag$a = 0;
    private static int ah$a = 0;
    private static final byte[] ivBytes;
    private static int toString = 1;
    private static int valueOf;
    private static long values;

    static void ah$a() {
        ah$a = 0;
        values = 0L;
        ag$a = (char) 43270;
    }

    static {
        ah$a();
        ivBytes = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int i = toString + 115;
        valueOf = i % 128;
        int i2 = i % 2;
    }

    private AES256Chiper() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String encrypt(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, UnsupportedEncodingException, BadPaddingException, IllegalBlockSizeException {
        int i = toString + 39;
        valueOf = i % 128;
        int i2 = i % 2;
        if (!(!TextUtils.isEmpty(str2))) {
            int i3 = toString + 63;
            valueOf = i3 % 128;
            if (!(i3 % 2 == 0)) {
                int i4 = 78 / 0;
            }
            int i5 = valueOf + 111;
            toString = i5 % 128;
            int i6 = i5 % 2;
            return str2;
        }
        Key createKeySpec = createKeySpec(str);
        Cipher cipher = Cipher.getInstance(valueOf(View.resolveSizeAndState(0, 0, 0), new char[]{54970, 14335, 27227, 16616}, new char[]{0, 0, 0, 0}, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), new char[]{54168, 26062, 62419, 28823, 36587, 5400, 58109, 10285, 43409, 50913, 49903, 54791, 418, 34745, 12331, 46324, 1330, 1719, 63375, 21391}).intern());
        cipher.init(1, createKeySpec, new IvParameterSpec(ivBytes));
        return Base64.encodeToString(cipher.doFinal(str2.getBytes("UTF-8")), 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String decrypt(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException, UnsupportedEncodingException {
        int i = toString + 9;
        valueOf = i % 128;
        int i2 = i % 2;
        if ((TextUtils.isEmpty(str2) ? 'G' : '2') == '2') {
            Key createKeySpec = createKeySpec(str);
            Cipher cipher = Cipher.getInstance(valueOf((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), new char[]{54970, 14335, 27227, 16616}, new char[]{0, 0, 0, 0}, (char) View.resolveSizeAndState(0, 0, 0), new char[]{54168, 26062, 62419, 28823, 36587, 5400, 58109, 10285, 43409, 50913, 49903, 54791, 418, 34745, 12331, 46324, 1330, 1719, 63375, 21391}).intern());
            cipher.init(2, createKeySpec, new IvParameterSpec(ivBytes));
            return new String(cipher.doFinal(Base64.decode(str2, 2)), "UTF-8");
        }
        int i3 = toString + 21;
        valueOf = i3 % 128;
        int i4 = i3 % 2;
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
        if ((android.text.TextUtils.isEmpty(r6)) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
        r6 = com.sendbird.android.AES256Chiper.valueOf + 67;
        com.sendbird.android.AES256Chiper.toString = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        if ((r6 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
        r6 = '(';
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
        r6 = 29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
        if (r6 == '(') goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
        r6 = 18 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
        r2 = new byte[16];
        r6 = r6.getBytes("UTF-8");
        r3 = r6.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
        if (r3 <= 16) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
        r3 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
        java.lang.System.arraycopy(r6, 0, r2, 0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
        return new javax.crypto.spec.SecretKeySpec(r2, valueOf(152754389 - (android.view.ViewConfiguration.getTapTimeout() >> 16), new char[]{54771, 6872, 35337, 55426}, new char[]{0, 0, 0, 0}, (char) (33417 - android.view.MotionEvent.axisFromString("")), new char[]{51096, 37389, 21382}).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.security.Key createKeySpec(java.lang.String r6) throws java.io.UnsupportedEncodingException {
        /*
            int r0 = com.sendbird.android.AES256Chiper.toString
            int r0 = r0 + 31
            int r1 = r0 % 128
            com.sendbird.android.AES256Chiper.valueOf = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L19
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r2 = 85
            int r2 = r2 / r1
            if (r0 == 0) goto L41
            goto L24
        L17:
            r6 = move-exception
            throw r6
        L19:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L21
            r0 = 1
            goto L22
        L21:
            r0 = 0
        L22:
            if (r0 == 0) goto L41
        L24:
            int r6 = com.sendbird.android.AES256Chiper.valueOf
            int r6 = r6 + 67
            int r0 = r6 % 128
            com.sendbird.android.AES256Chiper.toString = r0
            int r6 = r6 % 2
            r0 = 40
            if (r6 != 0) goto L35
            r6 = 40
            goto L37
        L35:
            r6 = 29
        L37:
            if (r6 == r0) goto L3a
            goto L3d
        L3a:
            r6 = 18
            int r6 = r6 / r1
        L3d:
            r6 = 0
            return r6
        L3f:
            r6 = move-exception
            throw r6
        L41:
            r0 = 16
            byte[] r2 = new byte[r0]
            java.lang.String r3 = "UTF-8"
            byte[] r6 = r6.getBytes(r3)
            int r3 = r6.length
            if (r3 <= r0) goto L50
            r3 = 16
        L50:
            java.lang.System.arraycopy(r6, r1, r2, r1, r3)
            javax.crypto.spec.SecretKeySpec r6 = new javax.crypto.spec.SecretKeySpec
            r1 = 152754389(0x91ad8d5, float:1.863903E-33)
            int r3 = android.view.ViewConfiguration.getTapTimeout()
            int r0 = r3 >> 16
            int r1 = r1 - r0
            r0 = 4
            char[] r3 = new char[r0]
            r3 = {x0088: FILL_ARRAY_DATA  , data: [-10765, 6872, -30199, -10110} // fill-array
            char[] r0 = new char[r0]
            r0 = {x0090: FILL_ARRAY_DATA  , data: [0, 0, 0, 0} // fill-array
            r4 = 33417(0x8289, float:4.6827E-41)
            java.lang.String r5 = ""
            int r5 = android.view.MotionEvent.axisFromString(r5)
            int r4 = r4 - r5
            char r4 = (char) r4
            r5 = 3
            char[] r5 = new char[r5]
            r5 = {x0098: FILL_ARRAY_DATA  , data: [-14440, -28147, 21382} // fill-array
            java.lang.String r0 = valueOf(r1, r3, r0, r4, r5)
            java.lang.String r0 = r0.intern()
            r6.<init>(r2, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sendbird.android.AES256Chiper.createKeySpec(java.lang.String):java.security.Key");
    }

    private static String valueOf(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
        String str;
        synchronized (getShort.toString) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            getShort.valueOf = 0;
            while (getShort.valueOf < length) {
                int i2 = (getShort.valueOf + 2) % 4;
                int i3 = (getShort.valueOf + 3) % 4;
                getShort.values = (char) (((cArr4[getShort.valueOf % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = getShort.values;
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ values) ^ ah$a) ^ ag$a);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
