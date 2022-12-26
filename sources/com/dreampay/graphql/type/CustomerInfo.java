package com.dreampay.graphql.type;

import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import androidx.autofill.HintConstants;
import com.apxor.androidsdk.core.ce.Constants;
import com.dreampay.commons.constants.Constants;
import o.ComponentActivity;
import o.OnBackPressedCallback;
import o.getShort;
import o.moveToFirst;
import o.remove;
import o.remove$ah$a;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class CustomerInfo implements ComponentActivity.AnonymousClass6 {
    private static char ag$a = 61522;
    private static int ah$a = 0;
    private static int invoke = 1;
    private static char toString = 35047;
    private static char valueOf = 37473;
    private static char values = 44940;
    private final ComponentActivity.AnonymousClass5<String> email;
    private final String id;
    private final ComponentActivity.AnonymousClass5<String> meta;
    private final ComponentActivity.AnonymousClass5<String> phone;
    private final String vpa;

    public boolean equals(Object obj) {
        int i = ah$a + 39;
        invoke = i % 128;
        int i2 = i % 2;
        if ((this == obj ? (char) 4 : ',') != 4) {
            if (!(obj instanceof CustomerInfo)) {
                int i3 = invoke + 107;
                ah$a = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            CustomerInfo customerInfo = (CustomerInfo) obj;
            if (!runAnimators.values((Object) this.id, (Object) customerInfo.id)) {
                int i5 = invoke + 77;
                ah$a = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if (!runAnimators.values(this.phone, customerInfo.phone)) {
                return false;
            }
            if (!runAnimators.values(this.email, customerInfo.email)) {
                int i7 = ah$a + 49;
                invoke = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 74 / 0;
                    return false;
                }
                return false;
            }
            if ((!runAnimators.values(this.meta, customerInfo.meta) ? '_' : 'G') != 'G') {
                return false;
            }
            if (!(runAnimators.values((Object) this.vpa, (Object) customerInfo.vpa))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = ah$a + 81;
        invoke = i % 128;
        int i2 = i % 2;
        int hashCode = (((((((this.id.hashCode() * 31) + this.phone.hashCode()) * 31) + this.email.hashCode()) * 31) + this.meta.hashCode()) * 31) + this.vpa.hashCode();
        int i3 = invoke + 97;
        ah$a = i3 % 128;
        if ((i3 % 2 != 0 ? '_' : ',') != '_') {
            return hashCode;
        }
        int i4 = 70 / 0;
        return hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("CustomerInfo(id=");
            sb.append(this.id);
            sb.append(", phone=");
            sb.append(this.phone);
            sb.append(", email=");
            sb.append(this.email);
            sb.append(", meta=");
            sb.append(this.meta);
            sb.append(", vpa=");
            sb.append(this.vpa);
            sb.append(')');
            String sb2 = sb.toString();
            int i = ah$a + 59;
            invoke = i % 128;
            if (!(i % 2 != 0)) {
                Object[] objArr = null;
                int length = objArr.length;
                return sb2;
            }
            return sb2;
        } catch (Exception e) {
            throw e;
        }
    }

    public CustomerInfo(String str, ComponentActivity.AnonymousClass5<String> anonymousClass5, ComponentActivity.AnonymousClass5<String> anonymousClass52, ComponentActivity.AnonymousClass5<String> anonymousClass53, String str2) {
        runAnimators.ag$a(str, values(new char[]{21191, 50498}, 2 - View.MeasureSpec.getSize(0)).intern());
        runAnimators.ag$a(anonymousClass5, HintConstants.AUTOFILL_HINT_PHONE);
        runAnimators.ag$a(anonymousClass52, "email");
        runAnimators.ag$a(anonymousClass53, Constants.META);
        runAnimators.ag$a(str2, Constants.Navigation.VPA);
        this.id = str;
        this.phone = anonymousClass5;
        this.email = anonymousClass52;
        this.meta = anonymousClass53;
        this.vpa = str2;
    }

    public final String getId() {
        int i = invoke + 111;
        ah$a = i % 128;
        int i2 = i % 2;
        String str = this.id;
        int i3 = invoke + 67;
        ah$a = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final ComponentActivity.AnonymousClass5<String> getPhone() {
        try {
            int i = invoke + 115;
            try {
                ah$a = i % 128;
                int i2 = i % 2;
                ComponentActivity.AnonymousClass5<String> anonymousClass5 = this.phone;
                int i3 = ah$a + 125;
                invoke = i3 % 128;
                if ((i3 % 2 == 0 ? '1' : 'E') != '1') {
                    return anonymousClass5;
                }
                Object[] objArr = null;
                int length = objArr.length;
                return anonymousClass5;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final ComponentActivity.AnonymousClass5<String> getEmail() {
        try {
            int i = ah$a + 95;
            try {
                invoke = i % 128;
                int i2 = i % 2;
                ComponentActivity.AnonymousClass5<String> anonymousClass5 = this.email;
                int i3 = invoke + 99;
                ah$a = i3 % 128;
                if (i3 % 2 != 0) {
                    Object obj = null;
                    super.hashCode();
                    return anonymousClass5;
                }
                return anonymousClass5;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final ComponentActivity.AnonymousClass5<String> getMeta() {
        int i = ah$a + 63;
        invoke = i % 128;
        int i2 = i % 2;
        ComponentActivity.AnonymousClass5<String> anonymousClass5 = this.meta;
        int i3 = invoke + 21;
        ah$a = i3 % 128;
        int i4 = i3 % 2;
        return anonymousClass5;
    }

    public final String getVpa() {
        int i = invoke + 121;
        ah$a = i % 128;
        int i2 = i % 2;
        try {
            String str = this.vpa;
            try {
                int i3 = invoke + 75;
                ah$a = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // o.ComponentActivity.AnonymousClass6
    public remove marshaller() {
        remove$ah$a remove_ah_a = remove.ag$a;
        remove removeVar = new remove() { // from class: com.dreampay.graphql.type.CustomerInfo$marshaller$$inlined$invoke$1
            private static int HaptikSDK$a = 1;
            private static long ah$a = 0;
            private static char toString = 0;
            private static int valueOf = 0;
            private static int values = 1514070648;

            @Override // o.remove
            public void marshal(OnBackPressedCallback onBackPressedCallback) {
                int i = HaptikSDK$a + 119;
                valueOf = i % 128;
                int i2 = i % 2;
                runAnimators.valueOf(onBackPressedCallback, "writer");
                onBackPressedCallback.ah$a(toString(KeyEvent.keyCodeFromString(""), new char[]{5617, 2716, 11300, 25782}, new char[]{0, 0, 0, 0}, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 46636), new char[]{12981, 50951}).intern(), CustomerInfo.this.getId());
                if ((CustomerInfo.this.getPhone().valueOf ? (char) 27 : 'S') != 'S') {
                    onBackPressedCallback.ah$a(HintConstants.AUTOFILL_HINT_PHONE, CustomerInfo.this.getPhone().values);
                }
                Object[] objArr = null;
                if (!(CustomerInfo.this.getEmail().valueOf ? false : true)) {
                    int i3 = valueOf + 53;
                    HaptikSDK$a = i3 % 128;
                    if (i3 % 2 == 0) {
                        onBackPressedCallback.ah$a("email", CustomerInfo.this.getEmail().values);
                        int length = objArr.length;
                    } else {
                        onBackPressedCallback.ah$a("email", CustomerInfo.this.getEmail().values);
                    }
                }
                if (CustomerInfo.this.getMeta().valueOf) {
                    int i4 = HaptikSDK$a + 13;
                    valueOf = i4 % 128;
                    if (i4 % 2 != 0) {
                        onBackPressedCallback.ah$a(com.apxor.androidsdk.core.ce.Constants.META, CustomerInfo.this.getMeta().values);
                        super.hashCode();
                    } else {
                        onBackPressedCallback.ah$a(com.apxor.androidsdk.core.ce.Constants.META, CustomerInfo.this.getMeta().values);
                    }
                }
                onBackPressedCallback.ah$a(Constants.Navigation.VPA, CustomerInfo.this.getVpa());
            }

            private static String toString(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
                String str;
                synchronized (getShort.toString) {
                    char[] cArr4 = (char[]) cArr.clone();
                    char[] cArr5 = (char[]) cArr2.clone();
                    cArr4[0] = (char) (c ^ cArr4[0]);
                    cArr5[2] = (char) (cArr5[2] + ((char) i));
                    int length = cArr3.length;
                    char[] cArr6 = new char[length];
                    getShort.valueOf = 0;
                    while (getShort.valueOf < length) {
                        int i2 = (getShort.valueOf + 2) % 4;
                        int i3 = (getShort.valueOf + 3) % 4;
                        getShort.values = (char) (((cArr4[getShort.valueOf % 4] * 32718) + cArr5[i2]) % 65535);
                        cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                        cArr4[i3] = getShort.values;
                        cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ ah$a) ^ values) ^ toString);
                        getShort.valueOf++;
                    }
                    str = new String(cArr6);
                }
                return str;
            }
        };
        int i = ah$a + 3;
        invoke = i % 128;
        if ((i % 2 == 0 ? (char) 3 : (char) 27) != 3) {
            return removeVar;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return removeVar;
    }

    private static String values(char[] cArr, int i) {
        String str;
        synchronized (moveToFirst.ah$a) {
            char[] cArr2 = new char[cArr.length];
            moveToFirst.values = 0;
            char[] cArr3 = new char[2];
            while (moveToFirst.values < cArr.length) {
                cArr3[0] = cArr[moveToFirst.values];
                cArr3[1] = cArr[moveToFirst.values + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + values)) ^ ((cArr3[0] >>> 5) + toString)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + valueOf)) ^ ((cArr3[1] >>> 5) + ag$a)));
                    i2 -= 40503;
                }
                cArr2[moveToFirst.values] = cArr3[0];
                cArr2[moveToFirst.values + 1] = cArr3[1];
                moveToFirst.values += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
