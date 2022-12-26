package o;

import java.nio.ShortBuffer;
import java.util.Arrays;
/* loaded from: classes3.dex */
final class isAtLeastN {
    private int HaptikSDK$a;
    private int HaptikSDK$b;
    private final int HaptikSDK$c;
    private final float HaptikSDK$d;
    private int HaptikSDK$e;
    private short[] HaptikWebView;
    private int a;
    private final int ag$a;
    private short[] ah$a;
    private final int ah$b;
    private final float aj$a;
    private int ak;
    private final float ak$b;
    private int extraCallback;
    private int getInitSettings;
    private int getSignupData;
    private final int invoke;
    private int isLogoutPending;
    private short[] onXdkEvent;
    private final int toString;
    private int valueOf;
    private final short[] values;

    public isAtLeastN(int i, int i2, float f, float f2, int i3) {
        this.ag$a = i;
        this.toString = i2;
        this.ak$b = f;
        this.HaptikSDK$d = f2;
        this.aj$a = i / i3;
        this.HaptikSDK$c = i / 400;
        int i4 = i / 65;
        this.ah$b = i4;
        int i5 = i4 * 2;
        this.invoke = i5;
        this.values = new short[i5];
        int i6 = i5 * i2;
        this.ah$a = new short[i6];
        this.HaptikWebView = new short[i6];
        this.onXdkEvent = new short[i6];
    }

    public int values() {
        return this.valueOf * this.toString * 2;
    }

    public void values(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.toString;
        int i2 = remaining / i;
        short[] valueOf = valueOf(this.ah$a, this.valueOf, i2);
        this.ah$a = valueOf;
        shortBuffer.get(valueOf, this.valueOf * this.toString, ((i * i2) * 2) / 2);
        this.valueOf += i2;
        ah$b();
    }

    public void toString(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.toString, this.getInitSettings);
        shortBuffer.put(this.HaptikWebView, 0, this.toString * min);
        int i = this.getInitSettings - min;
        this.getInitSettings = i;
        short[] sArr = this.HaptikWebView;
        int i2 = this.toString;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    public void ag$a() {
        int i;
        int i2 = this.valueOf;
        float f = this.ak$b;
        float f2 = this.HaptikSDK$d;
        int i3 = this.getInitSettings + ((int) ((((i2 / (f / f2)) + this.ak) / (this.aj$a * f2)) + 0.5f));
        this.ah$a = valueOf(this.ah$a, i2, (this.invoke * 2) + i2);
        int i4 = 0;
        while (true) {
            int i5 = this.invoke;
            int i6 = this.toString;
            i = i5 * 2;
            if (i4 >= i * i6) {
                break;
            }
            this.ah$a[(i6 * i2) + i4] = 0;
            i4++;
        }
        this.valueOf += i;
        ah$b();
        if (this.getInitSettings > i3) {
            this.getInitSettings = i3;
        }
        this.valueOf = 0;
        this.extraCallback = 0;
        this.ak = 0;
    }

    public void ah$a() {
        this.valueOf = 0;
        this.getInitSettings = 0;
        this.ak = 0;
        this.HaptikSDK$e = 0;
        this.getSignupData = 0;
        this.extraCallback = 0;
        this.isLogoutPending = 0;
        this.a = 0;
        this.HaptikSDK$a = 0;
        this.HaptikSDK$b = 0;
    }

    public int valueOf() {
        return this.getInitSettings * this.toString * 2;
    }

