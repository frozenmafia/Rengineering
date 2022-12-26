package o;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes3.dex */
public final class getSignature {
    private static final ArrayList<getSignature$ag$a> ah$a = new ArrayList<>();
    private static final Pattern ag$a = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static String values(int i) {
        if (i != 32) {
            if (i != 33) {
                if (i != 35) {
                    if (i != 64) {
                        if (i != 163) {
                            if (i != 177) {
                                if (i != 165) {
                                    if (i != 166) {
                                        switch (i) {
                                            case 96:
                                            case 97:
                                            case 98:
                                            case 99:
                                            case 100:
                                            case 101:
                                                return MimeTypes.VIDEO_MPEG2;
                                            case 102:
                                            case 103:
                                            case 104:
                                                return MimeTypes.AUDIO_AAC;
                                            case 105:
                                            case 107:
                                                return MimeTypes.AUDIO_MPEG;
                                            case 106:
                                                return MimeTypes.VIDEO_MPEG;
                                            default:
                                                switch (i) {
                                                    case 169:
                                                    case 172:
                                                        return MimeTypes.AUDIO_DTS;
                                                    case 170:
                                                    case 171:
                                                        return MimeTypes.AUDIO_DTS_HD;
                                                    case 173:
                                                        return MimeTypes.AUDIO_OPUS;
                                                    case 174:
                                                        return MimeTypes.AUDIO_AC4;
                                                    default:
                                                        return null;
                                                }
                                        }
                                    }
                                    return MimeTypes.AUDIO_E_AC3;
                                }
                                return MimeTypes.AUDIO_AC3;
                            }
                            return MimeTypes.VIDEO_VP9;
                        }
                        return MimeTypes.VIDEO_VC1;
                    }
                    return MimeTypes.AUDIO_AAC;
                }
                return MimeTypes.VIDEO_H265;
            }
            return MimeTypes.VIDEO_H264;
        }
        return MimeTypes.VIDEO_MP4V;
    }

    public static boolean ah$a(String str) {
        return "audio".equals(HaptikSDK$e(str));
    }

    public static boolean ah$b(String str) {
        return "video".equals(HaptikSDK$e(str));
    }

