package com.google.ads.interactivemedia.v3.internal;

import com.google.android.exoplayer2.extractor.mp4.Atom;
import java.nio.ByteBuffer;
import java.util.UUID;
/* loaded from: classes4.dex */
public final class acu {
    public static int a(byte[] bArr) {
        int i;
        act g = g(bArr);
        if (g == null) {
            return -1;
        }
        i = g.f471b;
        return i;
    }

    public static UUID b(byte[] bArr) {
        UUID uuid;
        act g = g(bArr);
        if (g == null) {
            return null;
        }
        uuid = g.a;
        return uuid;
    }

    public static boolean c(byte[] bArr) {
        return g(bArr) != null;
    }

    public static byte[] d(UUID uuid, byte[] bArr) {
        return e(uuid, null, bArr);
    }

    public static byte[] e(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length;
        int length2 = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length2 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length2);
        allocate.putInt(length2);
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
        if (bArr != null && (length = bArr.length) != 0) {
            allocate.putInt(length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static byte[] f(byte[] bArr, UUID uuid) {
        UUID uuid2;
        byte[] bArr2;
        UUID uuid3;
        act g = g(bArr);
        if (g == null) {
            return null;
        }
        uuid2 = g.a;
        if (uuid.equals(uuid2)) {
            bArr2 = g.c;
            return bArr2;
        }
        String valueOf = String.valueOf(uuid);
        uuid3 = g.a;
        String obj = uuid3.toString();
        cc.e("PsshAtomUtil", "UUID mismatch. Expected: " + valueOf + ", got: " + obj + ".");
        return null;
    }

    private static act g(byte[] bArr) {
        ci ciVar = new ci(bArr);
        if (ciVar.d() < 32) {
            return null;
        }
        ciVar.F(0);
        if (ciVar.e() == ciVar.a() + 4 && ciVar.e() == 1886614376) {
            int f = abz.f(ciVar.e());
            if (f > 1) {
                cc.e("PsshAtomUtil", "Unsupported pssh version: " + f);
                return null;
            }
            UUID uuid = new UUID(ciVar.o(), ciVar.o());
            if (f == 1) {
                ciVar.G(ciVar.l() * 16);
            }
            int l = ciVar.l();
            if (l != ciVar.a()) {
                return null;
            }
            byte[] bArr2 = new byte[l];
            ciVar.A(bArr2, 0, l);
            return new act(uuid, f, bArr2);
        }
        return null;
    }
}
