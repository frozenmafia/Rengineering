package o;

import android.widget.ExpandableListView;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import java.security.AlgorithmParameters;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
/* loaded from: classes7.dex */
public class MultiInstanceInvalidationService {
    private static char[] ag$a = {'\"', 'C', 'J'};
    private static int toString = 1;
    private static int values;

    /* renamed from: o.MultiInstanceInvalidationService$2  reason: invalid class name */
    /* loaded from: classes7.dex */
    public abstract class AnonymousClass2 extends notifyByTableInvalidStatus {
        public static final Set<JWSAlgorithm> valueOf;

        static {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(JWSAlgorithm.RS256);
            linkedHashSet.add(JWSAlgorithm.RS384);
            linkedHashSet.add(JWSAlgorithm.RS512);
            linkedHashSet.add(JWSAlgorithm.PS256);
            linkedHashSet.add(JWSAlgorithm.PS384);
            linkedHashSet.add(JWSAlgorithm.PS512);
            valueOf = Collections.unmodifiableSet(linkedHashSet);
        }

        public AnonymousClass2() {
            super(valueOf);
        }
    }

    public static byte[] ah$a(RSAPublicKey rSAPublicKey, SecretKey secretKey, Provider provider) throws JOSEException {
        try {
            Cipher ah$a = parentColumn.ah$a("RSA/ECB/OAEPWithSHA-1AndMGF1Padding", provider);
            ah$a.init(1, rSAPublicKey, new SecureRandom());
            byte[] doFinal = ah$a.doFinal(secretKey.getEncoded());
            int i = values + 95;
            toString = i % 128;
            if (!(i % 2 == 0)) {
                return doFinal;
            }
            int i2 = 30 / 0;
            return doFinal;
        } catch (IllegalBlockSizeException e) {
            throw new JOSEException("RSA block size exception: The RSA key is too short, try a longer one", e);
        } catch (Exception e2) {
            throw new JOSEException(e2.getMessage(), e2);
        }
    }

    /* renamed from: o.MultiInstanceInvalidationService$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public class AnonymousClass1 {
        private static int ag$a = 1;
        private static long ah$a = 248052850240409987L;
        private static int values;

        public static byte[] toString(RSAPublicKey rSAPublicKey, SecretKey secretKey, Provider provider) throws JOSEException {
            try {
                AlgorithmParameters values2 = notifyByTableNames.values("OAEP", provider);
                values2.init(new OAEPParameterSpec(MessageDigestAlgorithms.SHA_256, "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
                Cipher ah$a2 = parentColumn.ah$a("RSA/ECB/OAEPWithSHA-256AndMGF1Padding", provider);
                ah$a2.init(1, rSAPublicKey, values2);
                byte[] doFinal = ah$a2.doFinal(secretKey.getEncoded());
                try {
                    int i = ag$a + 7;
                    values = i % 128;
                    int i2 = i % 2;
                    return doFinal;
                } catch (Exception e) {
                    throw e;
                }
            } catch (IllegalBlockSizeException e2) {
                throw new JOSEException("RSA block size exception: The RSA key is too short, try a longer one", e2);
            } catch (Exception e3) {
                throw new JOSEException(e3.getMessage(), e3);
            }
        }

        public static SecretKey toString(PrivateKey privateKey, byte[] bArr, Provider provider) throws JOSEException {
            try {
                AlgorithmParameters values2 = notifyByTableNames.values("OAEP", provider);
                values2.init(new OAEPParameterSpec(MessageDigestAlgorithms.SHA_256, "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
                Cipher ah$a2 = parentColumn.ah$a("RSA/ECB/OAEPWithSHA-256AndMGF1Padding", provider);
                ah$a2.init(2, privateKey, values2);
                SecretKeySpec secretKeySpec = new SecretKeySpec(ah$a2.doFinal(bArr), ag$a(new char[]{20930, 38899, 56762}, ExpandableListView.getPackedPositionChild(0L) + 50742).intern());
                int i = ag$a + 71;
                values = i % 128;
                if ((i % 2 != 0 ? (char) 11 : 'a') != 11) {
                    return secretKeySpec;
                }
                Object obj = null;
                super.hashCode();
                return secretKeySpec;
            } catch (Exception e) {
                throw new JOSEException(e.getMessage(), e);
            }
        }

        private static String ag$a(char[] cArr, int i) {
            String str;
            synchronized (isBeforeFirst.toString) {
                isBeforeFirst.ah$a = i;
                char[] cArr2 = new char[cArr.length];
                isBeforeFirst.valueOf = 0;
                while (isBeforeFirst.valueOf < cArr.length) {
                    cArr2[isBeforeFirst.valueOf] = (char) ((cArr[isBeforeFirst.valueOf] ^ (isBeforeFirst.valueOf * isBeforeFirst.ah$a)) ^ ah$a);
                    isBeforeFirst.valueOf++;
                }
                str = new String(cArr2);
            }
            return str;
        }
    }

    public static SecretKey ah$a(PrivateKey privateKey, byte[] bArr, Provider provider) throws JOSEException {
        try {
            Cipher ah$a = parentColumn.ah$a("RSA/ECB/OAEPWithSHA-1AndMGF1Padding", provider);
            ah$a.init(2, privateKey);
            SecretKeySpec secretKeySpec = new SecretKeySpec(ah$a.doFinal(bArr), toString(true, new int[]{0, 3, 0, 2}, new byte[]{1, 0, 0}).intern());
            int i = values + 85;
            toString = i % 128;
            if (i % 2 == 0) {
                Object obj = null;
                super.hashCode();
                return secretKeySpec;
            }
            return secretKeySpec;
        } catch (Exception e) {
            throw new JOSEException(e.getMessage(), e);
        }
    }

    private static String toString(boolean z, int[] iArr, byte[] bArr) {
        String str;
        synchronized (isClosed.ah$a) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(ag$a, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                isClosed.ag$a = 0;
                char c = 0;
                while (isClosed.ag$a < i2) {
                    if (bArr[isClosed.ag$a] == 1) {
                        cArr2[isClosed.ag$a] = (char) (((cArr[isClosed.ag$a] << 1) + 1) - c);
                    } else {
                        cArr2[isClosed.ag$a] = (char) ((cArr[isClosed.ag$a] << 1) - c);
                    }
                    c = cArr2[isClosed.ag$a];
                    isClosed.ag$a++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr4[isClosed.ag$a] = cArr[(i2 - isClosed.ag$a) - 1];
                    isClosed.ag$a++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr[isClosed.ag$a] = (char) (cArr[isClosed.ag$a] - iArr[2]);
                    isClosed.ag$a++;
                }
            }
            str = new String(cArr);
        }
        return str;
    }
}