    public static boolean HaptikSDK$b(String str) {
        return "text".equals(HaptikSDK$e(str)) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_RAWCC.equals(str) || MimeTypes.APPLICATION_VOBSUB.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str);
    }

    public static boolean HaptikSDK$c(String str) {
        return "image".equals(HaptikSDK$e(str));
    }

    public static boolean values(String str, String str2) {
        getSignature$ah$a valueOf;
        int valueOf2;
        if (str == null) {
            return false;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    c = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals(MimeTypes.AUDIO_MPEG_L1)) {
                    c = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals(MimeTypes.AUDIO_MPEG_L2)) {
                    c = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals(MimeTypes.AUDIO_AAC)) {
                    c = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals(MimeTypes.AUDIO_AC3)) {
                    c = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals(MimeTypes.AUDIO_RAW)) {
                    c = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                    c = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals(MimeTypes.AUDIO_FLAC)) {
                    c = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals(MimeTypes.AUDIO_MPEG)) {
                    c = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals(MimeTypes.AUDIO_ALAW)) {
                    c = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals(MimeTypes.AUDIO_MLAW)) {
                    c = '\n';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
                return true;
            case 3:
                return (str2 == null || (valueOf = valueOf(str2)) == null || (valueOf2 = valueOf.valueOf()) == 0 || valueOf2 == 16) ? false : true;
            default:
                return false;
        }
    }

    public static boolean ah$a(String str, String str2) {
        return ag$a(str, str2) != null;
    }

    public static String ag$a(String str, String str2) {
        if (str != null && str2 != null) {
            String[] HaptikSDK$b = getElevationDegrees.HaptikSDK$b(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : HaptikSDK$b) {
                if (str2.equals(toString(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    public static String toString(String str) {
        getSignature$ah$a valueOf;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String valueOf2 = postponeAndUpdateViewHolders.valueOf(str.trim());
        if (valueOf2.startsWith("avc1") || valueOf2.startsWith("avc3")) {
            return MimeTypes.VIDEO_H264;
        }
        if (valueOf2.startsWith("hev1") || valueOf2.startsWith("hvc1")) {
            return MimeTypes.VIDEO_H265;
        }
        if (valueOf2.startsWith("dvav") || valueOf2.startsWith("dva1") || valueOf2.startsWith("dvhe") || valueOf2.startsWith("dvh1")) {
            return MimeTypes.VIDEO_DOLBY_VISION;
        }
        if (valueOf2.startsWith("av01")) {
            return MimeTypes.VIDEO_AV1;
        }
        if (valueOf2.startsWith("vp9") || valueOf2.startsWith("vp09")) {
            return MimeTypes.VIDEO_VP9;
        }
        if (valueOf2.startsWith("vp8") || valueOf2.startsWith("vp08")) {
            return MimeTypes.VIDEO_VP8;
        }
        if (!valueOf2.startsWith("mp4a")) {
            return valueOf2.startsWith("mha1") ? MimeTypes.AUDIO_MPEGH_MHA1 : valueOf2.startsWith("mhm1") ? MimeTypes.AUDIO_MPEGH_MHM1 : (valueOf2.startsWith("ac-3") || valueOf2.startsWith("dac3")) ? MimeTypes.AUDIO_AC3 : (valueOf2.startsWith("ec-3") || valueOf2.startsWith("dec3")) ? MimeTypes.AUDIO_E_AC3 : valueOf2.startsWith(MimeTypes.CODEC_E_AC3_JOC) ? MimeTypes.AUDIO_E_AC3_JOC : (valueOf2.startsWith("ac-4") || valueOf2.startsWith("dac4")) ? MimeTypes.AUDIO_AC4 : valueOf2.startsWith("dtsc") ? MimeTypes.AUDIO_DTS : valueOf2.startsWith("dtse") ? MimeTypes.AUDIO_DTS_EXPRESS : (valueOf2.startsWith("dtsh") || valueOf2.startsWith("dtsl")) ? MimeTypes.AUDIO_DTS_HD : valueOf2.startsWith("dtsx") ? MimeTypes.AUDIO_DTS_X : valueOf2.startsWith("opus") ? MimeTypes.AUDIO_OPUS : valueOf2.startsWith("vorbis") ? MimeTypes.AUDIO_VORBIS : valueOf2.startsWith("flac") ? MimeTypes.AUDIO_FLAC : valueOf2.startsWith("stpp") ? MimeTypes.APPLICATION_TTML : valueOf2.startsWith("wvtt") ? MimeTypes.TEXT_VTT : valueOf2.contains("cea708") ? MimeTypes.APPLICATION_CEA708 : (valueOf2.contains("eia608") || valueOf2.contains("cea608")) ? MimeTypes.APPLICATION_CEA608 : HaptikSDK$a(valueOf2);
        }
        if (valueOf2.startsWith("mp4a.") && (valueOf = valueOf(valueOf2)) != null) {
            str2 = values(valueOf.ah$a);
        }
        return str2 == null ? MimeTypes.AUDIO_AAC : str2;
    }

    public static int values(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (ah$a(str)) {
            return 1;
        }
        if (ah$b(str)) {
            return 2;
        }
        if (HaptikSDK$b(str)) {
            return 3;
        }
        if (HaptikSDK$c(str)) {
            return 4;
        }
        if (MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str)) {
            return 5;
        }
        if (MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
            return 6;
        }
        return getSignupData(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int valueOf(String str, String str2) {
        char c;
        getSignature$ah$a valueOf;
        str.hashCode();
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1095064472:
                if (str.equals(MimeTypes.AUDIO_DTS)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals(MimeTypes.AUDIO_AAC)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals(MimeTypes.AUDIO_AC3)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 187078297:
                if (str.equals(MimeTypes.AUDIO_AC4)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (str.equals(MimeTypes.AUDIO_MPEG)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1505942594:
                if (str.equals(MimeTypes.AUDIO_DTS_HD)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1556697186:
                if (str.equals(MimeTypes.AUDIO_TRUEHD)) {
                    c = '\b';
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
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (valueOf = valueOf(str2)) == null) {
                    return 0;
                }
                return valueOf.valueOf();
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 8;
            case '\b':
                return 14;
            default:
                return 0;
        }
    }

    public static int ag$a(String str) {
        return values(toString(str));
    }

    public static String invoke(String str) {
        char c;
        str.hashCode();
        int hashCode = str.hashCode();
        if (hashCode == -1007807498) {
            if (str.equals("audio/x-flac")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -586683234) {
            if (hashCode == 187090231 && str.equals("audio/mp3")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("audio/x-wav")) {
                c = 1;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? c != 2 ? str : MimeTypes.AUDIO_MPEG : MimeTypes.AUDIO_WAV : MimeTypes.AUDIO_FLAC;
    }

    private static String HaptikSDK$e(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    private static String HaptikSDK$a(String str) {
        int size = ah$a.size();
        for (int i = 0; i < size; i++) {
            getSignature$ag$a getsignature_ag_a = ah$a.get(i);
            if (str.startsWith(getsignature_ag_a.valueOf)) {
                return getsignature_ag_a.values;
            }
        }
        return null;
    }

    private static int getSignupData(String str) {
        int size = ah$a.size();
        for (int i = 0; i < size; i++) {
            getSignature$ag$a getsignature_ag_a = ah$a.get(i);
            if (str.equals(getsignature_ag_a.values)) {
                return getsignature_ag_a.ah$a;
            }
        }
        return -1;
    }

    static getSignature$ah$a valueOf(String str) {
        Matcher matcher = ag$a.matcher(str);
        if (matcher.matches()) {
            String str2 = (String) FingerprintManagerCompat.toString(matcher.group(1));
            String group = matcher.group(2);
            try {
                return new getSignature$ah$a(Integer.parseInt(str2, 16), group != null ? Integer.parseInt(group) : 0);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }
}
