package o;
/* loaded from: classes3.dex */
public final class rotationYBy implements getStartDelay<byte[]> {
    @Override // o.getStartDelay
    public String ag$a() {
        return "ByteArrayPool";
    }

    @Override // o.getStartDelay
    public int values() {
        return 1;
    }

    @Override // o.getStartDelay
    /* renamed from: ag$a */
    public int values(byte[] bArr) {
        return bArr.length;
    }

    @Override // o.getStartDelay
    /* renamed from: values */
    public byte[] toString(int i) {
        return new byte[i];
    }
}
