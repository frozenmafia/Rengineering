package o;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import o.getScaledPagingTouchSlop;
/* loaded from: classes3.dex */
public class shouldShowMenuShortcutsWhenKeyboardPresent implements getScaledPagingTouchSlop {
    private static final String ag$a = "StandardGifDecoder";
    private int HaptikSDK$a;
    private getLayoutMode HaptikSDK$b;
    private int HaptikSDK$c;
    private final int[] HaptikSDK$d;
    private byte[] HaptikSDK$e;
    private short[] HaptikWebView;
    private byte[] ICustomTabsCallback;
    private boolean a;
    private int[] ah$a;
    private int ah$b;
    private Bitmap aj$a;
    private int ak;
    private int[] getInitSettings;
    private byte[] getSignupData;
    private Boolean invoke;
    private ByteBuffer isLogoutPending;
    private int onXdkEvent;
    private Bitmap.Config toString;
    private byte[] valueOf;
    private final getScaledPagingTouchSlop.valueOf values;

    public shouldShowMenuShortcutsWhenKeyboardPresent(getScaledPagingTouchSlop.valueOf valueof, getLayoutMode getlayoutmode, ByteBuffer byteBuffer, int i) {
        this(valueof);
        values(getlayoutmode, byteBuffer, i);
    }

    public shouldShowMenuShortcutsWhenKeyboardPresent(getScaledPagingTouchSlop.valueOf valueof) {
        this.HaptikSDK$d = new int[256];
        this.toString = Bitmap.Config.ARGB_8888;
        this.values = valueof;
        this.HaptikSDK$b = new getLayoutMode();
    }

    @Override // o.getScaledPagingTouchSlop
    public ByteBuffer HaptikSDK$c() {
        return this.isLogoutPending;
    }

    @Override // o.getScaledPagingTouchSlop
    public void values() {
        this.HaptikSDK$c = (this.HaptikSDK$c + 1) % this.HaptikSDK$b.ah$a;
    }

    public int valueOf(int i) {
        if (i < 0 || i >= this.HaptikSDK$b.ah$a) {
            return -1;
        }
        return this.HaptikSDK$b.ag$a.get(i).valueOf;
    }

    @Override // o.getScaledPagingTouchSlop
    public int ah$b() {
        int i;
        if (this.HaptikSDK$b.ah$a <= 0 || (i = this.HaptikSDK$c) < 0) {
            return 0;
        }
        return valueOf(i);
    }

    @Override // o.getScaledPagingTouchSlop
    public int HaptikSDK$a() {
        return this.HaptikSDK$b.ah$a;
    }

    @Override // o.getScaledPagingTouchSlop
    public int valueOf() {
        return this.HaptikSDK$c;
    }

    @Override // o.getScaledPagingTouchSlop
    public void HaptikSDK$b() {
        this.HaptikSDK$c = -1;
    }

    @Override // o.getScaledPagingTouchSlop
    public int ag$a() {
        return this.isLogoutPending.limit() + this.getSignupData.length + (this.getInitSettings.length * 4);
    }

