package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
/* loaded from: classes4.dex */
public final class ams {
    private String a = "googleads.g.doubleclick.net";

    /* renamed from: b  reason: collision with root package name */
    private String f642b = "/pagead/ads";
    private final String c = "ad.doubleclick.net";
    private String[] d = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private final amk e;

    @Deprecated
    public ams(amk amkVar) {
        this.e = amkVar;
    }

    private final Uri h(Uri uri, String str) throws amt {
        uri.getClass();
        try {
            try {
                if (uri.getHost().equals(this.c)) {
                    if (!uri.toString().contains("dc_ms=")) {
                        String uri2 = uri.toString();
                        int indexOf = uri2.indexOf(";adurl");
                        if (indexOf != -1) {
                            int i = indexOf + 1;
                            return Uri.parse(uri2.substring(0, i) + "dc_ms=" + str + ";" + uri2.substring(i));
                        }
                        String encodedPath = uri.getEncodedPath();
                        int indexOf2 = uri2.indexOf(encodedPath);
                        return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
                    }
                    throw new amt("Parameter already exists: dc_ms");
                }
            } catch (UnsupportedOperationException unused) {
                throw new amt("Provided Uri is not in a valid state");
            }
        } catch (NullPointerException unused2) {
        }
        if (uri.getQueryParameter("ms") == null) {
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 != -1) {
                int i2 = indexOf3 + 1;
                return Uri.parse(uri3.substring(0, i2) + "ms=" + str + "&" + uri3.substring(i2));
            }
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        throw new amt("Query parameter already exists: ms");
    }

    @Deprecated
    public final Uri a(Uri uri, Context context) throws amt {
        return h(uri, this.e.f(context));
    }

    @Deprecated
    public final void b(MotionEvent motionEvent) {
        this.e.k(motionEvent);
    }

    public final void c(String str, String str2) {
        this.a = str;
        this.f642b = str2;
    }

    public final void d(String str) {
        this.d = str.split(",");
    }

    public final boolean e(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            for (String str : this.d) {
                if (host.endsWith(str)) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public final boolean f(Uri uri) {
        uri.getClass();
        try {
            if (uri.getHost().equals(this.a)) {
                return uri.getPath().equals(this.f642b);
            }
            return false;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    @Deprecated
    public final Uri g(Uri uri, Context context) throws amt {
        try {
            return h(uri, this.e.e(context, uri.getQueryParameter("ai"), null, null));
        } catch (UnsupportedOperationException unused) {
            throw new amt("Provided Uri is not in a valid state");
        }
    }
}
