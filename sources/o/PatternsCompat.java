package o;

import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
/* loaded from: classes3.dex */
final class PatternsCompat {
    public final int ag$a;
    public final int ah$a;
    public final int toString;
    public final int valueOf;
    public final int values;

    private PatternsCompat(int i, int i2, int i3, int i4, int i5) {
        this.ah$a = i;
        this.toString = i2;
        this.ag$a = i3;
        this.values = i4;
        this.valueOf = i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static PatternsCompat valueOf(String str) {
        char c;
        FingerprintManagerCompat.toString(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < split.length; i5++) {
            String valueOf = postponeAndUpdateViewHolders.valueOf(split[i5].trim());
            valueOf.hashCode();
            switch (valueOf.hashCode()) {
                case 100571:
                    if (valueOf.equals("end")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3556653:
                    if (valueOf.equals("text")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 109757538:
                    if (valueOf.equals("start")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (valueOf.equals(TtmlNode.TAG_STYLE)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                i2 = i5;
            } else if (c == 1) {
                i4 = i5;
            } else if (c == 2) {
                i = i5;
            } else if (c == 3) {
                i3 = i5;
            }
        }
        if (i == -1 || i2 == -1 || i4 == -1) {
            return null;
        }
        return new PatternsCompat(i, i2, i3, i4, split.length);
    }
}
