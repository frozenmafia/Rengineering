package com.giphy.sdk.ui.views;

import com.dreampay.commons.constants.Constants;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.LocalBroadcastManager;
import o.Transition;
import o.runAnimators;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class GiphyDialogFragment$updateSuggestions$1 extends Lambda implements Transition<List<? extends LocalBroadcastManager.ReceiverRecord>, Throwable, setAnimationMatrix> {
    final /* synthetic */ String $term;
    final /* synthetic */ GiphyDialogFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiphyDialogFragment$updateSuggestions$1(GiphyDialogFragment giphyDialogFragment, String str) {
        super(2);
        this.this$0 = giphyDialogFragment;
        this.$term = str;
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(List<? extends LocalBroadcastManager.ReceiverRecord> list, Throwable th) {
        invoke2((List<LocalBroadcastManager.ReceiverRecord>) list, th);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<LocalBroadcastManager.ReceiverRecord> list, Throwable th) {
        List<LocalBroadcastManager.ReceiverRecord> addSuggestionTextPillIfNeeded;
        GPHSuggestionsView gPHSuggestionsView;
        runAnimators.ag$a(list, Constants.RESULT);
        addSuggestionTextPillIfNeeded = this.this$0.addSuggestionTextPillIfNeeded(list, this.$term);
        this.this$0.canShowSuggestions = !addSuggestionTextPillIfNeeded.isEmpty();
        if (addSuggestionTextPillIfNeeded.isEmpty()) {
            this.this$0.hideSuggestions();
        } else {
            this.this$0.showSuggestions();
        }
        gPHSuggestionsView = this.this$0.suggestionsView;
        if (gPHSuggestionsView != null) {
            gPHSuggestionsView.update(addSuggestionTextPillIfNeeded);
        }
    }
}
