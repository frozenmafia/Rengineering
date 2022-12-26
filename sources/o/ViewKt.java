package o;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
/* loaded from: classes3.dex */
public class ViewKt extends ViewGroupKt$descendants$1<ParcelFileDescriptor> {
    public ViewKt(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.ViewGroupKt$descendants$1
    /* renamed from: valueOf */
    public ParcelFileDescriptor values(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.ViewGroupKt$descendants$1
    /* renamed from: ah$a */
    public void toString(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // o.invokeSuspend
    public Class<ParcelFileDescriptor> ag$a() {
        return ParcelFileDescriptor.class;
    }
}
