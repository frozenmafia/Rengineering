package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import o.WindowInsetsControllerCompat;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public interface getShownStateInsets {
    ImageHeaderParser.ImageType ag$a() throws IOException;

    int valueOf() throws IOException;

    Bitmap valueOf(BitmapFactory.Options options) throws IOException;

    void values();

    /* loaded from: classes3.dex */
    public static final class toString implements getShownStateInsets {
        private final List<ImageHeaderParser> ag$a;
        private final rotationXBy valueOf;
        private final doOnPreDraw values;

        /* JADX INFO: Access modifiers changed from: package-private */
        public toString(InputStream inputStream, List<ImageHeaderParser> list, rotationXBy rotationxby) {
            this.valueOf = (rotationXBy) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(rotationxby);
            this.ag$a = (List) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(list);
            this.values = new doOnPreDraw(inputStream, rotationxby);
        }

        @Override // o.getShownStateInsets
        public Bitmap valueOf(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.values.ag$a(), null, options);
        }

        @Override // o.getShownStateInsets
        public ImageHeaderParser.ImageType ag$a() throws IOException {
            return setTransitionGroup.toString(this.ag$a, this.values.ag$a(), this.valueOf);
        }

        @Override // o.getShownStateInsets
        public int valueOf() throws IOException {
            return setTransitionGroup.ah$a(this.ag$a, this.values.ag$a(), this.valueOf);
        }

        @Override // o.getShownStateInsets
        public void values() {
            this.values.ah$a();
        }
    }
}
