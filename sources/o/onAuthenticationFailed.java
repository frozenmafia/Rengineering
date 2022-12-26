package o;

import android.net.Uri;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.List;
import java.util.Map;
import org.apache.http.message.TokenParser;
/* loaded from: classes3.dex */
public final class onAuthenticationFailed {
    public static int values(Map<String, List<String>> map) {
        List<String> list = map.get("Content-Type");
        return toString((list == null || list.isEmpty()) ? null : list.get(0));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int toString(String str) {
        char c;
        if (str == null) {
            return -1;
        }
        String invoke = getSignature.invoke(str);
        invoke.hashCode();
        switch (invoke.hashCode()) {
            case -2123537834:
                if (invoke.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662384011:
                if (invoke.equals(MimeTypes.VIDEO_PS)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1662384007:
                if (invoke.equals(MimeTypes.VIDEO_MP2T)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1662095187:
                if (invoke.equals(MimeTypes.VIDEO_WEBM)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1606874997:
                if (invoke.equals(MimeTypes.AUDIO_AMR_WB)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1487394660:
                if (invoke.equals(MimeTypes.IMAGE_JPEG)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1248337486:
                if (invoke.equals(MimeTypes.APPLICATION_MP4)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1079884372:
                if (invoke.equals(MimeTypes.VIDEO_AVI)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1004728940:
                if (invoke.equals(MimeTypes.TEXT_VTT)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -387023398:
                if (invoke.equals(MimeTypes.AUDIO_MATROSKA)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -43467528:
                if (invoke.equals(MimeTypes.APPLICATION_WEBM)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 13915911:
                if (invoke.equals(MimeTypes.VIDEO_FLV)) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (invoke.equals(MimeTypes.AUDIO_AC3)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 187078297:
                if (invoke.equals(MimeTypes.AUDIO_AC4)) {
                    c = TokenParser.CR;
                    break;
                }
                c = 65535;
                break;
            case 187078669:
                if (invoke.equals(MimeTypes.AUDIO_AMR)) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 187090232:
                if (invoke.equals(MimeTypes.AUDIO_MP4)) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 187091926:
                if (invoke.equals(MimeTypes.AUDIO_OGG)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 187099443:
                if (invoke.equals(MimeTypes.AUDIO_WAV)) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1331848029:
                if (invoke.equals(MimeTypes.VIDEO_MP4)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1503095341:
                if (invoke.equals(MimeTypes.AUDIO_AMR_NB)) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (invoke.equals(MimeTypes.AUDIO_E_AC3)) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1504619009:
                if (invoke.equals(MimeTypes.AUDIO_FLAC)) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1504824762:
                if (invoke.equals(MimeTypes.AUDIO_MIDI)) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (invoke.equals(MimeTypes.AUDIO_MPEG)) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1505118770:
                if (invoke.equals(MimeTypes.AUDIO_WEBM)) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 2039520277:
                if (invoke.equals(MimeTypes.VIDEO_MATROSKA)) {
                    c = 25;
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
            case '\f':
            case 20:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case '\t':
            case '\n':
            case 24:
            case 25:
                return 6;
            case 4:
            case 14:
            case 19:
                return 3;
            case 5:
                return 14;
            case 6:
            case 15:
            case 18:
                return 8;
            case 7:
                return 16;
            case '\b':
                return 13;
            case 11:
                return 5;
            case '\r':
                return 1;
            case 16:
                return 9;
            case 17:
                return 12;
            case 21:
                return 4;
            case 22:
                return 15;
            case 23:
                return 7;
            default:
                return -1;
        }
    }

    public static int valueOf(Uri uri) {
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
}
