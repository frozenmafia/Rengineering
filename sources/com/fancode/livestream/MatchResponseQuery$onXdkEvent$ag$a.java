package com.fancode.livestream;

import com.fancode.livestream.MatchResponseQuery;
import com.fancode.livestream.MatchResponseQuery$HaptikSDK$c;
import com.fancode.livestream.type.SSAIProvider;
import o.OnBackPressedDispatcher;
import o.removeCancellable;
/* loaded from: classes4.dex */
public final class MatchResponseQuery$onXdkEvent$ag$a implements OnBackPressedDispatcher<MatchResponseQuery.onXdkEvent> {
    final MatchResponseQuery$HaptikSDK$c.values ag$a = new MatchResponseQuery$HaptikSDK$c.values();

    @Override // o.OnBackPressedDispatcher
    /* renamed from: values */
    public MatchResponseQuery.onXdkEvent map(removeCancellable removecancellable) {
        String ag$a = removecancellable.ag$a(MatchResponseQuery.onXdkEvent.values[0]);
        Boolean values = removecancellable.values(MatchResponseQuery.onXdkEvent.values[1]);
        String ag$a2 = removecancellable.ag$a(MatchResponseQuery.onXdkEvent.values[2]);
        return new MatchResponseQuery.onXdkEvent(ag$a, values, ag$a2 != null ? SSAIProvider.safeValueOf(ag$a2) : null, (MatchResponseQuery$HaptikSDK$c) removecancellable.valueOf(MatchResponseQuery.onXdkEvent.values[3], new removeCancellable.toString<MatchResponseQuery$HaptikSDK$c>() { // from class: com.fancode.livestream.MatchResponseQuery$onXdkEvent$ag$a.4
            @Override // o.removeCancellable.toString
            /* renamed from: toString */
            public MatchResponseQuery$HaptikSDK$c values(removeCancellable removecancellable2) {
                return MatchResponseQuery$onXdkEvent$ag$a.this.ag$a.map(removecancellable2);
            }
        }));
    }
}
