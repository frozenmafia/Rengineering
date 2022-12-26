package o;

import java.util.Arrays;
/* loaded from: classes3.dex */
final class FindAddress$ZipRange$ah$a {
    private static final byte[] ah$a = {0, 0, 1};
    public int ag$a;
    private int invoke;
    public int toString;
    private boolean valueOf;
    public byte[] values;

    public FindAddress$ZipRange$ah$a(int i) {
        this.values = new byte[i];
    }

    public void valueOf() {
        this.valueOf = false;
        this.ag$a = 0;
        this.invoke = 0;
    }

    public boolean ag$a(int i, int i2) {
        int i3 = this.invoke;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            throw new IllegalStateException();
                        }
                        if (i == 179 || i == 181) {
                            this.ag$a -= i2;
                            this.valueOf = false;
                            return true;
                        }
                    } else if ((i & 240) != 32) {
                        SupportMenuItem.toString("H263Reader", "Unexpected start code value");
                        valueOf();
                    } else {
                        this.toString = this.ag$a;
                        this.invoke = 4;
                    }
                } else if (i > 31) {
                    SupportMenuItem.toString("H263Reader", "Unexpected start code value");
                    valueOf();
                } else {
                    this.invoke = 3;
                }
            } else if (i != 181) {
                SupportMenuItem.toString("H263Reader", "Unexpected start code value");
                valueOf();
            } else {
                this.invoke = 2;
            }
        } else if (i == 176) {
            this.invoke = 1;
            this.valueOf = true;
        }
        byte[] bArr = ah$a;
        ah$a(bArr, 0, bArr.length);
        return false;
    }

    public void ah$a(byte[] bArr, int i, int i2) {
        if (this.valueOf) {
            int i3 = i2 - i;
            byte[] bArr2 = this.values;
            int length = bArr2.length;
            int i4 = this.ag$a + i3;
            if (length < i4) {
                this.values = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.values, this.ag$a, i3);
            this.ag$a += i3;
        }
    }
}
