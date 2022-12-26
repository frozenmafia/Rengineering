package com.facebook.imageformat;

import com.facebook.imageformat.ImageFormat;
import o.Fragment;
import o.FragmentAnim;
import o.onPreAttached;
/* loaded from: classes4.dex */
public class DefaultImageFormatChecker implements ImageFormat.FormatChecker {
    private static final byte[] BMP_HEADER;
    private static final int BMP_HEADER_LENGTH;
    private static final byte[] DNG_HEADER_II;
    private static final int DNG_HEADER_LENGTH;
    private static final byte[] DNG_HEADER_MM;
    private static final int EXTENDED_WEBP_HEADER_LENGTH = 21;
    private static final int GIF_HEADER_LENGTH = 6;
    private static final int HEIF_HEADER_LENGTH = 12;
    private static final byte[] HEIF_HEADER_PREFIX;
    private static final byte[][] HEIF_HEADER_SUFFIXES;
    private static final byte[] ICO_HEADER;
    private static final int ICO_HEADER_LENGTH;
    private static final int SIMPLE_WEBP_HEADER_LENGTH = 20;
    final int MAX_HEADER_LENGTH = onPreAttached.valueOf(21, 20, JPEG_HEADER_LENGTH, PNG_HEADER_LENGTH, 6, BMP_HEADER_LENGTH, ICO_HEADER_LENGTH, 12);
    private boolean mUseNewOrder = false;
    private static final byte[] JPEG_HEADER = {-1, -40, -1};
    private static final int JPEG_HEADER_LENGTH = 3;
    private static final byte[] PNG_HEADER = {-119, 80, 78, 71, 13, 10, 26, 10};
    private static final int PNG_HEADER_LENGTH = 8;
    private static final byte[] GIF_HEADER_87A = ImageFormatCheckerUtils.asciiBytes("GIF87a");
    private static final byte[] GIF_HEADER_89A = ImageFormatCheckerUtils.asciiBytes("GIF89a");

    public void setUseNewOrder(boolean z) {
        this.mUseNewOrder = z;
    }

    @Override // com.facebook.imageformat.ImageFormat.FormatChecker
    public int getHeaderSize() {
        return this.MAX_HEADER_LENGTH;
    }

    @Override // com.facebook.imageformat.ImageFormat.FormatChecker
    public final ImageFormat determineFormat(byte[] bArr, int i) {
        bArr.getClass();
        if (!this.mUseNewOrder && FragmentAnim.AnonymousClass2.AnonymousClass1.values(bArr, 0, i)) {
            return getWebpFormat(bArr, i);
        }
        if (isJpegHeader(bArr, i)) {
            return DefaultImageFormats.JPEG;
        }
        if (isPngHeader(bArr, i)) {
            return DefaultImageFormats.PNG;
        }
        if (this.mUseNewOrder && FragmentAnim.AnonymousClass2.AnonymousClass1.values(bArr, 0, i)) {
            return getWebpFormat(bArr, i);
        }
        if (isGifHeader(bArr, i)) {
            return DefaultImageFormats.GIF;
        }
        if (isBmpHeader(bArr, i)) {
            return DefaultImageFormats.BMP;
        }
        if (isIcoHeader(bArr, i)) {
            return DefaultImageFormats.ICO;
        }
        if (isHeifHeader(bArr, i)) {
            return DefaultImageFormats.HEIF;
        }
        if (isDngHeader(bArr, i)) {
            return DefaultImageFormats.DNG;
        }
        return ImageFormat.UNKNOWN;
    }