    private short[] valueOf(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.toString;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    private void values(int i) {
        int i2 = this.valueOf - i;
        short[] sArr = this.ah$a;
        int i3 = this.toString;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.valueOf = i2;
    }

    private void toString(short[] sArr, int i, int i2) {
        short[] valueOf = valueOf(this.HaptikWebView, this.getInitSettings, i2);
        this.HaptikWebView = valueOf;
        int i3 = this.toString;
        System.arraycopy(sArr, i * i3, valueOf, this.getInitSettings * i3, i3 * i2);
        this.getInitSettings += i2;
    }

    private int valueOf(int i) {
        int min = Math.min(this.invoke, this.extraCallback);
        toString(this.ah$a, i, min);
        this.extraCallback -= min;
        return min;
    }

    private void ah$a(short[] sArr, int i, int i2) {
        int i3 = this.invoke / i2;
        int i4 = this.toString;
        int i5 = i2 * i4;
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                i7 += sArr[(i6 * i5) + (i * i4) + i8];
            }
            this.values[i6] = (short) (i7 / i5);
        }
    }

    private int ah$a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.toString;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.HaptikSDK$a = i5 / i7;
        this.HaptikSDK$b = i8 / i6;
        return i7;
    }

    private boolean valueOf(int i, int i2) {
        return i != 0 && this.isLogoutPending != 0 && i2 <= i * 3 && i * 2 > this.a * 3;
    }

    private int toString(short[] sArr, int i) {
        int i2;
        int i3 = this.ag$a;
        int i4 = i3 > 4000 ? i3 / 4000 : 1;
        if (this.toString == 1 && i4 == 1) {
            i2 = ah$a(sArr, i, this.HaptikSDK$c, this.ah$b);
        } else {
            ah$a(sArr, i, i4);
            int ah$a = ah$a(this.values, 0, this.HaptikSDK$c / i4, this.ah$b / i4);
            if (i4 != 1) {
                int i5 = ah$a * i4;
                int i6 = i4 * 4;
                int i7 = i5 - i6;
                int i8 = i5 + i6;
                int i9 = this.HaptikSDK$c;
                if (i7 < i9) {
                    i7 = i9;
                }
                int i10 = this.ah$b;
                if (i8 > i10) {
                    i8 = i10;
                }
                if (this.toString == 1) {
                    i2 = ah$a(sArr, i, i7, i8);
                } else {
                    ah$a(sArr, i, 1);
                    i2 = ah$a(this.values, 0, i7, i8);
                }
            } else {
                i2 = ah$a;
            }
        }
        int i11 = valueOf(this.HaptikSDK$a, this.HaptikSDK$b) ? this.isLogoutPending : i2;
        this.a = this.HaptikSDK$a;
        this.isLogoutPending = i2;
        return i11;
    }

    private void ag$a(int i) {
        int i2 = this.getInitSettings - i;
        short[] valueOf = valueOf(this.onXdkEvent, this.ak, i2);
        this.onXdkEvent = valueOf;
        short[] sArr = this.HaptikWebView;
        int i3 = this.toString;
        System.arraycopy(sArr, i * i3, valueOf, this.ak * i3, i3 * i2);
        this.getInitSettings = i;
        this.ak += i2;
    }

    private void ah$a(int i) {
        if (i == 0) {
            return;
        }
        short[] sArr = this.onXdkEvent;
        int i2 = this.toString;
        System.arraycopy(sArr, i * i2, sArr, 0, (this.ak - i) * i2);
        this.ak -= i;
    }

    private short values(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[i + this.toString];
        int i4 = this.getSignupData;
        int i5 = this.HaptikSDK$e;
        int i6 = (i5 + 1) * i3;
        int i7 = i6 - (i4 * i2);
        int i8 = i6 - (i5 * i3);
        return (short) (((s * i7) + ((i8 - i7) * s2)) / i8);
    }

    private void ag$a(float f, int i) {
        int i2;
        int i3;
        if (this.getInitSettings == i) {
            return;
        }
        int i4 = this.ag$a;
        int i5 = (int) (i4 / f);
        while (true) {
            if (i5 <= 16384 && i4 <= 16384) {
                break;
            }
            i5 /= 2;
            i4 /= 2;
        }
        ag$a(i);
        int i6 = 0;
        while (true) {
            int i7 = this.ak - 1;
            if (i6 < i7) {
                while (true) {
                    int i8 = this.HaptikSDK$e;
                    i2 = this.getSignupData;
                    i3 = i8 + 1;
                    if (i3 * i5 <= i2 * i4) {
                        break;
                    }
                    this.HaptikWebView = valueOf(this.HaptikWebView, this.getInitSettings, 1);
                    int i9 = 0;
                    while (true) {
                        int i10 = this.toString;
                        if (i9 < i10) {
                            this.HaptikWebView[(this.getInitSettings * i10) + i9] = values(this.onXdkEvent, (i10 * i6) + i9, i4, i5);
                            i9++;
                        }
                    }
                    this.getSignupData++;
                    this.getInitSettings++;
                }
                this.HaptikSDK$e = i3;
                if (i3 == i4) {
                    this.HaptikSDK$e = 0;
                    FingerprintManagerCompat.ah$a(i2 == i5);
                    this.getSignupData = 0;
                }
                i6++;
            } else {
                ah$a(i7);
                return;
            }
        }
    }

    private int toString(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (i2 / (f - 1.0f));
        } else {
            this.extraCallback = (int) ((i2 * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        short[] valueOf = valueOf(this.HaptikWebView, this.getInitSettings, i3);
        this.HaptikWebView = valueOf;
        toString(i3, this.toString, valueOf, this.getInitSettings, sArr, i, sArr, i + i2);
        this.getInitSettings += i3;
        return i3;
    }

    private int values(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((i2 * f) / (1.0f - f));
        } else {
            this.extraCallback = (int) ((i2 * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        short[] valueOf = valueOf(this.HaptikWebView, this.getInitSettings, i4);
        this.HaptikWebView = valueOf;
        int i5 = this.toString;
        System.arraycopy(sArr, i * i5, valueOf, this.getInitSettings * i5, i5 * i2);
        toString(i3, this.toString, this.HaptikWebView, this.getInitSettings + i2, sArr, i + i2, sArr, i);
        this.getInitSettings += i4;
        return i3;
    }

    private void ah$a(float f) {
        int values;
        int i = this.valueOf;
        if (i < this.invoke) {
            return;
        }
        int i2 = 0;
        do {
            if (this.extraCallback > 0) {
                values = valueOf(i2);
            } else {
                int isatleastn = toString(this.ah$a, i2);
                if (f > 1.0d) {
                    values = isatleastn + toString(this.ah$a, i2, f, isatleastn);
                } else {
                    values = values(this.ah$a, i2, f, isatleastn);
                }
            }
            i2 += values;
        } while (this.invoke + i2 <= i);
        values(i2);
    }

    private void ah$b() {
        int i = this.getInitSettings;
        float f = this.ak$b;
        float f2 = this.HaptikSDK$d;
        float f3 = f / f2;
        float f4 = this.aj$a * f2;
        double d = f3;
        if (d > 1.00001d || d < 0.99999d) {
            ah$a(f3);
        } else {
            toString(this.ah$a, 0, this.valueOf);
            this.valueOf = 0;
        }
        if (f4 != 1.0f) {
            ag$a(f4, i);
        }
    }

    private static void toString(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }
}
