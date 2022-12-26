package o;

import com.nimbusds.jose.jwk.KeyOperation;
import com.nimbusds.jose.jwk.KeyUse;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes7.dex */
public class QueryInterceptorDatabase {
    static final Map<KeyUse, Set<KeyOperation>> valueOf;

    QueryInterceptorDatabase() {
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(KeyUse.SIGNATURE, new HashSet(Arrays.asList(KeyOperation.SIGN, KeyOperation.VERIFY)));
        hashMap.put(KeyUse.ENCRYPTION, new HashSet(Arrays.asList(KeyOperation.ENCRYPT, KeyOperation.DECRYPT, KeyOperation.WRAP_KEY, KeyOperation.UNWRAP_KEY)));
        valueOf = Collections.unmodifiableMap(hashMap);
    }

    public static boolean ah$a(KeyUse keyUse, Set<KeyOperation> set) {
        if (keyUse == null || set == null) {
            return true;
        }
        return valueOf.get(keyUse).containsAll(set);
    }
}
