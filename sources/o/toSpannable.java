package o;

import com.google.android.exoplayer2.extractor.mp4.Atom;
import java.nio.ByteBuffer;
import java.util.UUID;
/* loaded from: classes3.dex */
public final class toSpannable {
    public static byte[] ah$a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(Atom.TYPE_pssh);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static boolean ag$a(byte[] bArr) {
        return values(bArr) != null;
    }

    public static UUID toString(byte[] bArr) {
        values values2 = values(bArr);
        if (values2 == null) {
            return null;
        }
        return values2.valueOf;
    }

    public static int ah$a(byte[] bArr) {
        values values2 = values(bArr);
        if (values2 == null) {
            return -1;
        }
        return values2.values;
    }

    public static byte[] valueOf(byte[] bArr, UUID uuid) {
        values values2 = values(bArr);
        if (values2 == null) {
            return null;
        }
        if (!uuid.equals(values2.valueOf)) {
            SupportMenuItem.toString("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + values2.valueOf + ".");
            return null;
        }
        return values2.ah$a;
    }

    private static values values(byte[] bArr) {
        C$default$setContentDescription c$default$setContentDescription = new C$default$setContentDescription(bArr);
        if (c$default$setContentDescription.HaptikSDK$a() < 32) {
            return null;
        }
        c$default$setContentDescription.HaptikSDK$b(0);
        if (c$default$setContentDescription.getSignupData() == c$default$setContentDescription.ag$a() + 4 && c$default$setContentDescription.getSignupData() == 1886614376) {
            int ah$a = setTextDirection.ah$a(c$default$setContentDescription.getSignupData());
            if (ah$a > 1) {
                SupportMenuItem.toString("PsshAtomUtil", "Unsupported pssh version: " + ah$a);
                return null;
            }
            UUID uuid = new UUID(c$default$setContentDescription.isLogoutPending(), c$default$setContentDescription.isLogoutPending());
            if (ah$a == 1) {
                c$default$setContentDescription.HaptikSDK$a(c$default$setContentDescription.onNavigationEvent() * 16);
            }
            int onNavigationEvent = c$default$setContentDescription.onNavigationEvent();
            if (onNavigationEvent != c$default$setContentDescription.ag$a()) {
                return null;
            }
            byte[] bArr2 = new byte[onNavigationEvent];
            c$default$setContentDescription.valueOf(bArr2, 0, onNavigationEvent);
            return new values(uuid, ah$a, bArr2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class values {
        private final byte[] ah$a;
        private final UUID valueOf;
        private final int values;

        public values(UUID uuid, int i, byte[] bArr) {
            this.valueOf = uuid;
            this.values = i;
            this.ah$a = bArr;
        }
    }
}
