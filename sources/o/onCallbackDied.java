package o;

import java.security.PrivateKey;
import java.security.interfaces.RSAPrivateKey;
/* loaded from: classes7.dex */
public class onCallbackDied {
    public static int toString(PrivateKey privateKey) {
        if (privateKey instanceof RSAPrivateKey) {
            try {
                return ((RSAPrivateKey) privateKey).getModulus().bitLength();
            } catch (Exception unused) {
                return -1;
            }
        }
        return -1;
    }
}
