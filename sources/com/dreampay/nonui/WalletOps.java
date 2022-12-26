package com.dreampay.nonui;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.apxor.androidsdk.core.ce.Constants;
import com.dreampay.commons.PaymentResult;
import com.dreampay.commons.ResponseListener;
import com.dreampay.commons.constants.Constants;
import com.dreampay.commons.wallets.SendOtpResult;
import com.dreampay.commons.wallets.UnlinkResult;
import com.dreampay.commons.wallets.Wallet;
import com.dreampay.commons.wallets.WalletDetails;
import java.util.List;
import o.moveToLast;
import o.runAnimators;
import o.saveWebpAttributes;
/* loaded from: classes4.dex */
public final class WalletOps {
    private static int HaptikSDK$a = 0;
    private static short[] HaptikSDK$b = null;
    private static int HaptikSDK$c = 1;
    private static int ag$a;
    public static final WalletOps ah$a;
    private static int toString;
    private static byte[] valueOf;
    private static int values;

    static {
        ah$a();
        ah$a = new WalletOps();
        int i = HaptikSDK$a + 119;
        HaptikSDK$c = i % 128;
        if (!(i % 2 == 0)) {
            return;
        }
        Object obj = null;
        super.hashCode();
    }

    static void ah$a() {
        ag$a = 30;
        toString = -1104978592;
        values = -404414733;
        valueOf = new byte[]{-24, -26, 124, -11, -22, -117};
    }

    private WalletOps() {
    }

