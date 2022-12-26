package com.facebook.imageformat;

import com.facebook.imageformat.ImageFormat;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import o.Fragment;
/* loaded from: classes4.dex */
public class ImageFormatChecker {
    private static ImageFormatChecker sInstance;
    private List<ImageFormat.FormatChecker> mCustomImageFormatCheckers;
    private final DefaultImageFormatChecker mDefaultFormatChecker = new DefaultImageFormatChecker();
    private int mMaxHeaderLength;

    private ImageFormatChecker() {
        updateMaxHeaderLength();
    }

    public void setUseNewOrder(boolean z) {
        this.mDefaultFormatChecker.setUseNewOrder(z);
    }

    public void setCustomImageFormatCheckers(List<ImageFormat.FormatChecker> list) {
        this.mCustomImageFormatCheckers = list;
        updateMaxHeaderLength();
    }

    public ImageFormat determineImageFormat(InputStream inputStream) throws IOException {
        inputStream.getClass();
        int i = this.mMaxHeaderLength;
        byte[] bArr = new byte[i];
        int readHeaderFromStream = readHeaderFromStream(i, inputStream, bArr);
        ImageFormat determineFormat = this.mDefaultFormatChecker.determineFormat(bArr, readHeaderFromStream);
        if (determineFormat == null || determineFormat == ImageFormat.UNKNOWN) {
            List<ImageFormat.FormatChecker> list = this.mCustomImageFormatCheckers;
            if (list != null) {
                for (ImageFormat.FormatChecker formatChecker : list) {
                    ImageFormat determineFormat2 = formatChecker.determineFormat(bArr, readHeaderFromStream);
                    if (determineFormat2 != null && determineFormat2 != ImageFormat.UNKNOWN) {
                        return determineFormat2;
                    }
                }
            }
            return ImageFormat.UNKNOWN;
        }
        return determineFormat;
    }

    private void updateMaxHeaderLength() {
        this.mMaxHeaderLength = this.mDefaultFormatChecker.getHeaderSize();
        List<ImageFormat.FormatChecker> list = this.mCustomImageFormatCheckers;
        if (list != null) {
            for (ImageFormat.FormatChecker formatChecker : list) {
                this.mMaxHeaderLength = Math.max(this.mMaxHeaderLength, formatChecker.getHeaderSize());
            }
        }
    }

    private static int readHeaderFromStream(int i, InputStream inputStream, byte[] bArr) throws IOException {
        inputStream.getClass();
        bArr.getClass();
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(bArr.length >= i));
        if (inputStream.markSupported()) {
            try {
                inputStream.mark(i);
                return Fragment.AnonymousClass5.ah$a(inputStream, bArr, 0, i);
            } finally {
                inputStream.reset();
            }
        }
        return Fragment.AnonymousClass5.ah$a(inputStream, bArr, 0, i);
    }

    public static ImageFormatChecker getInstance() {
        ImageFormatChecker imageFormatChecker;
        synchronized (ImageFormatChecker.class) {
            if (sInstance == null) {
                sInstance = new ImageFormatChecker();
            }
            imageFormatChecker = sInstance;
        }
        return imageFormatChecker;
    }

    public static ImageFormat getImageFormat(InputStream inputStream) throws IOException {
        return getInstance().determineImageFormat(inputStream);
    }

    public static ImageFormat getImageFormat_WrapIOException(InputStream inputStream) {
        try {
            return getImageFormat(inputStream);
        } catch (IOException e) {
            throw Fragment.OnPreAttachedListener.ag$a(e);
        }
    }

    public static ImageFormat getImageFormat(String str) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th) {
                th = th;
                fileInputStream = null;
            }
        } catch (IOException unused) {
        }
        try {
            ImageFormat imageFormat = getImageFormat(fileInputStream);
            Fragment.AnonymousClass2.valueOf(fileInputStream);
            return imageFormat;
        } catch (IOException unused2) {
            fileInputStream2 = fileInputStream;
            ImageFormat imageFormat2 = ImageFormat.UNKNOWN;
            Fragment.AnonymousClass2.valueOf(fileInputStream2);
            return imageFormat2;
        } catch (Throwable th2) {
            th = th2;
            Fragment.AnonymousClass2.valueOf(fileInputStream);
            throw th;
        }
    }
}
