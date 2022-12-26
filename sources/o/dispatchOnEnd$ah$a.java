package o;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.InputStream;
import o.WindowInsetsAnimationCompat;
import o.dispatchOnEnd;
/* loaded from: classes3.dex */
public class dispatchOnEnd$ah$a implements toBounds<Uri, InputStream>, dispatchOnEnd.toString<InputStream> {
    private final ContentResolver values;

    @Override // o.toBounds
    public void ag$a() {
    }

    public dispatchOnEnd$ah$a(ContentResolver contentResolver) {
        this.values = contentResolver;
    }

    @Override // o.dispatchOnEnd.toString
    public invokeSuspend<InputStream> ag$a(Uri uri) {
        return new drawToBitmap(this.values, uri);
    }

    @Override // o.toBounds
    public getUpperBound<Uri, InputStream> ag$a(WindowInsetsAnimationCompat.Impl impl) {
        return new dispatchOnEnd(this);
    }
}
