package o;

import android.graphics.Bitmap;
import android.os.Build;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
/* loaded from: classes4.dex */
public class setTextSelection {
    private static final String values = "GifDecoder";
    private setRoleDescription HaptikSDK$a;
    private boolean HaptikSDK$b;
    private int HaptikSDK$c;
    private byte[] HaptikSDK$d;
    private byte[] HaptikSDK$e;
    private setVisibleToUser HaptikWebView;
    private int ICustomTabsCallback;
    private Bitmap a;
    private final values ag$a;
    private int ah$a;
    private int ah$b;
    private boolean aj$a;
    private ByteBuffer ak;
    private int ak$a;
    private byte[] ak$b;
    private byte[] extraCallback;
    private int extraCallbackWithResult;
    private int[] getInitSettings;
    private final int[] getSignupData;
    private int invoke;
    private int isLogoutPending;
    private short[] onXdkEvent;
    private byte[] toString;
    private int[] valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface values {
        Bitmap ag$a(int i, int i2, Bitmap.Config config);

        byte[] ag$a(int i);

        int[] ah$a(int i);
    }

    setTextSelection(values valuesVar) {
        this.getSignupData = new int[256];
        this.extraCallbackWithResult = 0;
        this.ICustomTabsCallback = 0;
        this.ag$a = valuesVar;
        this.HaptikSDK$a = new setRoleDescription();
    }

    public setTextSelection() {
        this(new setTouchDelegateInfo());
    }

    public boolean valueOf() {
        if (this.HaptikSDK$a.ag$a <= 0) {
            return false;
        }
        if (this.ah$b == values() - 1) {
            this.HaptikSDK$c++;
        }
        if (this.HaptikSDK$a.invoke == -1 || this.HaptikSDK$c <= this.HaptikSDK$a.invoke) {
            this.ah$b = (this.ah$b + 1) % this.HaptikSDK$a.ag$a;
            return true;
        }
        return false;
    }

    public int ag$a() {
        return this.ah$b;
    }

    int valueOf(int i) {
        if (i < 0 || i >= this.HaptikSDK$a.ag$a) {
            return -1;
        }
        return this.HaptikSDK$a.valueOf.get(i).values;
    }

    int values() {
        return this.HaptikSDK$a.ag$a;
    }

    public int ah$a() {
        int i;
        if (this.HaptikSDK$a.ag$a <= 0 || (i = this.ah$b) < 0) {
            return 0;
        }
        return valueOf(i);
    }

    public Bitmap HaptikSDK$a() {
        synchronized (this) {
            if (this.HaptikSDK$a.ag$a <= 0 || this.ah$b < 0) {
                String str = values;
                setBoundsInScreen.values(str, "unable to decode frame, frameCount=" + this.HaptikSDK$a.ag$a + " framePointer=" + this.ah$b);
                this.ak$a = 1;
            }
            int i = this.ak$a;
            if (i != 1 && i != 2) {
                this.ak$a = 0;
                setScrollable setscrollable = this.HaptikSDK$a.valueOf.get(this.ah$b);
                int i2 = this.ah$b - 1;
                setScrollable setscrollable2 = i2 >= 0 ? this.HaptikSDK$a.valueOf.get(i2) : null;
                int[] iArr = setscrollable.HaptikSDK$c != null ? setscrollable.HaptikSDK$c : this.HaptikSDK$a.HaptikSDK$c;
                this.valueOf = iArr;
                if (iArr == null) {
                    String str2 = values;
                    setBoundsInScreen.values(str2, "No Valid Color Table for frame #" + this.ah$b);
                    this.ak$a = 1;
                    return null;
                }
                if (setscrollable.HaptikSDK$d) {
                    int[] iArr2 = this.valueOf;
                    System.arraycopy(iArr2, 0, this.getSignupData, 0, iArr2.length);
                    int[] iArr3 = this.getSignupData;
                    this.valueOf = iArr3;
                    iArr3[setscrollable.invoke] = 0;
                }
                return values(setscrollable, setscrollable2);
            }
            String str3 = values;
            setBoundsInScreen.values(str3, "Unable to decode frame, status=" + this.ak$a);
            return null;
        }
    }

    public int toString(byte[] bArr) {
        int i;
        synchronized (this) {
            setRoleDescription valueOf = HaptikSDK$b().toString(bArr).valueOf();
            this.HaptikSDK$a = valueOf;
            if (bArr != null) {
                ag$a(valueOf, bArr);
            }
            i = this.ak$a;
        }
        return i;
    }

    void invoke() {
        this.HaptikSDK$c = 0;
    }

    void ag$a(setRoleDescription setroledescription, byte[] bArr) {
        synchronized (this) {
            values(setroledescription, ByteBuffer.wrap(bArr));
        }
    }

    void values(setRoleDescription setroledescription, ByteBuffer byteBuffer) {
        synchronized (this) {
            ah$a(setroledescription, byteBuffer, 1);
        }
    }

