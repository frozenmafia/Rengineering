package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.List;
/* loaded from: classes3.dex */
public class getDisplayCutout implements plusAssign<Uri, Drawable> {
    private final Context valueOf;

    public getDisplayCutout(Context context) {
        this.valueOf = context.getApplicationContext();
    }

    @Override // o.plusAssign
    /* renamed from: values */
    public boolean ag$a(Uri uri, setMargins setmargins) {
        return uri.getScheme().equals("android.resource");
    }

    @Override // o.plusAssign
    /* renamed from: ag$a */
    public ViewKt$postDelayed$runnable$1<Drawable> ah$a(Uri uri, int i, int i2, setMargins setmargins) {
        Drawable insetinsets;
        Context ag$a = ag$a(uri, uri.getAuthority());
        insetinsets = insetInsets.toString(this.valueOf, ag$a, values(ag$a, uri), null);
        return getInsets.values(insetinsets);
    }

    private Context ag$a(Uri uri, String str) {
        if (str.equals(this.valueOf.getPackageName())) {
            return this.valueOf;
        }
        try {
            return this.valueOf.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.valueOf.getPackageName())) {
                return this.valueOf;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    private int values(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return ag$a(context, uri);
        }
        if (pathSegments.size() == 1) {
            return ah$a(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    private int ag$a(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    private int ah$a(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e);
        }
    }
}
