package o;

import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class toAndroidXPair$ah$a {
    public final int HaptikSDK$a;
    public final int HaptikSDK$b;
    public final int HaptikSDK$c;
    public final int ag$a;
    public final int ah$a;
    public final int ah$b;
    public final int getInitSettings;
    public final int invoke;
    public final int toString;
    public final int valueOf;
    public final int values;

    private toAndroidXPair$ah$a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.invoke = i;
        this.ah$a = i2;
        this.HaptikSDK$a = i3;
        this.ah$b = i4;
        this.valueOf = i5;
        this.ag$a = i6;
        this.values = i7;
        this.getInitSettings = i8;
        this.HaptikSDK$c = i9;
        this.toString = i10;
        this.HaptikSDK$b = i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static toAndroidXPair$ah$a valueOf(String str) {
        char c;
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < split.length; i11++) {
            String valueOf = postponeAndUpdateViewHolders.valueOf(split[i11].trim());
            valueOf.hashCode();
            switch (valueOf.hashCode()) {
                case -1178781136:
                    if (valueOf.equals(TtmlNode.ITALIC)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1026963764:
                    if (valueOf.equals(TtmlNode.UNDERLINE)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -192095652:
                    if (valueOf.equals("strikeout")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -70925746:
                    if (valueOf.equals("primarycolour")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3029637:
                    if (valueOf.equals(TtmlNode.BOLD)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3373707:
                    if (valueOf.equals("name")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 366554320:
                    if (valueOf.equals("fontsize")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 767321349:
                    if (valueOf.equals("borderstyle")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1767875043:
                    if (valueOf.equals("alignment")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1988365454:
                    if (valueOf.equals("outlinecolour")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    i7 = i11;
                    break;
                case 1:
                    i8 = i11;
                    break;
                case 2:
                    i9 = i11;
                    break;
                case 3:
                    i3 = i11;
                    break;
                case 4:
                    i6 = i11;
                    break;
                case 5:
                    i = i11;
                    break;
                case 6:
                    i5 = i11;
                    break;
                case 7:
                    i10 = i11;
                    break;
                case '\b':
                    i2 = i11;
                    break;
                case '\t':
                    i4 = i11;
                    break;
            }
        }
        if (i != -1) {
            return new toAndroidXPair$ah$a(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, split.length);
        }
        return null;
    }
}
