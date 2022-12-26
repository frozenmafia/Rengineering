package o;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import o.WindowInsetsAnimationCompat;
import o.getInsetsController;
/* loaded from: classes3.dex */
public class getInsetsController$ag$a implements toBounds<Uri, ParcelFileDescriptor>, getInsetsController.valueOf<ParcelFileDescriptor> {
    private final AssetManager values;

    @Override // o.toBounds
    public void ag$a() {
    }

    public getInsetsController$ag$a(AssetManager assetManager) {
        this.values = assetManager;
    }

    @Override // o.toBounds
    public getUpperBound<Uri, ParcelFileDescriptor> ag$a(WindowInsetsAnimationCompat.Impl impl) {
        return new getInsetsController(this.values, this);
    }

    @Override // o.getInsetsController.valueOf
    public invokeSuspend<ParcelFileDescriptor> ag$a(AssetManager assetManager, String str) {
        return new ViewKt(assetManager, str);
    }
}
