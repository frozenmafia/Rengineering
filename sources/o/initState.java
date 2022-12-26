package o;

import android.content.Context;
/* loaded from: classes4.dex */
public final class initState {
    public static final initState ah$a = new initState();

    private initState() {
    }

    public static final void valueOf(Context context) {
        getViewLifecycleOwnerLiveData ag$a;
        if (isStateAtLeast.values(initState.class)) {
            return;
        }
        try {
            runAnimators.ag$a(context, "context");
            isInBackStack isinbackstack = isInBackStack.toString;
            if (isInBackStack.toString("com.android.billingclient.api.Purchase") == null || (ag$a = getViewLifecycleOwnerLiveData.values.ag$a(context)) == null || !getViewLifecycleOwnerLiveData.values.values().get()) {
                return;
            }
            isMenuVisible ismenuvisible = isMenuVisible.toString;
            if (isMenuVisible.ag$a()) {
                ag$a.toString("inapp", isAdded.valueOf);
            } else {
                ag$a.ah$a("inapp", isDetached.values);
            }
        } catch (Throwable th) {
            isStateAtLeast.values(th, initState.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ag$a() {
        if (isStateAtLeast.values(initState.class)) {
            return;
        }
        try {
            ah$a.values();
        } catch (Throwable th) {
            isStateAtLeast.values(th, initState.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HaptikSDK$a() {
        if (isStateAtLeast.values(initState.class)) {
            return;
        }
        try {
            ah$a.values();
        } catch (Throwable th) {
            isStateAtLeast.values(th, initState.class);
        }
    }

    private final void values() {
        if (isStateAtLeast.values(this)) {
            return;
        }
        try {
            isMenuVisible ismenuvisible = isMenuVisible.toString;
            isMenuVisible.ag$a(getViewLifecycleOwnerLiveData.values.ah$a(), getViewLifecycleOwnerLiveData.values.valueOf());
            getViewLifecycleOwnerLiveData.values.ah$a().clear();
        } catch (Throwable th) {
            isStateAtLeast.values(th, this);
        }
    }
}
