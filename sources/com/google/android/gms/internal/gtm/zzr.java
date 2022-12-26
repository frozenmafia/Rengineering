package com.google.android.gms.internal.gtm;

import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.analytics.zzi;
import java.util.HashMap;
import o.move;
/* loaded from: classes7.dex */
public final class zzr extends zzi<zzr> {
    private static long ag$a = -3141110229666863441L;
    private static int toString = 1;
    private static int valueOf;
    private static char[] values = {'s', 26304, 52523, 13439, 39647, 270, 15144, 23946};
    private String name;
    private String zzno;
    private String zztz;
    private String zzua;
    private String zzub;
    private String zzuc;
    private String zzud;
    private String zzue;
    private String zzuf;
    private String zzug;

    public final String toString() {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("name", this.name);
            hashMap.put(valueOf((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 5, ViewConfiguration.getScrollBarSize() >> 8, (char) (ViewConfiguration.getEdgeSlop() >> 16)).intern(), this.zztz);
            hashMap.put("medium", this.zzua);
            hashMap.put("keyword", this.zzub);
            hashMap.put("content", this.zzuc);
            hashMap.put(valueOf((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1, 6 - KeyEvent.getDeadChar(0, 0), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 15169)).intern(), this.zzno);
            hashMap.put("adNetworkId", this.zzud);
            hashMap.put("gclid", this.zzue);
            hashMap.put("dclid", this.zzuf);
            hashMap.put("aclid", this.zzug);
            String zza = zza((Object) hashMap);
            int i = valueOf + 55;
            toString = i % 128;
            int i2 = i % 2;
            return zza;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getName() {
        String str;
        int i = valueOf + 17;
        toString = i % 128;
        if ((i % 2 == 0 ? 'D' : '#') != 'D') {
            str = this.name;
        } else {
            str = this.name;
            int i2 = 0 / 0;
        }
        int i3 = toString + 61;
        valueOf = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final void setName(String str) {
        int i = toString + 3;
        valueOf = i % 128;
        if (i % 2 != 0) {
            try {
                this.name = str;
                Object[] objArr = null;
                int length = objArr.length;
            } catch (Exception e) {
                throw e;
            }
        } else {
            this.name = str;
        }
        int i2 = valueOf + 39;
        toString = i2 % 128;
        int i3 = i2 % 2;
    }

    public final String getSource() {
        String str;
        int i = valueOf + 47;
        toString = i % 128;
        Object[] objArr = null;
        if (!(i % 2 != 0)) {
            str = this.zztz;
            int length = objArr.length;
        } else {
            str = this.zztz;
        }
        int i2 = toString + 97;
        valueOf = i2 % 128;
        if ((i2 % 2 != 0 ? '=' : (char) 18) != 18) {
            super.hashCode();
            return str;
        }
        return str;
    }

    public final void zzc(String str) {
        int i = valueOf + 17;
        toString = i % 128;
        int i2 = i % 2;
        try {
            this.zztz = str;
            int i3 = toString + 95;
            valueOf = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String zzbd() {
        String str;
        try {
            int i = toString + 59;
            try {
                valueOf = i % 128;
                Object obj = null;
                if ((i % 2 != 0 ? '_' : '!') != '_') {
                    str = this.zzua;
                } else {
                    str = this.zzua;
                    super.hashCode();
                }
                int i2 = toString + 55;
                valueOf = i2 % 128;
                if ((i2 % 2 != 0 ? '/' : 'D') != 'D') {
                    super.hashCode();
                    return str;
                }
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final void zzd(String str) {
        try {
            int i = toString + 113;
            try {
                valueOf = i % 128;
                char c = i % 2 != 0 ? ',' : 'D';
                this.zzua = str;
                if (c != 'D') {
                    int i2 = 70 / 0;
                }
                int i3 = toString + 17;
                valueOf = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String zzbe() {
        String str;
        int i = valueOf + 81;
        toString = i % 128;
        Object obj = null;
        if (!(i % 2 != 0)) {
            str = this.zzub;
            super.hashCode();
        } else {
            str = this.zzub;
        }
        int i2 = valueOf + 123;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        super.hashCode();
        return str;
    }

    public final void zze(String str) {
        try {
            int i = toString + 23;
            valueOf = i % 128;
            int i2 = i % 2;
            try {
                this.zzub = str;
                int i3 = toString + 23;
                valueOf = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String zzbf() {
        int i = toString + 83;
        valueOf = i % 128;
        if ((i % 2 != 0 ? '.' : '*') == '*') {
            try {
                return this.zzuc;
            } catch (Exception e) {
                throw e;
            }
        }
        String str = this.zzuc;
        Object obj = null;
        super.hashCode();
        return str;
    }

    public final void zzf(String str) {
        try {
            int i = valueOf + 45;
            toString = i % 128;
            int i2 = i % 2;
            try {
                this.zzuc = str;
                int i3 = toString + 47;
                valueOf = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String getId() {
        int i = valueOf + 29;
        toString = i % 128;
        int i2 = i % 2;
        try {
            String str = this.zzno;
            int i3 = valueOf + 89;
            toString = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final void zzg(String str) {
        int i = toString + 89;
        valueOf = i % 128;
        if ((i % 2 != 0 ? 'I' : (char) 6) == 6) {
            this.zzno = str;
            return;
        }
        try {
            this.zzno = str;
            int i2 = 61 / 0;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String zzbg() {
        int i = toString + 21;
        valueOf = i % 128;
        int i2 = i % 2;
        String str = this.zzud;
        int i3 = valueOf + 67;
        toString = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final void zzh(String str) {
        int i = toString + 107;
        valueOf = i % 128;
        char c = i % 2 != 0 ? '\f' : 'A';
        this.zzud = str;
        if (c != 'A') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    public final String zzbh() {
        String str;
        int i = toString + 61;
        valueOf = i % 128;
        if ((i % 2 != 0 ? 'I' : (char) 0) != 0) {
            str = this.zzue;
            Object obj = null;
            super.hashCode();
        } else {
            try {
                str = this.zzue;
            } catch (Exception e) {
                throw e;
            }
        }
        int i2 = toString + 45;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final void zzi(String str) {
        try {
            int i = toString + 25;
            valueOf = i % 128;
            int i2 = i % 2;
            this.zzue = str;
            int i3 = toString + 7;
            valueOf = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String zzbi() {
        String str;
        try {
            int i = valueOf + 101;
            try {
                toString = i % 128;
                if ((i % 2 == 0 ? 'R' : '+') != 'R') {
                    str = this.zzuf;
                } else {
                    str = this.zzuf;
                    Object obj = null;
                    super.hashCode();
                }
                int i2 = valueOf + 49;
                toString = i2 % 128;
                int i3 = i2 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final void zzj(String str) {
        int i = valueOf + 99;
        toString = i % 128;
        int i2 = i % 2;
        this.zzuf = str;
        int i3 = valueOf + 23;
        toString = i3 % 128;
        int i4 = i3 % 2;
    }

    public final String zzbj() {
        String str;
        int i = toString + 79;
        valueOf = i % 128;
        if (i % 2 != 0) {
            str = this.zzug;
            Object[] objArr = null;
            int length = objArr.length;
        } else {
            str = this.zzug;
        }
        try {
            int i2 = toString + 37;
            valueOf = i2 % 128;
            int i3 = i2 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public final void zzk(String str) {
        try {
            int i = valueOf + 125;
            toString = i % 128;
            int i2 = i % 2;
            try {
                this.zzug = str;
                int i3 = valueOf + 23;
                toString = i3 % 128;
                if ((i3 % 2 == 0 ? '`' : (char) 18) != '`') {
                    return;
                }
                int i4 = 44 / 0;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
        if ((!android.text.TextUtils.isEmpty(r4.name)) != true) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
        r5.name = r4.name;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (android.text.TextUtils.isEmpty(r4.name) == false) goto L66;
     */
    @Override // com.google.android.gms.analytics.zzi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void zzb(com.google.android.gms.internal.gtm.zzr r5) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzr.zzb(com.google.android.gms.analytics.zzi):void");
    }

    private static String valueOf(int i, int i2, char c) {
        String str;
        synchronized (move.valueOf) {
            char[] cArr = new char[i];
            move.values = 0;
            while (move.values < i) {
                cArr[move.values] = (char) ((values[move.values + i2] ^ (move.values * ag$a)) ^ c);
                move.values++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
