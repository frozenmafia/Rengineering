package com.dreampay.commons;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.autofill.HintConstants;
import com.apxor.androidsdk.core.ce.Constants;
import o.isFirst;
import o.isFullSpan;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class Customer {
    private static char[] ah$a = {2, 13811, 1, 13822};
    private static int toString = 0;
    private static int valueOf = 1;
    private static char values = 2;
    @isFullSpan(valueOf = "email")
    private final String email;
    @isFullSpan(valueOf = "id")
    private final String id;
    @isFullSpan(valueOf = Constants.META)
    private final String meta;
    @isFullSpan(valueOf = HintConstants.AUTOFILL_HINT_PHONE)
    private final String phone;

    public static /* synthetic */ Customer copy$default(Customer customer, String str, String str2, String str3, String str4, int i, Object obj) {
        try {
            int i2 = toString + 73;
            try {
                valueOf = i2 % 128;
                if ((i2 % 2 == 0 ? (char) 7 : (char) 2) == 2 ? (i & 1) != 0 : (i | 0) != 0) {
                    str = customer.id;
                }
                if ((i & 2) != 0) {
                    int i3 = toString + 49;
                    valueOf = i3 % 128;
                    if (i3 % 2 == 0) {
                        str2 = customer.phone;
                        int i4 = 36 / 0;
                    } else {
                        str2 = customer.phone;
                    }
                }
                if ((i & 4) != 0) {
                    str3 = customer.email;
                }
                if ((i & 8) != 0) {
                    str4 = customer.meta;
                }
                return customer.copy(str, str2, str3, str4);
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String component1() {
        int i = valueOf + 21;
        toString = i % 128;
        int i2 = i % 2;
        String str = this.id;
        int i3 = toString + 13;
        valueOf = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 17 / 0;
            return str;
        }
        return str;
    }

    public final String component2() {
        int i = valueOf + 47;
        toString = i % 128;
        if (!(i % 2 != 0)) {
            try {
                return this.phone;
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            int i2 = 3 / 0;
            return this.phone;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String component3() {
        try {
            int i = valueOf + 125;
            toString = i % 128;
            int i2 = i % 2;
            String str = this.email;
            try {
                int i3 = toString + 71;
                valueOf = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String component4() {
        try {
            int i = valueOf + 21;
            toString = i % 128;
            int i2 = i % 2;
            String str = this.meta;
            int i3 = toString + 53;
            valueOf = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final Customer copy(String str, String str2, String str3, String str4) {
        runAnimators.ag$a(str, values((byte) (101 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), new char[]{3, 1}, 1 - ((byte) KeyEvent.getModifierMetaStateMask())).intern());
        Customer customer = new Customer(str, str2, str3, str4);
        int i = valueOf + 71;
        toString = i % 128;
        int i2 = i % 2;
        return customer;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            int i = toString + 11;
            valueOf = i % 128;
            if (i % 2 == 0) {
                Object obj2 = null;
                super.hashCode();
                return true;
            }
            return true;
        }
        try {
            if (!(obj instanceof Customer)) {
                int i2 = toString + 123;
                valueOf = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            Customer customer = (Customer) obj;
            if (runAnimators.values((Object) this.id, (Object) customer.id)) {
                if ((!runAnimators.values((Object) this.phone, (Object) customer.phone) ? ',' : '!') != '!') {
                    int i4 = toString + 25;
                    valueOf = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                } else if (runAnimators.values((Object) this.email, (Object) customer.email)) {
                    try {
                        if ((!runAnimators.values((Object) this.meta, (Object) customer.meta) ? (char) 15 : '&') != '&') {
                            int i6 = valueOf + 123;
                            toString = i6 % 128;
                            int i7 = i6 % 2;
                            return false;
                        }
                        return true;
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    return false;
                }
            }
            return false;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.id.hashCode();
        String str = this.phone;
        if ((str == null ? '_' : (char) 4) != 4) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
            int i = toString + 77;
            valueOf = i % 128;
            int i2 = i % 2;
        }
        String str2 = this.email;
        if (str2 == null) {
            int i3 = valueOf + 99;
            toString = i3 % 128;
            int i4 = i3 % 2;
            hashCode2 = 0;
        } else {
            try {
                hashCode2 = str2.hashCode();
            } catch (Exception e) {
                throw e;
            }
        }
        String str3 = this.meta;
        int hashCode4 = (((((hashCode3 * 31) + hashCode) * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        int i5 = valueOf + 121;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return hashCode4;
    }

    public String toString() {
        String str = "Customer(id=" + this.id + ", phone=" + ((Object) this.phone) + ", email=" + ((Object) this.email) + ", meta=" + ((Object) this.meta) + ')';
        try {
            int i = valueOf + 1;
            toString = i % 128;
            if ((i % 2 != 0 ? (char) 2 : 'a') != 2) {
                return str;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public Customer(String str, String str2, String str3, String str4) {
        runAnimators.ag$a(str, values((byte) (View.MeasureSpec.getMode(0) + 101), new char[]{3, 1}, (ViewConfiguration.getPressedStateDuration() >> 16) + 2).intern());
        this.id = str;
        this.phone = str2;
        this.email = str3;
        this.meta = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Customer(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, o.getTargetTypes r8) {
        /*
            r2 = this;
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto L20
            int r4 = com.dreampay.commons.Customer.valueOf
            int r4 = r4 + 125
            int r8 = r4 % 128
            com.dreampay.commons.Customer.toString = r8
            int r4 = r4 % 2
            r8 = 91
            if (r4 == 0) goto L16
            r4 = 91
            goto L18
        L16:
            r4 = 88
        L18:
            if (r4 == r8) goto L1c
        L1a:
            r4 = r0
            goto L20
        L1c:
            int r4 = r0.length     // Catch: java.lang.Throwable -> L1e
            goto L1a
        L1e:
            r3 = move-exception
            throw r3
        L20:
            r8 = r7 & 4
            if (r8 == 0) goto L35
            int r5 = com.dreampay.commons.Customer.toString
            int r5 = r5 + 29
            int r8 = r5 % 128
            com.dreampay.commons.Customer.valueOf = r8
            int r5 = r5 % 2
            if (r5 != 0) goto L34
            int r5 = r0.length     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r3 = move-exception
            throw r3
        L34:
            r5 = r0
        L35:
            r7 = r7 & 8
            r8 = 0
            r1 = 1
            if (r7 == 0) goto L3d
            r7 = 0
            goto L3e
        L3d:
            r7 = 1
        L3e:
            if (r7 == r1) goto L58
            int r6 = com.dreampay.commons.Customer.toString
            int r6 = r6 + 125
            int r7 = r6 % 128
            com.dreampay.commons.Customer.valueOf = r7
            int r6 = r6 % 2
            if (r6 != 0) goto L4e
            r6 = 1
            goto L4f
        L4e:
            r6 = 0
        L4f:
            if (r6 == r1) goto L52
            goto L54
        L52:
            r6 = 7
            int r6 = r6 / r8
        L54:
            r6 = r0
            goto L58
        L56:
            r3 = move-exception
            throw r3
        L58:
            r2.<init>(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dreampay.commons.Customer.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, o.getTargetTypes):void");
    }

    public final String getId() {
        int i = valueOf + 91;
        toString = i % 128;
        int i2 = i % 2;
        String str = this.id;
        try {
            int i3 = valueOf + 67;
            toString = i3 % 128;
            if (!(i3 % 2 != 0)) {
                return str;
            }
            Object obj = null;
            super.hashCode();
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getPhone() {
        int i = valueOf + 63;
        toString = i % 128;
        int i2 = i % 2;
        String str = this.phone;
        int i3 = valueOf + 3;
        toString = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final String getEmail() {
        int i = toString + 73;
        valueOf = i % 128;
        if (!(i % 2 != 0)) {
            try {
                int i2 = 69 / 0;
                return this.email;
            } catch (Exception e) {
                throw e;
            }
        }
        return this.email;
    }

    public final String getMeta() {
        int i = valueOf + 47;
        toString = i % 128;
        int i2 = i % 2;
        String str = this.meta;
        int i3 = valueOf + 13;
        toString = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    private static String values(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = ah$a;
            char c = values;
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
