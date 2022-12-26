package com.app.dream11.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.app.dream11.teamselection.teampreivew.PreviewPlayerInfo;
import com.app.dream11Pro.R;
import o.createPopup;
/* loaded from: classes3.dex */
public class TeamPreviewImageView extends AppCompatImageView {
    public TeamPreviewImageView(Context context) {
        super(context);
    }

    public TeamPreviewImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TeamPreviewImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static void values(ImageView imageView, PreviewPlayerInfo previewPlayerInfo) {
        if (previewPlayerInfo != null) {
            if (previewPlayerInfo.isGettyImageAvailable()) {
                createPopup.toString(imageView.getContext(), previewPlayerInfo.getSquadPlayerImage(), imageView, R.drawable.default_1, R.drawable.default_1);
            } else if (previewPlayerInfo.isHomeTeam()) {
                imageView.setImageDrawable(ContextCompat.getDrawable(imageView.getContext(), R.drawable.jersey_1));
            } else {
                imageView.setImageDrawable(ContextCompat.getDrawable(imageView.getContext(), R.drawable.jersey_2));
            }
        }
    }
}
