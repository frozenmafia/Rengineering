package o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import o.drawToBitmap;
/* loaded from: classes3.dex */
public class doOnLayout extends drawToBitmap.Cdefault<ParcelFileDescriptor> {
    public doOnLayout(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.drawToBitmap.Cdefault
    /* renamed from: toString */
    public ParcelFileDescriptor valueOf(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor == null) {
            throw new FileNotFoundException("FileDescriptor is null for: " + uri);
        }
        return openAssetFileDescriptor.getParcelFileDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.drawToBitmap.Cdefault
    /* renamed from: ag$a */
    public void toString(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // o.invokeSuspend
    public Class<ParcelFileDescriptor> ag$a() {
        return ParcelFileDescriptor.class;
    }
}
