package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collections;
import java.util.List;
import o.isFirst;
import org.apache.commons.codec.language.Soundex;
import org.apache.http.HttpHost;
@Deprecated
/* loaded from: classes5.dex */
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR;
    public static final String EXTRA_KEY = "com.google.android.gms.credentials.Credential";
    private static int ag$a = 0;
    private static int ah$a = 1;
    private static char[] toString;
    private static char values;
    private final String zba;
    private final String zbb;
    private final Uri zbc;
    private final List zbd;
    private final String zbe;
    private final String zbf;
    private final String zbg;
    private final String zbh;

    @Deprecated
    /* loaded from: classes7.dex */
    public static class Builder {
        private final String zba;
        private String zbb;
        private Uri zbc;
        private List zbd;
        private String zbe;
        private String zbf;
        private String zbg;
        private String zbh;

        public Builder(Credential credential) {
            this.zba = Credential.zbe(credential);
            this.zbb = Credential.zbf(credential);
            this.zbc = Credential.zba(credential);
            this.zbd = Credential.zbh(credential);
            this.zbe = Credential.zbg(credential);
            this.zbf = Credential.zbb(credential);
            this.zbg = Credential.zbd(credential);
            this.zbh = Credential.zbc(credential);
        }

        public Builder(String str) {
            this.zba = str;
        }

        public Credential build() {
            return new Credential(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, this.zbg, this.zbh);
        }

        public Builder setAccountType(String str) {
            this.zbf = str;
            return this;
        }

        public Builder setName(String str) {
            this.zbb = str;
            return this;
        }

        public Builder setPassword(String str) {
            this.zbe = str;
            return this;
        }

        public Builder setProfilePictureUri(Uri uri) {
            this.zbc = uri;
            return this;
        }
    }

    static {
        try {
            valueOf();
            CREATOR = new zba();
            int i = ag$a + 5;
            ah$a = i % 128;
            int i2 = i % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Credential(String str, String str2, Uri uri, List list, String str3, String str4, String str5, String str6) {
        List unmodifiableList;
        Boolean bool;
        String trim = ((String) Preconditions.checkNotNull(str, "credential identifier cannot be null")).trim();
        Preconditions.checkNotEmpty(trim, "credential identifier cannot be empty");
        if (str3 != null && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password must not be empty if set");
        }
        if (str4 != null) {
            int i = ah$a + 81;
            ag$a = i % 128;
            int i2 = i % 2;
            boolean z = true;
            if (!(!TextUtils.isEmpty(str4))) {
                int i3 = ag$a + 51;
                ah$a = i3 % 128;
                if (i3 % 2 == 0) {
                }
                bool = false;
            } else {
                Uri parse = Uri.parse(str4);
                if (!(!parse.isAbsolute())) {
                    int i4 = ah$a + 119;
                    ag$a = i4 % 128;
                    int i5 = i4 % 2;
                    if (parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority())) {
                        if (!HttpHost.DEFAULT_SCHEME_NAME.equalsIgnoreCase(parse.getScheme())) {
                            int i6 = ah$a + 49;
                            ag$a = i6 % 128;
                            int i7 = i6 % 2;
                            if (!toString((byte) ((Process.myTid() >> 22) + 72), new char[]{3, 0, 3, 1, 13873}, 4 - TextUtils.indexOf((CharSequence) "", '0')).intern().equalsIgnoreCase(parse.getScheme())) {
                                z = false;
                            }
                        }
                        bool = Boolean.valueOf(z);
                    }
                }
                bool = false;
            }
            if (!bool.booleanValue()) {
                throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
            }
        }
        if ((!TextUtils.isEmpty(str4) ? 'U' : (char) 16) != 16 && !TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        if ((str2 != null ? (char) 23 : 'U') == 23 && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.zbb = str2;
        this.zbc = uri;
        if (list == null) {
            int i8 = ah$a + 93;
            ag$a = i8 % 128;
            if (i8 % 2 != 0) {
                unmodifiableList = Collections.emptyList();
                int i9 = 52 / 0;
            } else {
                unmodifiableList = Collections.emptyList();
            }
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.zbd = unmodifiableList;
        this.zba = trim;
        this.zbe = str3;
        this.zbf = str4;
        this.zbg = str5;
        this.zbh = str6;
    }

    static void valueOf() {
        values = (char) 2;
        toString = new char[]{13801, 13806, 13810, 13802};
    }

    static /* bridge */ /* synthetic */ Uri zba(Credential credential) {
        int i = ag$a + 111;
        ah$a = i % 128;
        int i2 = i % 2;
        Uri uri = credential.zbc;
        int i3 = ag$a + 43;
        ah$a = i3 % 128;
        if ((i3 % 2 == 0 ? (char) 15 : '.') != 15) {
            return uri;
        }
        int i4 = 64 / 0;
        return uri;
    }

    static /* bridge */ /* synthetic */ String zbb(Credential credential) {
        int i = ag$a + 69;
        ah$a = i % 128;
        int i2 = i % 2;
        String str = credential.zbf;
        int i3 = ah$a + 91;
        ag$a = i3 % 128;
        if (!(i3 % 2 == 0)) {
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        }
        return str;
    }

    static /* bridge */ /* synthetic */ String zbc(Credential credential) {
        int i = ag$a + 101;
        ah$a = i % 128;
        int i2 = i % 2;
        String str = credential.zbh;
        int i3 = ag$a + 75;
        ah$a = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    static /* synthetic */ String zbd(Credential credential) {
        String str;
        int i = ah$a + 119;
        ag$a = i % 128;
        Object[] objArr = null;
        if (i % 2 != 0) {
            str = credential.zbg;
            int length = objArr.length;
        } else {
            try {
                str = credential.zbg;
            } catch (Exception e) {
                throw e;
            }
        }
        int i2 = ah$a + 83;
        ag$a = i2 % 128;
        if (!(i2 % 2 != 0)) {
            return str;
        }
        super.hashCode();
        return str;
    }

    static /* bridge */ /* synthetic */ String zbe(Credential credential) {
        String str;
        int i = ah$a + 25;
        ag$a = i % 128;
        if ((i % 2 != 0 ? 'L' : (char) 16) != 16) {
            str = credential.zba;
            int i2 = 19 / 0;
        } else {
            try {
                str = credential.zba;
            } catch (Exception e) {
                throw e;
            }
        }
        int i3 = ah$a + 63;
        ag$a = i3 % 128;
        if (!(i3 % 2 == 0)) {
            int i4 = 53 / 0;
            return str;
        }
        return str;
    }

    static /* synthetic */ String zbf(Credential credential) {
        int i = ag$a + 61;
        ah$a = i % 128;
        int i2 = i % 2;
        String str = credential.zbb;
        int i3 = ag$a + 75;
        ah$a = i3 % 128;
        if (!(i3 % 2 != 0)) {
            Object obj = null;
            super.hashCode();
            return str;
        }
        return str;
    }

    static /* bridge */ /* synthetic */ String zbg(Credential credential) {
        try {
            int i = ag$a + 21;
            ah$a = i % 128;
            char c = i % 2 == 0 ? ')' : (char) 11;
            String str = credential.zbe;
            if (c == ')') {
                int i2 = 26 / 0;
            }
            int i3 = ag$a + 97;
            ah$a = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    static /* synthetic */ List zbh(Credential credential) {
        int i = ag$a + 85;
        ah$a = i % 128;
        if ((i % 2 == 0 ? '@' : '0') != '@') {
            try {
                return credential.zbd;
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            List list = credential.zbd;
            Object obj = null;
            super.hashCode();
            return list;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String getAccountType() {
        int i = ag$a + 111;
        ah$a = i % 128;
        int i2 = i % 2;
        String str = this.zbf;
        int i3 = ag$a + 85;
        ah$a = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public String getFamilyName() {
        int i = ag$a + 15;
        ah$a = i % 128;
        int i2 = i % 2;
        try {
            String str = this.zbh;
            int i3 = ag$a + 123;
            ah$a = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public String getGivenName() {
        int i = ah$a + 5;
        ag$a = i % 128;
        int i2 = i % 2;
        String str = this.zbg;
        try {
            int i3 = ag$a + 7;
            ah$a = i3 % 128;
            if ((i3 % 2 == 0 ? Soundex.SILENT_MARKER : '_') != '_') {
                Object obj = null;
                super.hashCode();
                return str;
            }
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public String getId() {
        String str;
        int i = ah$a + 5;
        ag$a = i % 128;
        Object[] objArr = null;
        if ((i % 2 != 0 ? 'X' : '\"') != '\"') {
            str = this.zba;
            int length = objArr.length;
        } else {
            str = this.zba;
        }
        int i2 = ah$a + 119;
        ag$a = i2 % 128;
        if (!(i2 % 2 == 0)) {
            int length2 = objArr.length;
            return str;
        }
        return str;
    }

    public List<IdToken> getIdTokens() {
        int i = ah$a + 103;
        ag$a = i % 128;
        int i2 = i % 2;
        List<IdToken> list = this.zbd;
        int i3 = ag$a + 93;
        ah$a = i3 % 128;
        int i4 = i3 % 2;
        return list;
    }

    public String getName() {
        int i = ag$a + 47;
        ah$a = i % 128;
        int i2 = i % 2;
        String str = this.zbb;
        int i3 = ah$a + 17;
        ag$a = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return str;
    }

    public String getPassword() {
        String str;
        try {
            int i = ag$a + 41;
            try {
                ah$a = i % 128;
                if (i % 2 == 0) {
                    str = this.zbe;
                    Object[] objArr = null;
                    int length = objArr.length;
                } else {
                    str = this.zbe;
                }
                int i2 = ah$a + 7;
                ag$a = i2 % 128;
                if ((i2 % 2 != 0 ? 'B' : '!') != 'B') {
                    return str;
                }
                int i3 = 29 / 0;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public Uri getProfilePictureUri() {
        int i = ah$a + 83;
        ag$a = i % 128;
        if ((i % 2 != 0 ? (char) 28 : '?') != '?') {
            Uri uri = this.zbc;
            Object[] objArr = null;
            int length = objArr.length;
            return uri;
        }
        return this.zbc;
    }

    public int hashCode() {
        int i = ag$a + 77;
        ah$a = i % 128;
        int i2 = i % 2;
        int hashCode = Objects.hashCode(this.zba, this.zbb, this.zbc, this.zbe, this.zbf);
        int i3 = ah$a + 123;
        ag$a = i3 % 128;
        int i4 = i3 % 2;
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r4 == r5) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (r4 == r5) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
        if ((r5 instanceof com.google.android.gms.auth.api.credentials.Credential) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
        r5 = (com.google.android.gms.auth.api.credentials.Credential) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
        if (android.text.TextUtils.equals(r4.zba, r5.zba) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
        r0 = com.google.android.gms.auth.api.credentials.Credential.ah$a + 75;
        com.google.android.gms.auth.api.credentials.Credential.ag$a = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
        if ((r0 % 2) == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
        r0 = org.apache.http.message.TokenParser.ESCAPE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
        r0 = '0';
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
        if (r0 == '0') goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
        r0 = android.text.TextUtils.equals(r4.zbb, r5.zbb);
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
        r1 = r1.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
        if (r0 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
        if (android.text.TextUtils.equals(r4.zbb, r5.zbb) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0063, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0064, code lost:
        if (r0 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006f, code lost:
        if (com.google.android.gms.common.internal.Objects.equal(r4.zbc, r5.zbc) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0079, code lost:
        if (android.text.TextUtils.equals(r4.zbe, r5.zbe) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0085, code lost:
        if (android.text.TextUtils.equals(r4.zbf, r5.zbf) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0087, code lost:
        r5 = 'S';
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008a, code lost:
        r5 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008c, code lost:
        if (r5 == 'S') goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008f, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0090, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0091, code lost:
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0092, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = com.google.android.gms.auth.api.credentials.Credential.ah$a
            int r0 = r0 + 27
            int r1 = r0 % 128
            com.google.android.gms.auth.api.credentials.Credential.ag$a = r1
            int r0 = r0 % 2
            r1 = 68
            if (r0 == 0) goto L11
            r0 = 22
            goto L13
        L11:
            r0 = 68
        L13:
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L1f
            r0 = 90
            int r0 = r0 / r3
            if (r4 != r5) goto L22
            goto L21
        L1d:
            r5 = move-exception
            throw r5
        L1f:
            if (r4 != r5) goto L22
        L21:
            return r2
        L22:
            boolean r0 = r5 instanceof com.google.android.gms.auth.api.credentials.Credential     // Catch: java.lang.Exception -> L93
            if (r0 != 0) goto L27
            return r3
        L27:
            com.google.android.gms.auth.api.credentials.Credential r5 = (com.google.android.gms.auth.api.credentials.Credential) r5
            java.lang.String r0 = r4.zba
            java.lang.String r1 = r5.zba
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L92
            int r0 = com.google.android.gms.auth.api.credentials.Credential.ah$a     // Catch: java.lang.Exception -> L90
            int r0 = r0 + 75
            int r1 = r0 % 128
            com.google.android.gms.auth.api.credentials.Credential.ag$a = r1     // Catch: java.lang.Exception -> L90
            int r0 = r0 % 2
            r1 = 48
            if (r0 == 0) goto L44
            r0 = 92
            goto L46
        L44:
            r0 = 48
        L46:
            if (r0 == r1) goto L57
            java.lang.String r0 = r4.zbb
            java.lang.String r1 = r5.zbb
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            r1 = 0
            int r1 = r1.length     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L92
            goto L67
        L55:
            r5 = move-exception
            throw r5
        L57:
            java.lang.String r0 = r4.zbb
            java.lang.String r1 = r5.zbb
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L63
            r0 = 0
            goto L64
        L63:
            r0 = 1
        L64:
            if (r0 == 0) goto L67
            goto L92
        L67:
            android.net.Uri r0 = r4.zbc
            android.net.Uri r1 = r5.zbc
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r1)
            if (r0 == 0) goto L92
            java.lang.String r0 = r4.zbe
            java.lang.String r1 = r5.zbe
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L92
            java.lang.String r0 = r4.zbf     // Catch: java.lang.Exception -> L90
            java.lang.String r5 = r5.zbf     // Catch: java.lang.Exception -> L90
            boolean r5 = android.text.TextUtils.equals(r0, r5)     // Catch: java.lang.Exception -> L90
            r0 = 83
            if (r5 == 0) goto L8a
            r5 = 83
            goto L8c
        L8a:
            r5 = 26
        L8c:
            if (r5 == r0) goto L8f
            goto L92
        L8f:
            return r2
        L90:
            r5 = move-exception
            throw r5
        L92:
            return r3
        L93:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.Credential.equals(java.lang.Object):boolean");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = ag$a + 49;
        ah$a = i2 % 128;
        int i3 = i2 % 2;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getId(), false);
        SafeParcelWriter.writeString(parcel, 2, getName(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getProfilePictureUri(), i, false);
        SafeParcelWriter.writeTypedList(parcel, 4, getIdTokens(), false);
        SafeParcelWriter.writeString(parcel, 5, getPassword(), false);
        SafeParcelWriter.writeString(parcel, 6, getAccountType(), false);
        SafeParcelWriter.writeString(parcel, 9, getGivenName(), false);
        SafeParcelWriter.writeString(parcel, 10, getFamilyName(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        int i4 = ag$a + 65;
        ah$a = i4 % 128;
        int i5 = i4 % 2;
    }

    private static String toString(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = toString;
            char c = values;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr3[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                isFirst.valueOf = 0;
                while (isFirst.valueOf < i2) {
                    isFirst.toString = cArr[isFirst.valueOf];
                    isFirst.ah$a = cArr[isFirst.valueOf + 1];
                    if (isFirst.toString == isFirst.ah$a) {
                        cArr3[isFirst.valueOf] = (char) (isFirst.toString - b2);
                        cArr3[isFirst.valueOf + 1] = (char) (isFirst.ah$a - b2);
                    } else {
                        isFirst.ag$a = isFirst.toString / c;
                        isFirst.invoke = isFirst.toString % c;
                        isFirst.values = isFirst.ah$a / c;
                        isFirst.ah$b = isFirst.ah$a % c;
                        if (isFirst.invoke == isFirst.ah$b) {
                            isFirst.ag$a = ((isFirst.ag$a + c) - 1) % c;
                            isFirst.values = ((isFirst.values + c) - 1) % c;
                            int i3 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i4 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i3];
                            cArr3[isFirst.valueOf + 1] = cArr2[i4];
                        } else if (isFirst.ag$a == isFirst.values) {
                            isFirst.invoke = ((isFirst.invoke + c) - 1) % c;
                            isFirst.ah$b = ((isFirst.ah$b + c) - 1) % c;
                            int i5 = (isFirst.ag$a * c) + isFirst.invoke;
                            int i6 = (isFirst.values * c) + isFirst.ah$b;
                            cArr3[isFirst.valueOf] = cArr2[i5];
                            cArr3[isFirst.valueOf + 1] = cArr2[i6];
                        } else {
                            int i7 = (isFirst.ag$a * c) + isFirst.ah$b;
                            int i8 = (isFirst.values * c) + isFirst.invoke;
                            cArr3[isFirst.valueOf] = cArr2[i7];
                            cArr3[isFirst.valueOf + 1] = cArr2[i8];
                        }
                    }
                    isFirst.valueOf += 2;
                }
            }
            for (int i9 = 0; i9 < i; i9++) {
                cArr3[i9] = (char) (cArr3[i9] ^ 13722);
            }
            str = new String(cArr3);
        }
        return str;
    }
}
