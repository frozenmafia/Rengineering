package com.app.dream11.myprofile.firstpersonprofile.myprofiledatamapper;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.Serializable;
import o.moveToLast;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class Preview implements Serializable {
    private static int HaptikSDK$c = 0;
    private static short[] ag$a = null;
    private static int ah$a = 2019620243;
    private static int invoke = 1;
    private static int toString = 57;
    private static byte[] valueOf = {-52, 97, 98, -13, 109};
    private static int values = 835819660;
    private final String artwork;
    private final OfferDetails offerDetails;
    private final String programUrl;
    private final String summary;
    private final String title;

    public Preview(String str, String str2, String str3, OfferDetails offerDetails, String str4) {
        runAnimators.ag$a(str, ah$a((byte) ((-54) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 59, ExpandableListView.getPackedPositionGroup(0L) - 835819544, (short) ((-49) - TextUtils.indexOf("", "", 0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 2019620243).intern());
        runAnimators.ag$a(str2, "artwork");
        runAnimators.ag$a(str3, "summary");
        runAnimators.ag$a(offerDetails, "offerDetails");
        runAnimators.ag$a(str4, "programUrl");
        this.title = str;
        this.artwork = str2;
        this.summary = str3;
        this.offerDetails = offerDetails;
        this.programUrl = str4;
    }

    public final String getArtwork() {
        int i = invoke + 115;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        String str = this.artwork;
        int i3 = HaptikSDK$c + 61;
        invoke = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        return str;
    }

    public final String getSummary() {
        int i = HaptikSDK$c + 65;
        invoke = i % 128;
        if (i % 2 == 0) {
            try {
                String str = this.summary;
                Object obj = null;
                super.hashCode();
                return str;
            } catch (Exception e) {
                throw e;
            }
        }
        return this.summary;
    }

    public final String getTitle() {
        int i = invoke + 21;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        try {
            String str = this.title;
            int i3 = invoke + 33;
            HaptikSDK$c = i3 % 128;
            if (!(i3 % 2 != 0)) {
                return str;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final OfferDetails getOfferDetails() {
        int i = HaptikSDK$c + 37;
        invoke = i % 128;
        int i2 = i % 2;
        OfferDetails offerDetails = this.offerDetails;
        try {
            int i3 = HaptikSDK$c + 85;
            invoke = i3 % 128;
            int i4 = i3 % 2;
            return offerDetails;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getProgramUrl() {
        int i = HaptikSDK$c + 39;
        invoke = i % 128;
        int i2 = i % 2;
        String str = this.programUrl;
        int i3 = invoke + 107;
        HaptikSDK$c = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    private static String ah$a(byte b2, int i, int i2, short s, int i3) {
        String obj;
        synchronized (moveToLast.ah$a) {
            StringBuilder sb = new StringBuilder();
            int i4 = i + toString;
            boolean z = i4 == -1;
            if (z) {
                if (valueOf != null) {
                    i4 = (byte) (valueOf[ah$a + i3] + toString);
                } else {
                    i4 = (short) (ag$a[ah$a + i3] + toString);
                }
            }
            if (i4 > 0) {
                moveToLast.values = ((i3 + i4) - 2) + ah$a + (z ? 1 : 0);
                moveToLast.ag$a = (char) (i2 + values);
                sb.append(moveToLast.ag$a);
                moveToLast.toString = moveToLast.ag$a;
                moveToLast.valueOf = 1;
                while (moveToLast.valueOf < i4) {
                    if (valueOf != null) {
                        byte[] bArr = valueOf;
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
}
