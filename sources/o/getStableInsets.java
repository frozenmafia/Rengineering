package o;

import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import java.io.IOException;
import o.WindowInsetsControllerCompat;
import o.updateMargins;
/* loaded from: classes3.dex */
public class getStableInsets implements updateMargins.Cdefault<getStableInsetBottom> {
    @Override // o.updateMargins.Cdefault
    public EncodeStrategy ag$a(setMargins setmargins) {
        return EncodeStrategy.SOURCE;
    }

    @Override // o.ViewGroupKt
    /* renamed from: values */
    public boolean ah$a(ViewKt$postDelayed$runnable$1<getStableInsetBottom> viewKt$postDelayed$runnable$1, File file, setMargins setmargins) {
        try {
            WindowInsetsControllerCompat.Impl20.ag$a(viewKt$postDelayed$runnable$1.ag$a().valueOf(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }
}
