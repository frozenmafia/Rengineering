package com.app.dream11.contest;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import com.app.dream11.model.FlowState;
import com.app.dream11.utils.FlowStates;
import o.isFirst;
import o.runAnimators;
import org.apache.http.message.TokenParser;
/* loaded from: classes.dex */
public final class SelectionDetailsFlowState extends FlowState {
    private static char ah$a = 3;
    private static int toString = 0;
    private static char[] valueOf = {13807, 13823, 13800, 13808, 13810, 13813, 13801, 13809, 13817};
    private static int values = 1;
    private final String callFrom;
    private final FilterData filterData;
    private final int roundId;
    private final Integer sectionId;
    private final ContestSectionDetailsSortType sortType;
    private final String source;
    private final int tourId;

    public final String getCallFrom() {
        try {
            int i = values + 41;
            toString = i % 128;
            if (i % 2 == 0) {
                return this.callFrom;
            }
            int i2 = 52 / 0;
            return this.callFrom;
        } catch (Exception e) {
            throw e;
        }
    }

    public final int getRoundId() {
        try {
            int i = values + 5;
            toString = i % 128;
            if ((i % 2 != 0 ? '&' : '=') != '=') {
                int i2 = 41 / 0;
                return this.roundId;
            }
            try {
                return this.roundId;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final int getTourId() {
        int i = toString + 41;
        values = i % 128;
        int i2 = i % 2;
        int i3 = this.tourId;
        int i4 = toString + 91;
        values = i4 % 128;
        if ((i4 % 2 == 0 ? '\t' : 'Z') != 'Z') {
            int i5 = 94 / 0;
            return i3;
        }
        return i3;
    }

    public final FilterData getFilterData() {
        int i = values + 1;
        toString = i % 128;
        int i2 = i % 2;
        FilterData filterData = this.filterData;
        int i3 = values + 73;
        toString = i3 % 128;
        int i4 = i3 % 2;
        return filterData;
    }

    public final Integer getSectionId() {
        Integer num;
        int i = toString + 95;
        values = i % 128;
        try {
            if (i % 2 == 0) {
                num = this.sectionId;
                Object[] objArr = null;
                int length = objArr.length;
            } else {
                num = this.sectionId;
            }
            int i2 = values + 81;
            toString = i2 % 128;
            if ((i2 % 2 != 0 ? 'Y' : (char) 11) != 'Y') {
                return num;
            }
            int i3 = 76 / 0;
            return num;
        } catch (Exception e) {
            throw e;
        }
    }

    public final ContestSectionDetailsSortType getSortType() {
        int i = values + 121;
        toString = i % 128;
        if (i % 2 == 0) {
            return this.sortType;
        }
        try {
            ContestSectionDetailsSortType contestSectionDetailsSortType = this.sortType;
            Object obj = null;
            super.hashCode();
            return contestSectionDetailsSortType;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ SelectionDetailsFlowState(java.lang.String r18, int r19, int r20, java.lang.String r21, java.lang.Integer r22, com.app.dream11.contest.FilterData r23, com.app.dream11.contest.ContestSectionDetailsSortType r24, java.lang.Integer r25, java.lang.Boolean r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, int r31, o.getTargetTypes r32) {
        /*
            Method dump skipped, instructions count: 174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.dream11.contest.SelectionDetailsFlowState.<init>(java.lang.String, int, int, java.lang.String, java.lang.Integer, com.app.dream11.contest.FilterData, com.app.dream11.contest.ContestSectionDetailsSortType, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, o.getTargetTypes):void");
    }

    public final String getSource() {
        String str;
        int i = values + 3;
        toString = i % 128;
        Object[] objArr = null;
        if ((i % 2 != 0 ? (char) 5 : 'Q') != 'Q') {
            try {
                str = this.source;
                int length = objArr.length;
            } catch (Exception e) {
                throw e;
            }
        } else {
            str = this.source;
        }
        int i2 = toString + 123;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        super.hashCode();
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionDetailsFlowState(String str, int i, int i2, String str2, Integer num, FilterData filterData, ContestSectionDetailsSortType contestSectionDetailsSortType, Integer num2, Boolean bool, String str3, String str4, String str5, String str6) {
        super(FlowStates.SECTION_DETAILS, null, str2);
        runAnimators.ag$a(str, "callFrom");
        runAnimators.ag$a(str2, FlowState.WLS_SLUG);
        runAnimators.ag$a(str3, valueOf((byte) (69 - (KeyEvent.getMaxKeyCode() >> 16)), new char[]{'\b', 3, 1, 0, 7, 2}, 6 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
        runAnimators.ag$a(str4, "previousScreenName");
        runAnimators.ag$a(str5, HeadToHeadMatchPickerFlowState.MATCH_NAME);
        runAnimators.ag$a(str6, "roundStartTime");
        this.callFrom = str;
        this.tourId = i;
        this.roundId = i2;
        this.sectionId = num;
        this.filterData = filterData;
        this.sortType = contestSectionDetailsSortType;
        this.source = str3;
        putExtra("callFrom", str);
        putExtra("tourId", Integer.valueOf(i));
        putExtra("tourID", Integer.valueOf(i));
        putExtra("roundID", Integer.valueOf(i2));
        putExtra(valueOf((byte) (Color.red(0) + 69), new char[]{'\b', 3, 1, 0, 7, 2}, 6 - TextUtils.getOffsetAfter("", 0)).intern(), str3);
        putExtra("previousScreenName", str4);
        putExtra(HeadToHeadMatchPickerFlowState.MATCH_NAME, str5);
        putExtra("roundStartTime", str6);
        if (num != null) {
            putExtra("sectionId", num);
        }
        if (filterData != null) {
            int i3 = toString + 31;
            values = i3 % 128;
            if ((i3 % 2 == 0 ? TokenParser.ESCAPE : (char) 6) != 6) {
                putExtra("contestFilters", filterData);
                int i4 = 39 / 0;
            } else {
                putExtra("contestFilters", filterData);
            }
        }
        if (contestSectionDetailsSortType != null) {
            putExtra("sortType", contestSectionDetailsSortType);
        }
        if ((num2 != null ? (char) 26 : '5') == 26) {
            putExtra("proxy_sec_id", num2);
            int i5 = toString + 79;
            values = i5 % 128;
            int i6 = i5 % 2;
        }
        putExtra("isLiveMatchAvailable", bool);
        int i7 = values + 21;
        toString = i7 % 128;
        int i8 = i7 % 2;
    }

    private static String valueOf(byte b2, char[] cArr, int i) {
        int i2;
        String str;
        synchronized (isFirst.HaptikSDK$b) {
            char[] cArr2 = valueOf;
            char c = ah$a;
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
