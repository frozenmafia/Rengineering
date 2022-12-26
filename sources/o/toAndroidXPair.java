package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.google.common.primitives.Ints;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class toAndroidXPair {
    public final String HaptikSDK$a;
    public final Integer HaptikSDK$b;
    public final boolean HaptikSDK$c;
    public final boolean ag$a;
    public final boolean ah$a;
    public final Integer ah$b;
    public final boolean invoke;
    public final int toString;
    public final float valueOf;
    public final int values;

    private static boolean ag$a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private static boolean valueOf(int i) {
        return i == 1 || i == 3;
    }

    private toAndroidXPair(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.HaptikSDK$a = str;
        this.toString = i;
        this.ah$b = num;
        this.HaptikSDK$b = num2;
        this.valueOf = f;
        this.ag$a = z;
        this.ah$a = z2;
        this.invoke = z3;
        this.HaptikSDK$c = z4;
        this.values = i2;
    }

    public static toAndroidXPair ah$a(String str, toAndroidXPair$ah$a toandroidxpair_ah_a) {
        FingerprintManagerCompat.toString(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        if (split.length != toandroidxpair_ah_a.HaptikSDK$b) {
            SupportMenuItem.toString("SsaStyle", getElevationDegrees.values("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(toandroidxpair_ah_a.HaptikSDK$b), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            return new toAndroidXPair(split[toandroidxpair_ah_a.invoke].trim(), toandroidxpair_ah_a.ah$a != -1 ? toString(split[toandroidxpair_ah_a.ah$a].trim()) : -1, toandroidxpair_ah_a.HaptikSDK$a != -1 ? ah$a(split[toandroidxpair_ah_a.HaptikSDK$a].trim()) : null, toandroidxpair_ah_a.ah$b != -1 ? ah$a(split[toandroidxpair_ah_a.ah$b].trim()) : null, toandroidxpair_ah_a.valueOf != -1 ? invoke(split[toandroidxpair_ah_a.valueOf].trim()) : -3.4028235E38f, toandroidxpair_ah_a.ag$a != -1 && valueOf(split[toandroidxpair_ah_a.ag$a].trim()), toandroidxpair_ah_a.values != -1 && valueOf(split[toandroidxpair_ah_a.values].trim()), toandroidxpair_ah_a.getInitSettings != -1 && valueOf(split[toandroidxpair_ah_a.getInitSettings].trim()), toandroidxpair_ah_a.HaptikSDK$c != -1 && valueOf(split[toandroidxpair_ah_a.HaptikSDK$c].trim()), toandroidxpair_ah_a.toString != -1 ? ag$a(split[toandroidxpair_ah_a.toString].trim()) : -1);
        } catch (RuntimeException e) {
            SupportMenuItem.valueOf("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toString(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (ag$a(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        SupportMenuItem.toString("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static int ag$a(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (valueOf(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        SupportMenuItem.toString("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    public static Integer ah$a(String str) {
        long parseLong;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            FingerprintManagerCompat.toString(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(Ints.ah$a(((parseLong >> 24) & 255) ^ 255), Ints.ah$a(parseLong & 255), Ints.ah$a((parseLong >> 8) & 255), Ints.ah$a((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            SupportMenuItem.valueOf("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    private static float invoke(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            SupportMenuItem.valueOf("SsaStyle", "Failed to parse font size: '" + str + "'", e);
            return -3.4028235E38f;
        }
    }

    private static boolean valueOf(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            SupportMenuItem.valueOf("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    /* loaded from: classes3.dex */
    static final class toString {
        public final PointF ah$a;
        public final int valueOf;
        private static final Pattern toString = Pattern.compile("\\{([^}]*)\\}");
        private static final Pattern HaptikSDK$b = Pattern.compile(getElevationDegrees.values("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        private static final Pattern values = Pattern.compile(getElevationDegrees.values("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        private static final Pattern ag$a = Pattern.compile("\\\\an(\\d+)");

        private toString(int i, PointF pointF) {
            this.valueOf = i;
            this.ah$a = pointF;
        }

        public static toString values(String str) {
            Matcher matcher = toString.matcher(str);
            PointF pointF = null;
            int i = -1;
            while (matcher.find()) {
                String str2 = (String) FingerprintManagerCompat.toString(matcher.group(1));
                try {
                    PointF ah$a = ah$a(str2);
                    if (ah$a != null) {
                        pointF = ah$a;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int ag$a2 = ag$a(str2);
                    if (ag$a2 != -1) {
                        i = ag$a2;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new toString(i, pointF);
        }

        public static String valueOf(String str) {
            return toString.matcher(str).replaceAll("");
        }

        private static PointF ah$a(String str) {
            String group;
            String group2;
            Matcher matcher = HaptikSDK$b.matcher(str);
            Matcher matcher2 = values.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    SupportMenuItem.ag$a("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) FingerprintManagerCompat.toString(group)).trim()), Float.parseFloat(((String) FingerprintManagerCompat.toString(group2)).trim()));
        }

        private static int ag$a(String str) {
            Matcher matcher = ag$a.matcher(str);
            if (matcher.find()) {
                return toAndroidXPair.toString((String) FingerprintManagerCompat.toString(matcher.group(1)));
            }
            return -1;
        }
    }
}