    @Override // o.getScaledPagingTouchSlop
    public Bitmap invoke() {
        synchronized (this) {
            if (this.HaptikSDK$b.ah$a <= 0 || this.HaptikSDK$c < 0) {
                String str = ag$a;
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Unable to decode frame, frameCount=" + this.HaptikSDK$b.ah$a + ", framePointer=" + this.HaptikSDK$c);
                }
                this.onXdkEvent = 1;
            }
            int i = this.onXdkEvent;
            if (i != 1 && i != 2) {
                this.onXdkEvent = 0;
                if (this.valueOf == null) {
                    this.valueOf = this.values.ah$a(255);
                }
                ViewGroupCompat viewGroupCompat = this.HaptikSDK$b.ag$a.get(this.HaptikSDK$c);
                int i2 = this.HaptikSDK$c - 1;
                ViewGroupCompat viewGroupCompat2 = i2 >= 0 ? this.HaptikSDK$b.ag$a.get(i2) : null;
                int[] iArr = viewGroupCompat.ah$b != null ? viewGroupCompat.ah$b : this.HaptikSDK$b.HaptikSDK$a;
                this.ah$a = iArr;
                if (iArr == null) {
                    String str2 = ag$a;
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, "No valid color table found for frame #" + this.HaptikSDK$c);
                    }
                    this.onXdkEvent = 1;
                    return null;
                }
                if (viewGroupCompat.HaptikSDK$d) {
                    int[] iArr2 = this.ah$a;
                    System.arraycopy(iArr2, 0, this.HaptikSDK$d, 0, iArr2.length);
                    int[] iArr3 = this.HaptikSDK$d;
                    this.ah$a = iArr3;
                    iArr3[viewGroupCompat.HaptikSDK$a] = 0;
                    if (viewGroupCompat.toString == 2 && this.HaptikSDK$c == 0) {
                        this.invoke = true;
                    }
                }
                return ah$a(viewGroupCompat, viewGroupCompat2);
            }
            String str3 = ag$a;
            if (Log.isLoggable(str3, 3)) {
                Log.d(str3, "Unable to decode frame, status=" + this.onXdkEvent);
            }
            return null;
        }
    }

    @Override // o.getScaledPagingTouchSlop
    public void ah$a() {
        this.HaptikSDK$b = null;
        byte[] bArr = this.getSignupData;
        if (bArr != null) {
            this.values.valueOf(bArr);
        }
        int[] iArr = this.getInitSettings;
        if (iArr != null) {
            this.values.toString(iArr);
        }
        Bitmap bitmap = this.aj$a;
        if (bitmap != null) {
            this.values.toString(bitmap);
        }
        this.aj$a = null;
        this.isLogoutPending = null;
        this.invoke = null;
        byte[] bArr2 = this.valueOf;
        if (bArr2 != null) {
            this.values.valueOf(bArr2);
        }
    }

    public void values(getLayoutMode getlayoutmode, ByteBuffer byteBuffer, int i) {
        synchronized (this) {
            if (i <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
            }
            int highestOneBit = Integer.highestOneBit(i);
            this.onXdkEvent = 0;
            this.HaptikSDK$b = getlayoutmode;
            this.HaptikSDK$c = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.isLogoutPending = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.isLogoutPending.order(ByteOrder.LITTLE_ENDIAN);
            this.a = false;
            Iterator<ViewGroupCompat> it = getlayoutmode.ag$a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().toString == 3) {
                    this.a = true;
                    break;
                }
            }
            this.ak = highestOneBit;
            this.HaptikSDK$a = getlayoutmode.HaptikSDK$e / highestOneBit;
            this.ah$b = getlayoutmode.ah$b / highestOneBit;
            this.getSignupData = this.values.ah$a(getlayoutmode.HaptikSDK$e * getlayoutmode.ah$b);
            this.getInitSettings = this.values.ag$a(this.HaptikSDK$a * this.ah$b);
        }
    }

    @Override // o.getScaledPagingTouchSlop
    public void toString(Bitmap.Config config) {
        if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
        }
        this.toString = config;
    }

    private Bitmap ah$a(ViewGroupCompat viewGroupCompat, ViewGroupCompat viewGroupCompat2) {
        Bitmap bitmap;
        int[] iArr = this.getInitSettings;
        int i = 0;
        if (viewGroupCompat2 == null) {
            Bitmap bitmap2 = this.aj$a;
            if (bitmap2 != null) {
                this.values.toString(bitmap2);
            }
            this.aj$a = null;
            Arrays.fill(iArr, 0);
        }
        if (viewGroupCompat2 != null && viewGroupCompat2.toString == 3 && this.aj$a == null) {
            Arrays.fill(iArr, 0);
        }
        if (viewGroupCompat2 != null && viewGroupCompat2.toString > 0) {
            if (viewGroupCompat2.toString == 2) {
                if (!viewGroupCompat.HaptikSDK$d) {
                    int i2 = this.HaptikSDK$b.values;
                    if (viewGroupCompat.ah$b == null || this.HaptikSDK$b.toString != viewGroupCompat.HaptikSDK$a) {
                        i = i2;
                    }
                }
                int i3 = viewGroupCompat2.values / this.ak;
                int i4 = viewGroupCompat2.HaptikSDK$c / this.ak;
                int i5 = viewGroupCompat2.invoke / this.ak;
                int i6 = viewGroupCompat2.HaptikSDK$b / this.ak;
                int i7 = this.HaptikSDK$a;
                int i8 = (i4 * i7) + i6;
                int i9 = i8;
                while (i9 < (i3 * i7) + i8) {
                    for (int i10 = i9; i10 < i9 + i5; i10++) {
                        iArr[i10] = i;
                    }
                    i9 += this.HaptikSDK$a;
                }
            } else if (viewGroupCompat2.toString == 3 && (bitmap = this.aj$a) != null) {
                int i11 = this.HaptikSDK$a;
                bitmap.getPixels(iArr, 0, i11, 0, 0, i11, this.ah$b);
            }
        }
        valueOf(viewGroupCompat);
        if (viewGroupCompat.ah$a || this.ak != 1) {
            ag$a(viewGroupCompat);
        } else {
            ah$a(viewGroupCompat);
        }
        if (this.a && (viewGroupCompat.toString == 0 || viewGroupCompat.toString == 1)) {
            if (this.aj$a == null) {
                this.aj$a = HaptikSDK$d();
            }
            Bitmap bitmap3 = this.aj$a;
            int i12 = this.HaptikSDK$a;
            bitmap3.setPixels(iArr, 0, i12, 0, 0, i12, this.ah$b);
        }
        Bitmap HaptikSDK$d = HaptikSDK$d();
        int i13 = this.HaptikSDK$a;
        HaptikSDK$d.setPixels(iArr, 0, i13, 0, 0, i13, this.ah$b);
        return HaptikSDK$d;
    }

    private void ah$a(ViewGroupCompat viewGroupCompat) {
        ViewGroupCompat viewGroupCompat2 = viewGroupCompat;
        int[] iArr = this.getInitSettings;
        int i = viewGroupCompat2.values;
        int i2 = viewGroupCompat2.HaptikSDK$c;
        int i3 = viewGroupCompat2.invoke;
        int i4 = viewGroupCompat2.HaptikSDK$b;
        boolean z = this.HaptikSDK$c == 0;
        int i5 = this.HaptikSDK$a;
        byte[] bArr = this.getSignupData;
        int[] iArr2 = this.ah$a;
        int i6 = 0;
        byte b2 = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = viewGroupCompat2.invoke * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b3 = bArr[i11];
                int i13 = i;
                int i14 = b3 & 255;
                if (i14 != b2) {
                    int i15 = iArr2[i14];
                    if (i15 != 0) {
                        iArr[i12] = i15;
                    } else {
                        b2 = b3;
                    }
                }
                i11++;
                i12++;
                i = i13;
            }
            i6++;
            viewGroupCompat2 = viewGroupCompat;
        }
        Boolean bool = this.invoke;
        this.invoke = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.invoke == null && z && b2 != -1));
    }

    private void ag$a(ViewGroupCompat viewGroupCompat) {
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr = this.getInitSettings;
        int i5 = viewGroupCompat.values / this.ak;
        int i6 = viewGroupCompat.HaptikSDK$c / this.ak;
        int i7 = viewGroupCompat.invoke / this.ak;
        int i8 = viewGroupCompat.HaptikSDK$b;
        int i9 = this.ak;
        int i10 = i8 / i9;
        boolean z = this.HaptikSDK$c == 0;
        int i11 = this.HaptikSDK$a;
        int i12 = this.ah$b;
        byte[] bArr = this.getSignupData;
        int[] iArr2 = this.ah$a;
        Boolean bool = this.invoke;
        int i13 = 8;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1;
        while (i14 < i5) {
            Boolean bool2 = bool;
            if (viewGroupCompat.ah$a) {
                if (i15 >= i5) {
                    i = i5;
                    int i17 = i16 + 1;
                    if (i17 == 2) {
                        i16 = i17;
                        i15 = 4;
                    } else if (i17 != 3) {
                        i16 = i17;
                        if (i17 == 4) {
                            i15 = 1;
                            i13 = 2;
                        }
                    } else {
                        i16 = i17;
                        i15 = 2;
                        i13 = 4;
                    }
                } else {
                    i = i5;
                }
                i2 = i15 + i13;
            } else {
                i = i5;
                i2 = i15;
                i15 = i14;
            }
            int i18 = i15 + i6;
            boolean z2 = i9 == 1;
            if (i18 < i12) {
                int i19 = i18 * i11;
                int i20 = i19 + i10;
                int i21 = i20 + i7;
                int i22 = i19 + i11;
                if (i22 < i21) {
                    i21 = i22;
                }
                i3 = i2;
                int i23 = i14 * i9 * viewGroupCompat.invoke;
                if (z2) {
                    int i24 = i20;
                    while (true) {
                        i4 = i6;
                        if (i24 >= i21) {
                            break;
                        }
                        int i25 = iArr2[bArr[i23] & 255];
                        if (i25 != 0) {
                            iArr[i24] = i25;
                        } else if (z && bool2 == null) {
                            bool2 = true;
                        }
                        i23 += i9;
                        i24++;
                        i6 = i4;
                    }
                } else {
                    i4 = i6;
                    int i26 = i23;
                    int i27 = i20;
                    while (i27 < i21) {
                        int i28 = i7;
                        int i29 = i10;
                        int ah$a = ah$a(i26, ((i21 - i20) * i9) + i23, viewGroupCompat.invoke);
                        if (ah$a != 0) {
                            iArr[i27] = ah$a;
                        } else if (z && bool2 == null) {
                            bool2 = true;
                        }
                        i26 += i9;
                        i27++;
                        i10 = i29;
                        i7 = i28;
                    }
                }
            } else {
                i3 = i2;
                i4 = i6;
            }
            bool = bool2;
            i14++;
            i6 = i4;
            i5 = i;
            i15 = i3;
            i10 = i10;
            i7 = i7;
        }
        Boolean bool3 = bool;
        if (this.invoke == null) {
            this.invoke = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    private int ah$a(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.ak + i; i9++) {
            byte[] bArr = this.getSignupData;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.ah$a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.ak + i11; i12++) {
            byte[] bArr2 = this.getSignupData;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.ah$a[bArr2[i12] & 255];
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
    private void valueOf(ViewGroupCompat viewGroupCompat) {
        int i;
        int i2;
        int i3;
        int i4;
        short s;
        shouldShowMenuShortcutsWhenKeyboardPresent shouldshowmenushortcutswhenkeyboardpresent = this;
        if (viewGroupCompat != null) {
            shouldshowmenushortcutswhenkeyboardpresent.isLogoutPending.position(viewGroupCompat.ag$a);
        }
        if (viewGroupCompat == null) {
            i2 = shouldshowmenushortcutswhenkeyboardpresent.HaptikSDK$b.HaptikSDK$e;
            i = shouldshowmenushortcutswhenkeyboardpresent.HaptikSDK$b.ah$b;
        } else {
            i = viewGroupCompat.invoke;
            i2 = viewGroupCompat.values;
        }
        int i5 = i2 * i;
        byte[] bArr = shouldshowmenushortcutswhenkeyboardpresent.getSignupData;
        if (bArr == null || bArr.length < i5) {
            shouldshowmenushortcutswhenkeyboardpresent.getSignupData = shouldshowmenushortcutswhenkeyboardpresent.values.ah$a(i5);
        }
        byte[] bArr2 = shouldshowmenushortcutswhenkeyboardpresent.getSignupData;
        if (shouldshowmenushortcutswhenkeyboardpresent.HaptikWebView == null) {
            shouldshowmenushortcutswhenkeyboardpresent.HaptikWebView = new short[4096];
        }
        short[] sArr = shouldshowmenushortcutswhenkeyboardpresent.HaptikWebView;
        if (shouldshowmenushortcutswhenkeyboardpresent.ICustomTabsCallback == null) {
            shouldshowmenushortcutswhenkeyboardpresent.ICustomTabsCallback = new byte[4096];
        }
        byte[] bArr3 = shouldshowmenushortcutswhenkeyboardpresent.ICustomTabsCallback;
        if (shouldshowmenushortcutswhenkeyboardpresent.HaptikSDK$e == null) {
            shouldshowmenushortcutswhenkeyboardpresent.HaptikSDK$e = new byte[androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN];
        }
        byte[] bArr4 = shouldshowmenushortcutswhenkeyboardpresent.HaptikSDK$e;
        int HaptikWebView = HaptikWebView();
        int i6 = 1 << HaptikWebView;
        int i7 = i6 + 2;
        int i8 = HaptikWebView + 1;
        int i9 = (1 << i8) - 1;
        int i10 = 0;
        for (int i11 = 0; i11 < i6; i11++) {
            sArr[i11] = 0;
            bArr3[i11] = (byte) i11;
        }
        byte[] bArr5 = shouldshowmenushortcutswhenkeyboardpresent.valueOf;
        int i12 = i8;
        int i13 = i7;
        int i14 = i9;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = -1;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        while (true) {
            if (i15 >= i5) {
                break;
            }
            if (i16 == 0) {
                i16 = getSignupData();
                if (i16 <= 0) {
                    shouldshowmenushortcutswhenkeyboardpresent.onXdkEvent = 3;
                    break;
                }
                i21 = 0;
            }
            i17 += (bArr5[i21] & 255) << i20;
            i21++;
            i16--;
            i20 += 8;
            int i23 = i13;
            int i24 = i12;
            int i25 = i18;
            int i26 = i19;
            int i27 = i8;
            while (true) {
                int i28 = i20;
                while (true) {
                    if (i28 < i24) {
                        int i29 = i7;
                        int i30 = i26;
                        shouldshowmenushortcutswhenkeyboardpresent = this;
                        i13 = i23;
                        i20 = i28;
                        i12 = i24;
                        i8 = i27;
                        i18 = i25;
                        i19 = i30;
                        i7 = i29;
                        break;
                    }
                    i3 = i7;
                    i4 = i17 & i14;
                    i17 >>= i24;
                    i28 -= i24;
                    if (i4 == i6) {
                        i14 = i9;
                        i24 = i27;
                        i23 = i3;
                        i7 = i23;
                        i25 = -1;
                    } else {
                        i20 = i28;
                        if (i4 == i6 + 1) {
                            i13 = i23;
                            i12 = i24;
                            i8 = i27;
                            i7 = i3;
                            i19 = i26;
                            i18 = i25;
                            shouldshowmenushortcutswhenkeyboardpresent = this;
                            break;
                        } else if (i25 == -1) {
                            break;
                        } else {
                            if (i4 >= i23) {
                                bArr4[i22] = (byte) i26;
                                i22++;
                                s = i25;
                            } else {
                                s = i4;
                            }
                            while (s >= i6) {
                                bArr4[i22] = bArr3[s];
                                i22++;
                                s = sArr[s];
                            }
                            int i31 = bArr3[s] & 255;
                            byte b2 = (byte) i31;
                            bArr2[i10] = b2;
                            while (true) {
                                i10++;
                                i15++;
                                if (i22 <= 0) {
                                    break;
                                }
                                i22--;
                                bArr2[i10] = bArr4[i22];
                            }
                            if (i23 < 4096) {
                                sArr[i23] = (short) i25;
                                bArr3[i23] = b2;
                                i23++;
                                if ((i23 & i14) == 0 && i23 < 4096) {
                                    i24++;
                                    i14 += i23;
                                }
                            }
                            i25 = i4;
                            i7 = i3;
                            i28 = i20;
                            i26 = i31;
                        }
                    }
                }
                bArr2[i10] = bArr3[i4];
                i10++;
                i15++;
                i26 = i4;
                i25 = i26;
                i7 = i3;
            }
        }
        Arrays.fill(bArr2, i10, i5, (byte) 0);
    }

    private int HaptikWebView() {
        return this.isLogoutPending.get() & 255;
    }

    private int getSignupData() {
        int HaptikWebView = HaptikWebView();
        if (HaptikWebView <= 0) {
            return HaptikWebView;
        }
        ByteBuffer byteBuffer = this.isLogoutPending;
        byteBuffer.get(this.valueOf, 0, Math.min(HaptikWebView, byteBuffer.remaining()));
        return HaptikWebView;
    }

    private Bitmap HaptikSDK$d() {
        Boolean bool = this.invoke;
        Bitmap ah$a = this.values.ah$a(this.HaptikSDK$a, this.ah$b, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.toString);
        ah$a.setHasAlpha(true);
        return ah$a;
    }
}
