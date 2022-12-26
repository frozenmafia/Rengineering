package com.facebook.fresco.animation.backend;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.fresco.animation.backend.AnimationBackend;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.onSupportInvalidateOptionsMenu;
/* loaded from: classes4.dex */
public class AnimationBackendDelegateWithInactivityCheck<T extends AnimationBackend> extends AnimationBackendDelegate<T> {
    static final long INACTIVITY_CHECK_POLLING_TIME_MS = 1000;
    static final long INACTIVITY_THRESHOLD_MS = 2000;
    private long mInactivityCheckPollingTimeMs;
    private boolean mInactivityCheckScheduled;
    private InactivityListener mInactivityListener;
    private long mInactivityThresholdMs;
    private final Runnable mIsInactiveCheck;
    private long mLastDrawnTimeMs;
    private final onSupportInvalidateOptionsMenu mMonotonicClock;
    private final ScheduledExecutorService mScheduledExecutorServiceForUiThread;

    /* loaded from: classes4.dex */
    public interface InactivityListener {
        void onInactive();
    }

    public static <T extends AnimationBackend & InactivityListener> AnimationBackendDelegate<T> createForBackend(T t, onSupportInvalidateOptionsMenu onsupportinvalidateoptionsmenu, ScheduledExecutorService scheduledExecutorService) {
        return createForBackend(t, (InactivityListener) t, onsupportinvalidateoptionsmenu, scheduledExecutorService);
    }

    public static <T extends AnimationBackend> AnimationBackendDelegate<T> createForBackend(T t, InactivityListener inactivityListener, onSupportInvalidateOptionsMenu onsupportinvalidateoptionsmenu, ScheduledExecutorService scheduledExecutorService) {
        return new AnimationBackendDelegateWithInactivityCheck(t, inactivityListener, onsupportinvalidateoptionsmenu, scheduledExecutorService);
    }

    private AnimationBackendDelegateWithInactivityCheck(T t, InactivityListener inactivityListener, onSupportInvalidateOptionsMenu onsupportinvalidateoptionsmenu, ScheduledExecutorService scheduledExecutorService) {
        super(t);
        this.mInactivityCheckScheduled = false;
        this.mInactivityThresholdMs = 2000L;
        this.mInactivityCheckPollingTimeMs = 1000L;
        this.mIsInactiveCheck = new Runnable() { // from class: com.facebook.fresco.animation.backend.AnimationBackendDelegateWithInactivityCheck.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (AnimationBackendDelegateWithInactivityCheck.this) {
                    AnimationBackendDelegateWithInactivityCheck.this.mInactivityCheckScheduled = false;
                    if (AnimationBackendDelegateWithInactivityCheck.this.isInactive()) {
                        if (AnimationBackendDelegateWithInactivityCheck.this.mInactivityListener != null) {
                            AnimationBackendDelegateWithInactivityCheck.this.mInactivityListener.onInactive();
                        }
                    } else {
                        AnimationBackendDelegateWithInactivityCheck.this.maybeScheduleInactivityCheck();
                    }
                }
            }
        };
        this.mInactivityListener = inactivityListener;
        this.mMonotonicClock = onsupportinvalidateoptionsmenu;
        this.mScheduledExecutorServiceForUiThread = scheduledExecutorService;
    }

    @Override // com.facebook.fresco.animation.backend.AnimationBackendDelegate, com.facebook.fresco.animation.backend.AnimationBackend
    public boolean drawFrame(Drawable drawable, Canvas canvas, int i) {
        this.mLastDrawnTimeMs = this.mMonotonicClock.values();
        boolean drawFrame = super.drawFrame(drawable, canvas, i);
        maybeScheduleInactivityCheck();
        return drawFrame;
    }

    public void setInactivityListener(InactivityListener inactivityListener) {
        this.mInactivityListener = inactivityListener;
    }

    public long getInactivityCheckPollingTimeMs() {
        return this.mInactivityCheckPollingTimeMs;
    }

    public void setInactivityCheckPollingTimeMs(long j) {
        this.mInactivityCheckPollingTimeMs = j;
    }

    public long getInactivityThresholdMs() {
        return this.mInactivityThresholdMs;
    }

    public void setInactivityThresholdMs(long j) {
        this.mInactivityThresholdMs = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isInactive() {
        return this.mMonotonicClock.values() - this.mLastDrawnTimeMs > this.mInactivityThresholdMs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeScheduleInactivityCheck() {
        synchronized (this) {
            if (!this.mInactivityCheckScheduled) {
                this.mInactivityCheckScheduled = true;
                this.mScheduledExecutorServiceForUiThread.schedule(this.mIsInactiveCheck, this.mInactivityCheckPollingTimeMs, TimeUnit.MILLISECONDS);
            }
        }
    }
}
