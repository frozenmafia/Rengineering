package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class setForeignKeyConstraintsEnabled implements setMaximumSize {
    public int ah$a() {
        return 4;
    }

    @Override // o.setMaximumSize
    public void ag$a(setTransactionSuccessful settransactionsuccessful) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!settransactionsuccessful.HaptikSDK$a()) {
                break;
            }
            values(settransactionsuccessful.values(), sb);
            settransactionsuccessful.ag$a++;
            if (sb.length() >= 4) {
                settransactionsuccessful.values(toString(sb, 0));
                sb.delete(0, 4);
                if (yieldIfContendedSafely.valueOf(settransactionsuccessful.valueOf(), settransactionsuccessful.ag$a, ah$a()) != ah$a()) {
                    settransactionsuccessful.values(0);
                    break;
                }
            }
        }
        sb.append((char) 31);
        toString(settransactionsuccessful, sb);
    }

    private static void toString(setTransactionSuccessful settransactionsuccessful, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                return;
            }
            boolean z = true;
            if (length == 1) {
                settransactionsuccessful.getInitSettings();
                int ah$a = settransactionsuccessful.HaptikSDK$c().ah$a() - settransactionsuccessful.ag$a();
                int HaptikSDK$b = settransactionsuccessful.HaptikSDK$b();
                if (HaptikSDK$b > ah$a) {
                    settransactionsuccessful.valueOf(settransactionsuccessful.ag$a() + 1);
                    ah$a = settransactionsuccessful.HaptikSDK$c().ah$a() - settransactionsuccessful.ag$a();
                }
                if (HaptikSDK$b <= ah$a && ah$a <= 2) {
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i = length - 1;
            String setforeignkeyconstraintsenabled = toString(charSequence, 0);
            if (!(!settransactionsuccessful.HaptikSDK$a()) || i > 2) {
                z = false;
            }
            if (i <= 2) {
                settransactionsuccessful.valueOf(settransactionsuccessful.ag$a() + i);
                if (settransactionsuccessful.HaptikSDK$c().ah$a() - settransactionsuccessful.ag$a() >= 3) {
                    settransactionsuccessful.valueOf(settransactionsuccessful.ag$a() + setforeignkeyconstraintsenabled.length());
                    z = false;
                }
            }
            if (z) {
                settransactionsuccessful.HaptikSDK$e();
                settransactionsuccessful.ag$a -= i;
            } else {
                settransactionsuccessful.values(setforeignkeyconstraintsenabled);
            }
        } finally {
            settransactionsuccessful.values(0);
        }
    }

    private static void values(char c, StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
        } else if (c >= '@' && c <= '^') {
            sb.append((char) (c - '@'));
        } else {
            yieldIfContendedSafely.valueOf(c);
        }
    }

    private static String toString(CharSequence charSequence, int i) {
        int length = charSequence.length() - i;
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int charAt = (charSequence.charAt(i) << 18) + ((length >= 2 ? charSequence.charAt(i + 1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(i + 2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(i + 3) : (char) 0);
        char c = (char) ((charAt >> 8) & 255);
        char c2 = (char) (charAt & 255);
        StringBuilder sb = new StringBuilder(3);
        sb.append((char) ((charAt >> 16) & 255));
        if (length >= 2) {
            sb.append(c);
        }
        if (length >= 3) {
            sb.append(c2);
        }
        return sb.toString();
    }
}
