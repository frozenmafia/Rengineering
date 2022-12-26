package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioTrack;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o.isBeforeFirst;
/* loaded from: classes4.dex */
public final class amy {
    private static Cipher a = null;
    private static int ag$a = 1;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f644b;
    private static final Object c;
    private static int toString;
    private static long values;

    static {
        try {
            values();
            f644b = new Object();
            c = new Object();
            int i = ag$a + 25;
            toString = i % 128;
            if ((i % 2 != 0 ? 'a' : 'K') != 'a') {
                return;
            }
            Object[] objArr = null;
            int length = objArr.length;
        } catch (Exception e) {
            throw e;
        }
    }

    private static final Cipher c() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (c) {
            if (a == null) {
                a = Cipher.getInstance(ah$a(new char[]{13576, 8483, 7492, 2539, 26038, 20960, 19472, 47151, 37985, 32933, 64732, 60191, 51016, 13178, 12218, 7148, 30685, 25151, 24169, 19027}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 5167).intern());
            }
            cipher = a;
        }
        return cipher;
    }

    static void values() {
        values = -3788364973983976119L;
    }

    public final String a(byte[] bArr, byte[] bArr2) throws amx {
        byte[] doFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, ah$a(new char[]{13576, 52187, 51380}, 65240 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern());
            synchronized (f644b) {
                c().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = c().doFinal(bArr2);
                iv = c().getIV();
            }
            int length2 = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return com.google.ads.interactivemedia.v3.impl.data.ai.a(bArr3, false);
        } catch (InvalidKeyException e) {
            throw new amx(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new amx(e2);
        } catch (BadPaddingException e3) {
            throw new amx(e3);
        } catch (IllegalBlockSizeException e4) {
            throw new amx(e4);
        } catch (NoSuchPaddingException e5) {
            throw new amx(e5);
        }
    }

    public final byte[] b(byte[] bArr, String str) throws amx {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] b2 = com.google.ads.interactivemedia.v3.impl.data.ai.b(str, false);
            int length2 = b2.length;
            if (length2 > 16) {
                ByteBuffer allocate = ByteBuffer.allocate(length2);
                allocate.put(b2);
                allocate.flip();
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[length2 - 16];
                allocate.get(bArr2);
                allocate.get(bArr3);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, ah$a(new char[]{13576, 52187, 51380}, 65239 - KeyEvent.getDeadChar(0, 0)).intern());
                synchronized (f644b) {
                    c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                    doFinal = c().doFinal(bArr3);
                }
                return doFinal;
            }
            throw new amx();
        } catch (IllegalArgumentException e) {
            throw new amx(e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new amx(e2);
        } catch (InvalidKeyException e3) {
            throw new amx(e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new amx(e4);
        } catch (BadPaddingException e5) {
            throw new amx(e5);
        } catch (IllegalBlockSizeException e6) {
            throw new amx(e6);
        } catch (NoSuchPaddingException e7) {
            throw new amx(e7);
        }
    }

    private static String ah$a(char[] cArr, int i) {
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
