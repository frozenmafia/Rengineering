package com.sendbird.android;

import android.text.TextUtils;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.sendbird.android.constant.StringSet;
import com.sendbird.android.shadow.com.google.gson.JsonArray;
import com.sendbird.android.shadow.com.google.gson.JsonElement;
import com.sendbird.android.shadow.com.google.gson.JsonObject;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.getDouble;
/* loaded from: classes7.dex */
public class EmojiCategory {
    private static int ah$a = 1;
    private static int toString;
    private static int[] valueOf = {55367643, 795211094, -1744784203, 285169222, 2024848174, 724286914, 857264752, 4547487, -95071851, -1864694038, -1896895519, 1143387722, 2104634393, -1190794441, -2012350645, -1571543576, -628017244, -2130777961};
    private final List<Emoji> emojis = new ArrayList();
    private final long id;
    private final String name;
    private final String url;

    /* JADX INFO: Access modifiers changed from: package-private */
    public EmojiCategory(JsonElement jsonElement) {
        String str;
        int i;
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        String str2 = "";
        this.id = asJsonObject.has(toString(new int[]{-2020835577, 1841114009}, 2 - TextUtils.indexOf("", "", 0)).intern()) ? asJsonObject.get(toString(new int[]{-2020835577, 1841114009}, ((byte) KeyEvent.getModifierMetaStateMask()) + 3).intern()).getAsLong() : 0L;
        if (asJsonObject.has("name")) {
            int i2 = ah$a + 23;
            toString = i2 % 128;
            int i3 = i2 % 2;
            str = asJsonObject.get("name").getAsString();
        } else {
            int i4 = ah$a + 61;
            toString = i4 % 128;
            int i5 = i4 % 2;
            str = "";
        }
        this.name = str;
        if (asJsonObject.has("url")) {
            int i6 = toString + 27;
            ah$a = i6 % 128;
            int i7 = i6 % 2;
            str2 = asJsonObject.get("url").getAsString();
        }
        this.url = str2;
        if (!(asJsonObject.has(StringSet.emojis))) {
            return;
        }
        int i8 = toString + 31;
        ah$a = i8 % 128;
        int i9 = i8 % 2;
        JsonArray asJsonArray = asJsonObject.getAsJsonArray(StringSet.emojis);
        while (true) {
            if ((i < asJsonArray.size() ? '9' : ')') == ')') {
                return;
            }
            int i10 = toString + 13;
            ah$a = i10 % 128;
            if (i10 % 2 != 0) {
                i = asJsonArray.get(i) == null ? i + 1 : 0;
                this.emojis.add(new Emoji(asJsonArray.get(i).getAsJsonObject()));
                int i11 = toString + 99;
                ah$a = i11 % 128;
                int i12 = i11 % 2;
            } else {
                int i13 = 60 / 0;
                if (asJsonArray.get(i) == null) {
                }
                this.emojis.add(new Emoji(asJsonArray.get(i).getAsJsonObject()));
                int i112 = toString + 99;
                ah$a = i112 % 128;
                int i122 = i112 % 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JsonElement toJson() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(toString(new int[]{-2020835577, 1841114009}, 2 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), Long.valueOf(this.id));
        jsonObject.addProperty("name", this.name);
        jsonObject.addProperty("url", this.url);
        synchronized (this.emojis) {
            if (this.emojis.size() > 0) {
                JsonArray jsonArray = new JsonArray();
                for (Emoji emoji : this.emojis) {
                    if (emoji != null) {
                        jsonArray.add(emoji.toJson());
                    }
                }
                jsonObject.add(StringSet.emojis, jsonArray);
            }
        }
        return jsonObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r6 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
        if (r6 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001e, code lost:
        r0 = new byte[r6.length];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0025, code lost:
        if (r3 >= r6.length) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0027, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0029, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002a, code lost:
        if (r4 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
        r3 = new com.sendbird.android.EmojiCategory(new com.sendbird.android.shadow.com.google.gson.JsonParser().parse(new java.lang.String(android.util.Base64.decode(r0, 0), "UTF-8")));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        r6 = com.sendbird.android.EmojiCategory.ah$a + 37;
        com.sendbird.android.EmojiCategory.toString = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
        if ((r6 % 2) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
        if (r6 == true) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
        r6 = 73 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005d, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
        r6.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0062, code lost:
        r0[r3] = (byte) (r6[r3] ^ (r3 & 255));
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sendbird.android.EmojiCategory buildFromSerializedData(byte[] r6) {
        /*
            int r0 = com.sendbird.android.EmojiCategory.toString     // Catch: java.lang.Exception -> L6f
            r1 = 27
            int r0 = r0 + r1
            int r2 = r0 % 128
            com.sendbird.android.EmojiCategory.ah$a = r2     // Catch: java.lang.Exception -> L6d
            int r0 = r0 % 2
            if (r0 != 0) goto L10
            r0 = 41
            goto L12
        L10:
            r0 = 27
        L12:
            r2 = 0
            if (r0 == r1) goto L1b
            int r0 = r2.length     // Catch: java.lang.Throwable -> L19
            if (r6 != 0) goto L1e
            goto L1d
        L19:
            r6 = move-exception
            throw r6
        L1b:
            if (r6 != 0) goto L1e
        L1d:
            return r2
        L1e:
            int r0 = r6.length
            byte[] r0 = new byte[r0]
            r1 = 0
            r3 = 0
        L23:
            int r4 = r6.length
            r5 = 1
            if (r3 >= r4) goto L29
            r4 = 0
            goto L2a
        L29:
            r4 = 1
        L2a:
            if (r4 == 0) goto L62
            java.lang.String r6 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L5d
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> L5d
            java.lang.String r3 = "UTF-8"
            r6.<init>(r0, r3)     // Catch: java.io.UnsupportedEncodingException -> L5d
            com.sendbird.android.shadow.com.google.gson.JsonParser r0 = new com.sendbird.android.shadow.com.google.gson.JsonParser     // Catch: java.io.UnsupportedEncodingException -> L5d
            r0.<init>()     // Catch: java.io.UnsupportedEncodingException -> L5d
            com.sendbird.android.EmojiCategory r3 = new com.sendbird.android.EmojiCategory     // Catch: java.io.UnsupportedEncodingException -> L5d
            com.sendbird.android.shadow.com.google.gson.JsonElement r6 = r0.parse(r6)     // Catch: java.io.UnsupportedEncodingException -> L5d
            r3.<init>(r6)     // Catch: java.io.UnsupportedEncodingException -> L5d
            int r6 = com.sendbird.android.EmojiCategory.ah$a
            int r6 = r6 + 37
            int r0 = r6 % 128
            com.sendbird.android.EmojiCategory.toString = r0
            int r6 = r6 % 2
            if (r6 == 0) goto L53
            r6 = 1
            goto L54
        L53:
            r6 = 0
        L54:
            if (r6 == r5) goto L57
            return r3
        L57:
            r6 = 73
            int r6 = r6 / r1
            return r3
        L5b:
            r6 = move-exception
            throw r6
        L5d:
            r6 = move-exception
            r6.printStackTrace()
            return r2
        L62:
            r4 = r6[r3]
            r5 = r3 & 255(0xff, float:3.57E-43)
            r4 = r4 ^ r5
            byte r4 = (byte) r4
            r0[r3] = r4
            int r3 = r3 + 1
            goto L23
        L6d:
            r6 = move-exception
            throw r6
        L6f:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sendbird.android.EmojiCategory.buildFromSerializedData(byte[]):com.sendbird.android.EmojiCategory");
    }

    public byte[] serialize() {
        try {
            try {
                JsonObject asJsonObject = toJson().getAsJsonObject();
                asJsonObject.addProperty("version", SendBird.getSDKVersion());
                try {
                    byte[] encode = Base64.encode(asJsonObject.toString().getBytes("UTF-8"), 0);
                    int i = 0;
                    while (true) {
                        if ((i < encode.length ? '(' : '6') == '6') {
                            return encode;
                        }
                        int i2 = ah$a + 73;
                        toString = i2 % 128;
                        if (i2 % 2 == 0) {
                            encode[i] = (byte) (encode[i] ^ (i & 255));
                            i++;
                        } else {
                            encode[i] = (byte) (encode[i] | (i & 11223));
                            i += 43;
                        }
                        int i3 = toString + 1;
                        ah$a = i3 % 128;
                        int i4 = i3 % 2;
                    }
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    return null;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    public long getId() {
        int i = ah$a + 93;
        toString = i % 128;
        int i2 = i % 2;
        long j = this.id;
        try {
            int i3 = ah$a + 33;
            toString = i3 % 128;
            int i4 = i3 % 2;
            return j;
        } catch (Exception e) {
            throw e;
        }
    }

    public String getName() {
        int i = ah$a + 13;
        toString = i % 128;
        int i2 = i % 2;
        String str = this.name;
        try {
            int i3 = toString + 103;
            try {
                ah$a = i3 % 128;
                if (i3 % 2 != 0) {
                    return str;
                }
                Object obj = null;
                super.hashCode();
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String getUrl() {
        try {
            int i = ah$a + 29;
            toString = i % 128;
            try {
                if ((i % 2 != 0 ? '`' : (char) 6) == 6) {
                    return this.url;
                }
                String str = this.url;
                Object obj = null;
                super.hashCode();
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public List<Emoji> getEmojis() {
        int i = toString + 105;
        ah$a = i % 128;
        int i2 = i % 2;
        List<Emoji> unmodifiableList = Collections.unmodifiableList(this.emojis);
        try {
            int i3 = ah$a + 15;
            toString = i3 % 128;
            int i4 = i3 % 2;
            return unmodifiableList;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean equals(Object obj) {
        int i = toString + 115;
        ah$a = i % 128;
        int i2 = i % 2;
        if (obj != null) {
            int i3 = ah$a + 35;
            toString = i3 % 128;
            int i4 = i3 % 2;
            try {
                if ((obj.getClass() != getClass() ? (char) 7 : 'A') == 'A') {
                    if (getId() == ((EmojiCategory) obj).getId()) {
                        int i5 = toString + 33;
                        ah$a = i5 % 128;
                        if (i5 % 2 == 0) {
                        }
                        return true;
                    }
                    return false;
                }
                int i6 = ah$a + 37;
                toString = i6 % 128;
                if (i6 % 2 != 0) {
                    Object obj2 = null;
                    super.hashCode();
                    return false;
                }
                return false;
            } catch (Exception e) {
                throw e;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = ah$a + 69;
        toString = i % 128;
        int i2 = i % 2;
        int generateHashCode = HashUtils.generateHashCode(Long.valueOf(getId()));
        try {
            int i3 = toString + 117;
            ah$a = i3 % 128;
            if (!(i3 % 2 == 0)) {
                return generateHashCode;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return generateHashCode;
        } catch (Exception e) {
            throw e;
        }
    }

    public String toString() {
        String str = "EmojiCategory{id='" + this.id + "', name='" + this.name + "', url='" + this.url + "', emojis=" + this.emojis + '}';
        int i = ah$a + 79;
        toString = i % 128;
        int i2 = i % 2;
        return str;
    }

    private static String toString(int[] iArr, int i) {
        String str;
        synchronized (getDouble.ag$a) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) valueOf.clone();
            getDouble.toString = 0;
            while (getDouble.toString < iArr.length) {
                cArr[0] = (char) (iArr[getDouble.toString] >> 16);
                cArr[1] = (char) iArr[getDouble.toString];
                cArr[2] = (char) (iArr[getDouble.toString + 1] >> 16);
                cArr[3] = (char) iArr[getDouble.toString + 1];
                getDouble.valueOf = (cArr[0] << 16) + cArr[1];
                getDouble.values = (cArr[2] << 16) + cArr[3];
                getDouble.values(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = getDouble.valueOf ^ iArr2[i2];
                    getDouble.valueOf = i3;
                    getDouble.values = getDouble.toString(i3) ^ getDouble.values;
                    int i4 = getDouble.valueOf;
                    getDouble.valueOf = getDouble.values;
                    getDouble.values = i4;
                }
                int i5 = getDouble.valueOf;
                getDouble.valueOf = getDouble.values;
                getDouble.values = i5;
                getDouble.values = i5 ^ iArr2[16];
                getDouble.valueOf ^= iArr2[17];
                int i6 = getDouble.valueOf;
                int i7 = getDouble.values;
                cArr[0] = (char) (getDouble.valueOf >>> 16);
                cArr[1] = (char) getDouble.valueOf;
                cArr[2] = (char) (getDouble.values >>> 16);
                cArr[3] = (char) getDouble.values;
                getDouble.values(iArr2);
                cArr2[getDouble.toString << 1] = cArr[0];
                cArr2[(getDouble.toString << 1) + 1] = cArr[1];
                cArr2[(getDouble.toString << 1) + 2] = cArr[2];
                cArr2[(getDouble.toString << 1) + 3] = cArr[3];
                getDouble.toString += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
