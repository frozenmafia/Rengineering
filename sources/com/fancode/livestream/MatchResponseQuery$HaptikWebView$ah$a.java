package com.fancode.livestream;

import com.fancode.livestream.MatchResponseQuery;
import o.OnBackPressedDispatcher;
import o.removeCancellable;
/* loaded from: classes4.dex */
public final class MatchResponseQuery$HaptikWebView$ah$a implements OnBackPressedDispatcher<MatchResponseQuery.HaptikWebView> {
    final MatchResponseQuery.extraCallbackWithResult.toString values = new MatchResponseQuery.extraCallbackWithResult.toString();

    @Override // o.OnBackPressedDispatcher
    /* renamed from: ah$a */
    public MatchResponseQuery.HaptikWebView map(removeCancellable removecancellable) {
        return new MatchResponseQuery.HaptikWebView(removecancellable.ag$a(MatchResponseQuery.HaptikWebView.valueOf[0]), removecancellable.valueOf(MatchResponseQuery.HaptikWebView.valueOf[1]).intValue(), removecancellable.ag$a(MatchResponseQuery.HaptikWebView.valueOf[2]), removecancellable.ag$a(MatchResponseQuery.HaptikWebView.valueOf[3]), (MatchResponseQuery.extraCallbackWithResult) removecancellable.valueOf(MatchResponseQuery.HaptikWebView.valueOf[4], new removeCancellable.toString<MatchResponseQuery.extraCallbackWithResult>() { // from class: com.fancode.livestream.MatchResponseQuery$HaptikWebView$ah$a.5
            @Override // o.removeCancellable.toString
            /* renamed from: ah$a */
            public MatchResponseQuery.extraCallbackWithResult values(removeCancellable removecancellable2) {
                return MatchResponseQuery$HaptikWebView$ah$a.this.values.map(removecancellable2);
            }
        }));
    }
}
