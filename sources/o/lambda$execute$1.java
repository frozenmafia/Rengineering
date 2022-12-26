package o;
/* loaded from: classes5.dex */
final class lambda$execute$1 {
    private final byte[] toString;
    private int valueOf = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public lambda$execute$1(int i) {
        this.toString = new byte[i];
    }

    private void values(int i, boolean z) {
        this.toString[i] = z ? (byte) 1 : (byte) 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void toString(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.valueOf;
            this.valueOf = i3 + 1;
            values(i3, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] ag$a(int i) {
        int length = this.toString.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.toString[i2 / i];
        }
        return bArr;
    }
}
