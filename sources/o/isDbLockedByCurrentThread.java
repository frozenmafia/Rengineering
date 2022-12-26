package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class isDbLockedByCurrentThread implements setMaximumSize {
    public int values() {
        return 5;
    }

    @Override // o.setMaximumSize
    public void ag$a(setTransactionSuccessful settransactionsuccessful) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (true) {
            if (!settransactionsuccessful.HaptikSDK$a()) {
                break;
            }
            sb.append(settransactionsuccessful.values());
            settransactionsuccessful.ag$a++;
            if (yieldIfContendedSafely.valueOf(settransactionsuccessful.valueOf(), settransactionsuccessful.ag$a, values()) != values()) {
                settransactionsuccessful.values(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int ag$a = settransactionsuccessful.ag$a() + length + 1;
        settransactionsuccessful.valueOf(ag$a);
        boolean z = settransactionsuccessful.HaptikSDK$c().ah$a() - ag$a > 0;
        if (settransactionsuccessful.HaptikSDK$a() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb.setCharAt(0, (char) ((length / 250) + androidx.databinding.library.baseAdapters.BR.multiplier));
                sb.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            settransactionsuccessful.values(valueOf(sb.charAt(i), settransactionsuccessful.ag$a() + 1));
        }
    }

    private static char valueOf(char c, int i) {
        int i2 = c + ((i * 149) % 255) + 1;
        return i2 <= 255 ? (char) i2 : (char) (i2 + androidx.core.view.InputDeviceCompat.SOURCE_ANY);
    }
}
