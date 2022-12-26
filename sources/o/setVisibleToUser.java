package o;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class setVisibleToUser {
    private final byte[] ag$a = new byte[256];
    private int ah$a = 0;
    private setRoleDescription valueOf;
    private ByteBuffer values;

    public setVisibleToUser valueOf(ByteBuffer byteBuffer) {
        HaptikSDK$e();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.values = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.values.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public setVisibleToUser toString(byte[] bArr) {
        if (bArr != null) {
            valueOf(ByteBuffer.wrap(bArr));
        } else {
            this.values = null;
            this.valueOf.HaptikWebView = 2;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setRoleDescription valueOf() {
        if (this.values == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (ah$a()) {
            return this.valueOf;
        }
        HaptikSDK$c();
        if (!ah$a()) {
            ah$b();
            if (this.valueOf.ag$a < 0) {
                this.valueOf.HaptikWebView = 1;
            }
        }
        return this.valueOf;
    }

    private boolean ah$a() {
        return this.valueOf.HaptikWebView != 0;
    }

    private int ag$a() {
        try {
            return this.values.get() & 255;
        } catch (Exception unused) {
            this.valueOf.HaptikWebView = 1;
            return 0;
        }
    }

    private void values() {
        this.valueOf.toString.HaptikSDK$b = getSignupData();
        this.valueOf.toString.ah$b = getSignupData();
        this.valueOf.toString.HaptikSDK$a = getSignupData();
        this.valueOf.toString.ag$a = getSignupData();
        int ag$a = ag$a();
        boolean z = (ag$a & 128) != 0;
        int pow = (int) Math.pow(2.0d, (ag$a & 7) + 1);
        this.valueOf.toString.ah$a = (ag$a & 64) != 0;
        if (z) {
            this.valueOf.toString.HaptikSDK$c = values(pow);
        } else {
            this.valueOf.toString.HaptikSDK$c = null;
        }
        this.valueOf.toString.valueOf = this.values.position();
        getInitSettings();
        if (ah$a()) {
            return;
        }
        this.valueOf.ag$a++;
        this.valueOf.valueOf.add(this.valueOf.toString);
    }

    private int HaptikSDK$a() {
        int ag$a = ag$a();
        this.ah$a = ag$a;
        int i = 0;
        if (ag$a > 0) {
            while (true) {
                try {
                    int i2 = this.ah$a;
                    if (i >= i2) {
                        break;
                    }
                    int i3 = i2 - i;
                    this.values.get(this.ag$a, i, i3);
                    i += i3;
                } catch (Exception unused) {
                    this.valueOf.HaptikWebView = 1;
                }
            }
        }
        return i;
    }

    private int[] values(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.values.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i2 + 1;
                int i5 = i4 + 1;
                iArr[i3] = ((bArr[i2] & 255) << 16) | androidx.core.view.ViewCompat.MEASURED_STATE_MASK | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i2 = i5 + 1;
            }
        } catch (BufferUnderflowException e) {
            setBoundsInScreen.ah$a("GifHeaderParser", "Format Error Reading Color Table", e);
            this.valueOf.HaptikWebView = 1;
        }
        return iArr;
    }

    private void ah$b() {
        toString(Integer.MAX_VALUE);
    }

    private void toString(int i) {
        boolean z = false;
        while (!z && !ah$a() && this.valueOf.ag$a <= i) {
            int ag$a = ag$a();
            if (ag$a == 33) {
                int ag$a2 = ag$a();
                if (ag$a2 == 1) {
                    HaptikSDK$d();
                } else if (ag$a2 == 249) {
                    this.valueOf.toString = new setScrollable();
                    invoke();
                } else if (ag$a2 == 254) {
                    HaptikSDK$d();
                } else if (ag$a2 == 255) {
                    HaptikSDK$a();
                    String str = "";
                    for (int i2 = 0; i2 < 11; i2++) {
                        str = str + ((char) this.ag$a[i2]);
                    }
                    if (str.equals("NETSCAPE2.0")) {
                        HaptikWebView();
                    } else {
                        HaptikSDK$d();
                    }
                } else {
                    HaptikSDK$d();
                }
            } else if (ag$a == 44) {
                if (this.valueOf.toString == null) {
                    this.valueOf.toString = new setScrollable();
                }
                values();
            } else if (ag$a != 59) {
                this.valueOf.HaptikWebView = 1;
            } else {
                z = true;
            }
        }
    }

    private void invoke() {
        ag$a();
        int ag$a = ag$a();
        this.valueOf.toString.toString = (ag$a & 28) >> 2;
        if (this.valueOf.toString.toString == 0) {
            this.valueOf.toString.toString = 1;
        }
        this.valueOf.toString.HaptikSDK$d = (ag$a & 1) != 0;
        int signupData = getSignupData();
        if (signupData < 2) {
            signupData = 10;
        }
        this.valueOf.toString.values = signupData * 10;
        this.valueOf.toString.invoke = ag$a();
        ag$a();
    }

    private void HaptikSDK$c() {
        String str = "";
        for (int i = 0; i < 6; i++) {
            str = str + ((char) ag$a());
        }
        if (!str.startsWith("GIF")) {
            this.valueOf.HaptikWebView = 1;
            return;
        }
        HaptikSDK$b();
        if (!this.valueOf.HaptikSDK$b || ah$a()) {
            return;
        }
        setRoleDescription setroledescription = this.valueOf;
        setroledescription.HaptikSDK$c = values(setroledescription.ah$b);
        setRoleDescription setroledescription2 = this.valueOf;
        setroledescription2.values = setroledescription2.HaptikSDK$c[this.valueOf.ah$a];
    }

    private void HaptikSDK$b() {
        this.valueOf.getInitSettings = getSignupData();
        this.valueOf.HaptikSDK$a = getSignupData();
        int ag$a = ag$a();
        this.valueOf.HaptikSDK$b = (ag$a & 128) != 0;
        this.valueOf.ah$b = 2 << (ag$a & 7);
        this.valueOf.ah$a = ag$a();
        this.valueOf.HaptikSDK$e = ag$a();
    }

    private void HaptikWebView() {
        do {
            HaptikSDK$a();
            byte[] bArr = this.ag$a;
            if (bArr[0] == 1) {
                byte b2 = bArr[1];
                this.valueOf.invoke = ((bArr[2] & 255) << 8) | (b2 & 255);
                if (this.valueOf.invoke == 0) {
                    this.valueOf.invoke = -1;
                }
            }
            if (this.ah$a <= 0) {
                return;
            }
        } while (!ah$a());
    }

    private int getSignupData() {
        return this.values.getShort();
    }

    private void HaptikSDK$e() {
        this.values = null;
        Arrays.fill(this.ag$a, (byte) 0);
        this.valueOf = new setRoleDescription();
        this.ah$a = 0;
    }

    private void HaptikSDK$d() {
        int ag$a;
        do {
            try {
                ag$a = ag$a();
                ByteBuffer byteBuffer = this.values;
                byteBuffer.position(byteBuffer.position() + ag$a);
            } catch (IllegalArgumentException unused) {
                return;
            }
        } while (ag$a > 0);
    }

    private void getInitSettings() {
        ag$a();
        HaptikSDK$d();
    }
}
