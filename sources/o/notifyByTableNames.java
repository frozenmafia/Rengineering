package o;

import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
/* loaded from: classes7.dex */
public class notifyByTableNames {
    public static AlgorithmParameters values(String str, Provider provider) throws NoSuchAlgorithmException {
        if (provider == null) {
            return AlgorithmParameters.getInstance(str);
        }
        return AlgorithmParameters.getInstance(str, provider);
    }
}
