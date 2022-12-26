package com.dreampay.nonui;

import com.dreampay.commons.constants.Constants;
import java.util.Objects;
import o.Visibility;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class CardValidator {
    public static final Companion valueOf = new Companion(null);
    private int ag$a;
    private String toString;

    private final int valueOf(int i) {
        return i > 9 ? i - 9 : i;
    }

    public CardValidator(String str) {
        runAnimators.ag$a(str, "cardNumber");
        this.toString = str;
    }

    public final boolean isValidCardNumber() {
        String str = this.toString;
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = runAnimators.toString(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if ((str.subSequence(i, length + 1).toString().length() == 0) || valueOf.isAmexCard(this.toString)) {
            return false;
        }
        values();
        return (ag$a() + this.ag$a) % 10 == 0;
    }

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final boolean isAmexCard(String str) {
            runAnimators.ag$a(str, "cardNumber");
            if (str.length() >= 2) {
                String substring = str.substring(0, 2);
                runAnimators.ah$a(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                if (!Visibility.Mode.toString(substring, "37", true)) {
                    String substring2 = str.substring(0, 2);
                    runAnimators.ah$a(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (!Visibility.Mode.toString(substring2, "34", true)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
    }

    private final void values() {
        String str = this.toString;
        int length = str.length();
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(length - 1);
        runAnimators.ah$a(substring, "(this as java.lang.String).substring(startIndex)");
        this.ag$a = Integer.parseInt(substring);
        String str2 = this.toString;
        int length2 = str2.length();
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring2 = str2.substring(0, length2 - 1);
        runAnimators.ah$a(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        this.toString = substring2;
    }

    private final int ag$a() {
        int values;
        String mode = Visibility.Mode.toString(this.toString, Constants.WHITE_SPACE, "", false, 4, (Object) null);
        this.toString = mode;
        int length = mode.length() - 1;
        int i = 0;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (this.toString.length() % 2 != 0) {
                values = values(i3, Integer.parseInt(String.valueOf(this.toString.charAt(i))));
            } else {
                values = values(i, Integer.parseInt(String.valueOf(this.toString.charAt(i))));
            }
            i2 += values;
            if (i3 > length) {
                return i2;
            }
            i = i3;
        }
    }

    private final int values(int i, int i2) {
        return i % 2 == 0 ? i2 : valueOf(i2 * 2);
    }
}
