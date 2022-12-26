package com.sendbird.android;
/* loaded from: classes7.dex */
class CountDownTimer {
    private boolean mCanceled;
    private CountDownTimerEventHandler mHandler;
    private boolean mLoop;
    private int mTick;
    private int mTimeout;
    private Thread mTimer;

    /* loaded from: classes7.dex */
    public interface CountDownTimerEventHandler {
        void onCancel();

        void onStart();

        void onStop();

        void onTick(int i, int i2);

        void onTimeout();
    }

    public CountDownTimer(int i) {
        this(i, 100);
    }

    public CountDownTimer(int i, int i2) {
        this(i, i2, false);
    }

    public CountDownTimer(int i, int i2, boolean z) {
        this.mTimeout = i;
        this.mTick = i2;
        this.mLoop = z;
    }

    public void setEventHandler(CountDownTimerEventHandler countDownTimerEventHandler) {
        this.mHandler = countDownTimerEventHandler;
    }

    void setTimeout(int i) {
        this.mTimeout = i;
    }

    public void start() {
        synchronized (this) {
            stop();
            try {
                Thread thread = new Thread() { // from class: com.sendbird.android.CountDownTimer.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        if (CountDownTimer.this.mHandler != null) {
                            CountDownTimer.this.mHandler.onStart();
                        }
                        do {
                            int i = 0;
                            do {
                                try {
                                    Thread.sleep(CountDownTimer.this.mTick);
                                    i += CountDownTimer.this.mTick;
                                    if (i < CountDownTimer.this.mTimeout) {
                                        if (CountDownTimer.this.mHandler != null) {
                                            CountDownTimer.this.mHandler.onTick(CountDownTimer.this.mTimeout, i);
                                        }
                                    } else if (CountDownTimer.this.mHandler != null) {
                                        CountDownTimer.this.mHandler.onTimeout();
                                    }
                                } catch (InterruptedException unused) {
                                }
                            } while (i < CountDownTimer.this.mTimeout);
                        } while (CountDownTimer.this.mLoop);
                        if (CountDownTimer.this.mHandler != null) {
                            if (CountDownTimer.this.mCanceled) {
                                CountDownTimer.this.mHandler.onCancel();
                            } else {
                                CountDownTimer.this.mHandler.onStop();
                            }
                        }
                    }
                };
                this.mTimer = thread;
                thread.start();
            } catch (Throwable unused) {
            }
        }
    }

    public void stop() {
        synchronized (this) {
            Thread thread = this.mTimer;
            if (thread != null) {
                thread.interrupt();
                this.mTimer = null;
            }
        }
    }

    public void cancel() {
        synchronized (this) {
            this.mCanceled = true;
            stop();
        }
    }
}
