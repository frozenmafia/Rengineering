package o;

import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.app.dream11.model.GameConfig;
/* loaded from: classes6.dex */
public final /* synthetic */ class handleRetryListenerQueue implements FrameworkSQLiteStatement {
    public final /* synthetic */ boolean ag$a;
    public final /* synthetic */ TrustedWebActivityCallbackRemote ah$a$d840001;

    public /* synthetic */ handleRetryListenerQueue(TrustedWebActivityCallbackRemote trustedWebActivityCallbackRemote, boolean z) {
        this.ah$a$d840001 = trustedWebActivityCallbackRemote;
        this.ag$a = z;
    }

    @Override // o.FrameworkSQLiteStatement
    public final void accept(Object obj) {
        try {
            ((Class) getRealOwner.ag$a((char) (42857 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 32, ImageFormat.getBitsPerPixel(0) + 23)).getMethod("ag$a", Boolean.TYPE, GameConfig.class).invoke(this.ah$a$d840001, Boolean.valueOf(this.ag$a), (GameConfig) obj);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
