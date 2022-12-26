package o;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
/* loaded from: classes3.dex */
public class isTransitionGroup {
    private final byte[] ah$a = new byte[256];
    private int toString = 0;
    private ByteBuffer valueOf;
    private getLayoutMode values;

    public isTransitionGroup ag$a(ByteBuffer byteBuffer) {
        HaptikSDK$d();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.valueOf = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.valueOf.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public void ag$a() {
        this.valueOf = null;
        this.values = null;
    }

    private void HaptikSDK$d() {
        this.valueOf = null;
        Arrays.fill(this.ah$a, (byte) 0);
        this.values = new getLayoutMode();
        this.toString = 0;
    }

    public getLayoutMode ah$a() {
        if (this.valueOf == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (valueOf()) {
            return this.values;
        }
        HaptikSDK$c();
        if (!valueOf()) {
            ah$b();
            if (this.values.ah$a < 0) {
                this.values.HaptikSDK$d = 1;
            }
        }
        return this.values;
    }

    private void ah$b() {
        values(Integer.MAX_VALUE);
    }

    private void values(int i) {
        boolean z = false;
        while (!z && !valueOf() && this.values.ah$a <= i) {
            int values = values();
            if (values == 33) {
                int values2 = values();
                if (values2 == 1) {
                    HaptikWebView();
                } else if (values2 == 249) {
                    this.values.valueOf = new ViewGroupCompat();
                    invoke();
                } else if (values2 == 254) {
                    HaptikWebView();
                } else if (values2 == 255) {
                    HaptikSDK$a();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < 11; i2++) {
                        sb.append((char) this.ah$a[i2]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        HaptikSDK$e();
                    } else {
                        HaptikWebView();
                    }
                } else {
                    HaptikWebView();
                }
            } else if (values == 44) {
                if (this.values.valueOf == null) {
                    this.values.valueOf = new ViewGroupCompat();
                }
                HaptikSDK$b();
            } else if (values != 59) {
                this.values.HaptikSDK$d = 1;
            } else {
                z = true;
            }
        }
    }

    private void invoke() {
        values();
        int values = values();
        this.values.valueOf.toString = (values & 28) >> 2;
        if (this.values.valueOf.toString == 0) {
            this.values.valueOf.toString = 1;
        }
        this.values.valueOf.HaptikSDK$d = (values & 1) != 0;
        int initSettings = getInitSettings();
        if (initSettings < 2) {
            initSettings = 10;
        }
        this.values.valueOf.valueOf = initSettings * 10;
        this.values.valueOf.HaptikSDK$a = values();
        values();
    }

    private void HaptikSDK$b() {
        this.values.valueOf.HaptikSDK$b = getInitSettings();
        this.values.valueOf.HaptikSDK$c = getInitSettings();
        this.values.valueOf.invoke = getInitSettings();
        this.values.valueOf.values = getInitSettings();
        int values = values();
        boolean z = (values & 128) != 0;
        int pow = (int) Math.pow(2.0d, (values & 7) + 1);
        this.values.valueOf.ah$a = (values & 64) != 0;
        if (z) {
            this.values.valueOf.ah$b = ag$a(pow);
        } else {
            this.values.valueOf.ah$b = null;
        }
        this.values.valueOf.ag$a = this.valueOf.position();
        ak();
        if (valueOf()) {
            return;
        }
        this.values.ah$a++;
        this.values.ag$a.add(this.values.valueOf);
    }

    private void HaptikSDK$e() {
        do {
            HaptikSDK$a();
            byte[] bArr = this.ah$a;
            if (bArr[0] == 1) {
                byte b2 = bArr[1];
                this.values.HaptikSDK$c = ((bArr[2] & 255) << 8) | (b2 & 255);
            }
            if (this.toString <= 0) {
                return;
            }
        } while (!valueOf());
    }

    private void HaptikSDK$c() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) values());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.values.HaptikSDK$d = 1;
            return;
        }
        getSignupData();
        if (!this.values.invoke || valueOf()) {
            return;
        }
        getLayoutMode getlayoutmode = this.values;
        getlayoutmode.HaptikSDK$a = ag$a(getlayoutmode.HaptikSDK$b);
        getLayoutMode getlayoutmode2 = this.values;
        getlayoutmode2.values = getlayoutmode2.HaptikSDK$a[this.values.toString];
    }

    private void getSignupData() {
        this.values.HaptikSDK$e = getInitSettings();
        this.values.ah$b = getInitSettings();
        int values = values();
        this.values.invoke = (values & 128) != 0;
        this.values.HaptikSDK$b = (int) Math.pow(2.0d, (values & 7) + 1);
        this.values.toString = values();
        this.values.HaptikWebView = values();
    }

    private int[] ag$a(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.valueOf.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i2 + 1;
                int i5 = i4 + 1;
                iArr[i3] = ((bArr[i2] & 255) << 16) | androidx.core.view.ViewCompat.MEASURED_STATE_MASK | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i2 = i5 + 1;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.values.HaptikSDK$d = 1;
        }
        return iArr;
    }

    private void ak() {
        values();
        HaptikWebView();
    }

    private void HaptikWebView() {
        int values;
        do {
            values = values();
            this.valueOf.position(Math.min(this.valueOf.position() + values, this.valueOf.limit()));
        } while (values > 0);
    }

    private void HaptikSDK$a() {
        int values = values();
        this.toString = values;
        if (values <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                i = this.toString;
                if (i2 >= i) {
                    return;
                }
                i -= i2;
                this.valueOf.get(this.ah$a, i2, i);
                i2 += i;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i2 + " count: " + i + " blockSize: " + this.toString, e);
                }
                this.values.HaptikSDK$d = 1;
                return;
            }
        }
    }

    private int values() {
        try {
            return this.valueOf.get() & 255;
        } catch (Exception unused) {
            this.values.HaptikSDK$d = 1;
            return 0;
        }
    }

    private int getInitSettings() {
        return this.valueOf.getShort();
    }

    private boolean valueOf() {
        return this.values.HaptikSDK$d != 0;
    }
}
