package com.facebook.react.devsupport;

import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.react.bridge.ReactContext;
import java.util.Locale;
import o.FragmentActivity;
import o.makeActive;
import o.onFragmentSaveInstanceState;
import o.onFragmentSaveInstanceState$ah$a;
/* loaded from: classes6.dex */
public class FpsView extends FrameLayout {
    private static final int UPDATE_INTERVAL_MS = 500;
    private final FPSMonitorRunnable mFPSMonitorRunnable;
    private final makeActive mFrameCallback;
    private final TextView mTextView;

    public FpsView(ReactContext reactContext) {
        super(reactContext);
        inflate(reactContext, onFragmentSaveInstanceState$ah$a.fps_view, this);
        this.mTextView = (TextView) findViewById(onFragmentSaveInstanceState.values.fps_text);
        this.mFrameCallback = new makeActive(reactContext);
        this.mFPSMonitorRunnable = new FPSMonitorRunnable();
        setCurrentFPS(0.0d, 0.0d, 0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFrameCallback.HaptikSDK$c();
        this.mFrameCallback.ah$b();
        this.mFPSMonitorRunnable.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFrameCallback.HaptikSDK$e();
        this.mFPSMonitorRunnable.stop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentFPS(double d, double d2, int i, int i2) {
        String format = String.format(Locale.US, "UI: %.1f fps\n%d dropped so far\n%d stutters (4+) so far\nJS: %.1f fps", Double.valueOf(d), Integer.valueOf(i), Integer.valueOf(i2), Double.valueOf(d2));
        this.mTextView.setText(format);
        FragmentActivity.toString("ReactNative", format);
    }

    /* loaded from: classes6.dex */
    class FPSMonitorRunnable implements Runnable {
        private boolean mShouldStop;
        private int mTotal4PlusFrameStutters;
        private int mTotalFramesDropped;

        private FPSMonitorRunnable() {
            this.mShouldStop = false;
            this.mTotalFramesDropped = 0;
            this.mTotal4PlusFrameStutters = 0;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mShouldStop) {
                return;
            }
            this.mTotalFramesDropped += FpsView.this.mFrameCallback.ag$a() - FpsView.this.mFrameCallback.HaptikSDK$b();
            this.mTotal4PlusFrameStutters += FpsView.this.mFrameCallback.valueOf();
            FpsView fpsView = FpsView.this;
            fpsView.setCurrentFPS(fpsView.mFrameCallback.values(), FpsView.this.mFrameCallback.ah$a(), this.mTotalFramesDropped, this.mTotal4PlusFrameStutters);
            FpsView.this.mFrameCallback.HaptikSDK$c();
            FpsView.this.postDelayed(this, 500L);
        }

        public void start() {
            this.mShouldStop = false;
            FpsView.this.post(this);
        }

        public void stop() {
            this.mShouldStop = true;
        }
    }
}
