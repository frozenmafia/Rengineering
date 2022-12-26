package o;
/* loaded from: classes6.dex */
public abstract class executePendingTask {
    protected int ah$a;
    protected int valueOf;

    public abstract String ag$a();

    public final boolean values() {
        return this.valueOf == 1;
    }

    public final boolean HaptikSDK$a() {
        return this.valueOf == 2;
    }

    public String HaptikSDK$b() {
        int i = this.valueOf;
        return i != 0 ? i != 1 ? i != 2 ? "?" : "Object" : "Array" : "root";
    }

    public final int valueOf() {
        return this.ah$a + 1;
    }

    public final int ah$a() {
        int i = this.ah$a;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this.valueOf;
        if (i == 0) {
            sb.append("/");
        } else if (i == 1) {
            sb.append('[');
            sb.append(ah$a());
            sb.append(']');
        } else {
            sb.append('{');
            String ag$a = ag$a();
            if (ag$a != null) {
                sb.append('\"');
                getSelection.valueOf(sb, ag$a);
                sb.append('\"');
            } else {
                sb.append('?');
            }
            sb.append('}');
        }
        return sb.toString();
    }
}
