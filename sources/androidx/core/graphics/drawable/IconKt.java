package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class IconKt {
    public static final Icon toAdaptiveIcon(Bitmap bitmap) {
        runAnimators.ag$a(bitmap, "<this>");
        Icon createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
        runAnimators.ah$a(createWithAdaptiveBitmap, "createWithAdaptiveBitmap(this)");
        return createWithAdaptiveBitmap;
    }

    public static final Icon toIcon(Bitmap bitmap) {
        runAnimators.ag$a(bitmap, "<this>");
        Icon createWithBitmap = Icon.createWithBitmap(bitmap);
        runAnimators.ah$a(createWithBitmap, "createWithBitmap(this)");
        return createWithBitmap;
    }

    public static final Icon toIcon(Uri uri) {
        runAnimators.ag$a(uri, "<this>");
        Icon createWithContentUri = Icon.createWithContentUri(uri);
        runAnimators.ah$a(createWithContentUri, "createWithContentUri(this)");
        return createWithContentUri;
    }

    public static final Icon toIcon(byte[] bArr) {
        runAnimators.ag$a(bArr, "<this>");
        Icon createWithData = Icon.createWithData(bArr, 0, bArr.length);
        runAnimators.ah$a(createWithData, "createWithData(this, 0, size)");
        return createWithData;
    }
}
