package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class enableWriteAheadLogging extends getAttachedDbs {
    private final short ag$a;
    private final short toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public enableWriteAheadLogging(getAttachedDbs getattacheddbs, int i, int i2) {
        super(getattacheddbs);
        this.toString = (short) i;
        this.ag$a = (short) i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getAttachedDbs
    public void ah$a(getMaximumSize getmaximumsize, byte[] bArr) {
        getmaximumsize.valueOf(this.toString, this.ag$a);
    }

    public String toString() {
        short s = this.toString;
        short s2 = this.ag$a;
        StringBuilder sb = new StringBuilder("<");
        int i = 1 << s2;
        sb.append(Integer.toBinaryString((s & (i - 1)) | i | (1 << this.ag$a)).substring(1));
        sb.append('>');
        return sb.toString();
    }
}
