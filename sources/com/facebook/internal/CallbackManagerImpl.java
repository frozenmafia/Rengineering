package com.facebook.internal;

import android.content.Intent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import o.DefaultSpecialEffectsController;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class CallbackManagerImpl implements DefaultSpecialEffectsController.AnonymousClass4.AnonymousClass1 {
    private final Map<Integer, toString> ag$a = new HashMap();
    public static final CallbackManagerImpl$ah$a values = new CallbackManagerImpl$ah$a(null);
    private static final Map<Integer, toString> ah$a = new HashMap();

    /* loaded from: classes4.dex */
    public interface toString {
        boolean ag$a(int i, Intent intent);
    }

    public final void valueOf(int i, toString tostring) {
        runAnimators.ag$a(tostring, "callback");
        this.ag$a.put(Integer.valueOf(i), tostring);
    }

    @Override // o.DefaultSpecialEffectsController.AnonymousClass4.AnonymousClass1
    public boolean ah$a(int i, int i2, Intent intent) {
        boolean ah$a2;
        toString tostring = this.ag$a.get(Integer.valueOf(i));
        if (tostring != null) {
            return tostring.ag$a(i2, intent);
        }
        ah$a2 = values.ah$a(i, i2, intent);
        return ah$a2;
    }

    /* loaded from: classes4.dex */
    public enum RequestCodeOffset {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        Referral(11),
        GamingContextCreate(12),
        GamingContextSwitch(13),
        GamingContextChoose(14),
        TournamentShareDialog(15);
        
        private final int offset;

        RequestCodeOffset(int i) {
            this.offset = i;
        }

        public final int toRequestCode() {
            DefaultSpecialEffectsController.AnonymousClass8 anonymousClass8 = DefaultSpecialEffectsController.AnonymousClass8.values;
            return DefaultSpecialEffectsController.AnonymousClass8.getInitSettings() + this.offset;
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static RequestCodeOffset[] valuesCustom() {
            RequestCodeOffset[] valuesCustom = values();
            return (RequestCodeOffset[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }
}
