package com.app.dream11.myprofile.changeteamname;

import android.graphics.Color;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import java.io.Serializable;
import java.util.Map;
import o.isFirst;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class ChangeTeamNameFlowState extends FlowState {
    private static char ag$a = 3;
    private static int ah$a = 0;
    private static int valueOf = 1;
    private static char[] values = {13807, 13810, 13823, 13817, 13808, 13813, 13800, 13809, 13801};

    public ChangeTeamNameFlowState() {
        super(FlowStates.CHANGE_TEAM_NAME, null, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChangeTeamNameFlowState(String str) {
        this();
        runAnimators.ag$a(str, "screenSrc");
        putExtra(values((byte) (58 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), new char[]{2, '\b', 3, 0, 5, 0}, 6 - View.MeasureSpec.getMode(0)).intern(), str);
    }

    public final String getScreenSrc() {
        int i = ah$a + 31;
        valueOf = i % 128;
        int i2 = i % 2;
        String string = getString(values((byte) ((ViewConfiguration.getTapTimeout() >> 16) + 57), new char[]{2, '\b', 3, 0, 5, 0}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 7).intern(), "");
        int i3 = valueOf + 125;
        ah$a = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = null;
            int length = objArr.length;
            return string;
        }
        return string;
    }

    @Override // com.app.dream11.model.FlowState
    public void putAllExtras(Map<String, Serializable> map) {
        int i = valueOf + 33;
        ah$a = i % 128;
        int i2 = i % 2;
        runAnimators.ag$a(map, "args");
        putExtra(values((byte) ('i' - AndroidCharacter.getMirror('0')), new char[]{2, '\b', 3, 0, 5, 0}, Color.blue(0) + 6).intern(), map.get(values((byte) ('i' - AndroidCharacter.getMirror('0')), new char[]{2, '\b', 3, 0, 5, 0}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 6).intern()));
        int i3 = valueOf + 115;
        ah$a = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object[] objArr = null;
        int length = objArr.length;
    }

    private static String values(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = values;
            char c = ag$a;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr3[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                isFirst.valueOf = 0;
                while (isFirst.valueOf < i2) {
                    isFirst.toString = cArr[isFirst.valueOf];
                    isFirst.ah$a = cArr[isFirst.valueOf + 1];
                    if (isFirst.toString == isFirst.ah$a) {
                        cArr3[isFirst.valueOf] = (char) (isFirst.toString - b2);
                        cArr3[isFirst.valueOf + 1] = (char) (isFirst.ah$a - b2);
                    } else {
                        isFirst.ag$a = isFirst.toString / c;
                        isFirst.invoke = isFirst.toString % c;
                        isFirst.values = isFirst.ah$a / c;
                        isFirst.ah$b = isFirst.ah$a % c;
                        if (isFirst.invoke == isFirst.ah$b) {
                            isFirst.ag$a = ((isFirst.ag$a + c) - 1) % c;
                            isFirst.values = ((isFirst.values + c) - 1) % c;
                            int i3 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i4 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i3];
                            cArr3[isFirst.valueOf + 1] = cArr2[i4];
                        } else if (isFirst.ag$a == isFirst.values) {
                            isFirst.invoke = ((isFirst.invoke + c) - 1) % c;
                            isFirst.ah$b = ((isFirst.ah$b + c) - 1) % c;
                            int i5 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i6 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i5];
                            cArr3[isFirst.valueOf + 1] = cArr2[i6];
                        } else {
                            int i7 = (isFirst.ag$a * c) + isFirst.ah$b;
                            int i8 = (isFirst.values * c) + isFirst.invoke;
                            cArr3[isFirst.valueOf] = cArr2[i7];
                            cArr3[isFirst.valueOf + 1] = cArr2[i8];
                        }
                    }
                    isFirst.valueOf += 2;
                }
            }
            for (int i9 = 0; i9 < i; i9++) {
                cArr3[i9] = (char) (cArr3[i9] ^ 13722);
            }
            str = new String(cArr3);
        }
        return str;
    }
}
