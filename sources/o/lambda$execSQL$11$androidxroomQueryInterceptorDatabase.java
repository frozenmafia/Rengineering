package o;

import android.text.TextUtils;
import com.nimbusds.jose.JOSEException;
import java.io.StringReader;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.codec.language.Soundex;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.openssl.PEMException;
import org.bouncycastle.openssl.PEMKeyPair;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;
/* renamed from: o.lambda$execSQL$11$androidx-room-QueryInterceptorDatabase  reason: invalid class name */
/* loaded from: classes7.dex */
public class lambda$execSQL$11$androidxroomQueryInterceptorDatabase {
    private static int HaptikSDK$a = 1;
    private static int HaptikSDK$c;
    private static char[] ag$a;
    private static boolean ah$a;
    private static int toString;
    private static final JcaPEMKeyConverter valueOf;
    private static boolean values;

    static void valueOf() {
        values = true;
        ah$a = true;
        toString = 15;
        ag$a = new char[]{'a', 'b', 'P'};
    }

    static {
        valueOf();
        valueOf = new JcaPEMKeyConverter();
        try {
            int i = HaptikSDK$a + 101;
            try {
                HaptikSDK$c = i % 128;
                if (!(i % 2 == 0)) {
                    Object[] objArr = null;
                    int length = objArr.length;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static List<KeyPair> ag$a(String str) throws JOSEException {
        Object readObject;
        PEMParser pEMParser = new PEMParser(new StringReader(str));
        ArrayList arrayList = new ArrayList();
        do {
            try {
                readObject = pEMParser.readObject();
                if (readObject instanceof SubjectPublicKeyInfo) {
                    arrayList.add(values((SubjectPublicKeyInfo) readObject));
                    int i = HaptikSDK$c + 75;
                    HaptikSDK$a = i % 128;
                    int i2 = i % 2;
                    continue;
                } else {
                    if ((readObject instanceof X509CertificateHolder ? (char) 5 : '\t') == '\t') {
                        if ((readObject instanceof PEMKeyPair ? 'N' : Soundex.SILENT_MARKER) != '-') {
                            arrayList.add(ag$a((PEMKeyPair) readObject));
                            continue;
                        } else {
                            if (!(readObject instanceof PrivateKeyInfo)) {
                                continue;
                            } else {
                                int i3 = HaptikSDK$c + 77;
                                HaptikSDK$a = i3 % 128;
                                if ((i3 % 2 == 0 ? (char) 16 : (char) 5) != 5) {
                                    arrayList.add(values((PrivateKeyInfo) readObject));
                                    Object[] objArr = null;
                                    int length = objArr.length;
                                } else {
                                    arrayList.add(values((PrivateKeyInfo) readObject));
                                    continue;
                                }
                            }
                        }
                    } else {
                        try {
                            int i4 = HaptikSDK$c + 99;
                            HaptikSDK$a = i4 % 128;
                            int i5 = i4 % 2;
                            arrayList.add(values((X509CertificateHolder) readObject));
                            continue;
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                }
            } catch (Exception e2) {
                throw new JOSEException(e2.getMessage(), e2);
            }
        } while (readObject != null);
        return arrayList;
    }

    private static KeyPair values(SubjectPublicKeyInfo subjectPublicKeyInfo) throws PEMException {
        Object[] objArr = null;
        KeyPair keyPair = new KeyPair(valueOf.getPublicKey(subjectPublicKeyInfo), null);
        int i = HaptikSDK$c + 47;
        HaptikSDK$a = i % 128;
        if ((i % 2 == 0 ? (char) 30 : (char) 31) != 31) {
            int length = objArr.length;
            return keyPair;
        }
        return keyPair;
    }

    private static KeyPair values(X509CertificateHolder x509CertificateHolder) throws PEMException {
        try {
            KeyPair keyPair = new KeyPair(valueOf.getPublicKey(x509CertificateHolder.getSubjectPublicKeyInfo()), null);
            int i = HaptikSDK$c + 3;
            HaptikSDK$a = i % 128;
            int i2 = i % 2;
            return keyPair;
        } catch (Exception e) {
            throw e;
        }
    }

    private static KeyPair ag$a(PEMKeyPair pEMKeyPair) throws PEMException {
        int i = HaptikSDK$c + 7;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        try {
            KeyPair keyPair = valueOf.getKeyPair(pEMKeyPair);
            int i3 = HaptikSDK$c + 53;
            HaptikSDK$a = i3 % 128;
            int i4 = i3 % 2;
            return keyPair;
        } catch (Exception e) {
            throw e;
        }
    }

    private static KeyPair values(PrivateKeyInfo privateKeyInfo) throws PEMException, NoSuchAlgorithmException, InvalidKeySpecException {
        int i = HaptikSDK$c + 31;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        PrivateKey privateKey = valueOf.getPrivateKey(privateKeyInfo);
        if (privateKey instanceof RSAPrivateCrtKey) {
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) privateKey;
            KeyPair keyPair = new KeyPair(KeyFactory.getInstance(values(null, null, TextUtils.getTrimmedLength("") + 127, new byte[]{-125, -126, -127}).intern()).generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent())), privateKey);
            int i3 = HaptikSDK$a + 79;
            HaptikSDK$c = i3 % 128;
            if (!(i3 % 2 != 0)) {
                return keyPair;
            }
            int i4 = 42 / 0;
            return keyPair;
        }
        return new KeyPair(null, privateKey);
    }

    private static String values(char[] cArr, int[] iArr, int i, byte[] bArr) {
        synchronized (isLast.valueOf) {
            char[] cArr2 = ag$a;
            int i2 = toString;
            if (ah$a) {
                int length = bArr.length;
                isLast.values = length;
                char[] cArr3 = new char[length];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr3[isLast.toString] = (char) (cArr2[bArr[(isLast.values - 1) - isLast.toString] + i] - i2);
                    isLast.toString++;
                }
                return new String(cArr3);
            } else if (values) {
                int length2 = cArr.length;
                isLast.values = length2;
                char[] cArr4 = new char[length2];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr4[isLast.toString] = (char) (cArr2[cArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                    isLast.toString++;
                }
                return new String(cArr4);
            } else {
                int length3 = iArr.length;
                isLast.values = length3;
                char[] cArr5 = new char[length3];
                isLast.toString = 0;
                while (isLast.toString < isLast.values) {
                    cArr5[isLast.toString] = (char) (cArr2[iArr[(isLast.values - 1) - isLast.toString] - i] - i2);
                    isLast.toString++;
                }
                return new String(cArr5);
            }
        }
    }
}
