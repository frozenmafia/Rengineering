package o;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
/* loaded from: classes3.dex */
public final class setTransitionGroup {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface values {
        ImageHeaderParser.ImageType valueOf(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    public static ImageHeaderParser.ImageType toString(List<ImageHeaderParser> list, final InputStream inputStream, rotationXBy rotationxby) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, rotationxby);
        }
        inputStream.mark(5242880);
        return values(list, new values() { // from class: o.setTransitionGroup.1
            @Override // o.setTransitionGroup.values
            public ImageHeaderParser.ImageType valueOf(ImageHeaderParser imageHeaderParser) throws IOException {
                try {
                    return imageHeaderParser.toString(inputStream);
                } finally {
                    inputStream.reset();
                }
            }
        });
    }

    public static ImageHeaderParser.ImageType toString(List<ImageHeaderParser> list, final ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return values(list, new values() { // from class: o.setTransitionGroup.3
            @Override // o.setTransitionGroup.values
            public ImageHeaderParser.ImageType valueOf(ImageHeaderParser imageHeaderParser) throws IOException {
                return imageHeaderParser.values(byteBuffer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ImageHeaderParser.ImageType values(List<ImageHeaderParser> list, values valuesVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType valueOf = valuesVar.valueOf(list.get(i));
            if (valueOf != ImageHeaderParser.ImageType.UNKNOWN) {
                return valueOf;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static int ah$a(List<ImageHeaderParser> list, final InputStream inputStream, final rotationXBy rotationxby) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, rotationxby);
        }
        inputStream.mark(5242880);
        return ah$a(list, new setTransitionGroup$ag$a() { // from class: o.setTransitionGroup.2
            @Override // o.setTransitionGroup$ag$a
            public int ah$a(ImageHeaderParser imageHeaderParser) throws IOException {
                try {
                    return imageHeaderParser.ag$a(inputStream, rotationxby);
                } finally {
                    inputStream.reset();
                }
            }
        });
    }

    public static int values(List<ImageHeaderParser> list, final ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, final rotationXBy rotationxby) throws IOException {
        return ah$a(list, new setTransitionGroup$ag$a() { // from class: o.setTransitionGroup.4
            @Override // o.setTransitionGroup$ag$a
            public int ah$a(ImageHeaderParser imageHeaderParser) throws IOException {
                RecyclableBufferedInputStream recyclableBufferedInputStream;
                try {
                    recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(ParcelFileDescriptorRewinder.this.ag$a().getFileDescriptor()), rotationxby);
                    try {
                        int ag$a = imageHeaderParser.ag$a(recyclableBufferedInputStream, rotationxby);
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused) {
                        }
                        ParcelFileDescriptorRewinder.this.ag$a();
                        return ag$a;
                    } catch (Throwable th) {
                        th = th;
                        if (recyclableBufferedInputStream != null) {
                            try {
                                recyclableBufferedInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        ParcelFileDescriptorRewinder.this.ag$a();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    recyclableBufferedInputStream = null;
                }
            }
        });
    }

    private static int ah$a(List<ImageHeaderParser> list, setTransitionGroup$ag$a settransitiongroup_ag_a) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int ah$a = settransitiongroup_ag_a.ah$a(list.get(i));
            if (ah$a != -1) {
                return ah$a;
            }
        }
        return -1;
    }
}
