package o;
/* loaded from: classes5.dex */
class pokeOpen implements setMaximumSize {
    public int ah$a() {
        return 1;
    }

    @Override // o.setMaximumSize
    public void ag$a(setTransactionSuccessful settransactionsuccessful) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!settransactionsuccessful.HaptikSDK$a()) {
                break;
            }
            char values = settransactionsuccessful.values();
            settransactionsuccessful.ag$a++;
            int ah$a = ah$a(values, sb);
            int ag$a = settransactionsuccessful.ag$a() + ((sb.length() / 3) << 1);
            settransactionsuccessful.valueOf(ag$a);
            int ah$a2 = settransactionsuccessful.HaptikSDK$c().ah$a() - ag$a;
            if (!settransactionsuccessful.HaptikSDK$a()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (ah$a2 < 2 || ah$a2 > 2)) {
                    ah$a = valueOf(settransactionsuccessful, sb, sb2, ah$a);
                }
                while (sb.length() % 3 == 1 && ((ah$a <= 3 && ah$a2 != 1) || ah$a > 3)) {
                    ah$a = valueOf(settransactionsuccessful, sb, sb2, ah$a);
                }
            } else if (sb.length() % 3 == 0 && yieldIfContendedSafely.valueOf(settransactionsuccessful.valueOf(), settransactionsuccessful.ag$a, ah$a()) != ah$a()) {
                settransactionsuccessful.values(0);
                break;
            }
        }
        toString(settransactionsuccessful, sb);
    }

    private int valueOf(setTransactionSuccessful settransactionsuccessful, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        settransactionsuccessful.ag$a--;
        int ah$a = ah$a(settransactionsuccessful.values(), sb2);
        settransactionsuccessful.HaptikSDK$e();
        return ah$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void ah$a(setTransactionSuccessful settransactionsuccessful, StringBuilder sb) {
        settransactionsuccessful.values(values(sb, 0));
        sb.delete(0, 3);
    }

    void toString(setTransactionSuccessful settransactionsuccessful, StringBuilder sb) {
        int length = sb.length() % 3;
        int ag$a = settransactionsuccessful.ag$a() + ((sb.length() / 3) << 1);
        settransactionsuccessful.valueOf(ag$a);
        int ah$a = settransactionsuccessful.HaptikSDK$c().ah$a() - ag$a;
        if (length == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                ah$a(settransactionsuccessful, sb);
            }
            if (settransactionsuccessful.HaptikSDK$a()) {
                settransactionsuccessful.values((char) 254);
            }
        } else if (ah$a == 1 && length == 1) {
            while (sb.length() >= 3) {
                ah$a(settransactionsuccessful, sb);
            }
            if (settransactionsuccessful.HaptikSDK$a()) {
                settransactionsuccessful.values((char) 254);
            }
            settransactionsuccessful.ag$a--;
        } else if (length == 0) {
            while (sb.length() >= 3) {
                ah$a(settransactionsuccessful, sb);
            }
            if (ah$a > 0 || settransactionsuccessful.HaptikSDK$a()) {
                settransactionsuccessful.values((char) 254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        settransactionsuccessful.values(0);
    }

    int ah$a(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
            return 1;
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) ((c - 'A') + 14));
            return 1;
        } else if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        } else if (c >= '!' && c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        } else if (c >= ':' && c <= '@') {
            sb.append((char) 1);
            sb.append((char) ((c - ':') + 15));
            return 2;
        } else if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) ((c - '[') + 22));
            return 2;
        } else if (c >= '`' && c <= 127) {
            sb.append((char) 2);
            sb.append((char) (c - '`'));
            return 2;
        } else {
            sb.append("\u0001\u001e");
            return ah$a((char) (c - 128), sb) + 2;
        }
    }

    private static String values(CharSequence charSequence, int i) {
        int charAt = (charSequence.charAt(i) * 1600) + (charSequence.charAt(i + 1) * '(') + charSequence.charAt(i + 2) + 1;
        return new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)});
    }
}
