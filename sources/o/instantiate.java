package o;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.sendbird.android.constant.StringSet;
import o.WindowInsetsAnimationCompat;
/* loaded from: classes6.dex */
public class instantiate extends mergeTransitionsInSequence {
    private Uri ag$a;
    private getTypeMask valueOf;

    public static boolean ah$a(Uri uri) {
        return "data".equals(uri.getScheme());
    }

    public static boolean ag$a(Uri uri) {
        return "res".equals(uri.getScheme());
    }

    public static boolean values(Uri uri) {
        return "android.resource".equals(uri.getScheme());
    }

    public static boolean valueOf(Uri uri) {
        return "content".equals(uri.getScheme());
    }

    public static boolean toString(Uri uri) {
        return StringSet.file.equals(uri.getScheme());
    }

    public instantiate(Context context, String str, getTypeMask gettypemask) {
        this(context, str, 0.0d, 0.0d, gettypemask);
    }

    public instantiate(Context context, String str, double d, double d2, getTypeMask gettypemask) {
        super(context, str, d, d2);
        this.valueOf = gettypemask == null ? getTypeMask.ah$a : gettypemask;
        this.ag$a = super.ah$a();
        if (invoke() && TextUtils.isEmpty(this.ag$a.toString())) {
            throw new Resources.NotFoundException("Local Resource Not Found. Resource: '" + getInitSettings() + "'.");
        } else if (ag$a(this.ag$a)) {
            String uri = this.ag$a.toString();
            this.ag$a = Uri.parse(uri.replace("res:/", "android.resource://" + context.getPackageName() + "/"));
        }
    }

    public boolean HaptikSDK$a() {
        Uri uri = this.ag$a;
        return uri != null && ah$a(uri);
    }

    @Override // o.mergeTransitionsInSequence
    public boolean invoke() {
        Uri uri = this.ag$a;
        return uri != null && values(uri);
    }

    public boolean ah$b() {
        Uri uri = this.ag$a;
        return uri != null && toString(uri);
    }

    public boolean HaptikSDK$b() {
        Uri uri = this.ag$a;
        return uri != null && valueOf(uri);
    }

    public Object values() {
        if (HaptikSDK$b()) {
            return getInitSettings();
        }
        if (HaptikSDK$a()) {
            return getInitSettings();
        }
        if (invoke()) {
            return ah$a();
        }
        if (ah$b()) {
            return ah$a().toString();
        }
        return ag$a();
    }

    @Override // o.mergeTransitionsInSequence
    public Uri ah$a() {
        return this.ag$a;
    }

    public getTypeMask valueOf() {
        return this.valueOf;
    }

    public WindowInsetsAnimationCompat.BoundsCompat ag$a() {
        return new WindowInsetsAnimationCompat.BoundsCompat(ah$a().toString(), valueOf());
    }
}
