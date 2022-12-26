package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaFormat;
import android.net.Uri;
import android.os.Trace;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import org.apache.http.message.TokenParser;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes4.dex */
public final /* synthetic */ class af {
    private static String A(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i5 = i;
        int i6 = i5;
        while (i5 <= i2) {
            if (i5 == i2) {
                i3 = i5;
            } else if (sb.charAt(i5) == '/') {
                i3 = i5 + 1;
            } else {
                i5++;
            }
            int i7 = i6 + 1;
            if (i5 != i7 || sb.charAt(i6) != '.') {
                if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                    i4 = sb.lastIndexOf("/", i6 - 2) + 1;
                    int i8 = i4 > i ? i4 : i;
                    sb.delete(i8, i3);
                    i2 -= i3 - i8;
                } else {
                    i4 = i5 + 1;
                }
                i6 = i4;
            } else {
                sb.delete(i6, i3);
                i2 -= i3 - i6;
            }
            i5 = i6;
        }
        return sb.toString();
    }

    private static int[] B(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str) {
        char c;
        if (str == null) {
            return -1;
        }
        String j = ar.j(str);
        switch (j.hashCode()) {
            case -2123537834:
                if (j.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1662384011:
                if (j.equals(MimeTypes.VIDEO_PS)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -1662384007:
                if (j.equals(MimeTypes.VIDEO_MP2T)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case -1662095187:
                if (j.equals(MimeTypes.VIDEO_WEBM)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1606874997:
                if (j.equals(MimeTypes.AUDIO_AMR_WB)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1487394660:
                if (j.equals(MimeTypes.IMAGE_JPEG)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -1248337486:
                if (j.equals(MimeTypes.APPLICATION_MP4)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1079884372:
                if (j.equals(MimeTypes.VIDEO_AVI)) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -1004728940:
                if (j.equals(MimeTypes.TEXT_VTT)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -387023398:
                if (j.equals(MimeTypes.AUDIO_MATROSKA)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -43467528:
                if (j.equals(MimeTypes.APPLICATION_WEBM)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 13915911:
                if (j.equals(MimeTypes.VIDEO_FLV)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (j.equals(MimeTypes.AUDIO_AC3)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 187078297:
                if (j.equals(MimeTypes.AUDIO_AC4)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 187078669:
                if (j.equals(MimeTypes.AUDIO_AMR)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 187090232:
                if (j.equals(MimeTypes.AUDIO_MP4)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 187091926:
                if (j.equals(MimeTypes.AUDIO_OGG)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 187099443:
                if (j.equals(MimeTypes.AUDIO_WAV)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1331848029:
                if (j.equals(MimeTypes.VIDEO_MP4)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1503095341:
                if (j.equals(MimeTypes.AUDIO_AMR_NB)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (j.equals(MimeTypes.AUDIO_E_AC3)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1504619009:
                if (j.equals(MimeTypes.AUDIO_FLAC)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1504824762:
                if (j.equals(MimeTypes.AUDIO_MIDI)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (j.equals(MimeTypes.AUDIO_MPEG)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1505118770:
                if (j.equals(MimeTypes.AUDIO_WEBM)) {
                    c = TokenParser.CR;
                    break;
                }
                c = 65535;
                break;
            case 2039520277:
                if (j.equals(MimeTypes.VIDEO_MATROSKA)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
                return 0;
            case 3:
                return 1;
            case 4:
            case 5:
            case 6:
                return 3;
            case 7:
                return 4;
            case '\b':
                return 5;
            case '\t':
                return 15;
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
                return 6;
            case 15:
                return 7;
            case 16:
            case 17:
            case 18:
                return 8;
            case 19:
                return 9;
            case 20:
                return 10;
            case 21:
                return 11;
            case 22:
                return 12;
            case 23:
                return 13;
            case 24:
                return 14;
            case 25:
                return 16;
            default:
                return -1;
        }
    }

    public static int b(Map map) {
        List list = (List) map.get("Content-Type");
        return a((list == null || list.isEmpty()) ? null : (String) list.get(0));
    }

    public static int c(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        return lastPathSegment.endsWith(".avi") ? 16 : -1;
    }

    public static final f d(int i, int i2) {
        return new f(1, 1);
    }

    public static void e(cx cxVar) {
        if (cxVar != null) {
            try {
                cxVar.d();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean f(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }

    public static boolean g(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return f(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean h(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean i(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return h(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static String j(XmlPullParser xmlPullParser) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (z(xmlPullParser.getAttributeName(i)).equals("default_KID")) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static boolean k(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return h(xmlPullParser) && z(xmlPullParser.getName()).equals("pssh");
    }

    public static Uri l(String str, String str2) {
        return Uri.parse(m(str, str2));
    }

    public static String m(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] B = B(str2);
        if (B[0] != -1) {
            sb.append(str2);
            A(sb, B[1], B[2]);
            return sb.toString();
        }
        int[] B2 = B(str);
        if (B[3] == 0) {
            sb.append((CharSequence) str, 0, B2[3]);
            sb.append(str2);
            return sb.toString();
        } else if (B[2] == 0) {
            sb.append((CharSequence) str, 0, B2[2]);
            sb.append(str2);
            return sb.toString();
        } else if (B[1] != 0) {
            int i = B2[0] + 1;
            sb.append((CharSequence) str, 0, i);
            sb.append(str2);
            return A(sb, B[1] + i, i + B[2]);
        } else if (str2.charAt(0) == '/') {
            sb.append((CharSequence) str, 0, B2[1]);
            sb.append(str2);
            int i2 = B2[1];
            return A(sb, i2, B[2] + i2);
        } else {
            int i3 = B2[0];
            int i4 = B2[1];
            if (i3 + 2 >= i4 || i4 != B2[2]) {
                int lastIndexOf = str.lastIndexOf(47, B2[2] - 1);
                int i5 = lastIndexOf == -1 ? B2[1] : lastIndexOf + 1;
                sb.append((CharSequence) str, 0, i5);
                sb.append(str2);
                return A(sb, B2[1], i5 + B[2]);
            }
            sb.append((CharSequence) str, 0, i4);
            sb.append('/');
            sb.append(str2);
            int i6 = B2[1];
            return A(sb, i6, B[2] + i6 + 1);
        }
    }

    public static boolean n(String str) {
        return (str == null || B(str)[0] == -1) ? false : true;
    }

    public static void o(String str) {
        if (cp.a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void p() {
        if (cp.a >= 18) {
            Trace.endSection();
        }
    }

    public static void q(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void r(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static Object s(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object t(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    public static void u(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void v(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void w(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void x(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static void y(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    private static String z(String str) {
        int indexOf = str.indexOf(58);
        return indexOf == -1 ? str : str.substring(indexOf + 1);
    }
}
