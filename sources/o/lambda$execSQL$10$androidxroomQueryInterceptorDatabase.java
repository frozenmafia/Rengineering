package o;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.util.Base64URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
/* renamed from: o.lambda$execSQL$10$androidx-room-QueryInterceptorDatabase  reason: invalid class name */
/* loaded from: classes7.dex */
public final class lambda$execSQL$10$androidxroomQueryInterceptorDatabase {
    public static Base64URL valueOf(String str, JWK jwk) throws JOSEException {
        return values(str, jwk.getRequiredParams());
    }

    public static Base64URL values(String str, LinkedHashMap<String, ?> linkedHashMap) throws JOSEException {
        String values = QueryInterceptorStatement$$ExternalSyntheticLambda2.values(linkedHashMap);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(values.getBytes(Relation.valueOf));
            return Base64URL.encode(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            throw new JOSEException("Couldn't compute JWK thumbprint: Unsupported hash algorithm: " + e.getMessage(), e);
        }
    }
}
