package com.clevertap.android.sdk.inapp;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.Button;
/* loaded from: classes4.dex */
public abstract class CTInAppBaseFullNativeFragment extends CTInAppBaseFullFragment {
    int invoke() {
        WindowManager windowManager = (WindowManager) this.valueOf.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return this.valueOf.getResources().getConfiguration().densityDpi;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a(Button button, CTInAppNotificationButton cTInAppNotificationButton, int i) {
        ShapeDrawable shapeDrawable;
        if (cTInAppNotificationButton != null) {
            button.setVisibility(0);
            button.setTag(Integer.valueOf(i));
            button.setText(cTInAppNotificationButton.HaptikSDK$c());
            button.setTextColor(Color.parseColor(cTInAppNotificationButton.ah$b()));
            button.setOnClickListener(new CTInAppBaseFragment$ah$a(this));
            ShapeDrawable shapeDrawable2 = null;
            if (cTInAppNotificationButton.valueOf().isEmpty()) {
                shapeDrawable = null;
            } else {
                float parseFloat = Float.parseFloat(cTInAppNotificationButton.valueOf()) * (480.0f / invoke()) * 2.0f;
                shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{parseFloat, parseFloat, parseFloat, parseFloat, parseFloat, parseFloat, parseFloat, parseFloat}, null, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}));
                shapeDrawable.getPaint().setColor(Color.parseColor(cTInAppNotificationButton.ah$a()));
                shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
                shapeDrawable.getPaint().setAntiAlias(true);
                shapeDrawable2 = new ShapeDrawable(new RoundRectShape(new float[]{parseFloat, parseFloat, parseFloat, parseFloat, parseFloat, parseFloat, parseFloat, parseFloat}, null, new float[]{parseFloat, parseFloat, parseFloat, parseFloat, parseFloat, parseFloat, parseFloat, parseFloat}));
            }
            if (!cTInAppNotificationButton.ag$a().isEmpty() && shapeDrawable2 != null) {
                shapeDrawable2.getPaint().setColor(Color.parseColor(cTInAppNotificationButton.ag$a()));
                shapeDrawable2.setPadding(1, 1, 1, 1);
                shapeDrawable2.getPaint().setStyle(Paint.Style.FILL);
            }
            if (shapeDrawable != null) {
                button.setBackground(new LayerDrawable(new Drawable[]{shapeDrawable2, shapeDrawable}));
                return;
            }
            return;
        }
        button.setVisibility(8);
    }
}
