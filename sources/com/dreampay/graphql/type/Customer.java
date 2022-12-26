package com.dreampay.graphql.type;

import android.view.ViewConfiguration;
import androidx.autofill.HintConstants;
import com.apxor.androidsdk.core.ce.Constants;
import o.ComponentActivity;
import o.OnBackPressedCallback;
import o.getShort;
import o.moveToFirst;
import o.remove;
import o.remove$ah$a;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class Customer implements ComponentActivity.AnonymousClass6 {
    private static char ag$a = 18579;
    private static char ah$a = 53980;
    private static int invoke = 1;
    private static char toString = 20750;
    private static char valueOf = 6458;
    private static int values;
    private final ComponentActivity.AnonymousClass5<String> email;
    private final String id;
    private final ComponentActivity.AnonymousClass5<String> meta;
    private final ComponentActivity.AnonymousClass5<String> phone;

    public boolean equals(Object obj) {
        int i = values + 5;
        invoke = i % 128;
        int i2 = i % 2;
        if (this == obj) {
            int i3 = values + 117;
            invoke = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof Customer)) {
            int i5 = invoke + 43;
            values = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        try {
            Customer customer = (Customer) obj;
            if (runAnimators.values((Object) this.id, (Object) customer.id)) {
                try {
                    if ((!runAnimators.values(this.phone, customer.phone) ? ':' : 'N') != 'N') {
                        int i7 = values + 35;
                        invoke = i7 % 128;
                        int i8 = i7 % 2;
                        return false;
                    }
                    if (runAnimators.values(this.email, customer.email)) {
                        if (!runAnimators.values(this.meta, customer.meta)) {
                            int i9 = values + 105;
                            invoke = i9 % 128;
                            int i10 = i9 % 2;
                            return false;
                        }
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    throw e;
                }
            }
            return false;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public int hashCode() {
        try {
            int i = invoke + 45;
            values = i % 128;
            int i2 = i % 2;
            int hashCode = (((((this.id.hashCode() * 31) + this.phone.hashCode()) * 31) + this.email.hashCode()) * 31) + this.meta.hashCode();
            int i3 = invoke + 107;
            values = i3 % 128;
            int i4 = i3 % 2;
            return hashCode;
        } catch (Exception e) {
            throw e;
        }
    }

    public String toString() {
        String str = "Customer(id=" + this.id + ", phone=" + this.phone + ", email=" + this.email + ", meta=" + this.meta + ')';
        try {
            int i = values + 69;
            invoke = i % 128;
            int i2 = i % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public Customer(String str, ComponentActivity.AnonymousClass5<String> anonymousClass5, ComponentActivity.AnonymousClass5<String> anonymousClass52, ComponentActivity.AnonymousClass5<String> anonymousClass53) {
        runAnimators.ag$a(str, ah$a(new char[]{61685, 37224}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2).intern());
        runAnimators.ag$a(anonymousClass5, HintConstants.AUTOFILL_HINT_PHONE);
        runAnimators.ag$a(anonymousClass52, "email");
        runAnimators.ag$a(anonymousClass53, Constants.META);
        this.id = str;
        this.phone = anonymousClass5;
        this.email = anonymousClass52;
        this.meta = anonymousClass53;
    }

    public final String getId() {
        int i = invoke + 77;
        values = i % 128;
        int i2 = i % 2;
        String str = this.id;
        int i3 = values + 117;
        invoke = i3 % 128;
        if ((i3 % 2 == 0 ? (char) 29 : '?') != 29) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        return str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Customer(java.lang.String r2, o.ComponentActivity.AnonymousClass5 r3, o.ComponentActivity.AnonymousClass5 r4, o.ComponentActivity.AnonymousClass5 r5, int r6, o.getTargetTypes r7) {
        /*
            r1 = this;
            r7 = r6 & 2
            r0 = 1
            if (r7 == 0) goto L7
            r7 = 1
            goto L8
        L7:
            r7 = 0
        L8:
            if (r7 == r0) goto Lb
            goto L1b
        Lb:
            int r3 = com.dreampay.graphql.type.Customer.values     // Catch: java.lang.Exception -> L3d
            int r3 = r3 + 85
            int r7 = r3 % 128
            com.dreampay.graphql.type.Customer.invoke = r7     // Catch: java.lang.Exception -> L3d
            int r3 = r3 % 2
            o.ComponentActivity$5$values r3 = o.ComponentActivity.AnonymousClass5.ag$a
            o.ComponentActivity$5 r3 = r3.ag$a()
        L1b:
            r7 = r6 & 4
            if (r7 == 0) goto L2f
            o.ComponentActivity$5$values r4 = o.ComponentActivity.AnonymousClass5.ag$a
            o.ComponentActivity$5 r4 = r4.ag$a()
            int r7 = com.dreampay.graphql.type.Customer.values
            int r7 = r7 + 19
            int r0 = r7 % 128
            com.dreampay.graphql.type.Customer.invoke = r0
            int r7 = r7 % 2
        L2f:
            r6 = r6 & 8
            if (r6 == 0) goto L39
            o.ComponentActivity$5$values r5 = o.ComponentActivity.AnonymousClass5.ag$a
            o.ComponentActivity$5 r5 = r5.ag$a()
        L39:
            r1.<init>(r2, r3, r4, r5)
            return
        L3d:
            r2 = move-exception
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dreampay.graphql.type.Customer.<init>(java.lang.String, o.ComponentActivity$5, o.ComponentActivity$5, o.ComponentActivity$5, int, o.getTargetTypes):void");
    }

    public final ComponentActivity.AnonymousClass5<String> getPhone() {
        int i = values + 43;
        invoke = i % 128;
        int i2 = i % 2;
        try {
            ComponentActivity.AnonymousClass5<String> anonymousClass5 = this.phone;
            int i3 = values + 7;
            invoke = i3 % 128;
            int i4 = i3 % 2;
            return anonymousClass5;
        } catch (Exception e) {
            throw e;
        }
    }

    public final ComponentActivity.AnonymousClass5<String> getEmail() {
        int i = invoke + 41;
        values = i % 128;
        if ((i % 2 != 0 ? 'V' : 'a') != 'a') {
            ComponentActivity.AnonymousClass5<String> anonymousClass5 = this.email;
            Object[] objArr = null;
            int length = objArr.length;
            return anonymousClass5;
        }
        return this.email;
    }

    public final ComponentActivity.AnonymousClass5<String> getMeta() {
        int i = values + 91;
        invoke = i % 128;
        int i2 = i % 2;
        ComponentActivity.AnonymousClass5<String> anonymousClass5 = this.meta;
        int i3 = values + 69;
        invoke = i3 % 128;
        if ((i3 % 2 == 0 ? (char) 0 : 'E') != 0) {
            return anonymousClass5;
        }
        Object obj = null;
        super.hashCode();
        return anonymousClass5;
    }

    @Override // o.ComponentActivity.AnonymousClass6
    public remove marshaller() {
        remove$ah$a remove_ah_a = remove.ag$a;
        remove removeVar = new remove() { // from class: com.dreampay.graphql.type.Customer$marshaller$$inlined$invoke$1
            private static long ah$a = 5197275931276975212L;
            private static int ah$b = 1;
            private static int toString;
            private static int valueOf;
            private static char values;

            @Override // o.remove
            public void marshal(OnBackPressedCallback onBackPressedCallback) {
                runAnimators.valueOf(onBackPressedCallback, "writer");
                onBackPressedCallback.ah$a(toString(ViewConfiguration.getKeyRepeatDelay() >> 16, new char[]{34775, 47793, 47639, 8517}, new char[]{40044, 21363, 28396, 18464}, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 17850), new char[]{51894, 60214}).intern(), Customer.this.getId());
                if ((Customer.this.getPhone().valueOf ? '!' : (char) 4) != 4) {
                    onBackPressedCallback.ah$a(HintConstants.AUTOFILL_HINT_PHONE, Customer.this.getPhone().values);
                }
                if (!(!Customer.this.getEmail().valueOf)) {
                    int i = toString + 77;
                    ah$b = i % 128;
                    if (i % 2 != 0) {
                        onBackPressedCallback.ah$a("email", Customer.this.getEmail().values);
                    } else {
                        onBackPressedCallback.ah$a("email", Customer.this.getEmail().values);
                        Object obj = null;
                        super.hashCode();
                    }
                }
                if ((Customer.this.getMeta().valueOf ? 'A' : '4') != 'A') {
                    return;
                }
                int i2 = toString + 11;
                ah$b = i2 % 128;
                int i3 = i2 % 2;
                onBackPressedCallback.ah$a(Constants.META, Customer.this.getMeta().values);
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
                        cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ ah$a) ^ valueOf) ^ values);
                        getShort.valueOf++;
                    }
                    str = new String(cArr6);
                }
                return str;
            }
        };
        try {
            int i = values + 57;
            invoke = i % 128;
            int i2 = i % 2;
            return removeVar;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String ah$a(char[] cArr, int i) {
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
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + ah$a)) ^ ((cArr3[0] >>> 5) + ag$a)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + valueOf)) ^ ((cArr3[1] >>> 5) + toString)));
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
