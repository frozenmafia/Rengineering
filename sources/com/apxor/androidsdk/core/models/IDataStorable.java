package com.apxor.androidsdk.core.models;

import android.content.ContentValues;
@Deprecated
/* loaded from: classes6.dex */
public interface IDataStorable {
    ContentValues getContentValues();

    String getDBName();

    String getEventType();
}