    public final void pay(Activity activity, int i, String str, String str2, Wallet wallet, List<String> list) {
        int i2 = HaptikSDK$c + 109;
        HaptikSDK$a = i2 % 128;
        int i3 = i2 % 2;
        runAnimators.ag$a(activity, Constants.ACTIVITY);
        runAnimators.ag$a(str, "base64Request");
        runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
        runAnimators.ag$a(wallet, values((byte) (63 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 30, TextUtils.indexOf("", "", 0) + 1104978711, (short) (74 - Color.argb(0, 0, 0, 0)), 404414732 - TextUtils.lastIndexOf("", '0', 0, 0)).intern());
        saveWebpAttributes.valueOf(saveWebpAttributes.values, activity, i, null, wallet, str, str2, list, null, 132, null);
        int i4 = HaptikSDK$a + 121;
        HaptikSDK$c = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void unlink(String str, String str2, Wallet wallet, ResponseListener<UnlinkResult> responseListener) {
        int i = HaptikSDK$c + 57;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        runAnimators.ag$a(str, "base64Request");
        runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
        runAnimators.ag$a(wallet, values((byte) (TextUtils.indexOf("", "") + 63), Color.red(0) - 31, 1104978711 - (ViewConfiguration.getTapTimeout() >> 16), (short) (Color.argb(0, 0, 0, 0) + 74), TextUtils.getOffsetAfter("", 0) + 404414733).intern());
        runAnimators.ag$a(responseListener, "unlinkWalletListener");
        saveWebpAttributes.values.ah$a(wallet, str, str2, responseListener);
        int i3 = HaptikSDK$a + 11;
        HaptikSDK$c = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void link(Activity activity, int i, String str, String str2, Wallet wallet) {
        int i2 = HaptikSDK$a + 91;
        HaptikSDK$c = i2 % 128;
        int i3 = i2 % 2;
        runAnimators.ag$a(activity, com.apxor.androidsdk.core.ce.Constants.ACTIVITY);
        runAnimators.ag$a(str, "base64Request");
        runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
        runAnimators.ag$a(wallet, values((byte) (((Process.getThreadPriority(0) + 20) >> 6) + 63), (-31) - ExpandableListView.getPackedPositionGroup(0L), TextUtils.lastIndexOf("", '0', 0, 0) + 1104978712, (short) (Color.alpha(0) + 74), AndroidCharacter.getMirror('0') + 57565).intern());
        saveWebpAttributes.values.valueOf(activity, i, wallet, str, str2);
        int i4 = HaptikSDK$a + 3;
        HaptikSDK$c = i4 % 128;
        if ((i4 % 2 == 0 ? 'P' : '5') != '5') {
            int i5 = 53 / 0;
        }
    }

    public final void payOrAutoDebit(Activity activity, int i, String str, String str2, Wallet wallet, double d, List<String> list, ResponseListener<PaymentResult> responseListener) {
        int i2 = HaptikSDK$a + 115;
        HaptikSDK$c = i2 % 128;
        int i3 = i2 % 2;
        runAnimators.ag$a(activity, com.apxor.androidsdk.core.ce.Constants.ACTIVITY);
        runAnimators.ag$a(str, "base64Request");
        runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
        runAnimators.ag$a(wallet, values((byte) (63 - (Process.myTid() >> 22)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 32, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1104978711, (short) (74 - KeyEvent.getDeadChar(0, 0)), 404414734 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern());
        runAnimators.ag$a(responseListener, "autoDebitListener");
        saveWebpAttributes.values.toString(wallet, activity, i, str, str2, list, d, responseListener);
        int i4 = HaptikSDK$c + 61;
        HaptikSDK$a = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        int i5 = 60 / 0;
    }

    public final void fetchWalletDetails(String str, String str2, Wallet wallet, ResponseListener<WalletDetails> responseListener) {
        int i = HaptikSDK$a + 67;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        runAnimators.ag$a(str, "base64Request");
        runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
        runAnimators.ag$a(wallet, values((byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 62), (-16777247) - Color.rgb(0, 0, 0), 1104978711 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (short) (74 - (ViewConfiguration.getTouchSlop() >> 8)), (ViewConfiguration.getScrollBarSize() >> 8) + 404414733).intern());
        runAnimators.ag$a(responseListener, "listener");
        saveWebpAttributes.values.valueOf(str, str2, wallet, responseListener);
        int i3 = HaptikSDK$c + 65;
        HaptikSDK$a = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void sendOtp(String str, String str2, String str3, Wallet wallet, ResponseListener<SendOtpResult> responseListener, boolean z) {
        int i = HaptikSDK$a + 1;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        runAnimators.ag$a(str, "mobileNumber");
        runAnimators.ag$a(str2, "base64Request");
        runAnimators.ag$a(str3, Constants.Navigation.CHECKSUM);
        runAnimators.ag$a(wallet, values((byte) ((KeyEvent.getMaxKeyCode() >> 16) + 63), (-31) - Color.red(0), 1104978711 - View.resolveSize(0, 0), (short) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 73), 404414733 - KeyEvent.getDeadChar(0, 0)).intern());
        runAnimators.ag$a(responseListener, "sendOtpListener");
        saveWebpAttributes.values.values(wallet, str, str2, str3, z, responseListener);
        int i3 = HaptikSDK$a + 97;
        HaptikSDK$c = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void verifyOtp(String str, String str2, Wallet wallet, String str3, String str4, ResponseListener<WalletDetails> responseListener) {
        int i = HaptikSDK$a + 93;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        runAnimators.ag$a(str, "base64Request");
        runAnimators.ag$a(str2, Constants.Navigation.CHECKSUM);
        runAnimators.ag$a(wallet, values((byte) (63 - (ViewConfiguration.getLongPressTimeout() >> 16)), (-32) - Process.getGidForName(""), 1104978711 - (Process.myPid() >> 22), (short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 73), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 404414732).intern());
        runAnimators.ag$a(str3, "otp");
        runAnimators.ag$a(str4, "validateToken");
        runAnimators.ag$a(responseListener, "verifyOtpListener");
        saveWebpAttributes.values.toString(wallet, str3, str4, str, str2, responseListener);
        int i3 = HaptikSDK$c + 87;
        HaptikSDK$a = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
    }

    private static String values(byte b2, int i, int i2, short s, int i3) {
        String obj;
        synchronized (moveToLast.ah$a) {
            StringBuilder sb = new StringBuilder();
            int i4 = i + ag$a;
            boolean z = i4 == -1;
            if (z) {
                if (valueOf != null) {
                    i4 = (byte) (valueOf[values + i3] + ag$a);
                } else {
                    i4 = (short) (HaptikSDK$b[values + i3] + ag$a);
                }
            }
            if (i4 > 0) {
                moveToLast.values = ((i3 + i4) - 2) + values + (z ? 1 : 0);
                moveToLast.ag$a = (char) (i2 + toString);
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
                        short[] sArr = HaptikSDK$b;
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
