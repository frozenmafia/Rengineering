package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.core.view.InputDeviceCompat;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import o.WindowInsetsControllerCompat;
import o.rotationXBy;
/* loaded from: classes3.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {
    static final byte[] values = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    private static final int[] ag$a = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static int ag$a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    private static boolean valueOf(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType toString(InputStream inputStream) throws IOException {
        return valueOf(new toString((InputStream) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType values(ByteBuffer byteBuffer) throws IOException {
        return valueOf(new valueOf((ByteBuffer) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int ag$a(InputStream inputStream, rotationXBy rotationxby) throws IOException {
        return ah$a(new toString((InputStream) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(inputStream)), (rotationXBy) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(rotationxby));
    }

    private ImageHeaderParser.ImageType valueOf(Reader reader) throws IOException {
        try {
            int values2 = reader.values();
            if (values2 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int ag$a2 = (values2 << 8) | reader.ag$a();
            if (ag$a2 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int ag$a3 = (ag$a2 << 8) | reader.ag$a();
            if (ag$a3 == -1991225785) {
                reader.values(21L);
                try {
                    return reader.ag$a() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            } else if (ag$a3 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            } else {
                reader.values(4L);
                if (((reader.values() << 16) | reader.values()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int values3 = (reader.values() << 16) | reader.values();
                if ((values3 & InputDeviceCompat.SOURCE_ANY) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = values3 & 255;
                if (i == 88) {
                    reader.values(4L);
                    return (reader.ag$a() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                } else if (i == 76) {
                    reader.values(4L);
                    return (reader.ag$a() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                } else {
                    return ImageHeaderParser.ImageType.WEBP;
                }
            }
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    private int ah$a(Reader reader, rotationXBy rotationxby) throws IOException {
        try {
            int values2 = reader.values();
            if (!valueOf(values2)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + values2);
                }
                return -1;
            }
            int ag$a2 = ag$a(reader);
            if (ag$a2 == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) rotationxby.ah$a(ag$a2, byte[].class);
            int ag$a3 = ag$a(reader, bArr, ag$a2);
            rotationxby.ag$a(bArr);
            return ag$a3;
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    private int ag$a(Reader reader, byte[] bArr, int i) throws IOException {
        int ah$a = reader.ah$a(bArr, i);
        if (ah$a != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + ah$a);
            }
            return -1;
        } else if (ah$a(bArr, i)) {
            return toString(new DefaultImageHeaderParser$ag$a(bArr, i));
        } else {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    private boolean ah$a(byte[] bArr, int i) {
        boolean z = bArr != null && i > values.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = values;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    private int ag$a(Reader reader) throws IOException {
        short ag$a2;
        short ag$a3;
        int values2;
        long j;
        long values3;
        do {
            if (reader.ag$a() != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) ag$a2));
                }
                return -1;
            }
            ag$a3 = reader.ag$a();
            if (ag$a3 == 218) {
                return -1;
            }
            if (ag$a3 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            values2 = reader.values() - 2;
            if (ag$a3 == 225) {
                return values2;
            }
            j = values2;
            values3 = reader.values(j);
        } while (values3 == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) ag$a3) + ", wanted to skip: " + values2 + ", but actually skipped: " + values3);
        }
        return -1;
    }

    private static int toString(DefaultImageHeaderParser$ag$a defaultImageHeaderParser$ag$a) {
        ByteOrder byteOrder;
        short ah$a = defaultImageHeaderParser$ag$a.ah$a(6);
        if (ah$a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (ah$a == 19789) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) ah$a));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        defaultImageHeaderParser$ag$a.ah$a(byteOrder);
        int values2 = defaultImageHeaderParser$ag$a.values(10) + 6;
        short ah$a2 = defaultImageHeaderParser$ag$a.ah$a(values2);
        for (int i = 0; i < ah$a2; i++) {
            int ag$a2 = ag$a(values2, i);
            short ah$a3 = defaultImageHeaderParser$ag$a.ah$a(ag$a2);
            if (ah$a3 == 274) {
                short ah$a4 = defaultImageHeaderParser$ag$a.ah$a(ag$a2 + 2);
                if (ah$a4 < 1 || ah$a4 > 12) {
                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) ah$a4));
                    }
                } else {
                    int values3 = defaultImageHeaderParser$ag$a.values(ag$a2 + 4);
                    if (values3 < 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i + " tagType=" + ((int) ah$a3) + " formatCode=" + ((int) ah$a4) + " componentCount=" + values3);
                        }
                        int i2 = values3 + ag$a[ah$a4];
                        if (i2 > 4) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) ah$a4));
                            }
                        } else {
                            int i3 = ag$a2 + 8;
                            if (i3 < 0 || i3 > defaultImageHeaderParser$ag$a.ag$a()) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i3 + " tagType=" + ((int) ah$a3));
                                }
                            } else if (i2 < 0 || i2 + i3 > defaultImageHeaderParser$ag$a.ag$a()) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) ah$a3));
                                }
                            } else {
                                return defaultImageHeaderParser$ag$a.ah$a(i3);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface Reader {
        short ag$a() throws IOException;

        int ah$a(byte[] bArr, int i) throws IOException;

        int values() throws IOException;

        long values(long j) throws IOException;

        /* loaded from: classes3.dex */
        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class valueOf implements Reader {
        private final ByteBuffer toString;

        valueOf(ByteBuffer byteBuffer) {
            this.toString = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short ag$a() throws Reader.EndOfFileException {
            if (this.toString.remaining() < 1) {
                throw new Reader.EndOfFileException();
            }
            return (short) (this.toString.get() & 255);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int values() throws Reader.EndOfFileException {
            return (ag$a() << 8) | ag$a();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int ah$a(byte[] bArr, int i) {
            int min = Math.min(i, this.toString.remaining());
            if (min == 0) {
                return -1;
            }
            this.toString.get(bArr, 0, min);
            return min;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long values(long j) {
            int min = (int) Math.min(this.toString.remaining(), j);
            ByteBuffer byteBuffer = this.toString;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* loaded from: classes3.dex */
    static final class toString implements Reader {
        private final InputStream values;

        toString(InputStream inputStream) {
            this.values = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short ag$a() throws IOException {
            int read = this.values.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int values() throws IOException {
            return (ag$a() << 8) | ag$a();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int ah$a(byte[] bArr, int i) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i3 < i && (i2 = this.values.read(bArr, i3, i - i3)) != -1) {
                i3 += i2;
            }
            if (i3 == 0 && i2 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i3;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long values(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.values.skip(j2);
                if (skip <= 0) {
                    if (this.values.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }
}
