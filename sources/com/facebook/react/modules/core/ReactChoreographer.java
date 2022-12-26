package com.facebook.react.modules.core;

import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayDeque;
import o.FragmentActivity;
import o.FragmentLifecycleCallbacksDispatcher;
import o.burpActive;
import o.burpActive$ag$a;
/* loaded from: classes.dex */
public class ReactChoreographer {
    private static ReactChoreographer ag$a;
    private volatile burpActive ah$a;
    private final Object values = new Object();
    private int HaptikSDK$b = 0;
    private boolean valueOf = false;
    private final toString HaptikSDK$c = new toString();
    private final ArrayDeque<burpActive$ag$a>[] toString = new ArrayDeque[CallbackType.values().length];

    static /* synthetic */ int ah$a(ReactChoreographer reactChoreographer) {
        int i = reactChoreographer.HaptikSDK$b;
        reactChoreographer.HaptikSDK$b = i - 1;
        return i;
    }

    /* loaded from: classes4.dex */
    public enum CallbackType {
        PERF_MARKERS(0),
        DISPATCH_UI(1),
        NATIVE_ANIMATED_MODULE(2),
        TIMERS_EVENTS(3),
        IDLE_EVENT(4);
        
        private final int mOrder;

        CallbackType(int i) {
            this.mOrder = i;
        }

        int getOrder() {
            return this.mOrder;
        }
    }

    public static void values() {
        if (ag$a == null) {
            ag$a = new ReactChoreographer();
        }
    }

    public static ReactChoreographer valueOf() {
        FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder.ag$a(ag$a, "ReactChoreographer needs to be initialized.");
        return ag$a;
    }

    private ReactChoreographer() {
        int i = 0;
        while (true) {
            ArrayDeque<burpActive$ag$a>[] arrayDequeArr = this.toString;
            if (i < arrayDequeArr.length) {
                arrayDequeArr[i] = new ArrayDeque<>();
                i++;
            } else {
                values((Runnable) null);
                return;
            }
        }
    }

    public void valueOf(CallbackType callbackType, burpActive$ag$a burpactive_ag_a) {
        synchronized (this.values) {
            this.toString[callbackType.getOrder()].addLast(burpactive_ag_a);
            boolean z = true;
            int i = this.HaptikSDK$b + 1;
            this.HaptikSDK$b = i;
            if (i <= 0) {
                z = false;
            }
            FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder.ag$a(z);
            if (!this.valueOf) {
                if (this.ah$a == null) {
                    values(new Runnable() { // from class: com.facebook.react.modules.core.ReactChoreographer.2
                        @Override // java.lang.Runnable
                        public void run() {
                            ReactChoreographer.this.ag$a();
                        }
                    });
                } else {
                    ag$a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag$a() {
        this.ah$a.valueOf(this.HaptikSDK$c);
        this.valueOf = true;
    }

    public void values(final Runnable runnable) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.core.ReactChoreographer.5
            @Override // java.lang.Runnable
            public void run() {
                synchronized (ReactChoreographer.class) {
                    if (ReactChoreographer.this.ah$a == null) {
                        ReactChoreographer.this.ah$a = burpActive.ag$a();
                    }
                }
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }

    public void ah$a(CallbackType callbackType, burpActive$ag$a burpactive_ag_a) {
        synchronized (this.values) {
            if (this.toString[callbackType.getOrder()].removeFirstOccurrence(burpactive_ag_a)) {
                this.HaptikSDK$b--;
                ah$a();
            } else {
                FragmentActivity.values("ReactNative", "Tried to remove non-existent frame callback");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah$a() {
        FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder.ag$a(this.HaptikSDK$b >= 0);
        if (this.HaptikSDK$b == 0 && this.valueOf) {
            if (this.ah$a != null) {
                this.ah$a.toString(this.HaptikSDK$c);
            }
            this.valueOf = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class toString extends burpActive$ag$a {
        private toString() {
        }

        @Override // o.burpActive$ag$a
        public void doFrame(long j) {
            synchronized (ReactChoreographer.this.values) {
                ReactChoreographer.this.valueOf = false;
                for (int i = 0; i < ReactChoreographer.this.toString.length; i++) {
                    ArrayDeque arrayDeque = ReactChoreographer.this.toString[i];
                    int size = arrayDeque.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        burpActive$ag$a burpactive_ag_a = (burpActive$ag$a) arrayDeque.pollFirst();
                        if (burpactive_ag_a != null) {
                            burpactive_ag_a.doFrame(j);
                            ReactChoreographer.ah$a(ReactChoreographer.this);
                        } else {
                            FragmentActivity.values("ReactNative", "Tried to execute non-existent frame callback");
                        }
                    }
                }
                ReactChoreographer.this.ah$a();
            }
        }
    }
}
