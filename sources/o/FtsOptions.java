package o;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.react.uimanager.ViewProps;
import com.microsoft.fraudprotection.androidsdk.FPRunnableType;
import java.util.List;
import o.IMultiInstanceInvalidationCallback;
import o.IMultiInstanceInvalidationService;
/* loaded from: classes5.dex */
class FtsOptions {
    private final unique toString;
    private final Context valueOf;

    /* loaded from: classes5.dex */
    public class Order extends IMultiInstanceInvalidationCallback.Stub {
        private final List<MatchInfo> HaptikSDK$c;

        public Order(String str, String str2, Context context, Ignore ignore, onConflict onconflict, InvalidationTracker invalidationTracker, List<MatchInfo> list) {
            super(FPRunnableType.EVENT, str, str2, context, ignore, onconflict, invalidationTracker);
            this.HaptikSDK$c = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            ah$a();
        }

        private void ah$a() {
            try {
                if (this.HaptikSDK$c != null) {
                    IMultiInstanceInvalidationService.Default.valueOf("Sending " + this.HaptikSDK$c.size() + " Events to Server: ");
                    this.toString.ag$a(this.invoke, this.valueOf, this.HaptikSDK$c, this.values);
                } else {
                    IMultiInstanceInvalidationService.Default.valueOf("Event is null");
                }
            } catch (Exception e) {
                IMultiInstanceInvalidationService.Default.toString("Exception in sendEvent: ", e);
                this.values.toString(new IMultiInstanceInvalidationCallback.Stub.Proxy<>(this.ah$a, new IMultiInstanceInvalidationCallback(e.getMessage())));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class MatchInfo {
        private final String ah$a;
        private final String toString;
        private final int valueOf;

        /* JADX INFO: Access modifiers changed from: package-private */
        public MatchInfo(int i, String str, String str2) {
            this.valueOf = i;
            this.ah$a = str;
            this.toString = str2;
        }

        public String toString() {
            return "FPEvent{id=" + this.valueOf + "title=" + this.ah$a + ", payload='" + this.toString + "'}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FtsOptions(Context context, unique uniqueVar) {
        this.valueOf = context;
        this.toString = uniqueVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void values() {
        try {
            WindowManager windowManager = (WindowManager) this.valueOf.getSystemService("window");
            if (windowManager == null) {
                this.toString.ag$a(ViewProps.DISPLAY, "WindowManager is null");
                return;
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            this.toString.valueOf("d8", String.format("%sx%s", Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels)));
            this.toString.valueOf("d9", Float.valueOf(displayMetrics.density));
            this.toString.valueOf("e1", Float.valueOf(displayMetrics.xdpi));
            this.toString.valueOf("e2", Float.valueOf(displayMetrics.ydpi));
            this.toString.valueOf("e3", Integer.valueOf(displayMetrics.densityDpi));
            this.toString.valueOf("e4", ah$a(this.valueOf));
            this.toString.valueOf("e6", Float.valueOf(defaultDisplay.getRefreshRate()));
            this.toString.valueOf("e7", Integer.valueOf(defaultDisplay.getRotation()));
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception occurred in collectDisplayData: ", e);
            this.toString.ag$a(ViewProps.DISPLAY, e.toString());
        }
    }

    private String ah$a(Context context) {
        int i;
        try {
            i = context.getResources().getConfiguration().screenLayout & 15;
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception occurred in getScreenSize: ", e);
            this.toString.ag$a("e4", e.toString());
            i = 0;
        }
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "undefined" : "xlarge" : "large" : "normal" : "small";
    }
}
