package com.sendbird.android.shadow.okhttp3;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.databinding.library.baseAdapters.BR;
import com.sendbird.android.shadow.okhttp3.internal.Util;
import com.sendbird.android.shadow.okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import o.move;
import o.moveToLast;
import org.apache.commons.codec.language.Soundex;
import org.apache.http.HttpHost;
import org.apache.http.message.TokenParser;
/* loaded from: classes5.dex */
public final class HttpUrl {
    static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    static final String FRAGMENT_ENCODE_SET = "";
    static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    private static final char[] HEX_DIGITS;
    private static int HaptikSDK$c = 1;
    static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    static final String QUERY_ENCODE_SET = " \"'<>#";
    static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private static short[] ag$a;
    private static int ah$a;
    private static int invoke;
    private static int toString;
    private static byte[] valueOf;
    private static int values;
    private final String fragment;
    final String host;
    private final String password;
    private final List<String> pathSegments;
    final int port;
    private final List<String> queryNamesAndValues;
    final String scheme;
    private final String url;
    private final String username;

    static void values() {
        ah$a = 113;
        values = -1187634833;
        toString = -23963484;
        valueOf = new byte[]{-108, -79, 78, -78, -66};
    }

    static {
        values();
        HEX_DIGITS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int i = HaptikSDK$c + 45;
        invoke = i % 128;
        int i2 = i % 2;
    }

    HttpUrl(Builder builder) {
        List<String> percentDecode;
        this.scheme = builder.scheme;
        this.username = percentDecode(builder.encodedUsername, false);
        this.password = percentDecode(builder.encodedPassword, false);
        this.host = builder.host;
        this.port = builder.effectivePort();
        this.pathSegments = percentDecode(builder.encodedPathSegments, false);
        String str = null;
        if (builder.encodedQueryNamesAndValues != null) {
            try {
                percentDecode = percentDecode(builder.encodedQueryNamesAndValues, true);
                int i = invoke + 69;
                HaptikSDK$c = i % 128;
                int i2 = i % 2;
            } catch (Exception e) {
                throw e;
            }
        } else {
            int i3 = HaptikSDK$c + 39;
            invoke = i3 % 128;
            int i4 = i3 % 2;
            percentDecode = null;
        }
        this.queryNamesAndValues = percentDecode;
        if (builder.encodedFragment != null) {
            int i5 = HaptikSDK$c + 101;
            invoke = i5 % 128;
            if (i5 % 2 != 0) {
            }
            str = percentDecode(builder.encodedFragment, false);
        }
        this.fragment = str;
        this.url = builder.toString();
    }

