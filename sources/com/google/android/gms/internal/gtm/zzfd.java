package com.google.android.gms.internal.gtm;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import o.isClosed;
import org.apache.http.message.TokenParser;
/* loaded from: classes7.dex */
public class zzfd {
    private static int ah$a = 1;
    private static int valueOf;
    private static char[] values = {'D', 134};
    private static zzfd zzaoq;
    private volatile int zzaor = zza.zzaos;
    private volatile String zzais = null;
    private volatile String zzaec = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public enum zza {
        public static final int zzaos = 1;
        public static final int zzaot = 2;
        private static final /* synthetic */ int[] zzaou = {1, 2};
    }

    zzfd() {
    }

    public static zzfd zzkr() {
        zzfd zzfdVar;
        synchronized (zzfd.class) {
            if (zzaoq == null) {
                zzaoq = new zzfd();
            }
            zzfdVar = zzaoq;
        }
        return zzfdVar;
    }

    public final boolean zza(String str, Uri uri) {
        synchronized (this) {
            try {
                String decode = URLDecoder.decode(uri.toString(), "UTF-8");
                if (!decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\S+")) {
                    String valueOf2 = String.valueOf(decode);
                    zzev.zzac(valueOf2.length() != 0 ? "Bad preview url: ".concat(valueOf2) : new String("Bad preview url: "));
                    return false;
                }
                String queryParameter = uri.getQueryParameter(ah$a(true, new int[]{0, 2, 32, 1}, new byte[]{1, 1}).intern());
                String queryParameter2 = uri.getQueryParameter("gtm_auth");
                String queryParameter3 = uri.getQueryParameter("gtm_preview");
                if (!str.equals(queryParameter)) {
                    zzev.zzac("Preview fails (container doesn't match the container specified by the asset)");
                    return false;
                } else if (queryParameter != null && queryParameter.length() > 0) {
                    if (queryParameter3 != null && queryParameter3.length() == 0) {
                        if (queryParameter.equals(this.zzaec) && this.zzaor != zza.zzaos) {
                            String valueOf3 = String.valueOf(this.zzaec);
                            zzev.zzab(valueOf3.length() != 0 ? "Exit preview mode for container: ".concat(valueOf3) : new String("Exit preview mode for container: "));
                            this.zzaor = zza.zzaos;
                            this.zzaec = null;
                            this.zzais = null;
                        }
                        zzev.zzac("Error in exiting preview mode. The container is not in preview.");
                        return false;
                    } else if (queryParameter3 != null && queryParameter3.length() > 0 && queryParameter2 != null && queryParameter2.length() > 0) {
                        this.zzaor = zza.zzaot;
                        this.zzais = uri.getQuery();
                        this.zzaec = queryParameter;
                    } else {
                        String valueOf4 = String.valueOf(decode);
                        zzev.zzac(valueOf4.length() != 0 ? "Bad preview url: ".concat(valueOf4) : new String("Bad preview url: "));
                        return false;
                    }
                    return true;
                } else {
                    String valueOf5 = String.valueOf(decode);
                    zzev.zzac(valueOf5.length() != 0 ? "Bad preview url: ".concat(valueOf5) : new String("Bad preview url: "));
                    return false;
                }
            } catch (UnsupportedEncodingException e) {
                String valueOf6 = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf6).length() + 32);
                sb.append("Error decoding the preview url: ");
                sb.append(valueOf6);
                zzev.zzac(sb.toString());
                return false;
            }
        }
    }

    public final boolean isPreview() {
        try {
            if ((this.zzaor == zza.zzaot ? (char) 2 : '\n') != 2) {
                int i = ah$a + 45;
                valueOf = i % 128;
                int i2 = i % 2;
                return false;
            }
            int i3 = valueOf + 125;
            ah$a = i3 % 128;
            int i4 = i3 % 2;
            return true;
        } catch (Exception e) {
            throw e;
        }
    }

    public final boolean zzbw(String str) {
        int i = ah$a + 3;
        valueOf = i % 128;
        if ((i % 2 != 0 ? '>' : '3') != '>') {
            try {
                if ((isPreview() ? (char) 20 : 'X') == 'X') {
                    return false;
                }
            } catch (Exception e) {
                throw e;
            }
        } else {
            boolean isPreview = isPreview();
            Object obj = null;
            super.hashCode();
            if (!isPreview) {
                return false;
            }
        }
        if (this.zzaec.equals(str)) {
            int i2 = ah$a + 111;
            valueOf = i2 % 128;
            return (i2 % 2 != 0 ? 'N' : TokenParser.SP) == ' ';
        }
        return false;
    }

    public final String zzks() {
        int i = valueOf + 121;
        ah$a = i % 128;
        int i2 = i % 2;
        try {
            String str = this.zzais;
            int i3 = ah$a + 17;
            valueOf = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getContainerId() {
        try {
            int i = valueOf + 111;
            try {
                ah$a = i % 128;
                if (i % 2 == 0) {
                    String str = this.zzaec;
                    Object[] objArr = null;
                    int length = objArr.length;
                    return str;
                }
                return this.zzaec;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String ah$a(boolean z, int[] iArr, byte[] bArr) {
        String str;
        synchronized (isClosed.ah$a) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(values, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                isClosed.ag$a = 0;
                char c = 0;
                while (isClosed.ag$a < i2) {
                    if (bArr[isClosed.ag$a] == 1) {
                        cArr2[isClosed.ag$a] = (char) (((cArr[isClosed.ag$a] << 1) + 1) - c);
                    } else {
                        cArr2[isClosed.ag$a] = (char) ((cArr[isClosed.ag$a] << 1) - c);
                    }
                    c = cArr2[isClosed.ag$a];
                    isClosed.ag$a++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr4[isClosed.ag$a] = cArr[(i2 - isClosed.ag$a) - 1];
                    isClosed.ag$a++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                isClosed.ag$a = 0;
                while (isClosed.ag$a < i2) {
                    cArr[isClosed.ag$a] = (char) (cArr[isClosed.ag$a] - iArr[2]);
                    isClosed.ag$a++;
                }
            }
            str = new String(cArr);
        }
        return str;
    }
}
