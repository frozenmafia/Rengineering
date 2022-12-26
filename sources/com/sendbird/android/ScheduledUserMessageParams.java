package com.sendbird.android;

import java.util.Locale;
/* loaded from: classes7.dex */
public class ScheduledUserMessageParams extends UserMessageParams {
    private Integer mDay;
    private Integer mHour;
    private Integer mMin;
    private Integer mMonth;
    private String mTimezone;
    private Integer mYear;

    public ScheduledUserMessageParams(String str, int i, int i2, int i3, int i4, int i5, String str2) {
        super(str);
        setSchedule(i, i2, i3, i4, i5, str2);
    }

    public void setSchedule(int i, int i2, int i3, int i4, int i5, String str) {
        this.mYear = Integer.valueOf(i);
        this.mMonth = Integer.valueOf(i2);
        this.mDay = Integer.valueOf(i3);
        this.mHour = Integer.valueOf(i4);
        this.mMin = Integer.valueOf(i5);
        this.mTimezone = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Date getScheduledDateTime() {
        /*
            r4 = this;
            java.lang.Integer r0 = r4.mYear     // Catch: java.lang.Exception -> L53
            if (r0 == 0) goto L57
            java.lang.Integer r0 = r4.mMonth     // Catch: java.lang.Exception -> L53
            if (r0 == 0) goto L57
            java.lang.Integer r0 = r4.mDay     // Catch: java.lang.Exception -> L53
            if (r0 == 0) goto L57
            java.lang.Integer r0 = r4.mHour     // Catch: java.lang.Exception -> L53
            if (r0 == 0) goto L57
            java.lang.Integer r0 = r4.mMin     // Catch: java.lang.Exception -> L53
            if (r0 == 0) goto L57
            java.lang.String r0 = r4.mTimezone     // Catch: java.lang.Exception -> L53
            if (r0 == 0) goto L57
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Exception -> L53
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L53
            r2 = 0
            java.lang.Integer r3 = r4.mYear     // Catch: java.lang.Exception -> L53
            r1[r2] = r3     // Catch: java.lang.Exception -> L53
            r2 = 1
            java.lang.Integer r3 = r4.mMonth     // Catch: java.lang.Exception -> L53
            r1[r2] = r3     // Catch: java.lang.Exception -> L53
            r2 = 2
            java.lang.Integer r3 = r4.mDay     // Catch: java.lang.Exception -> L53
            r1[r2] = r3     // Catch: java.lang.Exception -> L53
            r2 = 3
            java.lang.Integer r3 = r4.mHour     // Catch: java.lang.Exception -> L53
            r1[r2] = r3     // Catch: java.lang.Exception -> L53
            r2 = 4
            java.lang.Integer r3 = r4.mMin     // Catch: java.lang.Exception -> L53
            r1[r2] = r3     // Catch: java.lang.Exception -> L53
            java.lang.String r2 = "%04d-%02d-%02d %02d:%02d"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)     // Catch: java.lang.Exception -> L53
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L53
            java.lang.String r2 = "yyyy-MM-dd HH:mm"
            java.util.Locale r3 = java.util.Locale.US     // Catch: java.lang.Exception -> L53
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L53
            java.lang.String r2 = r4.mTimezone     // Catch: java.lang.Exception -> L53
            java.util.TimeZone r2 = java.util.TimeZone.getTimeZone(r2)     // Catch: java.lang.Exception -> L53
            r1.setTimeZone(r2)     // Catch: java.lang.Exception -> L53
            java.util.Date r0 = r1.parse(r0)     // Catch: java.lang.Exception -> L53
            goto L58
        L53:
            r0 = move-exception
            r0.printStackTrace()
        L57:
            r0 = 0
        L58:
            if (r0 != 0) goto L5f
            java.util.Date r0 = new java.util.Date
            r0.<init>()
        L5f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sendbird.android.ScheduledUserMessageParams.getScheduledDateTime():java.util.Date");
    }

    public String getScheduledTimezone() {
        String str = this.mTimezone;
        return str != null ? str : "UTC";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getScheduledString() {
        if (this.mYear == null || this.mMonth == null || this.mDay == null || this.mHour == null || this.mMin == null || this.mTimezone == null) {
            return null;
        }
        return String.format(Locale.US, "%04d-%02d-%02d %02d:%02d %s", this.mYear, this.mMonth, this.mDay, this.mHour, this.mMin, this.mTimezone);
    }

    @Override // com.sendbird.android.UserMessageParams, com.sendbird.android.BaseMessageParams
    public String toString() {
        return "ScheduledUserMessageParams{mYear=" + this.mYear + ", mMonth=" + this.mMonth + ", mDay=" + this.mDay + ", mHour=" + this.mHour + ", mMin=" + this.mMin + ", mTimezone='" + this.mTimezone + "', mMessage='" + this.mMessage + "', mTargetLanguages=" + this.mTargetLanguages + ", mData='" + this.mData + "', mCustomType='" + this.mCustomType + "', mMentionType=" + this.mMentionType + ", mMentionedUserIds=" + this.mMentionedUserIds + ", mPushNotificationDeliveryOption=" + this.mPushNotificationDeliveryOption + ", mMetaArrays=" + this.mMetaArrays + '}';
    }
}
