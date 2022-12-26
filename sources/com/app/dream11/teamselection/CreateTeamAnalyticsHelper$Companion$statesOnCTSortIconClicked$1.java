package com.app.dream11.teamselection;

import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.handleServiceConnected;
import o.isClosed;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class CreateTeamAnalyticsHelper$Companion$statesOnCTSortIconClicked$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    private static int ag$a = 0;
    private static char[] ah$a = {'7', 'r', 's', 'j', 'd', 'l'};
    private static int values = 1;
    final /* synthetic */ handleServiceConnected $controller;
    final /* synthetic */ int $matchId;
    final /* synthetic */ String $source;
    final /* synthetic */ int $teamId;
    final /* synthetic */ int $tourId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTeamAnalyticsHelper$Companion$statesOnCTSortIconClicked$1(int i, int i2, String str, int i3, handleServiceConnected handleserviceconnected) {
        super(0);
        this.$matchId = i;
        this.$tourId = i2;
        this.$source = str;
        this.$teamId = i3;
        this.$controller = handleserviceconnected;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        int i = values + 35;
        ag$a = i % 128;
        char c = i % 2 != 0 ? '=' : '?';
        invoke2();
        if (c != '=') {
            return setAnimationMatrix.ag$a;
        }
        setAnimationMatrix setanimationmatrix = setAnimationMatrix.ag$a;
        Object[] objArr = null;
        int length = objArr.length;
        return setanimationmatrix;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NewEvents newEvents = new NewEvents("StatsOnCreateTeamClicked");
        newEvents.addProperty(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.$matchId));
        newEvents.addProperty("tourId", Integer.valueOf(this.$tourId));
        newEvents.addProperty(values(false, new int[]{0, 6, 0, 5}, new byte[]{1, 0, 1, 1, 0, 0}).intern(), this.$source);
        newEvents.addProperty("teamId", Integer.valueOf(this.$teamId));
        this.$controller.ag$a(newEvents);
        int i = ag$a + 55;
        values = i % 128;
        if ((i % 2 == 0 ? (char) 21 : '/') != '/') {
            Object obj = null;
            super.hashCode();
        }
    }

    private static String values(boolean z, int[] iArr, byte[] bArr) {
        String str;
        synchronized (isClosed.ah$a) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(ah$a, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                isClosed.ag$a = 0;
                char c = 0;
                while (isClosed.ag$a < i2) {
                    if (bArr[isClosed.ag$a] == 1) {
                        cArr2[isClosed.ag$a] = (char) (((cArr[isClosed.ag$a] << 1) + 1) - c);
                    } else {
                        cArr2[isClosed.ag$a] = (char) ((cArr[isClosed.ag$a] << 1) - c);
                    }
                    c = cArr2[isClosed.ag$a];
                    isClosed.ag$a++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr4[isClosed.ag$a] = cArr[(i2 - isClosed.ag$a) - 1];
                    isClosed.ag$a++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr[isClosed.ag$a] = (char) (cArr[isClosed.ag$a] - iArr[2]);
                    isClosed.ag$a++;
                }
            }
            str = new String(cArr);
        }
        return str;
    }
}
