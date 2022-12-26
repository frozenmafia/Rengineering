package o;
/* loaded from: classes5.dex */
public class getBlob {
    public static void valueOf(byte[] bArr, byte b2, long j) {
        for (int i = 0; i < bArr.length; i++) {
            if (((1 << i) & j) != 0) {
                bArr[i] = (byte) (bArr[i] ^ b2);
            }
        }
    }
}
