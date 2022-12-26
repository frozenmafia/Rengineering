package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import o.getTargetTypes;
import o.moveToLast;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class ShareLinkContent extends ShareContent<ShareLinkContent, valueOf> {
    public static final Parcelable.Creator<ShareLinkContent> CREATOR;
    private static int HaptikSDK$a = 0;
    private static int HaptikSDK$b = 1;
    private static int ag$a;
    private static int ah$a;
    private static byte[] ah$b;
    private static short[] invoke;
    public static final toString toString;
    private static int values;
    private final String valueOf;

    public /* synthetic */ ShareLinkContent(valueOf valueof, getTargetTypes gettargettypes) {
        this(valueof);
    }

    static void values() {
        ah$a = 113;
        ag$a = -1740445947;
        values = 1224905910;
        ah$b = new byte[]{2, -15, -3, 6, -4, 0};
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        int i = HaptikSDK$a + 79;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        try {
            int i3 = HaptikSDK$b + 15;
            try {
                HaptikSDK$a = i3 % 128;
                int i4 = i3 % 2;
                return 0;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String ag$a() {
        String str;
        int i = HaptikSDK$a + 27;
        HaptikSDK$b = i % 128;
        if (!(i % 2 != 0)) {
            str = this.valueOf;
            Object[] objArr = null;
            int length = objArr.length;
        } else {
            str = this.valueOf;
        }
        int i2 = HaptikSDK$a + 75;
        HaptikSDK$b = i2 % 128;
        if (!(i2 % 2 == 0)) {
            return str;
        }
        int i3 = 94 / 0;
        return str;
    }

    private ShareLinkContent(valueOf valueof) {
        super(valueof);
        this.valueOf = valueof.ah$b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareLinkContent(Parcel parcel) {
        super(parcel);
        runAnimators.ag$a(parcel, ah$a((byte) ((Process.getThreadPriority(0) + 20) >> 6), (-106) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1740446062 - (ViewConfiguration.getJumpTapTimeout() >> 16), (short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 1224905910).intern());
        this.valueOf = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = HaptikSDK$a + 61;
        HaptikSDK$b = i2 % 128;
        int i3 = i2 % 2;
        runAnimators.ag$a(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.valueOf);
        try {
            int i4 = HaptikSDK$b + 43;
            try {
                HaptikSDK$a = i4 % 128;
                if (!(i4 % 2 == 0)) {
                    Object obj = null;
                    super.hashCode();
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* loaded from: classes6.dex */
    public static final class valueOf extends ShareContent$ag$a<ShareLinkContent, valueOf> {
        private String ag$a;

        public final String ah$b() {
            return this.ag$a;
        }

        public final valueOf toString(String str) {
            this.ag$a = str;
            return this;
        }

        public ShareLinkContent HaptikSDK$c() {
            return new ShareLinkContent(this, null);
        }

        @Override // com.facebook.share.model.ShareContent$ag$a
        /* renamed from: toString */
        public valueOf ag$a(ShareLinkContent shareLinkContent) {
            return shareLinkContent == null ? this : ((valueOf) super.ag$a((valueOf) shareLinkContent)).toString(shareLinkContent.ag$a());
        }
    }

    /* loaded from: classes4.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }
    }

    static {
        values();
        toString = new toString(null);
        CREATOR = new Parcelable.Creator<ShareLinkContent>() { // from class: com.facebook.share.model.ShareLinkContent$ag$a
            private static int HaptikSDK$a = 1;
            private static int HaptikSDK$b = 0;
            private static short[] ag$a = null;
            private static int ah$a = -793205482;
            private static int toString = 77;
            private static int valueOf = 1089496539;
            private static byte[] values = {-71, -16, Byte.MAX_VALUE, 123, -12, 122};

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ShareLinkContent createFromParcel(Parcel parcel) {
                int i = HaptikSDK$b + 41;
                HaptikSDK$a = i % 128;
                int i2 = i % 2;
                ShareLinkContent valueOf2 = valueOf(parcel);
                int i3 = HaptikSDK$b + 79;
                HaptikSDK$a = i3 % 128;
                if ((i3 % 2 == 0 ? '0' : (char) 30) != 30) {
                    Object[] objArr = null;
                    int length = objArr.length;
                    return valueOf2;
                }
                return valueOf2;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ShareLinkContent[] newArray(int i) {
                int i2 = HaptikSDK$a + 115;
                HaptikSDK$b = i2 % 128;
                char c = i2 % 2 != 0 ? '4' : (char) 14;
                ShareLinkContent[] valueOf2 = valueOf(i);
                if (c != 14) {
                    Object[] objArr = null;
                    int length = objArr.length;
                }
                return valueOf2;
            }

            public ShareLinkContent valueOf(Parcel parcel) {
                runAnimators.ag$a(parcel, valueOf((byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) - 72), (-78) - TextUtils.getOffsetAfter("", 0), (-1089496424) - View.MeasureSpec.makeMeasureSpec(0, 0), (short) (TextUtils.getOffsetAfter("", 0) - 54), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 793205481).intern());
                ShareLinkContent shareLinkContent = new ShareLinkContent(parcel);
                int i = HaptikSDK$b + 53;
                HaptikSDK$a = i % 128;
                if ((i % 2 == 0 ? (char) 6 : (char) 11) != 6) {
                    return shareLinkContent;
                }
                Object[] objArr = null;
                int length = objArr.length;
                return shareLinkContent;
            }

            public ShareLinkContent[] valueOf(int i) {
                int i2 = HaptikSDK$b + 39;
                HaptikSDK$a = i2 % 128;
                int i3 = i2 % 2;
                try {
                    ShareLinkContent[] shareLinkContentArr = new ShareLinkContent[i];
                    int i4 = HaptikSDK$a + 25;
                    HaptikSDK$b = i4 % 128;
                    int i5 = i4 % 2;
                    return shareLinkContentArr;
                } catch (Exception e) {
                    throw e;
                }
            }

            private static String valueOf(byte b2, int i, int i2, short s, int i3) {
                String obj;
                synchronized (moveToLast.ah$a) {
                    StringBuilder sb = new StringBuilder();
                    int i4 = i + toString;
                    boolean z = i4 == -1;
                    if (z) {
                        if (values != null) {
                            i4 = (byte) (values[ah$a + i3] + toString);
                        } else {
                            i4 = (short) (ag$a[ah$a + i3] + toString);
                        }
                    }
                    if (i4 > 0) {
                        moveToLast.values = ((i3 + i4) - 2) + ah$a + (z ? 1 : 0);
                        moveToLast.ag$a = (char) (i2 + valueOf);
                        sb.append(moveToLast.ag$a);
                        moveToLast.toString = moveToLast.ag$a;
                        moveToLast.valueOf = 1;
                        while (moveToLast.valueOf < i4) {
                            if (values != null) {
                                byte[] bArr = values;
                                int i5 = moveToLast.values;
                                moveToLast.values = i5 - 1;
                                moveToLast.ag$a = (char) (moveToLast.toString + (((byte) (bArr[i5] + s)) ^ b2));
                            } else {
                                short[] sArr = ag$a;
                                int i6 = moveToLast.values;
                                moveToLast.values = i6 - 1;
                                moveToLast.ag$a = (char) (moveToLast.toString + (((short) (sArr[i6] + s)) ^ b2));
                            }
                            sb.append(moveToLast.ag$a);
                            moveToLast.toString = moveToLast.ag$a;
                            moveToLast.valueOf++;
                        }
                    }
                    obj = sb.toString();
                }
                return obj;
            }
        };
        int i = HaptikSDK$b + 43;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
    }

    private static String ah$a(byte b2, int i, int i2, short s, int i3) {
        String obj;
        synchronized (moveToLast.ah$a) {
            StringBuilder sb = new StringBuilder();
            int i4 = i + ah$a;
            boolean z = i4 == -1;
            if (z) {
                if (ah$b != null) {
                    i4 = (byte) (ah$b[values + i3] + ah$a);
                } else {
                    i4 = (short) (invoke[values + i3] + ah$a);
                }
            }
            if (i4 > 0) {
                moveToLast.values = ((i3 + i4) - 2) + values + (z ? 1 : 0);
                moveToLast.ag$a = (char) (i2 + ag$a);
                sb.append(moveToLast.ag$a);
                moveToLast.toString = moveToLast.ag$a;
                moveToLast.valueOf = 1;
                while (moveToLast.valueOf < i4) {
                    if (ah$b != null) {
                        byte[] bArr = ah$b;
                        int i5 = moveToLast.values;
                        moveToLast.values = i5 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((byte) (bArr[i5] + s)) ^ b2));
                    } else {
                        short[] sArr = invoke;
                        int i6 = moveToLast.values;
                        moveToLast.values = i6 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((short) (sArr[i6] + s)) ^ b2));
                    }
                    sb.append(moveToLast.ag$a);
                    moveToLast.toString = moveToLast.ag$a;
                    moveToLast.valueOf++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
