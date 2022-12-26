package com.app.dream11.payment;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.databinding.library.baseAdapters.BR;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import java.io.Serializable;
import o.isAfterLast;
import o.runAnimators;
import org.apache.http.message.TokenParser;
/* loaded from: classes3.dex */
public final class PaymentWebViewFlowState extends FlowState {
    private static int ah$a = 0;
    private static int toString = 1;
    private static int values = 90;
    private final double amount;
    private final String title;
    private final String url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentWebViewFlowState(double d, String str, String str2, String str3, String str4) {
        super(FlowStates.PAYMENTWEB, null, 2, null);
        runAnimators.ag$a(str, "url");
        runAnimators.ag$a(str2, valueOf((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + BR.lastMessageText, false, 5 - ((Process.getThreadPriority(0) + 20) >> 6), new char[]{65532, 7, 65535, 65528, 7}).intern());
        runAnimators.ag$a(str3, "txnId");
        runAnimators.ag$a(str4, valueOf(4 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + BR.lastMessageText, true, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 5, new char[]{5, '\b', 2, 6, 65528, 65526}).intern());
        this.amount = d;
        this.url = str;
        this.title = str2;
        putExtra(valueOf((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2, 201 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), true, ((byte) KeyEvent.getModifierMetaStateMask()) + 7, new char[]{65535, 65523, 6, 0, 7, 1}).intern(), Double.valueOf(d));
        putExtra(valueOf(2 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 197 - View.MeasureSpec.makeMeasureSpec(0, 0), true, 7 - Color.red(0), new char[]{65530, '\f', 1, 7, '\n', 65524, 65527}).intern(), str);
        putExtra(valueOf(6 - (ViewConfiguration.getEdgeSlop() >> 16), Process.getGidForName("") + 198, false, (-16777210) - Color.rgb(0, 0, 0), new char[]{'\t', TokenParser.CR, 3, 65524, 65534, 65529}).intern(), str3);
        putExtra(valueOf((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3, (KeyEvent.getMaxKeyCode() >> 16) + BR.lastMessageText, false, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 5, new char[]{65532, 7, 65535, 65528, 7}).intern(), str2);
        putExtra(valueOf(4 - View.MeasureSpec.getMode(0), 199 - (ViewConfiguration.getTapTimeout() >> 16), true, 6 - (KeyEvent.getMaxKeyCode() >> 16), new char[]{5, '\b', 2, 6, 65528, 65526}).intern(), str4);
        String str5 = PaymentConstants.HaptikWebView;
        runAnimators.ah$a(str5, "DEPOSIT_FLOW");
        putExtra(str5, (Serializable) true);
    }

    public final double getAmount() {
        try {
            int i = toString + 119;
            ah$a = i % 128;
            int i2 = i % 2;
            double d = this.amount;
            int i3 = ah$a + 27;
            toString = i3 % 128;
            if ((i3 % 2 == 0 ? (char) 19 : '0') != '0') {
                int i4 = 86 / 0;
                return d;
            }
            return d;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getTitle() {
        int i = toString + 105;
        ah$a = i % 128;
        int i2 = i % 2;
        String str = this.title;
        int i3 = ah$a + 85;
        toString = i3 % 128;
        if ((i3 % 2 == 0 ? (char) 1 : (char) 21) != 21) {
            int i4 = 83 / 0;
            return str;
        }
        return str;
    }

    public final String getUrl() {
        try {
            int i = ah$a + 11;
            try {
                toString = i % 128;
                if (i % 2 != 0) {
                    return this.url;
                }
                String str = this.url;
                Object obj = null;
                super.hashCode();
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String valueOf(int i, int i2, boolean z, int i3, char[] cArr) {
        String str;
        synchronized (isAfterLast.valueOf) {
            char[] cArr2 = new char[i3];
            isAfterLast.values = 0;
            while (isAfterLast.values < i3) {
                isAfterLast.ag$a = cArr[isAfterLast.values];
                cArr2[isAfterLast.values] = (char) (isAfterLast.ag$a + i2);
                int i4 = isAfterLast.values;
                cArr2[i4] = (char) (cArr2[i4] - values);
                isAfterLast.values++;
            }
            if (i > 0) {
                isAfterLast.toString = i;
                char[] cArr3 = new char[i3];
                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                System.arraycopy(cArr3, 0, cArr2, i3 - isAfterLast.toString, isAfterLast.toString);
                System.arraycopy(cArr3, isAfterLast.toString, cArr2, 0, i3 - isAfterLast.toString);
            }
            if (z) {
                char[] cArr4 = new char[i3];
                isAfterLast.values = 0;
                while (isAfterLast.values < i3) {
                    cArr4[isAfterLast.values] = cArr2[(i3 - isAfterLast.values) - 1];
                    isAfterLast.values++;
                }
                cArr2 = cArr4;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
