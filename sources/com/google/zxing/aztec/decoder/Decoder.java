package com.google.zxing.aztec.decoder;

import androidx.exifinterface.media.ExifInterface;
import com.dreampay.commons.constants.Constants;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.sendbird.android.constant.StringSet;
/* loaded from: classes7.dex */
public final class Decoder {
    private static final String[] ah$a = {"CTRL_PS", Constants.WHITE_SPACE, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", com.apxor.androidsdk.core.ce.Constants.REGEX, ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] valueOf = {"CTRL_PS", Constants.WHITE_SPACE, "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", TtmlNode.TAG_P, "q", "r", StringSet.s, "t", StringSet.u, "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] values = {"CTRL_PS", Constants.WHITE_SPACE, "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    private static final String[] ag$a = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};
    private static final String[] toString = {"CTRL_PS", Constants.WHITE_SPACE, SessionDescription.SUPPORTED_SDP_VERSION, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* loaded from: classes7.dex */
    enum Table {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }
}
