package com.clevertap.android.sdk.inapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import o.setCollectionItemInfo;
import o.setCollectionItemInfo$ah$a;
/* loaded from: classes4.dex */
public class CTInAppHtmlHeaderFragment extends CTInAppBasePartialHtmlFragment {
    @Override // com.clevertap.android.sdk.inapp.CTInAppBasePartialHtmlFragment
    ViewGroup values(View view) {
        return (ViewGroup) view.findViewById(setCollectionItemInfo.toString.inapp_html_header_frame_layout);
    }

    @Override // com.clevertap.android.sdk.inapp.CTInAppBasePartialHtmlFragment
    View values(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(setCollectionItemInfo$ah$a.inapp_html_header, viewGroup, false);
    }
}
