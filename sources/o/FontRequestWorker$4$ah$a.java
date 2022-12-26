package o;
/* loaded from: classes3.dex */
public final class FontRequestWorker$4$ah$a {
    public final long ah$a;
    public final long toString;

    public FontRequestWorker$4$ah$a(long j, long j2) {
        this.ah$a = j;
        this.toString = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FontRequestWorker$4$ah$a) {
            FontRequestWorker$4$ah$a fontRequestWorker$4$ah$a = (FontRequestWorker$4$ah$a) obj;
            return this.ah$a == fontRequestWorker$4$ah$a.ah$a && this.toString == fontRequestWorker$4$ah$a.toString;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.ah$a) * 31) + ((int) this.toString);
    }
}
