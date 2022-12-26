package o;

import android.app.Application;
import android.content.Context;
import com.dreampay.nonui.DreamPay;
import com.google.android.exoplayer2.util.MimeTypes;
/* loaded from: classes.dex */
public final class removeNullEntries {
    public static final removeNullEntries ag$a = new removeNullEntries();
    private static final startAnimationInternal values = startAnimationInternal.valueOf;
    private static final getPropertyValue valueOf = getPropertyValue.toString;
    private static final endAnimationInternal toString = endAnimationInternal.ah$a;
    private static final removeEntry ah$a = removeEntry.ah$a;

    private removeNullEntries() {
    }

    public static final startAnimationInternal values() {
        return values;
    }

    public static final removeEntry valueOf() {
        return ah$a;
    }

    public static final void values(Application application) {
        runAnimators.ag$a(application, MimeTypes.BASE_TYPE_APPLICATION);
        DreamPay.init(application);
    }

    public final void toString(Context context) {
        runAnimators.ag$a(context, "context");
        DreamPay.wipe(context);
    }
}
