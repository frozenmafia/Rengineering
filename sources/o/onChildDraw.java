package o;

import com.google.crypto.tink.proto.HashType;
import java.security.NoSuchAlgorithmException;
/* loaded from: classes7.dex */
class onChildDraw {
    onChildDraw() {
    }

    /* renamed from: o.onChildDraw$5  reason: invalid class name */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] toString;

        static {
            int[] iArr = new int[HashType.values().length];
            toString = iArr;
            try {
                iArr[HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                toString[HashType.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                toString[HashType.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String values(HashType hashType) throws NoSuchAlgorithmException {
        int i = AnonymousClass5.toString[hashType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "HmacSha512";
                }
                throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + hashType);
            }
            return "HmacSha256";
        }
        return "HmacSha1";
    }
}
