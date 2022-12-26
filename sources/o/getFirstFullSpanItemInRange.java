package o;
/* loaded from: classes5.dex */
public final class getFirstFullSpanItemInRange {
    private static final int ah$a = ag$a();

    private static int ag$a() {
        return values(System.getProperty("java.version"));
    }

    static int values(String str) {
        int ah$a2 = ah$a(str);
        if (ah$a2 == -1) {
            ah$a2 = ag$a(str);
        }
        if (ah$a2 == -1) {
            return 6;
        }
        return ah$a2;
    }

    private static int ah$a(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private static int ag$a(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int valueOf() {
        return ah$a;
    }

    public static boolean values() {
        return ah$a >= 9;
    }
}
