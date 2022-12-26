package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.Pair;
import java.util.Collection;
import o.addPreferencesFromResource;
/* loaded from: classes7.dex */
public interface DateSelector<S> extends Parcelable {
    Collection<Long> ag$a();

    int ah$a(Context context);

    View ah$a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, addPreferencesFromResource<S> addpreferencesfromresource);

    Collection<Pair<Long, Long>> ah$a();

    void ah$a(long j);

    S valueOf();

    String values(Context context);

    boolean values();
}
