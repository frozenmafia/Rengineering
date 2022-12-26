package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class compileStatement extends getAttachedDbs {
    private final short toString;
    private final short valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public compileStatement(getAttachedDbs getattacheddbs, int i, int i2) {
        super(getattacheddbs);
        this.toString = (short) i;
        this.valueOf = (short) i2;
    }

    @Override // o.getAttachedDbs
    public void ah$a(getMaximumSize getmaximumsize, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.valueOf;
            if (i >= s) {
                return;
            }
            if (i == 0 || (i == 31 && s <= 62)) {
                getmaximumsize.valueOf(31, 5);
                short s2 = this.valueOf;
                if (s2 > 62) {
                    getmaximumsize.valueOf(s2 - 31, 16);
                } else if (i == 0) {
                    getmaximumsize.valueOf(Math.min((int) s2, 31), 5);
                } else {
                    getmaximumsize.valueOf(s2 - 31, 5);
                }
            }
            getmaximumsize.valueOf(bArr[this.toString + i], 8);
            i++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.toString);
        sb.append("::");
        sb.append((this.toString + this.valueOf) - 1);
        sb.append('>');
        return sb.toString();
    }
}
