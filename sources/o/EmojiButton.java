package o;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.dreampay.commons.cards.CardConsentFlowEnum;
import com.dreampay.commons.cards.ConsentType;
import com.dreampay.commons.constants.Constants;
import com.dreampay.commons.upi.UpiCollectAvailability;
import java.util.List;
/* loaded from: classes4.dex */
public abstract class EmojiButton {
    public /* synthetic */ EmojiButton(getTargetTypes gettargettypes) {
        this();
    }

    private EmojiButton() {
    }

    /* loaded from: classes4.dex */
    public static final class toString extends EmojiButton {
        private final int ag$a;
        private final String toString;
        private final UpiCollectAvailability valueOf;
        private final String values;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof toString) {
                toString tostring = (toString) obj;
                return runAnimators.values((Object) this.values, (Object) tostring.values) && runAnimators.values((Object) this.toString, (Object) tostring.toString) && runAnimators.values(this.valueOf, tostring.valueOf) && this.ag$a == tostring.ag$a;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.values.hashCode() * 31) + this.toString.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.ag$a;
        }

        public String toString() {
            return "UPICollectFragmentArguments(base64Request=" + this.values + ", checksum=" + this.toString + ", upiCollectAvailability=" + this.valueOf + ", requestCode=" + this.ag$a + ')';
        }

        public final String ah$a() {
            return this.toString;
        }

        public final String valueOf() {
            return this.values;
        }

        public final UpiCollectAvailability ag$a() {
            return this.valueOf;
        }

        public final int values() {
            return this.ag$a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public toString(String str, String str2, UpiCollectAvailability upiCollectAvailability, int i) {
            super(null);
            runAnimators.ag$a(str, "base64Request");
            runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
            runAnimators.ag$a(upiCollectAvailability, "upiCollectAvailability");
            this.values = str;
            this.toString = str2;
            this.valueOf = upiCollectAvailability;
            this.ag$a = i;
        }
    }

    /* loaded from: classes4.dex */
    public static final class values extends EmojiButton {
        private static int HaptikSDK$a = 1;
        private static int HaptikSDK$c = 0;
        private static char[] ah$b = {13806, 13814, 13811, 13823};
        private static char invoke = 2;
        private final int ag$a;
        private final String ah$a;
        private final String toString;
        private final String valueOf;
        private final String values;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((!(obj instanceof values) ? 'N' : '*') != '*') {
                return false;
            }
            values valuesVar = (values) obj;
            if ((!runAnimators.values((Object) this.valueOf, (Object) valuesVar.valueOf) ? 'C' : '^') != '^') {
                return false;
            }
            if (!runAnimators.values((Object) this.values, (Object) valuesVar.values)) {
                int i = HaptikSDK$c + 37;
                HaptikSDK$a = i % 128;
                int i2 = i % 2;
                return false;
            }
            try {
                try {
                    if ((this.ag$a != valuesVar.ag$a ? '/' : (char) 17) != '/') {
                        if (!runAnimators.values((Object) this.toString, (Object) valuesVar.toString)) {
                            return false;
                        }
                        return runAnimators.values((Object) this.ah$a, (Object) valuesVar.ah$a);
                    }
                    int i3 = HaptikSDK$a + 31;
                    HaptikSDK$c = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = HaptikSDK$a + 29;
                    HaptikSDK$c = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }

        public int hashCode() {
            int i = HaptikSDK$a + 117;
            HaptikSDK$c = i % 128;
            int hashCode = !(i % 2 == 0) ? (((((((this.valueOf.hashCode() - 0) - this.values.hashCode()) % 9) >>> this.ag$a) << 93) >>> this.toString.hashCode()) - 0) * this.ah$a.hashCode() : (((((((this.valueOf.hashCode() * 31) + this.values.hashCode()) * 31) + this.ag$a) * 31) + this.toString.hashCode()) * 31) + this.ah$a.hashCode();
            try {
                int i2 = HaptikSDK$a + 81;
                HaptikSDK$c = i2 % 128;
                int i3 = i2 % 2;
                return hashCode;
            } catch (Exception e) {
                throw e;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            try {
                sb.append("DpayBottomsheetFragmentArguments(title=");
                sb.append(this.valueOf);
                sb.append(", message=");
                sb.append(this.values);
                sb.append(", requestCode=");
                sb.append(this.ag$a);
                sb.append(", primaryTitle=");
                sb.append(this.toString);
                sb.append(", secondaryTitle=");
                sb.append(this.ah$a);
                sb.append(')');
                String sb2 = sb.toString();
                try {
                    int i = HaptikSDK$a + 53;
                    HaptikSDK$c = i % 128;
                    int i2 = i % 2;
                    return sb2;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }

        public final String HaptikSDK$b() {
            int i = HaptikSDK$a + 123;
            HaptikSDK$c = i % 128;
            if (i % 2 != 0) {
                try {
                    String str = this.valueOf;
                    Object[] objArr = null;
                    int length = objArr.length;
                    return str;
                } catch (Exception e) {
                    throw e;
                }
            }
            return this.valueOf;
        }

        public final int ah$a() {
            try {
                int i = HaptikSDK$c + 29;
                try {
                    HaptikSDK$a = i % 128;
                    if ((i % 2 == 0 ? 'U' : '$') != '$') {
                        int i2 = this.ag$a;
                        Object[] objArr = null;
                        int length = objArr.length;
                        return i2;
                    }
                    return this.ag$a;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }

        public final String valueOf() {
            String str;
            try {
                int i = HaptikSDK$a + 39;
                HaptikSDK$c = i % 128;
                if ((i % 2 != 0 ? '`' : '6') != '6') {
                    str = this.values;
                    int i2 = 6 / 0;
                } else {
                    str = this.values;
                }
                int i3 = HaptikSDK$c + 95;
                HaptikSDK$a = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        }

        public final String values() {
            try {
                int i = HaptikSDK$c + 35;
                HaptikSDK$a = i % 128;
                int i2 = i % 2;
                String str = this.toString;
                int i3 = HaptikSDK$c + 95;
                HaptikSDK$a = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public values(String str, String str2, int i, String str3, String str4) {
            super(null);
            runAnimators.ag$a(str, ag$a((byte) (33 - (ViewConfiguration.getLongPressTimeout() >> 16)), new char[]{2, 0, 1, 0, 13856}, TextUtils.indexOf("", "", 0) + 5).intern());
            runAnimators.ag$a(str2, "message");
            runAnimators.ag$a(str3, "primaryTitle");
            runAnimators.ag$a(str4, "secondaryTitle");
            this.valueOf = str;
            this.values = str2;
            this.ag$a = i;
            this.toString = str3;
            this.ah$a = str4;
        }

        public final String ag$a() {
            int i = HaptikSDK$c + 89;
            HaptikSDK$a = i % 128;
            if ((i % 2 == 0 ? 'O' : 'I') != 'O') {
                return this.ah$a;
            }
            String str = this.ah$a;
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        }

        private static String ag$a(byte b2, char[] cArr, int i) {
            int i2;
            String str;
            synchronized (isFirst.HaptikSDK$b) {
                char[] cArr2 = ah$b;
                char c = invoke;
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

    /* loaded from: classes4.dex */
    public static final class valueOf extends EmojiButton {
        private final List<String> HaptikSDK$b;
        private CardConsentFlowEnum ag$a;
        private final String ah$a;
        private final boolean invoke;
        private final List<String> toString;
        private final String valueOf;
        private final ConsentType values;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof valueOf) {
                valueOf valueof = (valueOf) obj;
                return runAnimators.values((Object) this.ah$a, (Object) valueof.ah$a) && runAnimators.values(this.HaptikSDK$b, valueof.HaptikSDK$b) && runAnimators.values(this.toString, valueof.toString) && runAnimators.values((Object) this.valueOf, (Object) valueof.valueOf) && this.values == valueof.values && this.invoke == valueof.invoke && this.ag$a == valueof.ag$a;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.ah$a.hashCode();
            List<String> list = this.HaptikSDK$b;
            int hashCode2 = list == null ? 0 : list.hashCode();
            List<String> list2 = this.toString;
            int hashCode3 = list2 == null ? 0 : list2.hashCode();
            String str = this.valueOf;
            int hashCode4 = str != null ? str.hashCode() : 0;
            int hashCode5 = this.values.hashCode();
            boolean z = this.invoke;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i) * 31) + this.ag$a.hashCode();
        }

        public String toString() {
            return "TokenisationBottomSheetArguments(headerText=" + this.ah$a + ", longMessages=" + this.HaptikSDK$b + ", bulletPointers=" + this.toString + ", iconUrl=" + ((Object) this.valueOf) + ", consentType=" + this.values + ", isEnforcedTokenisation=" + this.invoke + ", consentFlowEnum=" + this.ag$a + ')';
        }

        public final String ah$a() {
            return this.ah$a;
        }

        public final List<String> ah$b() {
            return this.HaptikSDK$b;
        }

        public final String HaptikSDK$c() {
            return this.valueOf;
        }

        public final List<String> ag$a() {
            return this.toString;
        }

        public final ConsentType values() {
            return this.values;
        }

        public final boolean HaptikSDK$b() {
            return this.invoke;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public valueOf(String str, List<String> list, List<String> list2, String str2, ConsentType consentType, boolean z, CardConsentFlowEnum cardConsentFlowEnum) {
            super(null);
            runAnimators.ag$a(str, "headerText");
            runAnimators.ag$a(consentType, "consentType");
            runAnimators.ag$a(cardConsentFlowEnum, "consentFlowEnum");
            this.ah$a = str;
            this.HaptikSDK$b = list;
            this.toString = list2;
            this.valueOf = str2;
            this.values = consentType;
            this.invoke = z;
            this.ag$a = cardConsentFlowEnum;
        }

        public final CardConsentFlowEnum valueOf() {
            return this.ag$a;
        }
    }
}
