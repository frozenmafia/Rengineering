package com.dreampay.commons.wallets;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.view.ViewConfiguration;
import o.isFirst;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class GroupPaymentInstrument implements PayInstrumentItemDetails {
    private static char ah$a = 2;
    private static char[] toString = {13814, 13806, 13811, 13823};
    private static int valueOf = 0;
    private static int values = 1;
    private final String icon;
    private final String subtitle;
    private final String title;

    public static /* synthetic */ GroupPaymentInstrument copy$default(GroupPaymentInstrument groupPaymentInstrument, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = groupPaymentInstrument.getTitle();
        }
        if ((i & 2) != 0) {
            int i2 = valueOf + 11;
            values = i2 % 128;
            if (i2 % 2 == 0) {
                try {
                    str2 = groupPaymentInstrument.getSubtitle();
                    Object[] objArr = null;
                    int length = objArr.length;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                str2 = groupPaymentInstrument.getSubtitle();
            }
            int i3 = valueOf + 87;
            values = i3 % 128;
            int i4 = i3 % 2;
        }
        if (((i & 4) != 0 ? '?' : 'b') != 'b') {
            try {
                str3 = groupPaymentInstrument.icon;
            } catch (Exception e2) {
                throw e2;
            }
        }
        GroupPaymentInstrument copy = groupPaymentInstrument.copy(str, str2, str3);
        int i5 = valueOf + 69;
        values = i5 % 128;
        int i6 = i5 % 2;
        return copy;
    }

    public final String component1() {
        String title;
        int i = valueOf + 123;
        values = i % 128;
        if (!(i % 2 != 0)) {
            try {
                title = getTitle();
                Object[] objArr = null;
                int length = objArr.length;
            } catch (Exception e) {
                throw e;
            }
        } else {
            title = getTitle();
        }
        try {
            int i2 = valueOf + 57;
            values = i2 % 128;
            int i3 = i2 % 2;
            return title;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String component2() {
        int i = values + 81;
        valueOf = i % 128;
        int i2 = i % 2;
        try {
            String subtitle = getSubtitle();
            try {
                int i3 = valueOf + 73;
                values = i3 % 128;
                int i4 = i3 % 2;
                return subtitle;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String component3() {
        int i = valueOf + 121;
        values = i % 128;
        int i2 = i % 2;
        try {
            String str = this.icon;
            int i3 = valueOf + 101;
            values = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final GroupPaymentInstrument copy(String str, String str2, String str3) {
        runAnimators.ag$a(str, ah$a((byte) (19 - (ViewConfiguration.getJumpTapTimeout() >> 16)), new char[]{0, 3, 0, 1, 13842}, ImageFormat.getBitsPerPixel(0) + 6).intern());
        runAnimators.ag$a(str2, "subtitle");
        runAnimators.ag$a(str3, "icon");
        GroupPaymentInstrument groupPaymentInstrument = new GroupPaymentInstrument(str, str2, str3);
        int i = values + 91;
        valueOf = i % 128;
        int i2 = i % 2;
        return groupPaymentInstrument;
    }

    public boolean equals(Object obj) {
        int i = values + 55;
        valueOf = i % 128;
        int i2 = i % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupPaymentInstrument)) {
            return false;
        }
        GroupPaymentInstrument groupPaymentInstrument = (GroupPaymentInstrument) obj;
        if (!(!runAnimators.values((Object) getTitle(), (Object) groupPaymentInstrument.getTitle()))) {
            if (runAnimators.values((Object) getSubtitle(), (Object) groupPaymentInstrument.getSubtitle())) {
                return !(!runAnimators.values((Object) this.icon, (Object) groupPaymentInstrument.icon));
            }
            return false;
        }
        int i3 = values + 11;
        valueOf = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    @Override // com.dreampay.commons.wallets.PayInstrumentItemDetails
    public String getOtherInfo() {
        try {
            int i = valueOf + 39;
            values = i % 128;
            int i2 = i % 2;
            int i3 = values + 79;
            valueOf = i3 % 128;
            int i4 = i3 % 2;
            return null;
        } catch (Exception e) {
            throw e;
        }
    }

    public int hashCode() {
        int i = values + 65;
        valueOf = i % 128;
        int i2 = i % 2;
        int hashCode = (((getTitle().hashCode() * 31) + getSubtitle().hashCode()) * 31) + this.icon.hashCode();
        int i3 = valueOf + 73;
        values = i3 % 128;
        int i4 = i3 % 2;
        return hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("GroupPaymentInstrument(title=");
            sb.append(getTitle());
            sb.append(", subtitle=");
            sb.append(getSubtitle());
            sb.append(", icon=");
            sb.append(this.icon);
            sb.append(')');
            String sb2 = sb.toString();
            int i = values + 73;
            valueOf = i % 128;
            int i2 = i % 2;
            return sb2;
        } catch (Exception e) {
            throw e;
        }
    }

    public GroupPaymentInstrument(String str, String str2, String str3) {
        runAnimators.ag$a(str, ah$a((byte) (Color.rgb(0, 0, 0) + 16777235), new char[]{0, 3, 0, 1, 13842}, 6 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
        runAnimators.ag$a(str2, "subtitle");
        runAnimators.ag$a(str3, "icon");
        this.title = str;
        this.subtitle = str2;
        this.icon = str3;
    }

    @Override // com.dreampay.commons.wallets.PayInstrumentItemDetails
    public String getTitle() {
        int i = valueOf + 79;
        values = i % 128;
        int i2 = i % 2;
        try {
            String str = this.title;
            int i3 = values + 121;
            valueOf = i3 % 128;
            if (!(i3 % 2 == 0)) {
                Object[] objArr = null;
                int length = objArr.length;
                return str;
            }
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.dreampay.commons.wallets.PayInstrumentItemDetails
    public String getSubtitle() {
        String str;
        int i = values + 7;
        valueOf = i % 128;
        if ((i % 2 != 0 ? 'b' : '2') != 'b') {
            str = this.subtitle;
        } else {
            try {
                str = this.subtitle;
                Object[] objArr = null;
                int length = objArr.length;
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            int i2 = values + 11;
            valueOf = i2 % 128;
            int i3 = i2 % 2;
            return str;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String getIcon() {
        try {
            int i = values + 9;
            try {
                valueOf = i % 128;
                int i2 = i % 2;
                String str = this.icon;
                int i3 = valueOf + 99;
                values = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.dreampay.commons.wallets.PayInstrumentItemDetails
    public String getIconUrl() {
        try {
            int i = valueOf + 109;
            values = i % 128;
            if ((i % 2 == 0 ? '!' : (char) 16) != 16) {
                String str = this.icon;
                Object obj = null;
                super.hashCode();
                return str;
            }
            return this.icon;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String ah$a(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = toString;
            char c = ah$a;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr3[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                isFirst.valueOf = 0;
                while (isFirst.valueOf < i2) {
                    isFirst.toString = cArr[isFirst.valueOf];
                    isFirst.ah$a = cArr[isFirst.valueOf + 1];
                    if (isFirst.toString == isFirst.ah$a) {
                        cArr3[isFirst.valueOf] = (char) (isFirst.toString - b2);
                        cArr3[isFirst.valueOf + 1] = (char) (isFirst.ah$a - b2);
                    } else {
                        isFirst.ag$a = isFirst.toString / c;
                        isFirst.invoke = isFirst.toString % c;
                        isFirst.values = isFirst.ah$a / c;
                        isFirst.ah$b = isFirst.ah$a % c;
                        if (isFirst.invoke == isFirst.ah$b) {
                            isFirst.ag$a = ((isFirst.ag$a + c) - 1) % c;
                            isFirst.values = ((isFirst.values + c) - 1) % c;
                            int i3 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i4 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i3];
                            cArr3[isFirst.valueOf + 1] = cArr2[i4];
                        } else if (isFirst.ag$a == isFirst.values) {
                            isFirst.invoke = ((isFirst.invoke + c) - 1) % c;
                            isFirst.ah$b = ((isFirst.ah$b + c) - 1) % c;
                            int i5 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i6 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i5];
                            cArr3[isFirst.valueOf + 1] = cArr2[i6];
                        } else {
                            int i7 = (isFirst.ag$a * c) + isFirst.ah$b;
                            int i8 = (isFirst.values * c) + isFirst.invoke;
                            cArr3[isFirst.valueOf] = cArr2[i7];
                            cArr3[isFirst.valueOf + 1] = cArr2[i8];
                        }
                    }
                    isFirst.valueOf += 2;
                }
            }
            for (int i9 = 0; i9 < i; i9++) {
                cArr3[i9] = (char) (cArr3[i9] ^ 13722);
            }
            str = new String(cArr3);
        }
        return str;
    }
}
