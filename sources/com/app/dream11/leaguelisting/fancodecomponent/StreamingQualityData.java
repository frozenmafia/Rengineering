package com.app.dream11.leaguelisting.fancodecomponent;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.io.Serializable;
import o.moveToLast;
import o.runAnimators;
/* loaded from: classes.dex */
public final class StreamingQualityData implements Serializable {
    private static int HaptikSDK$c = 1;
    private static byte[] ag$a = {-4, 65, 66, 19, 77, -1, -47, -46, Byte.MAX_VALUE, 101, -56, -35, 120};
    private static int ah$a = -745445719;
    private static int invoke = 0;
    private static int toString = -1144585964;
    private static int valueOf = 9;
    private static short[] values;
    private final int bitrate;
    private final int height;
    private final String subTitle;
    private final String title;
    private final int trackId;

    public StreamingQualityData(int i, int i2, int i3, String str, String str2) {
        runAnimators.ag$a(str, ah$a((byte) (TextUtils.indexOf((CharSequence) "", '0') + 106), (-9) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), Color.rgb(0, 0, 0) + 762223051, (short) (78 - TextUtils.indexOf((CharSequence) "", '0')), 1144585964 - (Process.myTid() >> 22)).intern());
        runAnimators.ag$a(str2, ah$a((byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) - 41), (-9) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 745445834, (short) (93 - TextUtils.indexOf("", "", 0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1144585968).intern());
        this.trackId = i;
        this.height = i2;
        this.bitrate = i3;
        this.title = str;
        this.subTitle = str2;
    }

    public final int getBitrate() {
        try {
            int i = HaptikSDK$c + 65;
            invoke = i % 128;
            if (!(i % 2 == 0)) {
                int i2 = this.bitrate;
                Object obj = null;
                super.hashCode();
                return i2;
            }
            return this.bitrate;
        } catch (Exception e) {
            throw e;
        }
    }

    public final int getHeight() {
        int i = HaptikSDK$c + 47;
        invoke = i % 128;
        int i2 = i % 2;
        int i3 = this.height;
        int i4 = invoke + 47;
        HaptikSDK$c = i4 % 128;
        if (!(i4 % 2 == 0)) {
            return i3;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return i3;
    }

    public final String getSubTitle() {
        int i = HaptikSDK$c + 103;
        invoke = i % 128;
        int i2 = i % 2;
        String str = this.subTitle;
        int i3 = HaptikSDK$c + 91;
        invoke = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        }
        return str;
    }

    public final String getTitle() {
        int i = invoke + 63;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        String str = this.title;
        int i3 = invoke + 109;
        HaptikSDK$c = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final int getTrackId() {
        int i = invoke + 107;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        try {
            int i3 = this.trackId;
            int i4 = HaptikSDK$c + 29;
            invoke = i4 % 128;
            int i5 = i4 % 2;
            return i3;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String ah$a(byte b2, int i, int i2, short s, int i3) {
        String obj;
        synchronized (moveToLast.ah$a) {
            StringBuilder sb = new StringBuilder();
            int i4 = i + valueOf;
            boolean z = i4 == -1;
            if (z) {
                if (ag$a != null) {
                    i4 = (byte) (ag$a[toString + i3] + valueOf);
                } else {
                    i4 = (short) (values[toString + i3] + valueOf);
                }
            }
            if (i4 > 0) {
                moveToLast.values = ((i3 + i4) - 2) + toString + (z ? 1 : 0);
                moveToLast.ag$a = (char) (i2 + ah$a);
                sb.append(moveToLast.ag$a);
                moveToLast.toString = moveToLast.ag$a;
                moveToLast.valueOf = 1;
                while (moveToLast.valueOf < i4) {
                    if (ag$a != null) {
                        byte[] bArr = ag$a;
                        int i5 = moveToLast.values;
                        moveToLast.values = i5 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((byte) (bArr[i5] + s)) ^ b2));
                    } else {
                        short[] sArr = values;
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
