package com.app.dream11.chat.chatlist.contestinvitebottomsheet;

import android.view.KeyEvent;
import androidx.databinding.BaseObservable;
import o.Styleable;
import o.addExtras;
import o.moveToFirst;
import o.runAnimators;
import o.setAnimationMatrix;
import o.setSemanticAction;
/* loaded from: classes.dex */
public final class ContestInviteChallengeCtaVM extends BaseObservable {
    private static int HaptikSDK$b = 1;
    private static char ag$a = 58631;
    private static int ah$a = 0;
    private static char toString = 36474;
    private static char valueOf = 63578;
    private static char values = 7215;
    private final Styleable.ArcMotion<setAnimationMatrix> callback;
    private final boolean contestInviteDMChallengeCtaVisibility;
    private final setSemanticAction dmChannelCTAData;
    private final boolean isGroupChannel;

    public final boolean isGroupChannel() {
        int i = ah$a + 55;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        boolean z = this.isGroupChannel;
        int i3 = ah$a + 33;
        HaptikSDK$b = i3 % 128;
        if ((i3 % 2 == 0 ? '\'' : '/') != '\'') {
            return z;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return z;
    }

    public final Styleable.ArcMotion<setAnimationMatrix> getCallback() {
        int i = HaptikSDK$b + 41;
        ah$a = i % 128;
        int i2 = i % 2;
        Styleable.ArcMotion<setAnimationMatrix> arcMotion = this.callback;
        int i3 = ah$a + 107;
        HaptikSDK$b = i3 % 128;
        int i4 = i3 % 2;
        return arcMotion;
    }

    public final setSemanticAction getDmChannelCTAData() {
        int i = ah$a + 19;
        HaptikSDK$b = i % 128;
        if (i % 2 != 0) {
            return this.dmChannelCTAData;
        }
        try {
            setSemanticAction setsemanticaction = this.dmChannelCTAData;
            Object[] objArr = null;
            int length = objArr.length;
            return setsemanticaction;
        } catch (Exception e) {
            throw e;
        }
    }

    public ContestInviteChallengeCtaVM(String str, boolean z, Integer num, addExtras.toString tostring, Styleable.ArcMotion<setAnimationMatrix> arcMotion) {
        setSemanticAction setsemanticaction;
        boolean z2 = false;
        runAnimators.ag$a(str, ah$a(new char[]{31019, 54754, 17362, 16595, 56696, 8619}, 6 - KeyEvent.normalizeMetaState(0)).intern());
        runAnimators.ag$a(tostring, "challengeCtaComponentCallback");
        runAnimators.ag$a(arcMotion, "callback");
        this.isGroupChannel = z;
        this.callback = arcMotion;
        if (num == null) {
            setsemanticaction = null;
            int i = ah$a + 29;
            HaptikSDK$b = i % 128;
            int i2 = i % 2;
        } else {
            setsemanticaction = new setSemanticAction(num.intValue(), str, tostring);
        }
        this.dmChannelCTAData = setsemanticaction;
        if (!z) {
            if (!(num == null)) {
                int i3 = ah$a + 43;
                HaptikSDK$b = i3 % 128;
                int i4 = i3 % 2;
                z2 = true;
            }
        }
        this.contestInviteDMChallengeCtaVisibility = z2;
    }

    public final boolean getContestInviteDMChallengeCtaVisibility() {
        int i = HaptikSDK$b + 71;
        ah$a = i % 128;
        int i2 = i % 2;
        boolean z = this.contestInviteDMChallengeCtaVisibility;
        try {
            int i3 = ah$a + 103;
            HaptikSDK$b = i3 % 128;
            if ((i3 % 2 == 0 ? '\f' : (char) 4) != 4) {
                Object[] objArr = null;
                int length = objArr.length;
                return z;
            }
            return z;
        } catch (Exception e) {
            throw e;
        }
    }

    public final void onChallengeCTAClicked() {
        int i = ah$a + 119;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        this.callback.invoke();
        int i3 = ah$a + 81;
        HaptikSDK$b = i3 % 128;
        int i4 = i3 % 2;
    }

    private static String ah$a(char[] cArr, int i) {
        String str;
        synchronized (moveToFirst.ah$a) {
            char[] cArr2 = new char[cArr.length];
            moveToFirst.values = 0;
            char[] cArr3 = new char[2];
            while (moveToFirst.values < cArr.length) {
                cArr3[0] = cArr[moveToFirst.values];
                cArr3[1] = cArr[moveToFirst.values + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + toString)) ^ ((cArr3[0] >>> 5) + ag$a)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + values)) ^ ((cArr3[1] >>> 5) + valueOf)));
                    i2 -= 40503;
                }
                cArr2[moveToFirst.values] = cArr3[0];
                cArr2[moveToFirst.values + 1] = cArr3[1];
                moveToFirst.values += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
