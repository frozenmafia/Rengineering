package defpackage;

import android.util.Base64;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import o.putEncryptedObject;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: cg  reason: default package */
/* loaded from: classes.dex */
public class cg {
    static final /* synthetic */ boolean ag$a = true;
    private static final String toString = "cg";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cg$a */
    /* loaded from: classes.dex */
    public enum a {
        HEADER,
        PAYLOAD,
        SIGNATURE
    }

    private void ag$a(String[] strArr) throws InvalidKeyException, NoSuchProviderException, SignatureException, NoSuchAlgorithmException, CertificateException, IOException {
        if (!valueOf(ah$a(strArr[a.SIGNATURE.ordinal()]), (strArr[a.HEADER.ordinal()].trim() + "." + strArr[a.PAYLOAD.ordinal()].trim()).getBytes("UTF-8"), cm.valueOf())) {
            throw new SecurityException("Decoding fails: signature mismatch!");
        }
    }

    private String[] ag$a(String str) {
        if (ag$a || str != null) {
            String[] split = str.split("[.]");
            if (split.length == 3) {
                return split;
            }
            throw new IllegalArgumentException("Invalid JWT format");
        }
        throw new AssertionError();
    }

    private byte[] ah$a(String str) throws UnsupportedEncodingException {
        return Base64.decode(str.trim().getBytes("UTF-8"), 0);
    }

    private boolean valueOf(byte[] bArr, byte[] bArr2, Certificate certificate) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException, SignatureException {
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initVerify(certificate);
        signature.update(bArr2);
        return signature.verify(bArr);
    }

    private String values(String str) throws UnsupportedEncodingException {
        return new String(ah$a(str), "UTF-8");
    }

    public JSONObject toString(String str) {
        String str2;
        StringBuilder sb;
        String message;
        if (str == null) {
            return null;
        }
        try {
            String[] ag$a2 = ag$a(str.trim());
            ag$a(ag$a2);
            return new JSONObject(values(ag$a2[a.PAYLOAD.ordinal()]));
        } catch (UnsupportedEncodingException e) {
            str2 = toString;
            sb = new StringBuilder();
            sb.append("Failed to decode: ");
            message = e.getMessage();
            sb.append(message);
            putEncryptedObject.toString(str2, sb.toString());
            return null;
        } catch (IOException e2) {
            str2 = toString;
            sb = new StringBuilder();
            sb.append("Failed to decode: ");
            message = e2.getMessage();
            sb.append(message);
            putEncryptedObject.toString(str2, sb.toString());
            return null;
        } catch (IllegalArgumentException e3) {
            str2 = toString;
            sb = new StringBuilder();
            sb.append("Failed to decode: ");
            message = e3.getMessage();
            sb.append(message);
            putEncryptedObject.toString(str2, sb.toString());
            return null;
        } catch (SecurityException e4) {
            str2 = toString;
            sb = new StringBuilder();
            sb.append("Failed to decode: ");
            message = e4.getMessage();
            sb.append(message);
            putEncryptedObject.toString(str2, sb.toString());
            return null;
        } catch (InvalidKeyException e5) {
            str2 = toString;
            sb = new StringBuilder();
            sb.append("Failed to decode: ");
            message = e5.getMessage();
            sb.append(message);
            putEncryptedObject.toString(str2, sb.toString());
            return null;
        } catch (NoSuchAlgorithmException e6) {
            str2 = toString;
            sb = new StringBuilder();
            sb.append("Failed to decode: ");
            message = e6.getMessage();
            sb.append(message);
            putEncryptedObject.toString(str2, sb.toString());
            return null;
        } catch (NoSuchProviderException e7) {
            str2 = toString;
            sb = new StringBuilder();
            sb.append("Failed to decode: ");
            message = e7.getMessage();
            sb.append(message);
            putEncryptedObject.toString(str2, sb.toString());
            return null;
        } catch (SignatureException e8) {
            str2 = toString;
            sb = new StringBuilder();
            sb.append("Failed to decode: ");
            message = e8.getMessage();
            sb.append(message);
            putEncryptedObject.toString(str2, sb.toString());
            return null;
        } catch (CertificateException e9) {
            str2 = toString;
            sb = new StringBuilder();
            sb.append("Failed to decode: ");
            message = e9.getMessage();
            sb.append(message);
            putEncryptedObject.toString(str2, sb.toString());
            return null;
        } catch (JSONException e10) {
            str2 = toString;
            sb = new StringBuilder();
            sb.append("Failed to decode: ");
            message = e10.getMessage();
            sb.append(message);
            putEncryptedObject.toString(str2, sb.toString());
            return null;
        }
    }
}
