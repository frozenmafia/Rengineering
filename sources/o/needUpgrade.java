package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class needUpgrade implements setMaximumSize {
    public int values() {
        return 0;
    }

    @Override // o.setMaximumSize
    public void ag$a(setTransactionSuccessful settransactionsuccessful) {
        if (yieldIfContendedSafely.toString(settransactionsuccessful.valueOf(), settransactionsuccessful.ag$a) >= 2) {
            settransactionsuccessful.values(ag$a(settransactionsuccessful.valueOf().charAt(settransactionsuccessful.ag$a), settransactionsuccessful.valueOf().charAt(settransactionsuccessful.ag$a + 1)));
            settransactionsuccessful.ag$a += 2;
            return;
        }
        char values = settransactionsuccessful.values();
        int valueOf = yieldIfContendedSafely.valueOf(settransactionsuccessful.valueOf(), settransactionsuccessful.ag$a, values());
        if (valueOf == values()) {
            if (yieldIfContendedSafely.ah$a(values)) {
                settransactionsuccessful.values((char) 235);
                settransactionsuccessful.values((char) ((values - 128) + 1));
                settransactionsuccessful.ag$a++;
                return;
            }
            settransactionsuccessful.values((char) (values + 1));
            settransactionsuccessful.ag$a++;
        } else if (valueOf == 1) {
            settransactionsuccessful.values((char) 230);
            settransactionsuccessful.values(1);
        } else if (valueOf == 2) {
            settransactionsuccessful.values((char) 239);
            settransactionsuccessful.values(2);
        } else if (valueOf == 3) {
            settransactionsuccessful.values((char) 238);
            settransactionsuccessful.values(3);
        } else if (valueOf == 4) {
            settransactionsuccessful.values((char) 240);
            settransactionsuccessful.values(4);
        } else if (valueOf == 5) {
            settransactionsuccessful.values((char) 231);
            settransactionsuccessful.values(5);
        } else {
            throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(valueOf)));
        }
    }

    private static char ag$a(char c, char c2) {
        if (yieldIfContendedSafely.ag$a(c) && yieldIfContendedSafely.ag$a(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c + c2);
    }
}
