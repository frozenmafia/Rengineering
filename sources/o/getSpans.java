package o;

import com.appsamurai.storyly.exoplayer2.common.ParserException;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.extractor.mp4.Sniffer;
import java.io.IOException;
/* loaded from: classes3.dex */
public interface getSpans {
    void ah$a(int i) throws ParserException;

    void ah$a(int i, long j, long j2) throws ParserException;

    void toString(int i, double d) throws ParserException;

    void valueOf(int i, int i2, getExitDir getexitdir) throws IOException;

    boolean valueOf(int i);

    int values(int i);

    void values(int i, long j) throws ParserException;

    void values(int i, String str) throws ParserException;

    /* renamed from: o.getSpans$default  reason: invalid class name */
    /* loaded from: classes3.dex */
    final class Cdefault {
        private static final int[] toString = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, Atom.TYPE_avc1, Atom.TYPE_hvc1, Atom.TYPE_hev1, Atom.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, Sniffer.BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};

        public static boolean toString(getExitDir getexitdir) throws IOException {
            return toString(getexitdir, true, false);
        }

        public static boolean values(getExitDir getexitdir, boolean z) throws IOException {
            return toString(getexitdir, false, z);
        }

        private static boolean toString(getExitDir getexitdir, boolean z, boolean z2) throws IOException {
            boolean z3;
            long ah$a = getexitdir.ah$a();
            long j = -1;
            long j2 = android.support.v4.media.session.PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            int i = (ah$a > (-1L) ? 1 : (ah$a == (-1L) ? 0 : -1));
            if (i != 0 && ah$a <= android.support.v4.media.session.PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
                j2 = ah$a;
            }
            int i2 = (int) j2;
            C$default$setContentDescription c$default$setContentDescription = new C$default$setContentDescription(64);
            boolean z4 = false;
            int i3 = 0;
            boolean z5 = false;
            while (i3 < i2) {
                c$default$setContentDescription.valueOf(8);
                if (!getexitdir.values(c$default$setContentDescription.ah$a(), z4 ? 1 : 0, 8, true)) {
                    break;
                }
                long onPostMessage = c$default$setContentDescription.onPostMessage();
                int signupData = c$default$setContentDescription.getSignupData();
                int i4 = 16;
                if (onPostMessage == 1) {
                    getexitdir.ag$a(c$default$setContentDescription.ah$a(), 8, 8);
                    c$default$setContentDescription.values(16);
                    onPostMessage = c$default$setContentDescription.isLogoutPending();
                } else {
                    if (onPostMessage == 0) {
                        long ah$a2 = getexitdir.ah$a();
                        if (ah$a2 != j) {
                            onPostMessage = (ah$a2 - getexitdir.ag$a()) + 8;
                        }
                    }
                    i4 = 8;
                }
                long j3 = i4;
                if (onPostMessage < j3) {
                    return z4;
                }
                i3 += i4;
                if (signupData == 1836019574) {
                    i2 += (int) onPostMessage;
                    if (i != 0 && i2 > ah$a) {
                        i2 = (int) ah$a;
                    }
                    j = -1;
                } else if (signupData == 1836019558 || signupData == 1836475768) {
                    z3 = true;
                    break;
                } else {
                    long j4 = ah$a;
                    if ((i3 + onPostMessage) - j3 >= i2) {
                        break;
                    }
                    int i5 = (int) (onPostMessage - j3);
                    i3 += i5;
                    if (signupData == 1718909296) {
                        if (i5 < 8) {
                            return false;
                        }
                        c$default$setContentDescription.valueOf(i5);
                        getexitdir.ag$a(c$default$setContentDescription.ah$a(), 0, i5);
                        int i6 = i5 / 4;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                break;
                            }
                            if (i7 == 1) {
                                c$default$setContentDescription.HaptikSDK$a(4);
                            } else if (ah$a(c$default$setContentDescription.getSignupData(), z2)) {
                                z5 = true;
                                break;
                            }
                            i7++;
                        }
                        if (!z5) {
                            return false;
                        }
                    } else if (i5 != 0) {
                        getexitdir.ah$a(i5);
                    }
                    ah$a = j4;
                    j = -1;
                    z4 = false;
                }
            }
            z3 = false;
            return z5 && z == z3;
        }

        private static boolean ah$a(int i, boolean z) {
            if ((i >>> 8) == 3368816) {
                return true;
            }
            if (i == 1751476579 && z) {
                return true;
            }
            for (int i2 : toString) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }
    }
}
