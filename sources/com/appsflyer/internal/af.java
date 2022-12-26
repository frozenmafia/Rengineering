package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* loaded from: classes3.dex */
public final class af {
    public static long AFInAppEventType = 500;
    public static b AFKeystoreWrapper;

    /* loaded from: classes3.dex */
    public interface b {
        void valueOf(Activity activity);

        void values(Context context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.internal.af$5  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass5 implements Application.ActivityLifecycleCallbacks {
        final /* synthetic */ b AFInAppEventType;
        boolean valueOf;
        boolean AFInAppEventParameterName = true;
        private Executor AFKeystoreWrapper = Executors.newSingleThreadExecutor();

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        AnonymousClass5(b bVar) {
            this.AFInAppEventType = bVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(final Activity activity) {
            this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.af.5.5
                @Override // java.lang.Runnable
                public final void run() {
                    if (!AnonymousClass5.this.valueOf) {
                        try {
                            AnonymousClass5.this.AFInAppEventType.valueOf(activity);
                        } catch (Exception e) {
                            AFLogger.AFInAppEventParameterName("Listener thrown an exception: ", e);
                        }
                    }
                    AnonymousClass5.this.AFInAppEventParameterName = false;
                    AnonymousClass5.this.valueOf = true;
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(final Activity activity) {
            this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.af.5.3
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass5.this.AFInAppEventParameterName = true;
                    final Context applicationContext = activity.getApplicationContext();
                    try {
                        new Timer().schedule(new TimerTask() { // from class: com.appsflyer.internal.af.5.3.5
                            @Override // java.util.TimerTask, java.lang.Runnable
                            public final void run() {
                                if (AnonymousClass5.this.valueOf && AnonymousClass5.this.AFInAppEventParameterName) {
                                    AnonymousClass5.this.valueOf = false;
                                    try {
                                        AnonymousClass5.this.AFInAppEventType.values(applicationContext);
                                    } catch (Exception e) {
                                        AFLogger.values("Listener threw exception! ", e);
                                    }
                                }
                            }
                        }, af.AFInAppEventType);
                    } catch (Throwable th) {
                        AFLogger.values("Background task failed with a throwable: ", th);
                    }
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(final Activity activity, Bundle bundle) {
            this.AFKeystoreWrapper.execute(new Runnable() { // from class: com.appsflyer.internal.af.5.2
                @Override // java.lang.Runnable
                public final void run() {
                    f.values();
                    Intent intent = activity.getIntent();
                    if (f.valueOf(intent) == null || intent == f.AFInAppEventParameterName) {
                        return;
                    }
                    f.AFInAppEventParameterName = intent;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void valueOf(Context context, b bVar) {
        AFKeystoreWrapper = bVar;
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(bVar);
        if (context instanceof Activity) {
            anonymousClass5.onActivityResumed((Activity) context);
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(anonymousClass5);
    }
}
