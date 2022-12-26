package com.app.dream11.chat.gif;

import com.giphy.sdk.core.models.Media;
/* loaded from: classes.dex */
public interface IGifBottomSheetListener {
    void onItemSelect(Media media);

    void onMediaSearch(String str, String str2, String str3, int i);

    void onMediaTypeSelected(String str);
}