    void ah$a(setRoleDescription setroledescription, ByteBuffer byteBuffer, int i) {
        synchronized (this) {
            if (i <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
            }
            int highestOneBit = Integer.highestOneBit(i);
            this.ak$a = 0;
            this.HaptikSDK$a = setroledescription;
            this.HaptikSDK$b = false;
            this.ah$b = -1;
            invoke();
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.ak = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.ak.order(ByteOrder.LITTLE_ENDIAN);
            this.aj$a = false;
            Iterator<setScrollable> it = setroledescription.valueOf.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().toString == 3) {
                    this.aj$a = true;
                    break;
                }
            }
            this.isLogoutPending = highestOneBit;
            this.invoke = setroledescription.getInitSettings / highestOneBit;
            this.ah$a = setroledescription.HaptikSDK$a / highestOneBit;
            this.HaptikSDK$e = this.ag$a.ag$a(setroledescription.getInitSettings * setroledescription.HaptikSDK$a);
            this.getInitSettings = this.ag$a.ah$a(this.invoke * this.ah$a);
        }
    }

    public boolean toString(int i) {
        if (i < -1 || i >= values()) {
            return false;
        }
        this.ah$b = i;
        return true;
    }

    private int ah$a(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.isLogoutPending + i; i9++) {
            byte[] bArr = this.HaptikSDK$e;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.valueOf[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.isLogoutPending + i11; i12++) {
            byte[] bArr2 = this.HaptikSDK$e;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.valueOf[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d A[LOOP:5: B:60:0x012b->B:61:0x012d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void ah$a(o.setScrollable r27) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTextSelection.ah$a(o.setScrollable):void");
    }

    private void valueOf(int[] iArr, setScrollable setscrollable, int i) {
        int i2 = setscrollable.ag$a / this.isLogoutPending;
        int i3 = setscrollable.ah$b / this.isLogoutPending;
        int i4 = setscrollable.HaptikSDK$a / this.isLogoutPending;
        int i5 = setscrollable.HaptikSDK$b / this.isLogoutPending;
        int i6 = this.invoke;
        int i7 = (i3 * i6) + i5;
        int i8 = i7;
        while (i8 < (i2 * i6) + i7) {
            for (int i9 = i8; i9 < i8 + i4; i9++) {
                iArr[i9] = i;
            }
            i8 += this.invoke;
        }
    }

    private setVisibleToUser HaptikSDK$b() {
        if (this.HaptikWebView == null) {
            this.HaptikWebView = new setVisibleToUser();
        }
        return this.HaptikWebView;
    }

    private Bitmap ah$b() {
        Bitmap ag$a = this.ag$a.ag$a(this.invoke, this.ah$a, this.HaptikSDK$b ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        values(ag$a);
        return ag$a;
    }

    private int HaptikSDK$c() {
        int signupData = getSignupData();
        if (signupData > 0) {
            try {
                if (this.toString == null) {
                    this.toString = this.ag$a.ag$a(255);
                }
                int i = this.ICustomTabsCallback;
                int i2 = this.extraCallbackWithResult;
                int i3 = i - i2;
                if (i3 >= signupData) {
                    System.arraycopy(this.ak$b, i2, this.toString, 0, signupData);
                    this.extraCallbackWithResult += signupData;
                } else if (this.ak.remaining() + i3 >= signupData) {
                    System.arraycopy(this.ak$b, this.extraCallbackWithResult, this.toString, 0, i3);
                    this.extraCallbackWithResult = this.ICustomTabsCallback;
                    HaptikWebView();
                    int i4 = signupData - i3;
                    System.arraycopy(this.ak$b, 0, this.toString, i3, i4);
                    this.extraCallbackWithResult += i4;
                } else {
                    this.ak$a = 1;
                }
            } catch (Exception e) {
                setBoundsInScreen.ah$a(values, "Error Reading Block", e);
                this.ak$a = 1;
            }
        }
        return signupData;
    }

    private int getSignupData() {
        try {
            HaptikWebView();
            byte[] bArr = this.ak$b;
            int i = this.extraCallbackWithResult;
            this.extraCallbackWithResult = i + 1;
            return bArr[i] & 255;
        } catch (Exception unused) {
            this.ak$a = 1;
            return 0;
        }
    }

    private void HaptikWebView() {
        if (this.ICustomTabsCallback > this.extraCallbackWithResult) {
            return;
        }
        if (this.ak$b == null) {
            this.ak$b = this.ag$a.ag$a(16384);
        }
        this.extraCallbackWithResult = 0;
        int min = Math.min(this.ak.remaining(), 16384);
        this.ICustomTabsCallback = min;
        this.ak.get(this.ak$b, 0, min);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        if (r19.HaptikSDK$a.ah$a == r20.invoke) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Bitmap values(o.setScrollable r20, o.setScrollable r21) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTextSelection.values(o.setScrollable, o.setScrollable):android.graphics.Bitmap");
    }

    private static void values(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 12) {
            bitmap.setHasAlpha(true);
        }
    }
}