    private static ImageFormat getWebpFormat(byte[] bArr, int i) {
        boolean anonymousClass1;
        Fragment.AnonymousClass8.valueOf(Boolean.valueOf(FragmentAnim.AnonymousClass2.AnonymousClass1.values(bArr, 0, i)));
        if (FragmentAnim.AnonymousClass2.AnonymousClass1.valueOf(bArr, 0)) {
            return DefaultImageFormats.WEBP_SIMPLE;
        }
        anonymousClass1 = FragmentAnim.AnonymousClass2.AnonymousClass1.toString(bArr, 0 + 12, FragmentAnim.AnonymousClass2.AnonymousClass1.HaptikSDK$b);
        if (anonymousClass1) {
            return DefaultImageFormats.WEBP_LOSSLESS;
        }
        if (FragmentAnim.AnonymousClass2.AnonymousClass1.toString(bArr, 0, i)) {
            if (FragmentAnim.AnonymousClass2.AnonymousClass1.ah$a(bArr, 0)) {
                return DefaultImageFormats.WEBP_ANIMATED;
            }
            if (FragmentAnim.AnonymousClass2.AnonymousClass1.values(bArr, 0)) {
                return DefaultImageFormats.WEBP_EXTENDED_WITH_ALPHA;
            }
            return DefaultImageFormats.WEBP_EXTENDED;
        }
        return ImageFormat.UNKNOWN;
    }

    static {
        byte[] asciiBytes = ImageFormatCheckerUtils.asciiBytes("BM");
        BMP_HEADER = asciiBytes;
        BMP_HEADER_LENGTH = asciiBytes.length;
        ICO_HEADER = new byte[]{0, 0, 1, 0};
        ICO_HEADER_LENGTH = 4;
        HEIF_HEADER_PREFIX = ImageFormatCheckerUtils.asciiBytes("ftyp");
        HEIF_HEADER_SUFFIXES = new byte[][]{ImageFormatCheckerUtils.asciiBytes("heic"), ImageFormatCheckerUtils.asciiBytes("heix"), ImageFormatCheckerUtils.asciiBytes("hevc"), ImageFormatCheckerUtils.asciiBytes("hevx"), ImageFormatCheckerUtils.asciiBytes("mif1"), ImageFormatCheckerUtils.asciiBytes("msf1")};
        DNG_HEADER_II = new byte[]{73, 73, 42, 0};
        DNG_HEADER_MM = new byte[]{77, 77, 0, 42};
        DNG_HEADER_LENGTH = 4;
    }

    private static boolean isJpegHeader(byte[] bArr, int i) {
        byte[] bArr2 = JPEG_HEADER;
        return i >= bArr2.length && ImageFormatCheckerUtils.startsWithPattern(bArr, bArr2);
    }

    private static boolean isPngHeader(byte[] bArr, int i) {
        byte[] bArr2 = PNG_HEADER;
        return i >= bArr2.length && ImageFormatCheckerUtils.startsWithPattern(bArr, bArr2);
    }

    private static boolean isGifHeader(byte[] bArr, int i) {
        if (i < 6) {
            return false;
        }
        return ImageFormatCheckerUtils.startsWithPattern(bArr, GIF_HEADER_87A) || ImageFormatCheckerUtils.startsWithPattern(bArr, GIF_HEADER_89A);
    }

    private static boolean isBmpHeader(byte[] bArr, int i) {
        byte[] bArr2 = BMP_HEADER;
        if (i < bArr2.length) {
            return false;
        }
        return ImageFormatCheckerUtils.startsWithPattern(bArr, bArr2);
    }

    private static boolean isIcoHeader(byte[] bArr, int i) {
        byte[] bArr2 = ICO_HEADER;
        if (i < bArr2.length) {
            return false;
        }
        return ImageFormatCheckerUtils.startsWithPattern(bArr, bArr2);
    }

    private static boolean isHeifHeader(byte[] bArr, int i) {
        if (i >= 12 && bArr[3] >= 8 && ImageFormatCheckerUtils.hasPatternAt(bArr, HEIF_HEADER_PREFIX, 4)) {
            for (byte[] bArr2 : HEIF_HEADER_SUFFIXES) {
                if (ImageFormatCheckerUtils.hasPatternAt(bArr, bArr2, 8)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private static boolean isDngHeader(byte[] bArr, int i) {
        return i >= DNG_HEADER_LENGTH && (ImageFormatCheckerUtils.startsWithPattern(bArr, DNG_HEADER_II) || ImageFormatCheckerUtils.startsWithPattern(bArr, DNG_HEADER_MM));
    }
}
