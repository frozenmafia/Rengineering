package com.app.dream11.teamselection;

import android.view.View;
import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.getShort;
import o.handleServiceConnected;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class CreateTeamAnalyticsHelper$Companion$statesOnCTItemClicked$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    private static char ag$a = 43775;
    private static int ah$a = 0;
    private static int toString = 1;
    private static int valueOf;
    private static long values;
    final /* synthetic */ handleServiceConnected $controller;
    final /* synthetic */ String $previousSelection;
    final /* synthetic */ int $roundId;
    final /* synthetic */ String $selection;
    final /* synthetic */ String $source;
    final /* synthetic */ int $teamId;
    final /* synthetic */ int $tourId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTeamAnalyticsHelper$Companion$statesOnCTItemClicked$1(int i, int i2, String str, int i3, String str2, String str3, handleServiceConnected handleserviceconnected) {
        super(0);
        try {
            this.$roundId = i;
            this.$tourId = i2;
            this.$source = str;
            this.$teamId = i3;
            this.$previousSelection = str2;
            this.$selection = str3;
            this.$controller = handleserviceconnected;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        int i = valueOf + 7;
        toString = i % 128;
        if ((i % 2 == 0 ? 'A' : (char) 29) == 'A') {
            invoke2();
            int i2 = 22 / 0;
            return setAnimationMatrix.ag$a;
        }
        try {
            invoke2();
            return setAnimationMatrix.ag$a;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NewEvents newEvents = new NewEvents("StatsOnCreateTeamApplied");
        newEvents.addProperty(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.$roundId));
        newEvents.addProperty("tourId", Integer.valueOf(this.$tourId));
        newEvents.addProperty(toString(View.MeasureSpec.getMode(0), new char[]{26188, 63887, 1478, 15742}, new char[]{0, 0, 0, 0}, (char) (View.resolveSizeAndState(0, 0, 0) + 32261), new char[]{26449, 63436, 17630, 33977, 24345, 64448}).intern(), this.$source);
        newEvents.addProperty("teamId", Integer.valueOf(this.$teamId));
        newEvents.addProperty("previousSelection", this.$previousSelection);
        newEvents.addProperty("selection", this.$selection);
        this.$controller.ag$a(newEvents);
        int i = toString + 101;
        valueOf = i % 128;
        int i2 = i % 2;
    }

    private static String toString(int i, char[] cArr, char[] cArr2, char c, char[] cArr3) {
        String str;
        synchronized (getShort.toString) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            getShort.valueOf = 0;
            while (getShort.valueOf < length) {
                int i2 = (getShort.valueOf + 2) % 4;
                int i3 = (getShort.valueOf + 3) % 4;
                getShort.values = (char) (((cArr4[getShort.valueOf % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = getShort.values;
                cArr6[getShort.valueOf] = (char) ((((cArr4[i3] ^ cArr3[getShort.valueOf]) ^ values) ^ ah$a) ^ ag$a);
                getShort.valueOf++;
            }
            str = new String(cArr6);
        }
        return str;
    }
}
