package o;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
/* loaded from: classes7.dex */
public final class oldSize implements endAnimation {
    private static final String values = "AndroidKeystoreAesGcm";
    private final SecretKey valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public oldSize(String str, KeyStore keyStore) throws GeneralSecurityException {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.valueOf = secretKey;
        if (secretKey != null) {
            return;
        }
        throw new InvalidKeyException("Keystore cannot load the key with ID: " + str);
    }

    @Override // o.endAnimation
    public byte[] ah$a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            return ag$a(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w(values, "encountered a potentially transient KeyStore error, will wait and retry", e);
            values();
            return ag$a(bArr, bArr2);
        }
    }

    private byte[] ag$a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 12 + 16];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, this.valueOf);
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
        System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
        return bArr3;
    }

    @Override // o.endAnimation
    public byte[] values(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            return toString(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w(values, "encountered a potentially transient KeyStore error, will wait and retry", e);
            values();
            return toString(bArr, bArr2);
        }
    }

    private byte[] toString(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, this.valueOf, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }

    private static void values() {
        try {
            Thread.sleep((int) (Math.random() * 100.0d));
        } catch (InterruptedException unused) {
        }
    }
}
