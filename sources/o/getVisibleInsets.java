package o;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public final class getVisibleInsets {
    private final List<ImageHeaderParser> ag$a = new ArrayList();

    public List<ImageHeaderParser> ah$a() {
        List<ImageHeaderParser> list;
        synchronized (this) {
            list = this.ag$a;
        }
        return list;
    }

    public void valueOf(ImageHeaderParser imageHeaderParser) {
        synchronized (this) {
            this.ag$a.add(imageHeaderParser);
        }
    }
}
