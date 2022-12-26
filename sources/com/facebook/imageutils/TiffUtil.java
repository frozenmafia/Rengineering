package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;
import o.FragmentActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class TiffUtil {
    private static final Class<?> TAG = TiffUtil.class;
    public static final int TIFF_BYTE_ORDER_BIG_END = 1296891946;
    public static final int TIFF_BYTE_ORDER_LITTLE_END = 1229531648;
    public static final int TIFF_TAG_ORIENTATION = 274;
    public static final int TIFF_TYPE_SHORT = 3;

    public static int getAutoRotateAngleFromOrientation(int i) {
        if (i != 3) {
            if (i != 6) {
                return i != 8 ? 0 : 270;
            }
            return 90;
        }
        return 180;
    }

    TiffUtil() {
    }

    public static int readOrientationFromTIFF(InputStream inputStream, int i) throws IOException {
        TiffHeader tiffHeader = new TiffHeader();
        int readTiffHeader = readTiffHeader(inputStream, i, tiffHeader);
        int i2 = tiffHeader.firstIfdOffset - 8;
        if (readTiffHeader == 0 || i2 > readTiffHeader) {
            return 0;
        }
        inputStream.skip(i2);
        return getOrientationFromTiffEntry(inputStream, moveToTiffEntryWithTag(inputStream, readTiffHeader - i2, tiffHeader.isLittleEndian, 274), tiffHeader.isLittleEndian);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class TiffHeader {
        int byteOrder;
        int firstIfdOffset;
        boolean isLittleEndian;

        private TiffHeader() {
        }
    }

    private static int readTiffHeader(InputStream inputStream, int i, TiffHeader tiffHeader) throws IOException {
        if (i <= 8) {
            return 0;
        }
        tiffHeader.byteOrder = StreamProcessor.readPackedInt(inputStream, 4, false);
        if (tiffHeader.byteOrder != 1229531648 && tiffHeader.byteOrder != 1296891946) {
            FragmentActivity.valueOf(TAG, "Invalid TIFF header");
            return 0;
        }
        tiffHeader.isLittleEndian = tiffHeader.byteOrder == 1229531648;
        tiffHeader.firstIfdOffset = StreamProcessor.readPackedInt(inputStream, 4, tiffHeader.isLittleEndian);
        int i2 = (i - 4) - 4;
        if (tiffHeader.firstIfdOffset < 8 || tiffHeader.firstIfdOffset - 8 > i2) {
            FragmentActivity.valueOf(TAG, "Invalid offset");
            return 0;
        }
        return i2;
    }

    private static int moveToTiffEntryWithTag(InputStream inputStream, int i, boolean z, int i2) throws IOException {
        if (i < 14) {
            return 0;
        }
        int i3 = i - 2;
        for (int readPackedInt = StreamProcessor.readPackedInt(inputStream, 2, z); readPackedInt > 0 && i3 >= 12; readPackedInt--) {
            int i4 = i3 - 2;
            if (StreamProcessor.readPackedInt(inputStream, 2, z) == i2) {
                return i4;
            }
            inputStream.skip(10L);
            i3 = i4 - 10;
        }
        return 0;
    }

    private static int getOrientationFromTiffEntry(InputStream inputStream, int i, boolean z) throws IOException {
        if (i >= 10 && StreamProcessor.readPackedInt(inputStream, 2, z) == 3 && StreamProcessor.readPackedInt(inputStream, 4, z) == 1) {
            return StreamProcessor.readPackedInt(inputStream, 2, z);
        }
        return 0;
    }
}