    public URL url() {
        try {
            URL url = new URL(this.url);
            int i = invoke + 43;
            HaptikSDK$c = i % 128;
            if ((i % 2 == 0 ? 'H' : (char) 2) != 2) {
                Object[] objArr = null;
                int length = objArr.length;
                return url;
            }
            return url;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public URI uri() {
        try {
            String builder = newBuilder().reencodeForUri().toString();
            try {
                URI uri = new URI(builder);
                try {
                    int i = invoke + 119;
                    HaptikSDK$c = i % 128;
                    if (i % 2 != 0) {
                        return uri;
                    }
                    Object obj = null;
                    super.hashCode();
                    return uri;
                } catch (Exception e) {
                    throw e;
                }
            } catch (URISyntaxException e2) {
                try {
                    return URI.create(builder.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
                } catch (Exception unused) {
                    throw new RuntimeException(e2);
                }
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    public String scheme() {
        int i = invoke + 63;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        String str = this.scheme;
        try {
            int i3 = HaptikSDK$c + 15;
            invoke = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean isHttps() {
        int i = HaptikSDK$c + 5;
        invoke = i % 128;
        int i2 = i % 2;
        boolean equals = this.scheme.equals(toString((byte) ((-78) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (-114) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1187634937 - Color.green(0), (short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 23963483 - TextUtils.lastIndexOf("", '0')).intern());
        int i3 = invoke + 121;
        HaptikSDK$c = i3 % 128;
        int i4 = i3 % 2;
        return equals;
    }

    public String encodedUsername() {
        int i = invoke + 79;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        if ((this.username.isEmpty() ? '\t' : 'b') != 'b') {
            int i3 = HaptikSDK$c + 39;
            invoke = i3 % 128;
            int i4 = i3 % 2;
            return "";
        }
        try {
            int length = this.scheme.length() + 3;
            String str = this.url;
            String substring = this.url.substring(length, Util.delimiterOffset(str, length, str.length(), ":@"));
            int i5 = invoke + 97;
            HaptikSDK$c = i5 % 128;
            int i6 = i5 % 2;
            return substring;
        } catch (Exception e) {
            throw e;
        }
    }

    public String username() {
        int i = invoke + 7;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        String str = this.username;
        try {
            int i3 = HaptikSDK$c + 85;
            invoke = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public String encodedPassword() {
        int i = invoke + 65;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        if (this.password.isEmpty()) {
            int i3 = invoke + 35;
            HaptikSDK$c = i3 % 128;
            int i4 = i3 % 2;
            return "";
        }
        try {
            String substring = this.url.substring(this.url.indexOf(58, this.scheme.length() + 3) + 1, this.url.indexOf(64));
            int i5 = HaptikSDK$c + 49;
            invoke = i5 % 128;
            if (i5 % 2 == 0) {
                return substring;
            }
            Object obj = null;
            super.hashCode();
            return substring;
        } catch (Exception e) {
            throw e;
        }
    }

    public String password() {
        int i = HaptikSDK$c + 25;
        invoke = i % 128;
        if ((i % 2 != 0 ? (char) 27 : (char) 31) == 31) {
            try {
                return this.password;
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            String str = this.password;
            Object obj = null;
            super.hashCode();
            return str;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String host() {
        int i = invoke + 23;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        String str = this.host;
        int i3 = invoke + 21;
        HaptikSDK$c = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public int port() {
        int i;
        try {
            int i2 = invoke + 35;
            HaptikSDK$c = i2 % 128;
            if ((i2 % 2 == 0 ? (char) 14 : '@') != '@') {
                i = this.port;
                Object[] objArr = null;
                int length = objArr.length;
            } else {
                i = this.port;
            }
            int i3 = invoke + 77;
            HaptikSDK$c = i3 % 128;
            int i4 = i3 % 2;
            return i;
        } catch (Exception e) {
            throw e;
        }
    }

    public static int defaultPort(String str) {
        int i = HaptikSDK$c + 11;
        invoke = i % 128;
        int i2 = i % 2;
        if ((str.equals(HttpHost.DEFAULT_SCHEME_NAME) ? 'c' : '`') != 'c') {
            if ((str.equals(toString((byte) ((-78) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0) + (-114), 1187634937 - View.MeasureSpec.makeMeasureSpec(0, 0), (short) (ImageFormat.getBitsPerPixel(0) + 1), 23963484 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern()) ? '>' : (char) 25) == 25) {
                int i3 = HaptikSDK$c + 107;
                invoke = i3 % 128;
                int i4 = i3 % 2;
                return -1;
            }
            int i5 = invoke + 105;
            HaptikSDK$c = i5 % 128;
            if (i5 % 2 == 0) {
                return 12834;
            }
            return BR.sortFilterHandler;
        }
        int i6 = HaptikSDK$c + 59;
        invoke = i6 % 128;
        int i7 = i6 % 2;
        return 80;
    }

    public int pathSize() {
        int i = HaptikSDK$c + 71;
        invoke = i % 128;
        int i2 = i % 2;
        int size = this.pathSegments.size();
        int i3 = HaptikSDK$c + 27;
        invoke = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = null;
            int length = objArr.length;
            return size;
        }
        return size;
    }

    public String encodedPath() {
        int i = invoke + 63;
        HaptikSDK$c = i % 128;
        if ((i % 2 == 0 ? '4' : Soundex.SILENT_MARKER) != '-') {
            int indexOf = this.url.indexOf(81, this.scheme.length() / 5);
            String str = this.url;
            return this.url.substring(indexOf, Util.delimiterOffset(str, indexOf, str.length(), "?#"));
        }
        try {
            int indexOf2 = this.url.indexOf(47, this.scheme.length() + 3);
            String str2 = this.url;
            return this.url.substring(indexOf2, Util.delimiterOffset(str2, indexOf2, str2.length(), "?#"));
        } catch (Exception e) {
            throw e;
        }
    }

    static void pathSegmentsToString(StringBuilder sb, List<String> list) {
        int size = list.size();
        int i = 0;
        while (true) {
            if ((i < size ? '8' : (char) 22) != '8') {
                int i2 = invoke + 81;
                HaptikSDK$c = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            int i4 = invoke + 81;
            HaptikSDK$c = i4 % 128;
            int i5 = i4 % 2;
            sb.append('/');
            sb.append(list.get(i));
            i++;
        }
    }

    public List<String> encodedPathSegments() {
        try {
            try {
                int indexOf = this.url.indexOf(47, this.scheme.length() + 3);
                String str = this.url;
                int delimiterOffset = Util.delimiterOffset(str, indexOf, str.length(), "?#");
                ArrayList arrayList = new ArrayList();
                int i = invoke + 95;
                HaptikSDK$c = i % 128;
                int i2 = i % 2;
                while (true) {
                    if ((indexOf < delimiterOffset ? 'Y' : '.') == '.') {
                        return arrayList;
                    }
                    int i3 = HaptikSDK$c + 25;
                    invoke = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = indexOf + 1;
                    int delimiterOffset2 = Util.delimiterOffset(this.url, i5, delimiterOffset, '/');
                    arrayList.add(this.url.substring(i5, delimiterOffset2));
                    indexOf = delimiterOffset2;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public List<String> pathSegments() {
        int i = invoke + 113;
        HaptikSDK$c = i % 128;
        if (i % 2 == 0) {
            try {
                List<String> list = this.pathSegments;
                Object[] objArr = null;
                int length = objArr.length;
                return list;
            } catch (Exception e) {
                throw e;
            }
        }
        return this.pathSegments;
    }

    public String encodedQuery() {
        if (!(this.queryNamesAndValues != null)) {
            int i = invoke + 99;
            HaptikSDK$c = i % 128;
            int i2 = i % 2;
            return null;
        }
        int indexOf = this.url.indexOf(63) + 1;
        String str = this.url;
        String substring = this.url.substring(indexOf, Util.delimiterOffset(str, indexOf, str.length(), '#'));
        int i3 = invoke + 105;
        HaptikSDK$c = i3 % 128;
        int i4 = i3 % 2;
        return substring;
    }

    static void namesAndValuesToQueryString(StringBuilder sb, List<String> list) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = HaptikSDK$c + 75;
            invoke = i2 % 128;
            int i3 = i2 % 2;
            try {
                String str = list.get(i);
                String str2 = list.get(i + 1);
                if (i > 0) {
                    int i4 = HaptikSDK$c + 47;
                    invoke = i4 % 128;
                    int i5 = i4 % 2;
                    sb.append('&');
                }
                sb.append(str);
                if ((str2 != null ? 'B' : (char) 4) == 'B') {
                    sb.append('=');
                    sb.append(str2);
                    int i6 = invoke + 11;
                    HaptikSDK$c = i6 % 128;
                    int i7 = i6 % 2;
                }
                i += 2;
                try {
                    int i8 = invoke + 65;
                    HaptikSDK$c = i8 % 128;
                    int i9 = i8 % 2;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    static List<String> queryStringToNamesAndValues(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if ((i <= str.length() ? 'X' : 'b') == 'b') {
                return arrayList;
            }
            int indexOf = str.indexOf(38, i);
            Object[] objArr = null;
            if (!(indexOf != -1)) {
                int i2 = invoke + 115;
                HaptikSDK$c = i2 % 128;
                if (i2 % 2 == 0) {
                    indexOf = str.length();
                    int length = objArr.length;
                } else {
                    indexOf = str.length();
                }
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
                int i3 = invoke + 113;
                HaptikSDK$c = i3 % 128;
                int i4 = i3 % 2;
            } else {
                try {
                    arrayList.add(str.substring(i, indexOf2));
                    arrayList.add(str.substring(indexOf2 + 1, indexOf));
                } catch (Exception e) {
                    throw e;
                }
            }
            i = indexOf + 1;
        }
    }

    public String query() {
        if ((this.queryNamesAndValues == null ? (char) 24 : (char) 18) != 18) {
            int i = HaptikSDK$c + 5;
            invoke = i % 128;
            int i2 = i % 2;
            return null;
        }
        StringBuilder sb = new StringBuilder();
        namesAndValuesToQueryString(sb, this.queryNamesAndValues);
        String sb2 = sb.toString();
        int i3 = HaptikSDK$c + 17;
        invoke = i3 % 128;
        int i4 = i3 % 2;
        return sb2;
    }

    public int querySize() {
        int i = invoke + 3;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return 0;
        }
        int i3 = HaptikSDK$c + 65;
        invoke = i3 % 128;
        if (!(i3 % 2 == 0)) {
            return list.size() % 4;
        }
        try {
            return list.size() / 2;
        } catch (Exception e) {
            throw e;
        }
    }

    public String queryParameter(String str) {
        List<String> list = this.queryNamesAndValues;
        if (!(list != null)) {
            return null;
        }
        try {
            int size = list.size();
            int i = 0;
            while (true) {
                if ((i < size ? '+' : '[') != '+') {
                    return null;
                }
                int i2 = invoke + 31;
                HaptikSDK$c = i2 % 128;
                int i3 = i2 % 2;
                if (!(!str.equals(this.queryNamesAndValues.get(i)))) {
                    try {
                        String str2 = this.queryNamesAndValues.get(i + 1);
                        int i4 = HaptikSDK$c + 123;
                        invoke = i4 % 128;
                        int i5 = i4 % 2;
                        return str2;
                    } catch (Exception e) {
                        throw e;
                    }
                }
                i += 2;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public Set<String> queryParameterNames() {
        try {
            if ((this.queryNamesAndValues == null ? '6' : 'H') != 'H') {
                int i = HaptikSDK$c + 63;
                invoke = i % 128;
                if ((i % 2 != 0 ? 1 : 0) != 0) {
                    Set<String> emptySet = Collections.emptySet();
                    Object[] objArr = null;
                    int length = objArr.length;
                    return emptySet;
                }
                return Collections.emptySet();
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = this.queryNamesAndValues.size();
            while (r2 < size) {
                int i2 = invoke + 35;
                HaptikSDK$c = i2 % 128;
                if ((i2 % 2 == 0 ? '.' : '\f') != '\f') {
                    linkedHashSet.add(this.queryNamesAndValues.get(r2));
                    r2 += 71;
                } else {
                    linkedHashSet.add(this.queryNamesAndValues.get(r2));
                    r2 += 2;
                }
            }
            try {
                return Collections.unmodifiableSet(linkedHashSet);
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public List<String> queryParameterValues(String str) {
        if (this.queryNamesAndValues == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = this.queryNamesAndValues.size();
        int i = 0;
        while (true) {
            if ((i < size ? (char) 28 : (char) 21) == 28) {
                try {
                    int i2 = invoke + 77;
                    HaptikSDK$c = i2 % 128;
                    int i3 = i2 % 2;
                    if (!(!str.equals(this.queryNamesAndValues.get(i)))) {
                        arrayList.add(this.queryNamesAndValues.get(i + 1));
                        int i4 = HaptikSDK$c + 105;
                        invoke = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    i += 2;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                return Collections.unmodifiableList(arrayList);
            }
        }
    }

    public String queryParameterName(int i) {
        List<String> list = this.queryNamesAndValues;
        if ((list != null ? '\'' : 'a') != 'a') {
            int i2 = HaptikSDK$c + 31;
            invoke = i2 % 128;
            int i3 = i2 % 2;
            String str = list.get(i * 2);
            int i4 = HaptikSDK$c + 21;
            invoke = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }
        throw new IndexOutOfBoundsException();
    }

    public String queryParameterValue(int i) {
        List<String> list = this.queryNamesAndValues;
        if ((list != null ? 'S' : '0') == '0') {
            throw new IndexOutOfBoundsException();
        }
        try {
            int i2 = HaptikSDK$c + 9;
            try {
                invoke = i2 % 128;
                int i3 = i2 % 2;
                String str = list.get((i * 2) + 1);
                int i4 = invoke + 89;
                HaptikSDK$c = i4 % 128;
                if (i4 % 2 != 0) {
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

    public String encodedFragment() {
        try {
            Object[] objArr = null;
            if ((this.fragment == null ? '5' : (char) 22) != 22) {
                try {
                    int i = HaptikSDK$c + 117;
                    invoke = i % 128;
                    int i2 = i % 2;
                    return null;
                } catch (Exception e) {
                    throw e;
                }
            }
            String substring = this.url.substring(this.url.indexOf(35) + 1);
            int i3 = invoke + 3;
            HaptikSDK$c = i3 % 128;
            if ((i3 % 2 == 0 ? (char) 21 : 'D') != 21) {
                return substring;
            }
            int length = objArr.length;
            return substring;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String fragment() {
        int i = HaptikSDK$c + 119;
        invoke = i % 128;
        int i2 = i % 2;
        String str = this.fragment;
        int i3 = HaptikSDK$c + 29;
        invoke = i3 % 128;
        if ((i3 % 2 == 0 ? (char) 20 : (char) 29) != 20) {
            Object obj = null;
            super.hashCode();
            return str;
        }
        return str;
    }

    public String redact() {
        int i = HaptikSDK$c + 59;
        invoke = i % 128;
        if ((i % 2 != 0 ? '4' : (char) 19) != '4') {
            return newBuilder("/...").username("").password("").build().toString();
        }
        String httpUrl = newBuilder("/...").username("").password("").build().toString();
        Object[] objArr = null;
        int length = objArr.length;
        return httpUrl;
    }

    public HttpUrl resolve(String str) {
        HttpUrl httpUrl;
        Builder newBuilder = newBuilder(str);
        try {
            if (!(newBuilder == null)) {
                int i = invoke + 123;
                HaptikSDK$c = i % 128;
                if ((i % 2 == 0 ? '\'' : '#') != '\'') {
                    httpUrl = newBuilder.build();
                    int i2 = invoke + 103;
                    HaptikSDK$c = i2 % 128;
                    int i3 = i2 % 2;
                    return httpUrl;
                }
                httpUrl = newBuilder.build();
                int i4 = 61 / 0;
            } else {
                httpUrl = null;
                int i5 = HaptikSDK$c + 61;
                invoke = i5 % 128;
                int i6 = i5 % 2;
            }
            int i22 = invoke + 103;
            HaptikSDK$c = i22 % 128;
            int i32 = i22 % 2;
            return httpUrl;
        } catch (Exception e) {
            throw e;
        }
    }

    public Builder newBuilder() {
        int i;
        Builder builder = new Builder();
        try {
            builder.scheme = this.scheme;
            builder.encodedUsername = encodedUsername();
            builder.encodedPassword = encodedPassword();
            builder.host = this.host;
            if ((this.port != defaultPort(this.scheme) ? (char) 26 : ':') != ':') {
                int i2 = invoke + 43;
                HaptikSDK$c = i2 % 128;
                int i3 = i2 % 2;
                i = this.port;
            } else {
                i = -1;
                int i4 = invoke + 41;
                HaptikSDK$c = i4 % 128;
                int i5 = i4 % 2;
            }
            builder.port = i;
            builder.encodedPathSegments.clear();
            builder.encodedPathSegments.addAll(encodedPathSegments());
            builder.encodedQuery(encodedQuery());
            builder.encodedFragment = encodedFragment();
            return builder;
        } catch (Exception e) {
            throw e;
        }
    }

    public Builder newBuilder(String str) {
        Object[] objArr = null;
        try {
            Builder parse = new Builder().parse(this, str);
            int i = invoke + 7;
            HaptikSDK$c = i % 128;
            if ((i % 2 == 0 ? '*' : 'H') != 'H') {
                int length = objArr.length;
                return parse;
            }
            return parse;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static HttpUrl parse(String str) {
        int i = HaptikSDK$c + 119;
        invoke = i % 128;
        int i2 = i % 2;
        try {
            HttpUrl httpUrl = get(str);
            try {
                int i3 = invoke + 45;
                HaptikSDK$c = i3 % 128;
                if (!(i3 % 2 != 0)) {
                    int i4 = 31 / 0;
                    return httpUrl;
                }
                return httpUrl;
            } catch (Exception e) {
                throw e;
            }
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static HttpUrl get(String str) {
        HttpUrl build = new Builder().parse(null, str).build();
        int i = invoke + 111;
        HaptikSDK$c = i % 128;
        int i2 = i % 2;
        return build;
    }

    public static HttpUrl get(URL url) {
        int i = HaptikSDK$c + 63;
        invoke = i % 128;
        int i2 = i % 2;
        HttpUrl parse = parse(url.toString());
        int i3 = invoke + 27;
        HaptikSDK$c = i3 % 128;
        int i4 = i3 % 2;
        return parse;
    }

    public static HttpUrl get(URI uri) {
        int i = HaptikSDK$c + 51;
        invoke = i % 128;
        try {
            if (i % 2 == 0) {
                try {
                    return parse(uri.toString());
                } catch (Exception e) {
                    throw e;
                }
            }
            HttpUrl parse = parse(uri.toString());
            Object obj = null;
            super.hashCode();
            return parse;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public boolean equals(Object obj) {
        if (!(!(obj instanceof HttpUrl))) {
            int i = invoke + 5;
            HaptikSDK$c = i % 128;
            int i2 = i % 2;
            try {
                if (((HttpUrl) obj).url.equals(this.url)) {
                    int i3 = invoke + 115;
                    HaptikSDK$c = i3 % 128;
                    if (i3 % 2 != 0) {
                    }
                    return true;
                }
            } catch (Exception e) {
                throw e;
            }
        }
        int i4 = invoke + 35;
        HaptikSDK$c = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = invoke + 103;
        HaptikSDK$c = i % 128;
        if ((i % 2 == 0 ? (char) 30 : 'R') != 30) {
            hashCode = this.url.hashCode();
        } else {
            try {
                hashCode = this.url.hashCode();
                int i2 = 53 / 0;
            } catch (Exception e) {
                throw e;
            }
        }
        int i3 = invoke + 67;
        HaptikSDK$c = i3 % 128;
        int i4 = i3 % 2;
        return hashCode;
    }

    public String toString() {
        String str;
        try {
            int i = invoke + 33;
            HaptikSDK$c = i % 128;
            if ((i % 2 == 0 ? '>' : 'S') != 'S') {
                str = this.url;
                Object[] objArr = null;
                int length = objArr.length;
            } else {
                str = this.url;
            }
            int i2 = HaptikSDK$c + 89;
            invoke = i2 % 128;
            int i3 = i2 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public String topPrivateDomain() {
        int i = HaptikSDK$c + 35;
        invoke = i % 128;
        int i2 = i % 2;
        try {
            try {
                if (!Util.verifyAsIpAddress(this.host)) {
                    return PublicSuffixDatabase.get().getEffectiveTldPlusOne(this.host);
                }
                int i3 = invoke + 125;
                HaptikSDK$c = i3 % 128;
                int i4 = i3 % 2;
                return null;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* loaded from: classes5.dex */
    public static final class Builder {
        static final String INVALID_HOST = "Invalid URL host";
        private static char[] ag$a = {'h', 46444, 27204, 7992, 54291};
        private static long ah$a = 7888125870865691928L;
        private static int toString = 1;
        private static int values;
        String encodedFragment;
        String encodedPassword;
        final List<String> encodedPathSegments;
        List<String> encodedQueryNamesAndValues;
        String encodedUsername;
        String host;
        int port;
        String scheme;

        public Builder() {
            try {
                this.encodedUsername = "";
                this.encodedPassword = "";
                this.port = -1;
                ArrayList arrayList = new ArrayList();
                this.encodedPathSegments = arrayList;
                arrayList.add("");
            } catch (Exception e) {
                throw e;
            }
        }

        public Builder scheme(String str) {
            try {
                int i = values + 27;
                toString = i % 128;
                int i2 = i % 2;
                Objects.requireNonNull(str, "scheme == null");
                if (str.equalsIgnoreCase(HttpHost.DEFAULT_SCHEME_NAME)) {
                    int i3 = values + 35;
                    try {
                        toString = i3 % 128;
                        int i4 = i3 % 2;
                        this.scheme = HttpHost.DEFAULT_SCHEME_NAME;
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    if (!(str.equalsIgnoreCase(values((ViewConfiguration.getDoubleTapTimeout() >> 16) + 5, TextUtils.getCapsMode("", 0, 0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + (-1))).intern()))) {
                        throw new IllegalArgumentException("unexpected scheme: " + str);
                    }
                    this.scheme = values(5 - KeyEvent.getDeadChar(0, 0), TextUtils.indexOf("", "", 0, 0), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern();
                    int i5 = values + 47;
                    toString = i5 % 128;
                    int i6 = i5 % 2;
                }
                int i7 = values + 113;
                toString = i7 % 128;
                if ((i7 % 2 == 0 ? TokenParser.SP : 'Y') != 'Y') {
                    Object[] objArr = null;
                    int length = objArr.length;
                    return this;
                }
                return this;
            } catch (Exception e2) {
                throw e2;
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:15:0x0040
            	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        public com.sendbird.android.shadow.okhttp3.HttpUrl.Builder username(java.lang.String r10) {
            /*
                r9 = this;
                int r0 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values
                int r0 = r0 + 51
                int r1 = r0 % 128
                com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString = r1
                int r0 = r0 % 2
                r1 = 1
                if (r0 != 0) goto Lf
                r0 = 1
                goto L10
            Lf:
                r0 = 0
            L10:
                java.lang.String r2 = "username == null"
                if (r0 == r1) goto L25
                java.util.Objects.requireNonNull(r10, r2)
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 1
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r3 = r10
                java.lang.String r10 = com.sendbird.android.shadow.okhttp3.HttpUrl.canonicalize(r3, r4, r5, r6, r7, r8)
                r9.encodedUsername = r10
                goto L35
            L25:
                java.util.Objects.requireNonNull(r10, r2)     // Catch: java.lang.Exception -> L42
                java.lang.String r1 = " \"':;<=>@[]^`{}|/\\?#"
                r2 = 1
                r3 = 0
                r4 = 0
                r5 = 0
                r0 = r10
                java.lang.String r10 = com.sendbird.android.shadow.okhttp3.HttpUrl.canonicalize(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L42
                r9.encodedUsername = r10     // Catch: java.lang.Exception -> L42
            L35:
                int r10 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values
                int r10 = r10 + 53
                int r0 = r10 % 128
                com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString = r0
                int r10 = r10 % 2
                return r9
            L40:
                r10 = move-exception
                goto L44
            L42:
                r10 = move-exception
                throw r10
            L44:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.username(java.lang.String):com.sendbird.android.shadow.okhttp3.HttpUrl$Builder");
        }

        public Builder encodedUsername(String str) {
            try {
                int i = values + 49;
                toString = i % 128;
                int i2 = i % 2;
                Objects.requireNonNull(str, "encodedUsername == null");
                this.encodedUsername = HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                int i3 = toString + 65;
                values = i3 % 128;
                int i4 = i3 % 2;
                return this;
            } catch (Exception e) {
                throw e;
            }
        }

        public Builder password(String str) {
            int i = values + 41;
            toString = i % 128;
            int i2 = i % 2;
            Objects.requireNonNull(str, "password == null");
            this.encodedPassword = HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            int i3 = values + 47;
            toString = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        public Builder encodedPassword(String str) {
            int i = toString + 119;
            values = i % 128;
            int i2 = i % 2;
            try {
                Objects.requireNonNull(str, "encodedPassword == null");
                this.encodedPassword = HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                int i3 = values + 57;
                toString = i3 % 128;
                int i4 = i3 % 2;
                return this;
            } catch (Exception e) {
                throw e;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
            if ((r0 != null ? 'H' : '+') == 'H') goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
            if ((r0 == null) == false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
            r4.host = r0;
            r5 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString + 103;
            com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values = r5 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
            if ((r5 % 2) == 0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
            r5 = 'T';
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
            r5 = 'S';
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
            if (r5 == 'T') goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
            r5 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
            super.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
            throw new java.lang.IllegalArgumentException("unexpected host: " + r5);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.sendbird.android.shadow.okhttp3.HttpUrl.Builder host(java.lang.String r5) {
            /*
                r4 = this;
                int r0 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString
                int r0 = r0 + 37
                int r1 = r0 % 128
                com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values = r1
                int r0 = r0 % 2
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L10
                r0 = 0
                goto L11
            L10:
                r0 = 1
            L11:
                java.lang.String r3 = "host == null"
                if (r0 == 0) goto L2e
                java.util.Objects.requireNonNull(r5, r3)     // Catch: java.lang.Exception -> L2c
                int r0 = r5.length()     // Catch: java.lang.Exception -> L2c
                java.lang.String r0 = canonicalizeHost(r5, r2, r0)     // Catch: java.lang.Exception -> L2c
                r1 = 72
                if (r0 == 0) goto L27
                r2 = 72
                goto L29
            L27:
                r2 = 43
            L29:
                if (r2 != r1) goto L5d
                goto L3e
            L2c:
                r5 = move-exception
                throw r5
            L2e:
                java.util.Objects.requireNonNull(r5, r3)
                int r0 = r5.length()
                java.lang.String r0 = canonicalizeHost(r5, r2, r0)
                if (r0 == 0) goto L3c
                r1 = 0
            L3c:
                if (r1 != 0) goto L5d
            L3e:
                r4.host = r0
                int r5 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString
                int r5 = r5 + 103
                int r0 = r5 % 128
                com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values = r0
                int r5 = r5 % 2
                r0 = 84
                if (r5 == 0) goto L51
                r5 = 84
                goto L53
            L51:
                r5 = 83
            L53:
                if (r5 == r0) goto L56
                return r4
            L56:
                r5 = 0
                super.hashCode()     // Catch: java.lang.Throwable -> L5b
                return r4
            L5b:
                r5 = move-exception
                throw r5
            L5d:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "unexpected host: "
                r0.append(r1)
                r0.append(r5)
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.host(java.lang.String):com.sendbird.android.shadow.okhttp3.HttpUrl$Builder");
        }

        public Builder port(int i) {
            if (i > 0) {
                if (!(i > 65535)) {
                    int i2 = toString + 73;
                    values = i2 % 128;
                    int i3 = i2 % 2;
                    this.port = i;
                    int i4 = toString + 1;
                    values = i4 % 128;
                    int i5 = i4 % 2;
                    return this;
                }
            }
            throw new IllegalArgumentException("unexpected port: " + i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x001a, code lost:
            if (r0 != (-1)) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x001c, code lost:
            r1 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString + 55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
            r0 = com.sendbird.android.shadow.okhttp3.HttpUrl.defaultPort(r3.scheme);
            r1 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString + 91;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
            if (r0 != (-1)) goto L16;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int effectivePort() {
            /*
                r3 = this;
                int r0 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString     // Catch: java.lang.Exception -> L35
                int r0 = r0 + 99
                int r1 = r0 % 128
                com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values = r1     // Catch: java.lang.Exception -> L33
                int r0 = r0 % 2
                r1 = -1
                if (r0 == 0) goto L18
                int r0 = r3.port     // Catch: java.lang.Exception -> L33
                r2 = 0
                super.hashCode()     // Catch: java.lang.Throwable -> L16
                if (r0 == r1) goto L27
                goto L1c
            L16:
                r0 = move-exception
                throw r0
            L18:
                int r0 = r3.port     // Catch: java.lang.Exception -> L35
                if (r0 == r1) goto L27
            L1c:
                int r1 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString
                int r1 = r1 + 55
            L20:
                int r2 = r1 % 128
                com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values = r2
                int r1 = r1 % 2
                goto L32
            L27:
                java.lang.String r0 = r3.scheme
                int r0 = com.sendbird.android.shadow.okhttp3.HttpUrl.defaultPort(r0)
                int r1 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString
                int r1 = r1 + 91
                goto L20
            L32:
                return r0
            L33:
                r0 = move-exception
                throw r0
            L35:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.effectivePort():int");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:18:0x0036
            	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        public com.sendbird.android.shadow.okhttp3.HttpUrl.Builder addPathSegment(java.lang.String r8) {
            /*
                r7 = this;
                int r0 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values
                int r0 = r0 + 115
                int r1 = r0 % 128
                com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString = r1
                int r0 = r0 % 2
                java.lang.String r0 = "pathSegment == null"
                java.util.Objects.requireNonNull(r8, r0)     // Catch: java.lang.Exception -> L34
                r3 = 0
                int r4 = r8.length()     // Catch: java.lang.Exception -> L34
                r5 = 0
                r6 = 0
                r1 = r7
                r2 = r8
                r1.push(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L34
                int r8 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString
                int r8 = r8 + 93
                int r0 = r8 % 128
                com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values = r0
                int r8 = r8 % 2
                if (r8 == 0) goto L29
                r8 = 1
                goto L2a
            L29:
                r8 = 0
            L2a:
                if (r8 == 0) goto L33
                r8 = 0
                super.hashCode()     // Catch: java.lang.Throwable -> L31
                return r7
            L31:
                r8 = move-exception
                throw r8
            L33:
                return r7
            L34:
                r8 = move-exception
                throw r8
            L36:
                r8 = move-exception
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.addPathSegment(java.lang.String):com.sendbird.android.shadow.okhttp3.HttpUrl$Builder");
        }

        public Builder addPathSegments(String str) {
            int i = toString + 101;
            values = i % 128;
            if (i % 2 != 0) {
            }
            Objects.requireNonNull(str, "pathSegments == null");
            Builder addPathSegments = addPathSegments(str, false);
            int i2 = values + 107;
            toString = i2 % 128;
            int i3 = i2 % 2;
            return addPathSegments;
        }

        public Builder addEncodedPathSegment(String str) {
            int i = toString + 103;
            values = i % 128;
            if (!(i % 2 != 0)) {
                Objects.requireNonNull(str, "encodedPathSegment == null");
                push(str, 0, str.length(), false, true);
            } else {
                try {
                    Objects.requireNonNull(str, "encodedPathSegment == null");
                    push(str, 1, str.length(), true, true);
                } catch (Exception e) {
                    throw e;
                }
            }
            try {
                int i2 = values + 29;
                toString = i2 % 128;
                if ((i2 % 2 == 0 ? '*' : '\"') != '\"') {
                    int i3 = 51 / 0;
                    return this;
                }
                return this;
            } catch (Exception e2) {
                throw e2;
            }
        }

        public Builder addEncodedPathSegments(String str) {
            int i = toString + 75;
            values = i % 128;
            int i2 = i % 2;
            Objects.requireNonNull(str, "encodedPathSegments == null");
            Builder addPathSegments = addPathSegments(str, true);
            try {
                int i3 = values + 91;
                try {
                    toString = i3 % 128;
                    int i4 = i3 % 2;
                    return addPathSegments;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }

        private Builder addPathSegments(String str, boolean z) {
            boolean z2;
            int i = 0;
            do {
                try {
                    int delimiterOffset = Util.delimiterOffset(str, i, str.length(), "/\\");
                    if (!(delimiterOffset >= str.length())) {
                        int i2 = toString + 37;
                        values = i2 % 128;
                        int i3 = i2 % 2;
                        z2 = true;
                    } else {
                        int i4 = toString + 111;
                        values = i4 % 128;
                        int i5 = i4 % 2;
                        z2 = false;
                    }
                    push(str, i, delimiterOffset, z2, z);
                    i = delimiterOffset + 1;
                } catch (Exception e) {
                    throw e;
                }
            } while (i <= str.length());
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
            if (r1 == false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
            if ((!isDotDot(r0) ? '=' : '<') != '<') goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
            r10.encodedPathSegments.set(r11, r0);
            r11 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString + 27;
            com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values = r11 % 128;
            r11 = r11 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
            return r10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.sendbird.android.shadow.okhttp3.HttpUrl.Builder setPathSegment(int r11, java.lang.String r12) {
            /*
                r10 = this;
                java.lang.String r0 = "pathSegment == null"
                java.util.Objects.requireNonNull(r12, r0)
                int r3 = r12.length()
                r2 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                java.lang.String r4 = " \"<>^`{}|/\\?#"
                r1 = r12
                java.lang.String r0 = com.sendbird.android.shadow.okhttp3.HttpUrl.canonicalize(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                boolean r1 = r10.isDot(r0)
                if (r1 != 0) goto L5b
                int r1 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values     // Catch: java.lang.Exception -> L59
                int r1 = r1 + 55
                int r2 = r1 % 128
                com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString = r2     // Catch: java.lang.Exception -> L57
                int r1 = r1 % 2
                if (r1 != 0) goto L2a
                r1 = 1
                goto L2b
            L2a:
                r1 = 0
            L2b:
                if (r1 == 0) goto L38
                boolean r1 = r10.isDotDot(r0)
                r2 = 0
                int r2 = r2.length     // Catch: java.lang.Throwable -> L36
                if (r1 != 0) goto L5b
                goto L47
            L36:
                r11 = move-exception
                throw r11
            L38:
                boolean r1 = r10.isDotDot(r0)
                r2 = 60
                if (r1 != 0) goto L43
                r1 = 61
                goto L45
            L43:
                r1 = 60
            L45:
                if (r1 == r2) goto L5b
            L47:
                java.util.List<java.lang.String> r12 = r10.encodedPathSegments
                r12.set(r11, r0)
                int r11 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString
                int r11 = r11 + 27
                int r12 = r11 % 128
                com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values = r12
                int r11 = r11 % 2
                return r10
            L57:
                r11 = move-exception
                throw r11
            L59:
                r11 = move-exception
                throw r11
            L5b:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r0 = "unexpected path segment: "
                r11.append(r0)
                r11.append(r12)
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r11 = r11.toString()
                r12.<init>(r11)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.setPathSegment(int, java.lang.String):com.sendbird.android.shadow.okhttp3.HttpUrl$Builder");
        }

        public Builder setEncodedPathSegment(int i, String str) {
            try {
                int i2 = values + 115;
                try {
                    toString = i2 % 128;
                    int i3 = i2 % 2;
                    Objects.requireNonNull(str, "encodedPathSegment == null");
                    String canonicalize = HttpUrl.canonicalize(str, 0, str.length(), " \"<>^`{}|/\\?#", true, false, false, true, null);
                    this.encodedPathSegments.set(i, canonicalize);
                    if (!(isDot(canonicalize))) {
                        if ((!isDotDot(canonicalize) ? '?' : '(') == '?') {
                            int i4 = toString + 29;
                            values = i4 % 128;
                            int i5 = i4 % 2;
                            return this;
                        }
                    }
                    throw new IllegalArgumentException("unexpected path segment: " + str);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }

        public Builder removePathSegment(int i) {
            try {
                int i2 = values + 17;
                toString = i2 % 128;
                int i3 = i2 % 2;
                this.encodedPathSegments.remove(i);
                if ((this.encodedPathSegments.isEmpty() ? (char) 15 : 'E') != 'E') {
                    int i4 = values + 67;
                    toString = i4 % 128;
                    if (!(i4 % 2 != 0)) {
                        this.encodedPathSegments.add("");
                        int i5 = 31 / 0;
                    } else {
                        this.encodedPathSegments.add("");
                    }
                }
                return this;
            } catch (Exception e) {
                throw e;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
            if ((r0 ? false : true) == false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
            if ((r7.startsWith("/")) == true) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
            resolvePath(r7, 0, r7.length());
            r7 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values + 37;
            com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString = r7 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
            if ((r7 % 2) != 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
            r7 = r3.length;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
            throw new java.lang.IllegalArgumentException("unexpected encodedPath: " + r7);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.sendbird.android.shadow.okhttp3.HttpUrl.Builder encodedPath(java.lang.String r7) {
            /*
                r6 = this;
                int r0 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString
                int r0 = r0 + 45
                int r1 = r0 % 128
                com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values = r1
                int r0 = r0 % 2
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L10
                r0 = 0
                goto L11
            L10:
                r0 = 1
            L11:
                r3 = 0
                java.lang.String r4 = "/"
                java.lang.String r5 = "encodedPath == null"
                if (r0 == r2) goto L28
                java.util.Objects.requireNonNull(r7, r5)
                boolean r0 = r7.startsWith(r4)
                int r4 = r3.length     // Catch: java.lang.Throwable -> L26
                if (r0 == 0) goto L23
                r2 = 0
            L23:
                if (r2 != 0) goto L4e
                goto L36
            L26:
                r7 = move-exception
                throw r7
            L28:
                java.util.Objects.requireNonNull(r7, r5)
                boolean r0 = r7.startsWith(r4)
                if (r0 == 0) goto L33
                r0 = 1
                goto L34
            L33:
                r0 = 0
            L34:
                if (r0 != r2) goto L4e
            L36:
                int r0 = r7.length()
                r6.resolvePath(r7, r1, r0)
                int r7 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values
                int r7 = r7 + 37
                int r0 = r7 % 128
                com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString = r0
                int r7 = r7 % 2
                if (r7 != 0) goto L4d
                int r7 = r3.length     // Catch: java.lang.Throwable -> L4b
                return r6
            L4b:
                r7 = move-exception
                throw r7
            L4d:
                return r6
            L4e:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "unexpected encodedPath: "
                r0.append(r1)
                r0.append(r7)
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r7.<init>(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.encodedPath(java.lang.String):com.sendbird.android.shadow.okhttp3.HttpUrl$Builder");
        }

        public Builder query(String str) {
            List<String> queryStringToNamesAndValues;
            try {
                int i = toString + 35;
                values = i % 128;
                int i2 = i % 2;
                if ((str != null ? '+' : 'Z') != '+') {
                    queryStringToNamesAndValues = null;
                    int i3 = values + 9;
                    toString = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    try {
                        queryStringToNamesAndValues = HttpUrl.queryStringToNamesAndValues(HttpUrl.canonicalize(str, " \"'<>#", false, false, true, true));
                    } catch (Exception e) {
                        throw e;
                    }
                }
                this.encodedQueryNamesAndValues = queryStringToNamesAndValues;
                return this;
            } catch (Exception e2) {
                throw e2;
            }
        }

        public Builder encodedQuery(String str) {
            List<String> queryStringToNamesAndValues;
            if (!(str != null)) {
                queryStringToNamesAndValues = null;
            } else {
                int i = toString + 71;
                values = i % 128;
                int i2 = i % 2;
                try {
                    queryStringToNamesAndValues = HttpUrl.queryStringToNamesAndValues(HttpUrl.canonicalize(str, " \"'<>#", true, false, true, true));
                    int i3 = values + 1;
                    toString = i3 % 128;
                    int i4 = i3 % 2;
                } catch (Exception e) {
                    throw e;
                }
            }
            this.encodedQueryNamesAndValues = queryStringToNamesAndValues;
            return this;
        }

        public Builder addQueryParameter(String str, String str2) {
            String canonicalize;
            Objects.requireNonNull(str, "name == null");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            this.encodedQueryNamesAndValues.add(HttpUrl.canonicalize(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            List<String> list = this.encodedQueryNamesAndValues;
            if ((str2 != null ? 'R' : '5') == 'R') {
                int i = toString + 37;
                values = i % 128;
                canonicalize = (i % 2 != 0 ? 'V' : 'Y') != 'V' ? HttpUrl.canonicalize(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true) : HttpUrl.canonicalize(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true);
            } else {
                canonicalize = null;
                try {
                    int i2 = toString + 91;
                    values = i2 % 128;
                    int i3 = i2 % 2;
                } catch (Exception e) {
                    throw e;
                }
            }
            list.add(canonicalize);
            return this;
        }

        public Builder addEncodedQueryParameter(String str, String str2) {
            String canonicalize;
            int i = toString + 121;
            values = i % 128;
            int i2 = i % 2;
            try {
                Objects.requireNonNull(str, "encodedName == null");
                if (this.encodedQueryNamesAndValues == null) {
                    this.encodedQueryNamesAndValues = new ArrayList();
                }
                this.encodedQueryNamesAndValues.add(HttpUrl.canonicalize(str, " \"'<>#&=", true, false, true, true));
                List<String> list = this.encodedQueryNamesAndValues;
                if (str2 == null) {
                    canonicalize = null;
                } else {
                    int i3 = values + 47;
                    toString = i3 % 128;
                    canonicalize = (i3 % 2 == 0 ? ']' : '#') != ']' ? HttpUrl.canonicalize(str2, " \"'<>#&=", true, false, true, true) : HttpUrl.canonicalize(str2, " \"'<>#&=", true, true, false, true);
                }
                list.add(canonicalize);
                return this;
            } catch (Exception e) {
                throw e;
            }
        }

        public Builder setQueryParameter(String str, String str2) {
            int i = values + 83;
            toString = i % 128;
            if ((i % 2 == 0 ? 'b' : 'c') != 'b') {
                try {
                    removeAllQueryParameters(str);
                    try {
                        addQueryParameter(str, str2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                removeAllQueryParameters(str);
                addQueryParameter(str, str2);
                Object[] objArr = null;
                int length = objArr.length;
            }
            return this;
        }

        public Builder setEncodedQueryParameter(String str, String str2) {
            int i = values + 85;
            toString = i % 128;
            int i2 = i % 2;
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            int i3 = values + 103;
            toString = i3 % 128;
            if (!(i3 % 2 == 0)) {
                return this;
            }
            int i4 = 41 / 0;
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
            if ((r6.encodedQueryNamesAndValues != null) != true) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
            if ((r6.encodedQueryNamesAndValues == null ? 29 : 28) != 28) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
            r7 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString + 55;
            com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values = r7 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
            if ((r7 % 2) == 0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
            r7 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
            r7 = r7.length;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
            removeAllCanonicalQueryParameters(com.sendbird.android.shadow.okhttp3.HttpUrl.canonicalize(r7, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
            return r6;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.sendbird.android.shadow.okhttp3.HttpUrl.Builder removeAllQueryParameters(java.lang.String r7) {
            /*
                r6 = this;
                int r0 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values
                int r0 = r0 + 19
                int r1 = r0 % 128
                com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString = r1
                int r0 = r0 % 2
                java.lang.String r1 = "name == null"
                if (r0 != 0) goto L20
                java.util.Objects.requireNonNull(r7, r1)
                java.util.List<java.lang.String> r0 = r6.encodedQueryNamesAndValues
                r1 = 1
                r2 = 0
                int r1 = r1 / r2
                r1 = 1
                if (r0 != 0) goto L1a
                goto L1b
            L1a:
                r2 = 1
            L1b:
                if (r2 == r1) goto L42
                goto L30
            L1e:
                r7 = move-exception
                throw r7
            L20:
                java.util.Objects.requireNonNull(r7, r1)
                java.util.List<java.lang.String> r0 = r6.encodedQueryNamesAndValues
                r1 = 28
                if (r0 != 0) goto L2c
                r0 = 29
                goto L2e
            L2c:
                r0 = 28
            L2e:
                if (r0 == r1) goto L42
            L30:
                int r7 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString
                int r7 = r7 + 55
                int r0 = r7 % 128
                com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values = r0
                int r7 = r7 % 2
                if (r7 == 0) goto L41
                r7 = 0
                int r7 = r7.length     // Catch: java.lang.Throwable -> L3f
                return r6
            L3f:
                r7 = move-exception
                throw r7
            L41:
                return r6
            L42:
                r2 = 0
                r3 = 0
                r4 = 1
                r5 = 1
                java.lang.String r1 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~"
                r0 = r7
                java.lang.String r7 = com.sendbird.android.shadow.okhttp3.HttpUrl.canonicalize(r0, r1, r2, r3, r4, r5)
                r6.removeAllCanonicalQueryParameters(r7)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.removeAllQueryParameters(java.lang.String):com.sendbird.android.shadow.okhttp3.HttpUrl$Builder");
        }

        public Builder removeAllEncodedQueryParameters(String str) {
            Objects.requireNonNull(str, "encodedName == null");
            if ((this.encodedQueryNamesAndValues == null ? 'I' : 'F') == 'I') {
                int i = values + 67;
                toString = i % 128;
                int i2 = i % 2;
                return this;
            }
            removeAllCanonicalQueryParameters(HttpUrl.canonicalize(str, " \"'<>#&=", true, false, true, true));
            int i3 = values + 113;
            toString = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = null;
                int length = objArr.length;
                return this;
            }
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
            r3.encodedQueryNamesAndValues = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void removeAllCanonicalQueryParameters(java.lang.String r4) {
            /*
                r3 = this;
                java.util.List<java.lang.String> r0 = r3.encodedQueryNamesAndValues
                int r0 = r0.size()
                int r0 = r0 + (-2)
                int r1 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString
                int r1 = r1 + 27
                int r2 = r1 % 128
                com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values = r2
                int r1 = r1 % 2
            L12:
                r1 = 96
                if (r0 < 0) goto L19
                r2 = 59
                goto L1b
            L19:
                r2 = 96
            L1b:
                if (r2 == r1) goto L7f
                int r1 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values
                int r1 = r1 + 105
                int r2 = r1 % 128
                com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString = r2
                int r1 = r1 % 2
                java.util.List<java.lang.String> r1 = r3.encodedQueryNamesAndValues
                java.lang.Object r1 = r1.get(r0)
                boolean r1 = r4.equals(r1)
                if (r1 == 0) goto L7c
                int r1 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values
                int r1 = r1 + 99
                int r2 = r1 % 128
                com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString = r2
                int r1 = r1 % 2
                r2 = 75
                if (r1 != 0) goto L44
                r1 = 39
                goto L46
            L44:
                r1 = 75
            L46:
                if (r1 == r2) goto L5d
                java.util.List<java.lang.String> r1 = r3.encodedQueryNamesAndValues
                int r2 = r0 >>> 0
                r1.remove(r2)
                java.util.List<java.lang.String> r1 = r3.encodedQueryNamesAndValues
                r1.remove(r0)
                java.util.List<java.lang.String> r1 = r3.encodedQueryNamesAndValues
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L7c
                goto L78
            L5d:
                java.util.List<java.lang.String> r1 = r3.encodedQueryNamesAndValues
                int r2 = r0 + 1
                r1.remove(r2)
                java.util.List<java.lang.String> r1 = r3.encodedQueryNamesAndValues
                r1.remove(r0)
                java.util.List<java.lang.String> r1 = r3.encodedQueryNamesAndValues
                boolean r1 = r1.isEmpty()
                r2 = 3
                if (r1 == 0) goto L75
                r1 = 77
                goto L76
            L75:
                r1 = 3
            L76:
                if (r1 == r2) goto L7c
            L78:
                r4 = 0
                r3.encodedQueryNamesAndValues = r4
                return
            L7c:
                int r0 = r0 + (-2)
                goto L12
            L7f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.removeAllCanonicalQueryParameters(java.lang.String):void");
        }

        public Builder fragment(String str) {
            String canonicalize;
            int i = values + 35;
            toString = i % 128;
            int i2 = i % 2;
            if (str == null) {
                canonicalize = null;
            } else {
                canonicalize = HttpUrl.canonicalize(str, "", false, false, false, false);
                int i3 = toString + 115;
                values = i3 % 128;
                int i4 = i3 % 2;
            }
            this.encodedFragment = canonicalize;
            return this;
        }

        public Builder encodedFragment(String str) {
            String str2;
            if ((str != null ? ']' : '!') != '!') {
                int i = toString + 87;
                values = i % 128;
                str2 = i % 2 != 0 ? HttpUrl.canonicalize(str, "", false, true, false, false) : HttpUrl.canonicalize(str, "", true, false, false, false);
                int i2 = values + 99;
                toString = i2 % 128;
                int i3 = i2 % 2;
            } else {
                str2 = null;
                int i4 = values + 43;
                toString = i4 % 128;
                int i5 = i4 % 2;
            }
            this.encodedFragment = str2;
            return this;
        }

        Builder reencodeForUri() {
            int size = this.encodedPathSegments.size();
            int i = values + 21;
            toString = i % 128;
            int i2 = i % 2;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                try {
                    this.encodedPathSegments.set(i3, HttpUrl.canonicalize(this.encodedPathSegments.get(i3), "[]", true, true, false, true));
                    i3++;
                } catch (Exception e) {
                    throw e;
                }
                throw e;
            }
            List<String> list = this.encodedQueryNamesAndValues;
            if ((list != null ? (char) 23 : (char) 3) == 23) {
                int size2 = list.size();
                int i4 = toString + 75;
                values = i4 % 128;
                int i5 = i4 % 2;
                for (int i6 = 0; i6 < size2; i6++) {
                    int i7 = toString + 43;
                    values = i7 % 128;
                    int i8 = i7 % 2;
                    try {
                        String str = this.encodedQueryNamesAndValues.get(i6);
                        if ((str != null ? 'R' : 'X') == 'R') {
                            this.encodedQueryNamesAndValues.set(i6, HttpUrl.canonicalize(str, "\\^`{|}", true, true, true, true));
                        }
                    } catch (Exception e2) {
                        throw e2;
                    }
                }
            }
            String str2 = this.encodedFragment;
            if (str2 != null) {
                this.encodedFragment = HttpUrl.canonicalize(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
            if (r4.host != null) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0022, code lost:
            if (r1 != null) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0024, code lost:
            r1 = new com.sendbird.android.shadow.okhttp3.HttpUrl(r4);
            r2 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values + 99;
            com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
            if ((r2 % 2) != 0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
            r2 = '<';
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
            r2 = 'K';
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
            if (r2 == '<') goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
            super.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
            throw new java.lang.IllegalStateException("host == null");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.sendbird.android.shadow.okhttp3.HttpUrl build() {
            /*
                r4 = this;
                java.lang.String r0 = r4.scheme
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                if (r0 != r2) goto L4f
                int r0 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString
                int r0 = r0 + r2
                int r3 = r0 % 128
                com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values = r3
                int r0 = r0 % 2
                if (r0 == 0) goto L17
                r1 = 1
            L17:
                r0 = 0
                if (r1 == r2) goto L1f
                java.lang.String r1 = r4.host
                if (r1 == 0) goto L45
                goto L24
            L1f:
                java.lang.String r1 = r4.host
                int r2 = r0.length     // Catch: java.lang.Throwable -> L4d
                if (r1 == 0) goto L45
            L24:
                com.sendbird.android.shadow.okhttp3.HttpUrl r1 = new com.sendbird.android.shadow.okhttp3.HttpUrl
                r1.<init>(r4)
                int r2 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values
                int r2 = r2 + 99
                int r3 = r2 % 128
                com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString = r3
                int r2 = r2 % 2
                r3 = 60
                if (r2 != 0) goto L3a
                r2 = 60
                goto L3c
            L3a:
                r2 = 75
            L3c:
                if (r2 == r3) goto L3f
                return r1
            L3f:
                super.hashCode()     // Catch: java.lang.Throwable -> L43
                return r1
            L43:
                r0 = move-exception
                throw r0
            L45:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "host == null"
                r0.<init>(r1)
                throw r0
            L4d:
                r0 = move-exception
                throw r0
            L4f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "scheme == null"
                r0.<init>(r1)     // Catch: java.lang.Exception -> L57
                throw r0     // Catch: java.lang.Exception -> L57
            L57:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.build():com.sendbird.android.shadow.okhttp3.HttpUrl");
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
            if ((r8.scheme != null) != false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00b5, code lost:
            if ((r1 != com.sendbird.android.shadow.okhttp3.HttpUrl.defaultPort(r5) ? '0' : 27) != 27) goto L51;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 257
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:106:0x0271  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x029b  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x020b A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0170  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        com.sendbird.android.shadow.okhttp3.HttpUrl.Builder parse(com.sendbird.android.shadow.okhttp3.HttpUrl r24, java.lang.String r25) {
            /*
                Method dump skipped, instructions count: 752
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.parse(com.sendbird.android.shadow.okhttp3.HttpUrl, java.lang.String):com.sendbird.android.shadow.okhttp3.HttpUrl$Builder");
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0075 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0042 -> B:18:0x0035). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void resolvePath(java.lang.String r12, int r13, int r14) {
            /*
                r11 = this;
                if (r13 != r14) goto L3
                return
            L3:
                char r0 = r12.charAt(r13)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 0
                r4 = 1
                if (r0 == r1) goto L37
                int r1 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values
                int r1 = r1 + 113
                int r5 = r1 % 128
                com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString = r5
                int r1 = r1 % 2
                if (r1 != 0) goto L1d
                r1 = 0
                goto L1e
            L1d:
                r1 = 1
            L1e:
                if (r1 == 0) goto L25
                r1 = 92
                if (r0 != r1) goto L2a
                goto L37
            L25:
                r1 = 43
                if (r0 != r1) goto L2a
                goto L37
            L2a:
                java.util.List<java.lang.String> r0 = r11.encodedPathSegments
                int r1 = r0.size()
                int r1 = r1 - r4
                r0.set(r1, r2)
                r0 = r11
            L35:
                r7 = r13
                goto L44
            L37:
                java.util.List<java.lang.String> r0 = r11.encodedPathSegments     // Catch: java.lang.Exception -> L76
                r0.clear()     // Catch: java.lang.Exception -> L76
                java.util.List<java.lang.String> r0 = r11.encodedPathSegments     // Catch: java.lang.Exception -> L76
                r0.add(r2)     // Catch: java.lang.Exception -> L76
                r0 = r11
            L42:
                int r13 = r13 + r4
                goto L35
            L44:
                if (r7 >= r14) goto L48
                r13 = 0
                goto L49
            L48:
                r13 = 1
            L49:
                if (r13 == r4) goto L75
                java.lang.String r13 = "/\\"
                int r13 = com.sendbird.android.shadow.okhttp3.internal.Util.delimiterOffset(r12, r7, r14, r13)
                if (r13 >= r14) goto L62
                int r1 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString
                int r1 = r1 + 115
                int r2 = r1 % 128
                com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values = r2
                int r1 = r1 % 2
                if (r1 == 0) goto L60
                goto L62
            L60:
                r1 = 1
                goto L63
            L62:
                r1 = 0
            L63:
                r10 = 1
                r5 = r0
                r6 = r12
                r8 = r13
                r9 = r1
                r5.push(r6, r7, r8, r9, r10)
                r2 = 3
                if (r1 == 0) goto L70
                r1 = 3
                goto L72
            L70:
                r1 = 80
            L72:
                if (r1 == r2) goto L42
                goto L35
            L75:
                return
            L76:
                r12 = move-exception
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.resolvePath(java.lang.String, int, int):void");
        }

        private void push(String str, int i, int i2, boolean z, boolean z2) {
            String canonicalize = HttpUrl.canonicalize(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (isDot(canonicalize)) {
                return;
            }
            if (isDotDot(canonicalize)) {
                pop();
                return;
            }
            List<String> list = this.encodedPathSegments;
            if (!(!list.get(list.size() - 1).isEmpty())) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, canonicalize);
            } else {
                this.encodedPathSegments.add(canonicalize);
            }
            if (z) {
                this.encodedPathSegments.add("");
                int i3 = toString + 53;
                values = i3 % 128;
                int i4 = i3 % 2;
            }
            int i5 = values + 109;
            toString = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
            if ((!r4.equals(".") ? 'W' : '.') != 'W') goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
            if ((!r4.equals(".") ? ']' : 17) != 17) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
            if (r4.equalsIgnoreCase("%2e") == false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
            r4 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values + 3;
            com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString = r4 % 128;
            r4 = r4 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private boolean isDot(java.lang.String r4) {
            /*
                r3 = this;
                int r0 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString
                int r0 = r0 + 103
                int r1 = r0 % 128
                com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values = r1
                int r0 = r0 % 2
                r1 = 0
                java.lang.String r2 = "."
                if (r0 == 0) goto L24
                boolean r0 = r4.equals(r2)     // Catch: java.lang.Exception -> L47
                r2 = 78
                int r2 = r2 / r1
                r2 = 87
                if (r0 != 0) goto L1d
                r0 = 87
                goto L1f
            L1d:
                r0 = 46
            L1f:
                if (r0 == r2) goto L33
                goto L3b
            L22:
                r4 = move-exception
                throw r4
            L24:
                boolean r0 = r4.equals(r2)     // Catch: java.lang.Exception -> L47
                r2 = 17
                if (r0 != 0) goto L2f
                r0 = 93
                goto L31
            L2f:
                r0 = 17
            L31:
                if (r0 == r2) goto L3b
            L33:
                java.lang.String r0 = "%2e"
                boolean r4 = r4.equalsIgnoreCase(r0)
                if (r4 == 0) goto L46
            L3b:
                r1 = 1
                int r4 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values
                int r4 = r4 + 3
                int r0 = r4 % 128
                com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString = r0
                int r4 = r4 % 2
            L46:
                return r1
            L47:
                r4 = move-exception
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.isDot(java.lang.String):boolean");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:28:0x004b
            	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        private boolean isDotDot(java.lang.String r6) {
            /*
                r5 = this;
                int r0 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString
                int r0 = r0 + 49
                int r1 = r0 % 128
                com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values = r1
                int r0 = r0 % 2
                r1 = 58
                if (r0 == 0) goto L11
                r0 = 58
                goto L13
            L11:
                r0 = 46
            L13:
                r2 = 0
                r3 = 1
                java.lang.String r4 = ".."
                if (r0 == r1) goto L20
                boolean r0 = r6.equals(r4)
                if (r0 != 0) goto L4d
                goto L2a
            L20:
                boolean r0 = r6.equals(r4)
                r1 = 0
                super.hashCode()     // Catch: java.lang.Throwable -> L59
                if (r0 != 0) goto L4d
            L2a:
                java.lang.String r0 = "%2e."
                boolean r0 = r6.equalsIgnoreCase(r0)
                if (r0 != 0) goto L4d
                java.lang.String r0 = ".%2e"
                boolean r0 = r6.equalsIgnoreCase(r0)
                if (r0 != 0) goto L3c
                r0 = 0
                goto L3d
            L3c:
                r0 = 1
            L3d:
                if (r0 == 0) goto L40
                goto L4d
            L40:
                java.lang.String r0 = "%2e%2e"
                boolean r6 = r6.equalsIgnoreCase(r0)     // Catch: java.lang.Exception -> L49
                if (r6 == 0) goto L58
                goto L4d
            L49:
                r6 = move-exception
                throw r6
            L4b:
                r6 = move-exception
                throw r6
            L4d:
                int r6 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString
                int r6 = r6 + 61
                int r0 = r6 % 128
                com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values = r0
                int r6 = r6 % 2
                r2 = 1
            L58:
                return r2
            L59:
                r6 = move-exception
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.isDotDot(java.lang.String):boolean");
        }

        private void pop() {
            int i;
            List<String> list = this.encodedPathSegments;
            if (!(!list.remove(list.size() - 1).isEmpty())) {
                int i2 = toString + 19;
                values = i2 % 128;
                int i3 = i2 % 2;
                if (!(this.encodedPathSegments.isEmpty())) {
                    List<String> list2 = this.encodedPathSegments;
                    list2.set(list2.size() - 1, "");
                    i = toString + 57;
                    values = i % 128;
                    int i4 = i % 2;
                }
            }
            this.encodedPathSegments.add("");
            i = values + 7;
            toString = i % 128;
            int i42 = i % 2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
            if ((r0 > 'z' ? 11 : 20) != 20) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
            if (r0 > 'Z') goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
            r12 = r12 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
            if (r12 >= r13) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
            r0 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
            r0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
            if (r0 == false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
            r0 = r11.charAt(r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004b, code lost:
            if (r0 < 'a') goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x004d, code lost:
            r6 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString + 119;
            com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
            if (r0 <= 'z') goto L79;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
            if (r0 < 'A') goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
            r6 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString + 107;
            com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
            if (r0 <= 'Z') goto L77;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0067, code lost:
            r10 = 'M';
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x006a, code lost:
            r10 = 16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x006c, code lost:
            if (r10 == 'M') goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0071, code lost:
            if (r0 < '0') goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0073, code lost:
            r6 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0075, code lost:
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0076, code lost:
            if (r6 == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0079, code lost:
            r6 = com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.toString + 41;
            com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.values = r6 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0082, code lost:
            if ((r6 % 2) == 0) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0084, code lost:
            r6 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0086, code lost:
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0087, code lost:
            if (r6 == false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x008b, code lost:
            if (r0 <= '9') goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x008f, code lost:
            r6 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0090, code lost:
            if (r6 == true) goto L70;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0097, code lost:
            if (r0 <= 'U') goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0099, code lost:
            r6 = 29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x009c, code lost:
            r6 = '8';
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x009e, code lost:
            if (r6 == 29) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00a1, code lost:
            r6 = '+';
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00a3, code lost:
            if (r0 == '+') goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00a6, code lost:
            r6 = 'A';
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00a8, code lost:
            if (r6 == 'A') goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x00ac, code lost:
            if (r0 == '-') goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x00b0, code lost:
            if (r0 != '.') goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x00b5, code lost:
            if (r0 != ':') goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x00b7, code lost:
            return r12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int schemeDelimiterOffset(java.lang.String r11, int r12, int r13) {
            /*
                Method dump skipped, instructions count: 185
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sendbird.android.shadow.okhttp3.HttpUrl.Builder.schemeDelimiterOffset(java.lang.String, int, int):int");
        }

        private static int slashCount(String str, int i, int i2) {
            int i3 = toString + 25;
            values = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (true) {
                if (!(i >= i2)) {
                    char charAt = str.charAt(i);
                    if ((charAt != '\\' ? '\t' : (char) 6) != 6 && charAt != '/') {
                        break;
                    }
                    i5++;
                    i++;
                    try {
                        int i6 = toString + 43;
                        try {
                            values = i6 % 128;
                            int i7 = i6 % 2;
                        } catch (Exception e) {
                            throw e;
                        }
                    } catch (Exception e2) {
                        throw e2;
                    }
                } else {
                    break;
                }
            }
            return i5;
        }

        private static int portColonOffset(String str, int i, int i2) {
            char c;
            int i3;
            while (true) {
                if ((i < i2 ? '?' : (char) 15) != '?') {
                    int i4 = values + 63;
                    toString = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 17 / 0;
                        return i2;
                    }
                    return i2;
                }
                try {
                    char charAt = str.charAt(i);
                    if ((charAt != ':' ? Soundex.SILENT_MARKER : 'N') != '-') {
                        return i;
                    }
                    try {
                        int i6 = values + 83;
                        toString = i6 % 128;
                        int i7 = i6 % 2;
                        if (charAt != '[') {
                            i3 = toString + 73;
                        } else {
                            do {
                                i++;
                                if (i >= i2) {
                                    break;
                                } else if (str.charAt(i) == ']') {
                                    c = '8';
                                    continue;
                                } else {
                                    c = 27;
                                    continue;
                                }
                            } while (c == 27);
                            i3 = toString + 29;
                        }
                        values = i3 % 128;
                        int i8 = i3 % 2;
                        i++;
                        int i9 = toString + 13;
                        values = i9 % 128;
                        int i10 = i9 % 2;
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }

        private static String canonicalizeHost(String str, int i, int i2) {
            int i3 = toString + 121;
            values = i3 % 128;
            int i4 = i3 % 2;
            String canonicalizeHost = Util.canonicalizeHost(HttpUrl.percentDecode(str, i, i2, false));
            try {
                int i5 = values + 9;
                toString = i5 % 128;
                if ((i5 % 2 == 0 ? 'Y' : 'B') != 'Y') {
                    return canonicalizeHost;
                }
                int i6 = 32 / 0;
                return canonicalizeHost;
            } catch (Exception e) {
                throw e;
            }
        }

        private static int parsePort(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(HttpUrl.canonicalize(str, i, i2, "", false, false, false, true, null));
                if (!(parseInt > 0)) {
                    return -1;
                }
                if (!(parseInt > 65535)) {
                    int i3 = values + 79;
                    toString = i3 % 128;
                    if (i3 % 2 == 0) {
                        Object[] objArr = null;
                        int length = objArr.length;
                    }
                    int i4 = toString + 107;
                    values = i4 % 128;
                    int i5 = i4 % 2;
                    return parseInt;
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        private static String values(int i, int i2, char c) {
            String str;
            synchronized (move.valueOf) {
                char[] cArr = new char[i];
                move.values = 0;
                while (move.values < i) {
                    cArr[move.values] = (char) ((ag$a[move.values + i2] ^ (move.values * ah$a)) ^ c);
                    move.values++;
                }
                str = new String(cArr);
            }
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String percentDecode(String str, boolean z) {
        int i = invoke + 91;
        HaptikSDK$c = i % 128;
        return percentDecode(str, (i % 2 == 0 ? (char) 3 : '&') != 3 ? 0 : 1, str.length(), z);
    }

    private List<String> percentDecode(List<String> list, boolean z) {
        String percentDecode;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 0;
        while (true) {
            if ((i < size ? '0' : 'Y') == '0') {
                int i2 = HaptikSDK$c + 87;
                invoke = i2 % 128;
                int i3 = i2 % 2;
                String str = list.get(i);
                if (!(str == null)) {
                    try {
                        int i4 = HaptikSDK$c + 7;
                        invoke = i4 % 128;
                        if (i4 % 2 != 0) {
                            percentDecode = percentDecode(str, z);
                            int i5 = 55 / 0;
                        } else {
                            percentDecode = percentDecode(str, z);
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    percentDecode = null;
                }
                arrayList.add(percentDecode);
                i++;
            } else {
                return Collections.unmodifiableList(arrayList);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.String percentDecode(java.lang.String r5, int r6, int r7, boolean r8) {
        /*
            int r0 = com.sendbird.android.shadow.okhttp3.HttpUrl.invoke
            int r0 = r0 + 25
            int r1 = r0 % 128
            com.sendbird.android.shadow.okhttp3.HttpUrl.HaptikSDK$c = r1
            int r0 = r0 % 2
            int r0 = com.sendbird.android.shadow.okhttp3.HttpUrl.invoke
            int r0 = r0 + 57
            int r1 = r0 % 128
            com.sendbird.android.shadow.okhttp3.HttpUrl.HaptikSDK$c = r1
            int r0 = r0 % 2
            r0 = r6
        L15:
            if (r0 >= r7) goto L5d
            int r1 = com.sendbird.android.shadow.okhttp3.HttpUrl.invoke     // Catch: java.lang.Exception -> L5b
            int r1 = r1 + 29
            int r2 = r1 % 128
            com.sendbird.android.shadow.okhttp3.HttpUrl.HaptikSDK$c = r2     // Catch: java.lang.Exception -> L59
            int r1 = r1 % 2
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L2e
            char r1 = r5.charAt(r0)
            r4 = 51
            if (r1 == r4) goto L49
            goto L3b
        L2e:
            char r1 = r5.charAt(r0)
            r4 = 37
            if (r1 == r4) goto L38
            r4 = 1
            goto L39
        L38:
            r4 = 0
        L39:
            if (r4 == 0) goto L49
        L3b:
            r4 = 43
            if (r1 != r4) goto L40
            r2 = 1
        L40:
            if (r2 == r3) goto L43
            goto L46
        L43:
            if (r8 == 0) goto L46
            goto L49
        L46:
            int r0 = r0 + 1
            goto L15
        L49:
            com.sendbird.android.shadow.okio.Buffer r1 = new com.sendbird.android.shadow.okio.Buffer
            r1.<init>()
            r1.writeUtf8(r5, r6, r0)     // Catch: java.lang.Exception -> L5b
            percentDecode(r1, r5, r0, r7, r8)     // Catch: java.lang.Exception -> L5b
            java.lang.String r5 = r1.readUtf8()     // Catch: java.lang.Exception -> L5b
            return r5
        L59:
            r5 = move-exception
            throw r5
        L5b:
            r5 = move-exception
            throw r5
        L5d:
            java.lang.String r5 = r5.substring(r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sendbird.android.shadow.okhttp3.HttpUrl.percentDecode(java.lang.String, int, int, boolean):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
        if (r1 < r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
        if ((r1 < r10) != true) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
        r2 = com.sendbird.android.shadow.okhttp3.internal.Util.decodeHexDigit(r8.charAt(r9 + 1));
        r3 = com.sendbird.android.shadow.okhttp3.internal.Util.decodeHexDigit(r8.charAt(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
        if (r2 == (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        r5 = com.sendbird.android.shadow.okhttp3.HttpUrl.HaptikSDK$c + 101;
        com.sendbird.android.shadow.okhttp3.HttpUrl.invoke = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
        if (r3 == (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
        r9 = com.sendbird.android.shadow.okhttp3.HttpUrl.invoke + 99;
        com.sendbird.android.shadow.okhttp3.HttpUrl.HaptikSDK$c = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
        if ((r9 % 2) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
        r7.writeByte((r2 << 2) + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
        r7.writeByte((r2 << 4) + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
        r9 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void percentDecode(com.sendbird.android.shadow.okio.Buffer r7, java.lang.String r8, int r9, int r10, boolean r11) {
        /*
        L0:
            if (r9 >= r10) goto L9e
            int r0 = r8.codePointAt(r9)
            r1 = 37
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L70
            int r1 = com.sendbird.android.shadow.okhttp3.HttpUrl.HaptikSDK$c     // Catch: java.lang.Exception -> L6e
            int r1 = r1 + 25
            int r4 = r1 % 128
            com.sendbird.android.shadow.okhttp3.HttpUrl.invoke = r4     // Catch: java.lang.Exception -> L6e
            int r1 = r1 % 2
            r4 = 91
            if (r1 == 0) goto L1d
            r1 = 91
            goto L1f
        L1d:
            r1 = 40
        L1f:
            if (r1 == r4) goto L26
            int r1 = r9 + 2
            if (r1 >= r10) goto L70
            goto L30
        L26:
            int r1 = r9 + (-5)
            if (r1 >= r10) goto L2c
            r4 = 1
            goto L2d
        L2c:
            r4 = 0
        L2d:
            if (r4 == r3) goto L30
            goto L70
        L30:
            int r2 = r9 + 1
            char r2 = r8.charAt(r2)
            int r2 = com.sendbird.android.shadow.okhttp3.internal.Util.decodeHexDigit(r2)
            char r3 = r8.charAt(r1)
            int r3 = com.sendbird.android.shadow.okhttp3.internal.Util.decodeHexDigit(r3)
            r4 = -1
            if (r2 == r4) goto L8a
            int r5 = com.sendbird.android.shadow.okhttp3.HttpUrl.HaptikSDK$c
            int r5 = r5 + 101
            int r6 = r5 % 128
            com.sendbird.android.shadow.okhttp3.HttpUrl.invoke = r6
            int r5 = r5 % 2
            if (r3 == r4) goto L8a
            int r9 = com.sendbird.android.shadow.okhttp3.HttpUrl.invoke
            int r9 = r9 + 99
            int r4 = r9 % 128
            com.sendbird.android.shadow.okhttp3.HttpUrl.HaptikSDK$c = r4
            int r9 = r9 % 2
            if (r9 != 0) goto L66
            int r9 = r2 << 2
            int r9 = r9 + r3
            r7.writeByte(r9)     // Catch: java.lang.Exception -> L64
            goto L6c
        L64:
            r7 = move-exception
            throw r7
        L66:
            int r9 = r2 << 4
            int r9 = r9 + r3
            r7.writeByte(r9)
        L6c:
            r9 = r1
            goto L8d
        L6e:
            r7 = move-exception
            throw r7
        L70:
            r1 = 43
            if (r0 != r1) goto L75
            goto L76
        L75:
            r2 = 1
        L76:
            if (r2 == 0) goto L79
            goto L8a
        L79:
            r1 = 79
            if (r11 == 0) goto L80
            r2 = 98
            goto L82
        L80:
            r2 = 79
        L82:
            if (r2 == r1) goto L8a
            r1 = 32
            r7.writeByte(r1)
            goto L8d
        L8a:
            r7.writeUtf8CodePoint(r0)
        L8d:
            int r0 = java.lang.Character.charCount(r0)
            int r9 = r9 + r0
            int r0 = com.sendbird.android.shadow.okhttp3.HttpUrl.HaptikSDK$c
            int r0 = r0 + 31
            int r1 = r0 % 128
            com.sendbird.android.shadow.okhttp3.HttpUrl.invoke = r1
            int r0 = r0 % 2
            goto L0
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sendbird.android.shadow.okhttp3.HttpUrl.percentDecode(com.sendbird.android.shadow.okio.Buffer, java.lang.String, int, int, boolean):void");
    }

    static boolean percentEncoded(String str, int i, int i2) {
        int i3 = i + 2;
        if (i3 < i2) {
            int i4 = HaptikSDK$c + 95;
            invoke = i4 % 128;
            int i5 = i4 % 2;
            try {
                if ((str.charAt(i) == '%' ? 'T' : ',') != ',') {
                    try {
                        int i6 = HaptikSDK$c + 31;
                        invoke = i6 % 128;
                        int i7 = i6 % 2;
                        if (!(Util.decodeHexDigit(str.charAt(i + 1)) == -1)) {
                            int i8 = invoke + 55;
                            HaptikSDK$c = i8 % 128;
                            int i9 = i8 % 2;
                            return Util.decodeHexDigit(str.charAt(i3)) != -1;
                        }
                        return false;
                    } catch (Exception e) {
                        throw e;
                    }
                }
                return false;
            } catch (Exception e2) {
                throw e2;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0045, code lost:
        if ((r5 != 99) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004a, code lost:
        if (r5 == 37) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004e, code lost:
        if (r16 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0050, code lost:
        r2 = 'Z';
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0053, code lost:
        r2 = '\t';
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0055, code lost:
        if (r2 == 'Z') goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0058, code lost:
        r1 = com.sendbird.android.shadow.okhttp3.HttpUrl.HaptikSDK$c + 63;
        com.sendbird.android.shadow.okhttp3.HttpUrl.invoke = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0062, code lost:
        if ((r1 % 2) == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0064, code lost:
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0065, code lost:
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0068, code lost:
        if (r17 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x006e, code lost:
        if (r17 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0074, code lost:
        if (percentEncoded(r12, r3, r14) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0077, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0078, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x007b, code lost:
        if (r5 != 43) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x007d, code lost:
        if (r18 == false) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.String canonicalize(java.lang.String r12, int r13, int r14, java.lang.String r15, boolean r16, boolean r17, boolean r18, boolean r19, java.nio.charset.Charset r20) {
        /*
            r0 = r12
            r4 = r14
            r3 = r13
        L3:
            r1 = 0
            r2 = 1
            if (r3 >= r4) goto L9
            r5 = 0
            goto La
        L9:
            r5 = 1
        La:
            if (r5 == 0) goto L14
            java.lang.String r0 = r12.substring(r13, r14)     // Catch: java.lang.Exception -> L11
            return r0
        L11:
            r0 = move-exception
            goto L87
        L14:
            int r5 = r12.codePointAt(r3)
            r6 = 32
            if (r5 < r6) goto L88
            r6 = 127(0x7f, float:1.78E-43)
            if (r5 == r6) goto L22
            r6 = 0
            goto L23
        L22:
            r6 = 1
        L23:
            if (r6 == r2) goto L88
            r6 = 128(0x80, float:1.794E-43)
            if (r5 < r6) goto L2b
            if (r19 != 0) goto L88
        L2b:
            r6 = r15
            int r7 = r15.indexOf(r5)     // Catch: java.lang.Exception -> L11
            r8 = -1
            if (r7 != r8) goto L89
            int r7 = com.sendbird.android.shadow.okhttp3.HttpUrl.invoke
            int r7 = r7 + 93
            int r8 = r7 % 128
            com.sendbird.android.shadow.okhttp3.HttpUrl.HaptikSDK$c = r8
            int r7 = r7 % 2
            if (r7 != 0) goto L48
            r7 = 99
            if (r5 != r7) goto L44
            goto L45
        L44:
            r1 = 1
        L45:
            if (r1 == 0) goto L4c
            goto L79
        L48:
            r1 = 37
            if (r5 != r1) goto L79
        L4c:
            r1 = 90
            if (r16 == 0) goto L53
            r2 = 90
            goto L55
        L53:
            r2 = 9
        L55:
            if (r2 == r1) goto L58
            goto L89
        L58:
            int r1 = com.sendbird.android.shadow.okhttp3.HttpUrl.HaptikSDK$c     // Catch: java.lang.Exception -> L77
            int r1 = r1 + 63
            int r2 = r1 % 128
            com.sendbird.android.shadow.okhttp3.HttpUrl.invoke = r2     // Catch: java.lang.Exception -> L77
            int r1 = r1 % 2
            if (r1 == 0) goto L6e
            r1 = 0
            super.hashCode()     // Catch: java.lang.Throwable -> L6b
            if (r17 == 0) goto L79
            goto L70
        L6b:
            r0 = move-exception
            r1 = r0
            throw r1
        L6e:
            if (r17 == 0) goto L79
        L70:
            boolean r1 = percentEncoded(r12, r3, r14)
            if (r1 == 0) goto L89
            goto L79
        L77:
            r0 = move-exception
            throw r0
        L79:
            r1 = 43
            if (r5 != r1) goto L80
            if (r18 == 0) goto L80
            goto L89
        L80:
            int r1 = java.lang.Character.charCount(r5)
            int r3 = r3 + r1
            goto L3
        L87:
            throw r0
        L88:
            r6 = r15
        L89:
            com.sendbird.android.shadow.okio.Buffer r11 = new com.sendbird.android.shadow.okio.Buffer
            r11.<init>()
            r1 = r13
            r11.writeUtf8(r12, r13, r3)
            r1 = r11
            r2 = r12
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            canonicalize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r0 = r11.readUtf8()
            int r1 = com.sendbird.android.shadow.okhttp3.HttpUrl.invoke
            int r1 = r1 + 31
            int r2 = r1 % 128
            com.sendbird.android.shadow.okhttp3.HttpUrl.HaptikSDK$c = r2
            int r1 = r1 % 2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sendbird.android.shadow.okhttp3.HttpUrl.canonicalize(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (r7 != 71) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        if ((r7 != 10 ? 21 : 25) != 25) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        if (r7 == 12) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
        if (r11 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
        if (r7 != 13) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
        r8 = com.sendbird.android.shadow.okhttp3.HttpUrl.HaptikSDK$c + 15;
        com.sendbird.android.shadow.okhttp3.HttpUrl.invoke = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
        r8 = com.sendbird.android.shadow.okhttp3.HttpUrl.invoke + 115;
        com.sendbird.android.shadow.okhttp3.HttpUrl.HaptikSDK$c = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0091, code lost:
        if ((r20 ? false : true) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0097, code lost:
        if (r20 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0099, code lost:
        r8 = com.sendbird.android.shadow.okhttp3.HttpUrl.HaptikSDK$c + 109;
        com.sendbird.android.shadow.okhttp3.HttpUrl.invoke = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a3, code lost:
        if ((r8 % 2) == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a5, code lost:
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ac, code lost:
        r8 = "+";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00af, code lost:
        r8 = "%2B";
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d3, code lost:
        if ((!r23 ? 0 : 'M') != 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f7, code lost:
        if (percentEncoded(r16, r5, r18) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00fa, code lost:
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void canonicalize(com.sendbird.android.shadow.okio.Buffer r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sendbird.android.shadow.okhttp3.HttpUrl.canonicalize(com.sendbird.android.shadow.okio.Buffer, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String canonicalize(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        String canonicalize;
        int i = invoke + 87;
        HaptikSDK$c = i % 128;
        if (!(i % 2 != 0)) {
            try {
                canonicalize = canonicalize(str, 1, str.length(), str2, z, z2, z3, z4, charset);
            } catch (Exception e) {
                throw e;
            }
        } else {
            canonicalize = canonicalize(str, 0, str.length(), str2, z, z2, z3, z4, charset);
        }
        int i2 = HaptikSDK$c + 17;
        invoke = i2 % 128;
        if ((i2 % 2 != 0 ? 'L' : 'N') != 'L') {
            return canonicalize;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return canonicalize;
    }

    static String canonicalize(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        int length;
        int i;
        int i2 = invoke + 43;
        HaptikSDK$c = i2 % 128;
        if (!(i2 % 2 != 0)) {
            length = str.length();
            i = 1;
        } else {
            length = str.length();
            i = 0;
        }
        String canonicalize = canonicalize(str, i, length, str2, z, z2, z3, z4, null);
        int i3 = invoke + 29;
        HaptikSDK$c = i3 % 128;
        if (i3 % 2 != 0) {
            return canonicalize;
        }
        Object obj = null;
        super.hashCode();
        return canonicalize;
    }

    private static String toString(byte b2, int i, int i2, short s, int i3) {
        String obj;
        synchronized (moveToLast.ah$a) {
            StringBuilder sb = new StringBuilder();
            int i4 = i + ah$a;
            boolean z = i4 == -1;
            if (z) {
                if (valueOf != null) {
                    i4 = (byte) (valueOf[toString + i3] + ah$a);
                } else {
                    i4 = (short) (ag$a[toString + i3] + ah$a);
                }
            }
            if (i4 > 0) {
                moveToLast.values = ((i3 + i4) - 2) + toString + (z ? 1 : 0);
                moveToLast.ag$a = (char) (i2 + values);
                sb.append(moveToLast.ag$a);
                moveToLast.toString = moveToLast.ag$a;
                moveToLast.valueOf = 1;
                while (moveToLast.valueOf < i4) {
                    if (valueOf != null) {
                        byte[] bArr = valueOf;
                        int i5 = moveToLast.values;
                        moveToLast.values = i5 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((byte) (bArr[i5] + s)) ^ b2));
                    } else {
                        short[] sArr = ag$a;
                        int i6 = moveToLast.values;
                        moveToLast.values = i6 - 1;
                        moveToLast.ag$a = (char) (moveToLast.toString + (((short) (sArr[i6] + s)) ^ b2));
                    }
                    sb.append(moveToLast.ag$a);
                    moveToLast.toString = moveToLast.ag$a;
                    moveToLast.valueOf++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
