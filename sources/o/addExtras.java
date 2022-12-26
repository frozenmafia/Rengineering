package o;

import o.StateListDrawable;
/* loaded from: classes3.dex */
public final class addExtras {
    private final addExtras$ag$a toString;

    /* loaded from: classes3.dex */
    public interface toString {
        void onError(StateListDrawable.StateListState stateListState);

        void onStartContestCreate();

        void sendCreateContestButtonTappedClicked();

        void setProgressBarVisibility(boolean z);

        void showWarningMessage(String str);
    }

    public addExtras(addExtras$ag$a addextras_ag_a) {
        runAnimators.ag$a(addextras_ag_a, "handler");
        this.toString = addextras_ag_a;
    }

    public final addExtras$ag$a ag$a() {
        return this.toString;
    }
}
