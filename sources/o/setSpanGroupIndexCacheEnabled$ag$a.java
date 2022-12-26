package o;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.Utf8;
import com.google.crypto.tink.shaded.protobuf.WireFormat;
import java.io.IOException;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class setSpanGroupIndexCacheEnabled$ag$a extends setSpanGroupIndexCacheEnabled {
    private boolean HaptikSDK$a;
    private int HaptikSDK$b;
    private int HaptikSDK$c;
    private int HaptikSDK$d;
    private int HaptikWebView;
    private int ah$b;
    private int getSignupData;
    private final boolean invoke;
    private final byte[] toString;

    private setSpanGroupIndexCacheEnabled$ag$a(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.ah$b = Integer.MAX_VALUE;
        this.toString = bArr;
        this.HaptikWebView = i2 + i;
        this.HaptikSDK$d = i;
        this.getSignupData = i;
        this.invoke = z;
    }

    @Override // o.setSpanGroupIndexCacheEnabled
    public int isLogoutPending() throws IOException {
        if (valueOf()) {
            this.HaptikSDK$c = 0;
            return 0;
        }
        int onMessageChannelReady = onMessageChannelReady();
        this.HaptikSDK$c = onMessageChannelReady;
        if (WireFormat.toString(onMessageChannelReady) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        return this.HaptikSDK$c;
    }

    @Override // o.setSpanGroupIndexCacheEnabled
    public void valueOf(int i) throws InvalidProtocolBufferException {
        if (this.HaptikSDK$c != i) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    @Override // o.setSpanGroupIndexCacheEnabled
    public boolean toString(int i) throws IOException {
        int valueOf = WireFormat.valueOf(i);
        if (valueOf == 0) {
            onNavigationEvent();
            return true;
        } else if (valueOf == 1) {
            HaptikSDK$a(8);
            return true;
        } else if (valueOf == 2) {
            HaptikSDK$a(onMessageChannelReady());
            return true;
        } else if (valueOf == 3) {
            ICustomTabsCallback$Default();
            valueOf(WireFormat.valueOf(WireFormat.toString(i), 4));
            return true;
        } else if (valueOf != 4) {
            if (valueOf == 5) {
                HaptikSDK$a(4);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        } else {
            return false;
        }
    }

    public void ICustomTabsCallback$Default() throws IOException {
        int isLogoutPending;
        do {
            isLogoutPending = isLogoutPending();
            if (isLogoutPending == 0) {
                return;
            }
        } while (toString(isLogoutPending));
    }

    @Override // o.setSpanGroupIndexCacheEnabled
    public double HaptikSDK$c() throws IOException {
        return Double.longBitsToDouble(ak$a());
    }

    @Override // o.setSpanGroupIndexCacheEnabled
    public float ah$b() throws IOException {
        return Float.intBitsToFloat(ICustomTabsCallback());
    }

    @Override // o.setSpanGroupIndexCacheEnabled
    public long ak$b() throws IOException {
        return onRelationshipValidationResult();
    }

    @Override // o.setSpanGroupIndexCacheEnabled
    public long getSignupData() throws IOException {
        return onRelationshipValidationResult();
    }

    @Override // o.setSpanGroupIndexCacheEnabled
    public int HaptikWebView() throws IOException {
        return onMessageChannelReady();
    }

    @Override // o.setSpanGroupIndexCacheEnabled
    public long HaptikSDK$b() throws IOException {
        return ak$a();
    }

    @Override // o.setSpanGroupIndexCacheEnabled
    public int HaptikSDK$a() throws IOException {
        return ICustomTabsCallback();
    }

    @Override // o.setSpanGroupIndexCacheEnabled
    public boolean ag$a() throws IOException {
        return onRelationshipValidationResult() != 0;
    }

    @Override // o.setSpanGroupIndexCacheEnabled
    public String ak() throws IOException {
        int onMessageChannelReady = onMessageChannelReady();
        if (onMessageChannelReady > 0) {
            int i = this.HaptikWebView;
            int i2 = this.HaptikSDK$d;
            if (onMessageChannelReady <= i - i2) {
                String str = new String(this.toString, i2, onMessageChannelReady, checkSelectForSwipe.ah$a);
                this.HaptikSDK$d += onMessageChannelReady;
                return str;
            }
        }
        if (onMessageChannelReady == 0) {
            return "";
        }
        if (onMessageChannelReady < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // o.setSpanGroupIndexCacheEnabled
    public String a() throws IOException {
        int onMessageChannelReady = onMessageChannelReady();
        if (onMessageChannelReady > 0) {
            int i = this.HaptikWebView;
            int i2 = this.HaptikSDK$d;
            if (onMessageChannelReady <= i - i2) {
                String utf8 = Utf8.toString(this.toString, i2, onMessageChannelReady);
                this.HaptikSDK$d += onMessageChannelReady;
                return utf8;
            }
        }
        if (onMessageChannelReady == 0) {
            return "";
        }
        if (onMessageChannelReady <= 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // o.setSpanGroupIndexCacheEnabled
    public ByteString ah$a() throws IOException {
        ByteString copyFrom;
        int onMessageChannelReady = onMessageChannelReady();
        if (onMessageChannelReady > 0) {
            int i = this.HaptikWebView;
            int i2 = this.HaptikSDK$d;
            if (onMessageChannelReady <= i - i2) {
                if (this.invoke && this.HaptikSDK$a) {
                    copyFrom = ByteString.wrap(this.toString, i2, onMessageChannelReady);
                } else {
                    copyFrom = ByteString.copyFrom(this.toString, i2, onMessageChannelReady);
                }
                this.HaptikSDK$d += onMessageChannelReady;
                return copyFrom;
            }
        }
        if (onMessageChannelReady == 0) {
            return ByteString.EMPTY;
        }
        return ByteString.wrap(invoke(onMessageChannelReady));
    }

    @Override // o.setSpanGroupIndexCacheEnabled
    public int extraCallbackWithResult() throws IOException {
        return onMessageChannelReady();
    }

    @Override // o.setSpanGroupIndexCacheEnabled
    public int invoke() throws IOException {
        return onMessageChannelReady();
    }

    @Override // o.setSpanGroupIndexCacheEnabled
    public int HaptikSDK$e() throws IOException {
        return ICustomTabsCallback();
    }

    @Override // o.setSpanGroupIndexCacheEnabled
    public long HaptikSDK$d() throws IOException {
        return ak$a();
    }

    @Override // o.setSpanGroupIndexCacheEnabled
    public int aj$a() throws IOException {
        return values(onMessageChannelReady());
    }

    @Override // o.setSpanGroupIndexCacheEnabled
    public long onXdkEvent() throws IOException {
        return ag$a(onRelationshipValidationResult());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        if (r2[r3] < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int onMessageChannelReady() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.HaptikSDK$d
            int r1 = r5.HaptikWebView
            if (r1 != r0) goto L7
            goto L6a
        L7:
            byte[] r2 = r5.toString
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.HaptikSDK$d = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L18
            goto L6a
        L18:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L24
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L70
        L24:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L31
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2f:
            r1 = r3
            goto L70
        L31:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3f
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L70
        L3f:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2f
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L70
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2f
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L70
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2f
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L70
        L6a:
            long r0 = r5.getInitSettings()
            int r1 = (int) r0
            return r1
        L70:
            r5.HaptikSDK$d = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSpanGroupIndexCacheEnabled$ag$a.onMessageChannelReady():int");
    }

    private void onNavigationEvent() throws IOException {
        if (this.HaptikWebView - this.HaptikSDK$d >= 10) {
            ICustomTabsCallback$Stub();
        } else {
            getDefaultImpl();
        }
    }

    private void ICustomTabsCallback$Stub() throws IOException {
        for (int i = 0; i < 10; i++) {
            byte[] bArr = this.toString;
            int i2 = this.HaptikSDK$d;
            this.HaptikSDK$d = i2 + 1;
            if (bArr[i2] >= 0) {
                return;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    private void getDefaultImpl() throws IOException {
        for (int i = 0; i < 10; i++) {
            if (extraCallback() >= 0) {
                return;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public long onRelationshipValidationResult() throws IOException {
        int i;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        int i2;
        int i3 = this.HaptikSDK$d;
        int i4 = this.HaptikWebView;
        if (i4 != i3) {
            byte[] bArr = this.toString;
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.HaptikSDK$d = i5;
                return b2;
            } else if (i4 - i5 >= 9) {
                int i6 = i5 + 1;
                int i7 = b2 ^ (bArr[i5] << 7);
                if (i7 >= 0) {
                    i = i6 + 1;
                    int i8 = i7 ^ (bArr[i6] << 14);
                    if (i8 >= 0) {
                        j5 = i8 ^ 16256;
                    } else {
                        i6 = i + 1;
                        int i9 = i8 ^ (bArr[i] << 21);
                        if (i9 < 0) {
                            i2 = i9 ^ (-2080896);
                        } else {
                            long j6 = i9;
                            int i10 = i6 + 1;
                            long j7 = j6 ^ (bArr[i6] << 28);
                            if (j7 >= 0) {
                                j3 = 266354560;
                            } else {
                                i6 = i10 + 1;
                                long j8 = j7 ^ (bArr[i10] << 35);
                                if (j8 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i10 = i6 + 1;
                                    j7 = j8 ^ (bArr[i6] << 42);
                                    if (j7 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i6 = i10 + 1;
                                        j8 = j7 ^ (bArr[i10] << 49);
                                        if (j8 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            int i11 = i6 + 1;
                                            long j9 = (j8 ^ (bArr[i6] << 56)) ^ 71499008037633920L;
                                            if (j9 < 0) {
                                                i6 = i11 + 1;
                                                if (bArr[i11] >= 0) {
                                                    j = j9;
                                                    i = i6;
                                                    j5 = j;
                                                }
                                            } else {
                                                j = j9;
                                                i = i11;
                                                j5 = j;
                                            }
                                        }
                                    }
                                }
                                j4 = j8 ^ j2;
                                j = j4;
                                i = i6;
                                j5 = j;
                            }
                            long j10 = j3 ^ j7;
                            i = i10;
                            j5 = j10;
                        }
                    }
                    this.HaptikSDK$d = i;
                    return j5;
                }
                i2 = i7 ^ (-128);
                j4 = i2;
                j = j4;
                i = i6;
                j5 = j;
                this.HaptikSDK$d = i;
                return j5;
            }
        }
        return getInitSettings();
    }

    @Override // o.setSpanGroupIndexCacheEnabled
    long getInitSettings() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte extraCallback = extraCallback();
            j |= (extraCallback & Byte.MAX_VALUE) << i;
            if ((extraCallback & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public int ICustomTabsCallback() throws IOException {
        int i = this.HaptikSDK$d;
        if (this.HaptikWebView - i < 4) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        byte[] bArr = this.toString;
        this.HaptikSDK$d = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public long ak$a() throws IOException {
        int i = this.HaptikSDK$d;
        if (this.HaptikWebView - i < 8) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        byte[] bArr = this.toString;
        this.HaptikSDK$d = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // o.setSpanGroupIndexCacheEnabled
    public int ag$a(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int values = i + values();
        int i2 = this.ah$b;
        if (values > i2) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.ah$b = values;
        onPostMessage();
        return i2;
    }

    private void onPostMessage() {
        int i = this.HaptikWebView + this.HaptikSDK$b;
        this.HaptikWebView = i;
        int i2 = i - this.getSignupData;
        int i3 = this.ah$b;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.HaptikSDK$b = i4;
            this.HaptikWebView = i - i4;
            return;
        }
        this.HaptikSDK$b = 0;
    }

    @Override // o.setSpanGroupIndexCacheEnabled
    public void ah$a(int i) {
        this.ah$b = i;
        onPostMessage();
    }

    @Override // o.setSpanGroupIndexCacheEnabled
    public boolean valueOf() throws IOException {
        return this.HaptikSDK$d == this.HaptikWebView;
    }

    @Override // o.setSpanGroupIndexCacheEnabled
    public int values() {
        return this.HaptikSDK$d - this.getSignupData;
    }

    public byte extraCallback() throws IOException {
        int i = this.HaptikSDK$d;
        if (i == this.HaptikWebView) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        byte[] bArr = this.toString;
        this.HaptikSDK$d = i + 1;
        return bArr[i];
    }

    public byte[] invoke(int i) throws IOException {
        if (i > 0) {
            int i2 = this.HaptikWebView;
            int i3 = this.HaptikSDK$d;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.HaptikSDK$d = i4;
                return Arrays.copyOfRange(this.toString, i3, i4);
            }
        }
        if (i <= 0) {
            if (i == 0) {
                return checkSelectForSwipe.valueOf;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public void HaptikSDK$a(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.HaptikWebView;
            int i3 = this.HaptikSDK$d;
            if (i <= i2 - i3) {
                this.HaptikSDK$d = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }
}
