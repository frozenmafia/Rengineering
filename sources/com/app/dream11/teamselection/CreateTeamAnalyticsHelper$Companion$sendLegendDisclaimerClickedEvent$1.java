package com.app.dream11.teamselection;

import android.graphics.Color;
import android.view.ViewConfiguration;
import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import com.app.dream11.model.EventCategory;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.handleServiceConnected;
import o.isFirst;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class CreateTeamAnalyticsHelper$Companion$sendLegendDisclaimerClickedEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    private static int ag$a = 1;
    private static int ah$a = 0;
    private static char[] toString = {13807, 13813, 13808, 13817, 13801, 13800, 13809, 13810, 13823};
    private static char values = 3;
    final /* synthetic */ handleServiceConnected $controller;
    final /* synthetic */ float $creditBalance;
    final /* synthetic */ int $matchId;
    final /* synthetic */ int $playerCount;
    final /* synthetic */ String $playerTypeCount;
    final /* synthetic */ String $source;
    final /* synthetic */ String $squadWiseCount;
    final /* synthetic */ int $tourId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTeamAnalyticsHelper$Companion$sendLegendDisclaimerClickedEvent$1(float f, int i, String str, String str2, String str3, int i2, int i3, handleServiceConnected handleserviceconnected) {
        super(0);
        this.$creditBalance = f;
        this.$playerCount = i;
        this.$playerTypeCount = str;
        this.$squadWiseCount = str2;
        this.$source = str3;
        this.$matchId = i2;
        this.$tourId = i3;
        this.$controller = handleserviceconnected;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        int i = ag$a + 1;
        ah$a = i % 128;
        int i2 = i % 2;
        try {
            invoke2();
            setAnimationMatrix setanimationmatrix = setAnimationMatrix.ag$a;
            int i3 = ag$a + 59;
            ah$a = i3 % 128;
            if ((i3 % 2 != 0 ? 'I' : 'G') != 'G') {
                int i4 = 61 / 0;
                return setanimationmatrix;
            }
            return setanimationmatrix;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NewEvents newEvents = new NewEvents("SpinPaceClicked", EventCategory.$UNKNOWN);
        newEvents.addProperty("creditBalance", Float.valueOf(this.$creditBalance));
        newEvents.addProperty("playerCount", Integer.valueOf(this.$playerCount));
        newEvents.addProperty("playerTypeCount", this.$playerTypeCount);
        newEvents.addProperty("squadWiseCount", this.$squadWiseCount);
        newEvents.addProperty(values((byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3), new char[]{7, 4, 2, 3, 5, 6}, 6 - Color.argb(0, 0, 0, 0)).intern(), this.$source);
        newEvents.addProperty(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.$matchId));
        newEvents.addProperty("tourId", Integer.valueOf(this.$tourId));
        this.$controller.ag$a(newEvents);
        int i = ag$a + 47;
        ah$a = i % 128;
        if ((i % 2 != 0 ? '?' : 'M') != '?') {
            return;
        }
        int i2 = 43 / 0;
    }

    private static String values(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = toString;
            char c = values;
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
