package com.app.dream11.dream11;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.moveToLast;
/* loaded from: classes3.dex */
public final class WebViewFlowState extends FlowState {
    private static int HaptikSDK$a = 0;
    private static int ag$a = 96;
    private static short[] ah$a = null;
    private static int ah$b = 1;
    private static int toString = -654745728;
    private static byte[] valueOf = {-118, -117, 120, -122, 0};
    private static int values = -1370581056;
    private final String argTitle;
    private final String argUrl;
    private final String shouldHandleWebviewBackStack;

    public WebViewFlowState(String str, String str2, boolean z) {
        super(FlowStates.WEBVIEW, null, 2, null);
        this.argUrl = "url";
        this.argTitle = valueOf((byte) (ExpandableListView.getPackedPositionChild(0L) + 116), (-91) - Color.alpha(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1370581172, (short) TextUtils.getOffsetAfter("", 0), (Process.myTid() >> 22) + 654745728).intern();
        this.shouldHandleWebviewBackStack = "shouldHandleWebviewBackStack";
        putExtra(valueOf((byte) (View.resolveSizeAndState(0, 0, 0) + 115), (Process.myPid() >> 22) - 91, 1370581172 - (ViewConfiguration.getTapTimeout() >> 16), (short) (ViewConfiguration.getJumpTapTimeout() >> 16), 654745728 - View.resolveSizeAndState(0, 0, 0)).intern(), str);
        putExtra("url", str2);
        putExtra("shouldHandleWebviewBackStack", Boolean.valueOf(z));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ WebViewFlowState(java.lang.String r2, java.lang.String r3, boolean r4, int r5, o.getTargetTypes r6) {
        /*
            r1 = this;
            r5 = r5 & 4
            r6 = 0
            r0 = 1
            if (r5 == 0) goto L8
            r5 = 0
            goto L9
        L8:
            r5 = 1
        L9:
            if (r5 == 0) goto Lc
            goto L24
        Lc:
            int r4 = com.app.dream11.dream11.WebViewFlowState.ah$b
            int r4 = r4 + 7
            int r5 = r4 % 128
            com.app.dream11.dream11.WebViewFlowState.HaptikSDK$a = r5
            int r4 = r4 % 2
            r5 = 91
            if (r4 == 0) goto L1d
            r4 = 36
            goto L1f
        L1d:
            r4 = 91
        L1f:
            if (r4 == r5) goto L23
            r4 = 1
            goto L24
        L23:
            r4 = 0
        L24:
            r1.<init>(r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.dream11.WebViewFlowState.<init>(java.lang.String, java.lang.String, boolean, int, o.getTargetTypes):void");
    }

    public final String getTitle() {
        int i = ah$b + 67;
        HaptikSDK$a = i % 128;
        int i2 = i % 2;
        try {
            try {
                String string = getString(this.argTitle);
                int i3 = ah$b + 3;
                HaptikSDK$a = i3 % 128;
                if ((i3 % 2 != 0 ? ')' : ']') != ']') {
                    Object[] objArr = null;
                    int length = objArr.length;
                    return string;
                }
                return string;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String getUrl() {
        try {
            int i = HaptikSDK$a + 11;
            ah$b = i % 128;
            int i2 = i % 2;
            try {
                String string = getString(this.argUrl);
                int i3 = HaptikSDK$a + 119;
                ah$b = i3 % 128;
                int i4 = i3 % 2;
                return string;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final boolean getShouldHandlerWebViewbackstack() {
        try {
            int i = HaptikSDK$a + 105;
            ah$b = i % 128;
            int i2 = i % 2;
            boolean z = getBoolean(this.shouldHandleWebviewBackStack);
            try {
                int i3 = HaptikSDK$a + 69;
                ah$b = i3 % 128;
                if ((i3 % 2 == 0 ? '8' : 'D') != 'D') {
                    Object[] objArr = null;
                    int length = objArr.length;
                    return z;
                }
                return z;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String valueOf(byte b2, int i, int i2, short s, int i3) {
        String obj;
        synchronized (moveToLast.ah$a) {
            StringBuilder sb = new StringBuilder();
            int i4 = i + ag$a;
            boolean z = i4 == -1;
            if (z) {
                if (valueOf != null) {
                    i4 = (byte) (valueOf[toString + i3] + ag$a);
                } else {
                    i4 = (short) (ah$a[toString + i3] + ag$a);
                }
            }
            if (i4 > 0) {
                moveToLast.values = ((i3 + i4) - 2) + toString + (z ? 1 : 0);
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
                        short[] sArr = ah$a;
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
