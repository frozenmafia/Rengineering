package com.apxor.androidsdk.plugins.survey.e;
/* loaded from: classes6.dex */
public enum a {
    single_choice,
    multi_choice,
    rating,
    text,
    yes_or_no,
    unknown;

    public static a a(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return unknown;
        }
    }
}
