package o;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import o.getColumnCountForAccessibility;
import o.getSpanCount;
/* loaded from: classes7.dex */
public class endX {
    public static final Charset values = Charset.forName("UTF-8");

    endX() {
    }

    public static getSpanCount ah$a(getColumnCountForAccessibility getcolumncountforaccessibility) {
        getSpanCount.toString ak;
        ak = getSpanCount.DEFAULT_INSTANCE.ak();
        getSpanCount.toString values2 = ak.values(getcolumncountforaccessibility.HaptikSDK$c());
        for (getColumnCountForAccessibility.valueOf valueof : getcolumncountforaccessibility.valueOf()) {
            values2.ag$a(ag$a(valueof));
        }
        return values2.HaptikSDK$b();
    }

    public static getSpanCount.values ag$a(getColumnCountForAccessibility.valueOf valueof) {
        return getSpanCount.values.values().values(valueof.ag$a().HaptikSDK$b()).toString(valueof.ah$b()).values(valueof.invoke()).ah$a(valueof.ah$a()).HaptikSDK$b();
    }

    public static void values(getColumnCountForAccessibility.valueOf valueof) throws GeneralSecurityException {
        if (!valueof.HaptikSDK$a()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(valueof.ah$a())));
        }
        if (valueof.invoke() == OutputPrefixType.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(valueof.ah$a())));
        }
        if (valueof.ah$b() == KeyStatusType.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(valueof.ah$a())));
        }
    }

    public static void ag$a(getColumnCountForAccessibility getcolumncountforaccessibility) throws GeneralSecurityException {
        int HaptikSDK$c = getcolumncountforaccessibility.HaptikSDK$c();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (getColumnCountForAccessibility.valueOf valueof : getcolumncountforaccessibility.valueOf()) {
            if (valueof.ah$b() == KeyStatusType.ENABLED) {
                values(valueof);
                if (valueof.ah$a() == HaptikSDK$c) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                if (valueof.ag$a().ag$a() != KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i++;
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
