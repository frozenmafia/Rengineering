package com.app.dream11.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.app.dream11Pro.R;
/* loaded from: classes6.dex */
public class PlayerInfoView extends RelativeLayout {
    private Context ah$a;
    @BindView
    ImageView info_img;
    @BindView
    ImageView jersey;
    @BindView
    ImageView sleeve;
    @BindView
    CustomTextView title;

    public PlayerInfoView(Context context) {
        super(context);
        this.ah$a = context;
        ag$a(context);
    }

    public PlayerInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ah$a = context;
        ag$a(context);
    }

    public PlayerInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ah$a = context;
        ag$a(context);
    }

    public void ag$a(Context context) {
        this.ah$a = context;
        LayoutInflater.from(context).inflate(R.layout.res_0x7f0d03d7, this);
        ButterKnife.ag$a(this, this);
    }

    public void setTitle(String str) {
        if (str != null) {
            this.title.setText(str);
        }
    }

    public void setTitleColor(int i) {
        this.title.setTextColor(i);
    }

    public void setTxtProperties(String str, int i) {
        if (str != null) {
            setTitle(str);
            setTitleColor(i);
        }
    }

    public void setImage(Bitmap bitmap) {
        this.jersey.setImageBitmap(bitmap);
    }

    public void setSleeveImage(Bitmap bitmap) {
        this.sleeve.setImageBitmap(bitmap);
    }
}
