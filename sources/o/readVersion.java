package o;

import android.graphics.PointF;
import android.view.MotionEvent;
import com.swmansion.gesturehandler.GestureHandler;
import o.FileUtil;
/* loaded from: classes5.dex */
public final class readVersion extends GestureHandler<readVersion> {
    public static final toString values = new toString(null);
    private double HaptikSDK$a;
    private FileUtil HaptikSDK$c;
    private final FileUtil.values ag$a;
    private double ah$b;
    private float valueOf = Float.NaN;
    private float toString = Float.NaN;

    public readVersion() {
        HaptikSDK$b(false);
        this.ag$a = new FileUtil.values() { // from class: o.readVersion$ag$a
            @Override // o.FileUtil.values
            public boolean toString(FileUtil fileUtil) {
                runAnimators.ag$a(fileUtil, "detector");
                return true;
            }

            @Override // o.FileUtil.values
            public boolean values(FileUtil fileUtil) {
                runAnimators.ag$a(fileUtil, "detector");
                double receiveFile = readVersion.this.receiveFile();
                readVersion readversion = readVersion.this;
                readversion.ah$b = readversion.receiveFile() + fileUtil.valueOf();
                long values2 = fileUtil.values();
                if (values2 > 0) {
                    readVersion readversion2 = readVersion.this;
                    readversion2.HaptikSDK$a = (readversion2.receiveFile() - receiveFile) / values2;
                }
                if (Math.abs(readVersion.this.receiveFile()) < 0.08726646259971647d || readVersion.this.ak$a() != 2) {
                    return true;
                }
                readVersion.this.ah$b();
                return true;
            }

            @Override // o.FileUtil.values
            public void ah$a(FileUtil fileUtil) {
                runAnimators.ag$a(fileUtil, "detector");
                readVersion.this.HaptikWebView();
            }
        };
    }

    public final double receiveFile() {
        return this.ah$b;
    }

    public final double mayLaunchUrl() {
        return this.HaptikSDK$a;
    }

    public final float extraCommand() {
        return this.valueOf;
    }

    public final float newSession() {
        return this.toString;
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void valueOf(MotionEvent motionEvent, MotionEvent motionEvent2) {
        runAnimators.ag$a(motionEvent, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
        runAnimators.ag$a(motionEvent2, "sourceEvent");
        if (ak$a() == 0) {
            ICustomTabsService();
            this.HaptikSDK$c = new FileUtil(this.ag$a);
            HaptikSDK$a();
        }
        FileUtil fileUtil = this.HaptikSDK$c;
        if (fileUtil != null) {
            fileUtil.ah$a(motionEvent2);
        }
        FileUtil fileUtil2 = this.HaptikSDK$c;
        if (fileUtil2 != null) {
            PointF ah$a = ah$a(new PointF(fileUtil2.ag$a(), fileUtil2.ah$a()));
            this.valueOf = ah$a.x;
            this.toString = ah$a.y;
        }
        if (motionEvent2.getActionMasked() == 1) {
            if (ak$a() == 4) {
                HaptikWebView();
            } else {
                getSignupData();
            }
        }
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void valueOf(boolean z) {
        if (ak$a() != 4) {
            ICustomTabsService();
        }
        super.valueOf(z);
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void values() {
        this.HaptikSDK$c = null;
        this.valueOf = Float.NaN;
        this.toString = Float.NaN;
        ICustomTabsService();
    }

    @Override // com.swmansion.gesturehandler.GestureHandler
    public void ICustomTabsService() {
        this.HaptikSDK$a = 0.0d;
        this.ah$b = 0.0d;
    }

    /* loaded from: classes5.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }
    }
}
