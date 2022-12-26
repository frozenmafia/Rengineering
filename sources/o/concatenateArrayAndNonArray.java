package o;

import com.amazon.identity.auth.device.api.authorization.Region;
/* loaded from: classes5.dex */
public final class concatenateArrayAndNonArray {
    public static Region toString(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("regionString cannot be null or empty");
        }
        if ("AUTO".equals(str)) {
            return Region.AUTO;
        }
        if (com.apxor.androidsdk.core.Constants.NO_SESSION_ID.equals(str)) {
            return Region.NA;
        }
        if ("EU".equals(str)) {
            return Region.EU;
        }
        if ("FE".equals(str)) {
            return Region.FE;
        }
        throw new IllegalArgumentException("Undefined region for string: " + str);
    }
}
