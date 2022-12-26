package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes4.dex */
final class kz implements wz {
    private static final Pattern a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    public static final Long b(InputStream inputStream) throws IOException {
        String readLine = new BufferedReader(new InputStreamReader(inputStream, asu.f704b)).readLine();
        try {
            Matcher matcher = a.matcher(readLine);
            if (!matcher.matches()) {
                throw as.c("Couldn't parse timestamp: " + readLine, null);
            }
            String group = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(group).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j = true != "+".equals(matcher.group(4)) ? -1L : 1L;
                long parseLong = Long.parseLong(matcher.group(5));
                String group2 = matcher.group(7);
                time -= j * (((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60000);
            }
            return Long.valueOf(time);
        } catch (ParseException e) {
            throw as.c(null, e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wz
    public final /* synthetic */ Object a(Uri uri, InputStream inputStream) throws IOException {
        return b(inputStream);
    }
}
