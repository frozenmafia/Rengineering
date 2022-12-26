package o;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import o.WindowInsetsAnimationCompat;
import o.dispatchOnEnd;
/* loaded from: classes3.dex */
public class dispatchOnEnd$ag$a implements toBounds<Uri, ParcelFileDescriptor>, dispatchOnEnd.toString<ParcelFileDescriptor> {
    private final ContentResolver ah$a;

    @Override // o.toBounds
    public void ag$a() {
    }

    public dispatchOnEnd$ag$a(ContentResolver contentResolver) {
        this.ah$a = contentResolver;
    }

    @Override // o.dispatchOnEnd.toString
    public invokeSuspend<ParcelFileDescriptor> ag$a(Uri uri) {
        return new doOnLayout(this.ah$a, uri);
    }

    @Override // o.toBounds
    public getUpperBound<Uri, ParcelFileDescriptor> ag$a(WindowInsetsAnimationCompat.Impl impl) {
        return new dispatchOnEnd(this);
    }
}
