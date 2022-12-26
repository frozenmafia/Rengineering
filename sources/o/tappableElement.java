package o;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import o.WindowInsetsCompat;
/* loaded from: classes3.dex */
public class tappableElement extends WindowInsetsCompat.Type.InsetsType<Drawable> {
    public tappableElement(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.WindowInsetsCompat.Type.InsetsType
    /* renamed from: valueOf */
    public void ah$a(Drawable drawable) {
        ((ImageView) this.ah$a).setImageDrawable(drawable);
    }
}
