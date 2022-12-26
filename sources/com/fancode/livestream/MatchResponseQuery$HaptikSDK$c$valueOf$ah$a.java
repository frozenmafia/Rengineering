package com.fancode.livestream;

import com.apollographql.apollo.api.ResponseField;
import com.fancode.livestream.MatchResponseQuery$HaptikSDK$c;
import java.util.Arrays;
import o.LifecycleCoroutineScopeImpl$register$1;
import o.OnBackPressedDispatcher;
import o.removeCancellable;
/* loaded from: classes4.dex */
public final class MatchResponseQuery$HaptikSDK$c$valueOf$ah$a implements OnBackPressedDispatcher<MatchResponseQuery$HaptikSDK$c.valueOf> {
    static final ResponseField[] values;
    final LifecycleCoroutineScopeImpl$register$1.valueOf ah$a = new LifecycleCoroutineScopeImpl$register$1.valueOf();

    static {
        ResponseField tostring;
        tostring = ResponseField.values.toString("__typename", "__typename", Arrays.asList(ResponseField.values.valueOf(new String[]{"Dai"})));
        values = new ResponseField[]{tostring};
    }

    @Override // o.OnBackPressedDispatcher
    /* renamed from: ah$a */
    public MatchResponseQuery$HaptikSDK$c.valueOf map(removeCancellable removecancellable) {
        return new MatchResponseQuery$HaptikSDK$c.valueOf((LifecycleCoroutineScopeImpl$register$1) removecancellable.ag$a(values[0], new removeCancellable.toString<LifecycleCoroutineScopeImpl$register$1>() { // from class: com.fancode.livestream.MatchResponseQuery$HaptikSDK$c$valueOf$ah$a.1
            @Override // o.removeCancellable.toString
            /* renamed from: ah$a */
            public LifecycleCoroutineScopeImpl$register$1 values(removeCancellable removecancellable2) {
                return MatchResponseQuery$HaptikSDK$c$valueOf$ah$a.this.ah$a.map(removecancellable2);
            }
        }));
    }
}
