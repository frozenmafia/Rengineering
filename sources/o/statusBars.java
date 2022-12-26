package o;

import android.graphics.Bitmap;
import android.widget.ImageView;
import o.WindowInsetsCompat;
/* loaded from: classes3.dex */
public class statusBars extends WindowInsetsCompat.Type.InsetsType<Bitmap> {
    public statusBars(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.WindowInsetsCompat.Type.InsetsType
    /* renamed from: values */
    public void ah$a(Bitmap bitmap) {
        ((ImageView) this.ah$a).setImageBitmap(bitmap);
    }
}
