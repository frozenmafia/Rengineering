package com.app.dream11.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.app.dream11Pro.R;
import o.fromJchInFrame;
/* loaded from: classes6.dex */
public class PlayerSelectionHeader extends RelativeLayout {
    fromJchInFrame HaptikSDK$c;
    Context ag$a;
    String ah$a;
    @BindView
    RelativeLayout cr;
    @BindView
    ImageView crArrow;
    @BindView
    CustomTextView credits_txt;
    @BindView
    CustomTextView info_txt;
    @BindView
    ImageView playerArrow;
    @BindView
    CustomTextView player_txt;
    @BindView
    RelativeLayout players;
    @BindView
    ImageView pointArrow;
    @BindView
    RelativeLayout points;
    @BindView
    CustomTextView points_txt;
    @BindView
    RelativeLayout team;
    @BindView
    ImageView teamArrow;
    String toString;
    String valueOf;
    String values;

    public PlayerSelectionHeader(Context context) {
        super(context);
        this.toString = "up";
        this.ah$a = "down";
        this.values = "up";
        this.valueOf = "up";
        valueOf(context);
    }

    public PlayerSelectionHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.toString = "up";
        this.ah$a = "down";
        this.values = "up";
        this.valueOf = "up";
        valueOf(context);
    }

    public void setOnCustomEventListener(fromJchInFrame fromjchinframe) {
        this.HaptikSDK$c = fromjchinframe;
    }

    public PlayerSelectionHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.toString = "up";
        this.ah$a = "down";
        this.values = "up";
        this.valueOf = "up";
        valueOf(context);
    }

    private void valueOf(Context context) {
        LayoutInflater.from(context).inflate(R.layout.res_0x7f0d03db, this);
        ButterKnife.ag$a(this, this);
        this.ag$a = context;
        this.points.setTag(this.toString);
        this.cr.setTag(this.ah$a);
        this.players.setTag(this.values);
        this.team.setTag(this.valueOf);
    }

    public void setDefaultPoint(String str) {
        this.points.setTag(str);
    }

    public void setDefaultCredits(String str) {
        this.cr.setTag(str);
    }

    public void setDefaultValues(String str, String str2) {
        setDefaultPoint(str);
        setDefaultCredits(str2);
        setDefaultImage();
    }

    public void setDefaultImage() {
        if (this.points.getTag().toString().equalsIgnoreCase("down")) {
            this.pointArrow.setImageResource(ah$a("down"));
        } else {
            this.pointArrow.setImageResource(ah$a("up"));
        }
        if (this.cr.getTag().toString().equalsIgnoreCase("down")) {
            this.crArrow.setImageResource(ah$a("down"));
        } else {
            this.crArrow.setImageResource(ah$a("up"));
        }
    }

    @OnClick
    public void points(View view) {
        if (view.getTag() != null) {
            this.pointArrow.setVisibility(0);
            this.crArrow.setVisibility(8);
            this.playerArrow.setVisibility(8);
            this.teamArrow.setVisibility(8);
            this.player_txt.setTextColor(toString(false));
            this.credits_txt.setTextColor(toString(false));
            this.info_txt.setTextColor(toString(false));
            this.points_txt.setTextColor(toString(true));
            if (view.getTag().toString().equalsIgnoreCase("down")) {
                view.setTag("up");
                this.pointArrow.setImageResource(ah$a("up"));
                this.HaptikSDK$c.ah$a(1);
            } else if (view.getTag().toString().equalsIgnoreCase("up")) {
                view.setTag("down");
                this.pointArrow.setImageResource(ah$a("down"));
                this.HaptikSDK$c.ah$a(2);
            }
        }
    }

    @OnClick
    public void players(View view) {
        if (view.getTag() != null) {
            this.playerArrow.setVisibility(0);
            this.pointArrow.setVisibility(8);
            this.crArrow.setVisibility(8);
            this.teamArrow.setVisibility(8);
            this.player_txt.setTextColor(toString(true));
            this.credits_txt.setTextColor(toString(false));
            this.info_txt.setTextColor(toString(false));
            this.points_txt.setTextColor(toString(false));
            if (view.getTag().toString().equalsIgnoreCase("down")) {
                view.setTag("up");
                this.playerArrow.setImageResource(ah$a("up"));
                this.HaptikSDK$c.ah$a(5);
            } else if (view.getTag().toString().equalsIgnoreCase("up")) {
                view.setTag("down");
                this.playerArrow.setImageResource(ah$a("down"));
                this.HaptikSDK$c.ah$a(6);
            }
        }
    }

    @OnClick
    public void team(View view) {
        if (view.getTag() != null) {
            this.teamArrow.setVisibility(0);
            this.pointArrow.setVisibility(8);
            this.crArrow.setVisibility(8);
            this.playerArrow.setVisibility(8);
            this.info_txt.setTextColor(toString(true));
            this.credits_txt.setTextColor(toString(false));
            this.player_txt.setTextColor(toString(false));
            this.points_txt.setTextColor(toString(false));
            if (view.getTag().toString().equalsIgnoreCase("down")) {
                view.setTag("up");
                this.teamArrow.setImageResource(ah$a("up"));
                this.HaptikSDK$c.ah$a(7);
            } else if (view.getTag().toString().equalsIgnoreCase("up")) {
                view.setTag("down");
                this.teamArrow.setImageResource(ah$a("down"));
                this.HaptikSDK$c.ah$a(8);
            }
        }
    }

    @OnClick
    public void credits(View view) {
        if (view.getTag() != null) {
            this.crArrow.setVisibility(0);
            this.pointArrow.setVisibility(8);
            this.playerArrow.setVisibility(8);
            this.teamArrow.setVisibility(8);
            this.player_txt.setTextColor(toString(false));
            this.credits_txt.setTextColor(toString(true));
            this.info_txt.setTextColor(toString(false));
            this.points_txt.setTextColor(toString(false));
            if (view.getTag().toString().equalsIgnoreCase("down")) {
                view.setTag("up");
                this.crArrow.setImageResource(ah$a("up"));
                this.HaptikSDK$c.ah$a(3);
            } else if (view.getTag().toString().equalsIgnoreCase("up")) {
                view.setTag("down");
                this.crArrow.setImageResource(ah$a("down"));
                this.HaptikSDK$c.ah$a(4);
            }
        }
    }

    public int ah$a(String str) {
        return "down".equalsIgnoreCase(str) ? R.drawable.ic_arrow_downward_blue : "up".equalsIgnoreCase(str) ? R.drawable.ic_arrow_upward_blue : R.color.res_0x7f0605ac;
    }

    public int toString(boolean z) {
        if (z) {
            return ContextCompat.getColor(this.ag$a, R.color.res_0x7f0602a0);
        }
        return ContextCompat.getColor(this.ag$a, R.color.res_0x7f06029f);
    }
}
