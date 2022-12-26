package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes4.dex */
public final class ar {
    private static final ArrayList a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f681b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str, String str2) {
        char c;
        aq d;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1095064472:
                if (str.equals(MimeTypes.AUDIO_DTS)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals(MimeTypes.AUDIO_AAC)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals(MimeTypes.AUDIO_AC3)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 187078297:
                if (str.equals(MimeTypes.AUDIO_AC4)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (str.equals(MimeTypes.AUDIO_MPEG)) {
                    c = 0;
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
                return 9;
            case 1:
                if (str2 == null || (d = d(str2)) == null) {
                    return 0;
                }
                return d.a();
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 18;
            case 5:
                return 17;
            case 6:
                return 7;
            case 7:
                return 8;
            case '\b':
                return 14;
            default:
                return 0;
        }
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m(str)) {
            return 1;
        }
        if (q(str)) {
            return 2;
        }
        if (p(str)) {
            return 3;
        }
        if (n(str)) {
            return 4;
        }
        if (MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str)) {
            return 5;
        }
        if (MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
            return 6;
        }
        int size = a.size();
        for (int i = 0; i < size; i++) {
            ap apVar = (ap) a.get(i);
            String str2 = apVar.a;
            if (str.equals(null)) {
                int i2 = apVar.c;
                return 0;
            }
        }
        return -1;
    }

    public static int c(String str) {
        return b(g(str));
    }

    static aq d(String str) {
        Matcher matcher = f681b.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            af.s(group);
            String group2 = matcher.group(2);
            try {
                return new aq(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : cp.am(str)) {
            String g = g(str2);
            if (g != null && m(g)) {
                return g;
            }
        }
        return null;
    }

    public static String f(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] am = cp.am(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : am) {
            if (str2.equals(g(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static String g(String str) {
        aq d;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String p = atc.p(str.trim());
        if (p.startsWith("avc1") || p.startsWith("avc3")) {
            return MimeTypes.VIDEO_H264;
        }
        if (p.startsWith("hev1") || p.startsWith("hvc1")) {
            return MimeTypes.VIDEO_H265;
        }
        if (p.startsWith("dvav") || p.startsWith("dva1") || p.startsWith("dvhe") || p.startsWith("dvh1")) {
            return MimeTypes.VIDEO_DOLBY_VISION;
        }
        if (p.startsWith("av01")) {
            return MimeTypes.VIDEO_AV1;
        }
        if (p.startsWith("vp9") || p.startsWith("vp09")) {
            return MimeTypes.VIDEO_VP9;
        }
        if (p.startsWith("vp8") || p.startsWith("vp08")) {
            return MimeTypes.VIDEO_VP8;
        }
        if (p.startsWith("mp4a")) {
            if (p.startsWith("mp4a.") && (d = d(p)) != null) {
                str2 = h(d.a);
            }
            return str2 == null ? MimeTypes.AUDIO_AAC : str2;
        } else if (p.startsWith("mha1")) {
            return MimeTypes.AUDIO_MPEGH_MHA1;
        } else {
            if (p.startsWith("mhm1")) {
                return MimeTypes.AUDIO_MPEGH_MHM1;
            }
            if (p.startsWith("ac-3") || p.startsWith("dac3")) {
                return MimeTypes.AUDIO_AC3;
            }
            if (p.startsWith("ec-3") || p.startsWith("dec3")) {
                return MimeTypes.AUDIO_E_AC3;
            }
            if (p.startsWith(MimeTypes.CODEC_E_AC3_JOC)) {
                return MimeTypes.AUDIO_E_AC3_JOC;
            }
            if (p.startsWith("ac-4") || p.startsWith("dac4")) {
                return MimeTypes.AUDIO_AC4;
            }
            if (p.startsWith("dtsc")) {
                return MimeTypes.AUDIO_DTS;
            }
            if (p.startsWith("dtse")) {
                return MimeTypes.AUDIO_DTS_EXPRESS;
            }
            if (p.startsWith("dtsh") || p.startsWith("dtsl")) {
                return MimeTypes.AUDIO_DTS_HD;
            }
            if (p.startsWith("dtsx")) {
                return MimeTypes.AUDIO_DTS_X;
            }
            if (p.startsWith("opus")) {
                return MimeTypes.AUDIO_OPUS;
            }
            if (p.startsWith("vorbis")) {
                return MimeTypes.AUDIO_VORBIS;
            }
            if (p.startsWith("flac")) {
                return MimeTypes.AUDIO_FLAC;
            }
            if (p.startsWith("stpp")) {
                return MimeTypes.APPLICATION_TTML;
            }
            if (p.startsWith("wvtt")) {
                return MimeTypes.TEXT_VTT;
            }
            if (p.contains("cea708")) {
                return MimeTypes.APPLICATION_CEA708;
            }
            if (p.contains("eia608") || p.contains("cea608")) {
                return MimeTypes.APPLICATION_CEA608;
            }
            int size = a.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                ap apVar = (ap) a.get(i);
                String str3 = apVar.f665b;
                if (p.startsWith(null)) {
                    String str4 = apVar.a;
                    break;
                }
                i++;
            }
            return null;
        }
    }

    public static String h(int i) {
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

    public static String i(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : cp.am(str)) {
            String g = g(str2);
            if (g != null && q(g)) {
                return g;
            }
        }
        return null;
    }

    public static String j(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1007807498) {
            if (str.equals("audio/x-flac")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -586683234) {
            if (hashCode == 187090231 && str.equals("audio/mp3")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("audio/x-wav")) {
                c = 2;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? c != 2 ? str : MimeTypes.AUDIO_WAV : MimeTypes.AUDIO_MPEG : MimeTypes.AUDIO_FLAC;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean k(String str, String str2) {
        char c;
        aq d;
        int a2;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -432837260:
                if (str.equals(MimeTypes.AUDIO_MPEG_L1)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -432837259:
                if (str.equals(MimeTypes.AUDIO_MPEG_L2)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals(MimeTypes.AUDIO_AAC)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals(MimeTypes.AUDIO_AC3)) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 187094639:
                if (str.equals(MimeTypes.AUDIO_RAW)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1504619009:
                if (str.equals(MimeTypes.AUDIO_FLAC)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (str.equals(MimeTypes.AUDIO_MPEG)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1903231877:
                if (str.equals(MimeTypes.AUDIO_ALAW)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1903589369:
                if (str.equals(MimeTypes.AUDIO_MLAW)) {
                    c = 5;
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
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
                return true;
            case '\n':
                return (str2 == null || (d = d(str2)) == null || (a2 = d.a()) == 0 || a2 == 16) ? false : true;
            default:
                return false;
        }
    }

    public static boolean l(String str, String str2) {
        return f(str, str2) != null;
    }

    public static boolean m(String str) {
        return "audio".equals(r(str));
    }

    public static boolean n(String str) {
        return "image".equals(r(str));
    }

    public static boolean o(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith(MimeTypes.VIDEO_WEBM) || str.startsWith(MimeTypes.AUDIO_WEBM) || str.startsWith(MimeTypes.APPLICATION_WEBM) || str.startsWith(MimeTypes.VIDEO_MATROSKA) || str.startsWith(MimeTypes.AUDIO_MATROSKA) || str.startsWith(MimeTypes.APPLICATION_MATROSKA);
    }

    public static boolean p(String str) {
        return "text".equals(r(str)) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_RAWCC.equals(str) || MimeTypes.APPLICATION_VOBSUB.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str);
    }

    public static boolean q(String str) {
        return "video".equals(r(str));
    }

    private static String r(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}
