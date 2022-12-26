package irjuc.irjuc.cqqlq.irjuc.qwsnv;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes5.dex */
public class zihjx {
    public static final Set<String> ag$a = new HashSet(Arrays.asList("47DEQpj8HBSa+/TImW+5JCeuQeRkm5NMpJWZG3hSuFU=", "9Bwm9kIBsrAcvjMPTDjBzKtSD8OnnsGZPwlTJDMKteA=", "8Rw90Ej3Ttt8RRkrg+WYDS9n7IS03bk5bjP/UXPtaY8=", "Ko8tivDrEjiY90yGasP6ZpBU4jwXvHqVvQI0GS3GNdA="));
    public static String toString;

    /* loaded from: classes5.dex */
    public enum irjuc {
        LOCAL("http://", "172.17.61.0:8080", 3),
        STAGE("https://", "mercury-stg.phonepe.com", 3),
        UAT("https://", "mercury-uat.phonepe.com", 3),
        TX("https://", "mercury-tx.phonepe.com", 3),
        PRODUCTION_T1("https://", "mercury-t1.phonepe.com", 3),
        PRODUCTION("https://", "mercury-t2.phonepe.com", 3);
        
        public final String chmha;
        public final String cqqlq;

        /* renamed from: irjuc  reason: collision with root package name */
        public final String f1421irjuc;
        public final String jmjou;

        irjuc(String str, String str2, int i) {
            this.f1421irjuc = str;
            this.jmjou = str + str2 + "/v" + i + "/";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            this.cqqlq = sb.toString();
            this.chmha = str2;
        }
    }

    public static irjuc ag$a(boolean z) {
        return z ? "com.phonepe.networkclient.Environment.PRODUCTION".matches("com.phonepe.networkclient.Environment.STAGE") ? irjuc.STAGE : irjuc.UAT : Build.VERSION.SDK_INT > 19 ? irjuc.PRODUCTION : irjuc.PRODUCTION_T1;
    }

    public static String toString(boolean z) {
        "com.phonepe.networkclient.Environment.PRODUCTION".matches("com.phonepe.networkclient.Environment.PRODUCTION");
        return ag$a(z).cqqlq;
    }
}
