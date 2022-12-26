package o;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o.ViewCompat;
/* loaded from: classes3.dex */
public final class setImportantForAutofill extends getMeasuredWidthAndState {
    private final ScheduledThreadPoolExecutor ah$a;
    private final setImportantForAccessibility valueOf;
    private final AtomicBoolean values;

    public /* synthetic */ setImportantForAutofill(setContentChangeTypes setcontentchangetypes, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, int i, getTargetTypes gettargettypes) {
        this(setcontentchangetypes, (i & 2) != 0 ? new ScheduledThreadPoolExecutor(1) : scheduledThreadPoolExecutor);
    }

    public setImportantForAutofill(setContentChangeTypes setcontentchangetypes, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        runAnimators.valueOf(setcontentchangetypes, easypay.manager.Constants.EASY_PAY_CONFIG_PREF_KEY);
        runAnimators.valueOf(scheduledThreadPoolExecutor, "executor");
        this.ah$a = scheduledThreadPoolExecutor;
        this.values = new AtomicBoolean(true);
        this.valueOf = setcontentchangetypes.ak();
        long signupData = setcontentchangetypes.getSignupData();
        if (signupData > 0) {
            scheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
            try {
                scheduledThreadPoolExecutor.schedule(new Runnable() { // from class: o.setImportantForAutofill.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        setImportantForAutofill.this.ag$a();
                    }
                }, signupData, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                this.valueOf.toString("Failed to schedule timer for LaunchCrashTracker", e);
            }
        }
    }

    public final void ag$a() {
        this.ah$a.shutdown();
        this.values.set(false);
        setImportantForAutofill setimportantforautofill = this;
        if (!setimportantforautofill.getObservers$bugsnag_android_core_release().isEmpty()) {
            ViewCompat.AccessibilityPaneVisibilityManager.a aVar = new ViewCompat.AccessibilityPaneVisibilityManager.a(false);
            for (ViewCompat.Api20Impl api20Impl : setimportantforautofill.getObservers$bugsnag_android_core_release()) {
                api20Impl.onStateChange(aVar);
            }
        }
        this.valueOf.valueOf("App launch period marked as complete");
    }

    public final boolean valueOf() {
        return this.values.get();
    }
}
