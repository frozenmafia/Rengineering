package androidx.autofill.inline.v1;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.autofill.R;
import androidx.autofill.inline.UiVersions;
import androidx.autofill.inline.common.BundledStyle;
import androidx.autofill.inline.common.ImageViewStyle;
import androidx.autofill.inline.common.SlicedContent;
import androidx.autofill.inline.common.TextViewStyle;
import androidx.autofill.inline.common.ViewStyle;
import java.util.Collections;
import java.util.List;
/* loaded from: classes5.dex */
public final class InlineSuggestionUi {
    private static final String TAG = "InlineSuggestionUi";

    public static Content.Builder newContentBuilder(PendingIntent pendingIntent) {
        return new Content.Builder(pendingIntent);
    }

    public static Style.Builder newStyleBuilder() {
        return new Style.Builder();
    }

    public static Content fromSlice(Slice slice) {
        Content content = new Content(slice);
        if (content.isValid()) {
            return content;
        }
        Log.w(TAG, "Invalid content for androidx.autofill.inline.ui.version:v1");
        return null;
    }

    public static Style fromBundle(Bundle bundle) {
        Style style = new Style(bundle);
        if (style.isValid()) {
            return style;
        }
        Log.w(TAG, "Invalid style for androidx.autofill.inline.ui.version:v1");
        return null;
    }

    public static View render(Context context, Content content, Style style) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getDefaultContextThemeWrapper(context)).inflate(R.layout.autofill_inline_suggestion, (ViewGroup) null);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.autofill_inline_suggestion_start_icon);
        TextView textView = (TextView) viewGroup.findViewById(R.id.autofill_inline_suggestion_title);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.autofill_inline_suggestion_subtitle);
        ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.autofill_inline_suggestion_end_icon);
        CharSequence title = content.getTitle();
        if (title != null) {
            textView.setText(title);
            textView.setVisibility(0);
        }
        CharSequence subtitle = content.getSubtitle();
        if (subtitle != null) {
            textView2.setText(subtitle);
            textView2.setVisibility(0);
        }
        Icon startIcon = content.getStartIcon();
        if (startIcon != null) {
            imageView.setImageIcon(startIcon);
            imageView.setVisibility(0);
        }
        Icon endIcon = content.getEndIcon();
        if (endIcon != null) {
            imageView2.setImageIcon(endIcon);
            imageView2.setVisibility(0);
        }
        CharSequence contentDescription = content.getContentDescription();
        if (!TextUtils.isEmpty(contentDescription)) {
            viewGroup.setContentDescription(contentDescription);
        }
        if (style.isValid()) {
            if (content.isSingleIconOnly()) {
                style.applyStyle(viewGroup, imageView);
            } else {
                style.applyStyle(viewGroup, imageView, textView, textView2, imageView2);
            }
        }
        return viewGroup;
    }

    public static PendingIntent getAttributionIntent(Content content) {
        return content.getAttributionIntent();
    }

    private static Context getDefaultContextThemeWrapper(Context context) {
        Resources.Theme newTheme = context.getResources().newTheme();
        newTheme.applyStyle(R.style.Theme_AutofillInlineSuggestion, true);
        return new ContextThemeWrapper(context, newTheme);
    }

    private InlineSuggestionUi() {
    }

    /* loaded from: classes5.dex */
    public static final class Style extends BundledStyle implements UiVersions.Style {
        private static final String KEY_CHIP_STYLE = "chip_style";
        private static final String KEY_END_ICON_STYLE = "end_icon_style";
        private static final String KEY_LAYOUT_DIRECTION = "layout_direction";
        private static final String KEY_SINGLE_ICON_CHIP_ICON_STYLE = "single_icon_chip_icon_style";
        private static final String KEY_SINGLE_ICON_CHIP_STYLE = "single_icon_chip_style";
        private static final String KEY_START_ICON_STYLE = "start_icon_style";
        private static final String KEY_STYLE_V1 = "style_v1";
        private static final String KEY_SUBTITLE_STYLE = "subtitle_style";
        private static final String KEY_TITLE_STYLE = "title_style";

        @Override // androidx.autofill.inline.common.BundledStyle
        public String getStyleKey() {
            return KEY_STYLE_V1;
        }

        @Override // androidx.autofill.inline.UiVersions.Style
        public String getVersion() {
            return UiVersions.INLINE_UI_VERSION_1;
        }

        Style(Bundle bundle) {
            super(bundle);
        }

        public void applyStyle(View view, ImageView imageView) {
            if (isValid()) {
                view.setLayoutDirection(getLayoutDirection());
                if (imageView.getVisibility() != 8) {
                    ImageViewStyle singleIconChipIconStyle = getSingleIconChipIconStyle();
                    if (singleIconChipIconStyle == null) {
                        singleIconChipIconStyle = getStartIconStyle();
                    }
                    if (singleIconChipIconStyle != null) {
                        singleIconChipIconStyle.applyStyleOnImageViewIfValid(imageView);
                    }
                }
                ViewStyle singleIconChipStyle = getSingleIconChipStyle();
                if (singleIconChipStyle == null) {
                    singleIconChipStyle = getChipStyle();
                }
                if (singleIconChipStyle != null) {
                    singleIconChipStyle.applyStyleOnViewIfValid(view);
                }
            }
        }

        public void applyStyle(View view, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2) {
            ImageViewStyle endIconStyle;
            TextViewStyle subtitleStyle;
            TextViewStyle titleStyle;
            ImageViewStyle startIconStyle;
            if (isValid()) {
                view.setLayoutDirection(getLayoutDirection());
                if (imageView.getVisibility() != 8 && (startIconStyle = getStartIconStyle()) != null) {
                    startIconStyle.applyStyleOnImageViewIfValid(imageView);
                }
                if (textView.getVisibility() != 8 && (titleStyle = getTitleStyle()) != null) {
                    titleStyle.applyStyleOnTextViewIfValid(textView);
                }
                if (textView2.getVisibility() != 8 && (subtitleStyle = getSubtitleStyle()) != null) {
                    subtitleStyle.applyStyleOnTextViewIfValid(textView2);
                }
                if (imageView2.getVisibility() != 8 && (endIconStyle = getEndIconStyle()) != null) {
                    endIconStyle.applyStyleOnImageViewIfValid(imageView2);
                }
                ViewStyle chipStyle = getChipStyle();
                if (chipStyle != null) {
                    chipStyle.applyStyleOnViewIfValid(view);
                }
            }
        }

        public int getLayoutDirection() {
            int i = this.mBundle.getInt(KEY_LAYOUT_DIRECTION, 0);
            if (i == 0 || i == 1) {
                return i;
            }
            return 0;
        }

        public ViewStyle getChipStyle() {
            Bundle bundle = this.mBundle.getBundle(KEY_CHIP_STYLE);
            if (bundle == null) {
                return null;
            }
            return new ViewStyle(bundle);
        }

        public TextViewStyle getTitleStyle() {
            Bundle bundle = this.mBundle.getBundle(KEY_TITLE_STYLE);
            if (bundle == null) {
                return null;
            }
            return new TextViewStyle(bundle);
        }

        public TextViewStyle getSubtitleStyle() {
            Bundle bundle = this.mBundle.getBundle(KEY_SUBTITLE_STYLE);
            if (bundle == null) {
                return null;
            }
            return new TextViewStyle(bundle);
        }

        public ImageViewStyle getStartIconStyle() {
            Bundle bundle = this.mBundle.getBundle(KEY_START_ICON_STYLE);
            if (bundle == null) {
                return null;
            }
            return new ImageViewStyle(bundle);
        }

        public ImageViewStyle getEndIconStyle() {
            Bundle bundle = this.mBundle.getBundle(KEY_END_ICON_STYLE);
            if (bundle == null) {
                return null;
            }
            return new ImageViewStyle(bundle);
        }

        public ViewStyle getSingleIconChipStyle() {
            Bundle bundle = this.mBundle.getBundle(KEY_SINGLE_ICON_CHIP_STYLE);
            if (bundle == null) {
                return null;
            }
            return new ViewStyle(bundle);
        }

        public ImageViewStyle getSingleIconChipIconStyle() {
            Bundle bundle = this.mBundle.getBundle(KEY_SINGLE_ICON_CHIP_ICON_STYLE);
            if (bundle == null) {
                return null;
            }
            return new ImageViewStyle(bundle);
        }

        /* loaded from: classes5.dex */
        public static final class Builder extends BundledStyle.Builder<Style> {
            Builder() {
                super(Style.KEY_STYLE_V1);
            }

            public Builder setLayoutDirection(int i) {
                this.mBundle.putInt(Style.KEY_LAYOUT_DIRECTION, i);
                return this;
            }

            public Builder setChipStyle(ViewStyle viewStyle) {
                viewStyle.assertIsValid();
                this.mBundle.putBundle(Style.KEY_CHIP_STYLE, viewStyle.getBundle());
                return this;
            }

            public Builder setTitleStyle(TextViewStyle textViewStyle) {
                textViewStyle.assertIsValid();
                this.mBundle.putBundle(Style.KEY_TITLE_STYLE, textViewStyle.getBundle());
                return this;
            }

            public Builder setSubtitleStyle(TextViewStyle textViewStyle) {
                textViewStyle.assertIsValid();
                this.mBundle.putBundle(Style.KEY_SUBTITLE_STYLE, textViewStyle.getBundle());
                return this;
            }

            public Builder setStartIconStyle(ImageViewStyle imageViewStyle) {
                imageViewStyle.assertIsValid();
                this.mBundle.putBundle(Style.KEY_START_ICON_STYLE, imageViewStyle.getBundle());
                return this;
            }

            public Builder setEndIconStyle(ImageViewStyle imageViewStyle) {
                imageViewStyle.assertIsValid();
                this.mBundle.putBundle(Style.KEY_END_ICON_STYLE, imageViewStyle.getBundle());
                return this;
            }

            public Builder setSingleIconChipStyle(ViewStyle viewStyle) {
                viewStyle.assertIsValid();
                this.mBundle.putBundle(Style.KEY_SINGLE_ICON_CHIP_STYLE, viewStyle.getBundle());
                return this;
            }

            public Builder setSingleIconChipIconStyle(ImageViewStyle imageViewStyle) {
                imageViewStyle.assertIsValid();
                this.mBundle.putBundle(Style.KEY_SINGLE_ICON_CHIP_ICON_STYLE, imageViewStyle.getBundle());
                return this;
            }

            @Override // androidx.autofill.inline.common.BundledStyle.Builder
            public Style build() {
                return new Style(this.mBundle);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class Content extends SlicedContent {
        static final String HINT_INLINE_ATTRIBUTION_INTENT = "inline_attribution";
        static final String HINT_INLINE_CONTENT_DESCRIPTION = "inline_content_description";
        static final String HINT_INLINE_END_ICON = "inline_end_icon";
        static final String HINT_INLINE_START_ICON = "inline_start_icon";
        static final String HINT_INLINE_SUBTITLE = "inline_subtitle";
        static final String HINT_INLINE_TITLE = "inline_title";
        private PendingIntent mAttributionIntent;
        private CharSequence mContentDescription;
        private Icon mEndIcon;
        private Icon mStartIcon;
        private CharSequence mSubtitle;
        private CharSequence mTitle;

        Content(Slice slice) {
            super(slice);
            for (SliceItem sliceItem : slice.getItems()) {
                String itemType = itemType(sliceItem);
                if (itemType != null) {
                    itemType.hashCode();
                    char c = 65535;
                    switch (itemType.hashCode()) {
                        case -1790855426:
                            if (itemType.equals(HINT_INLINE_SUBTITLE)) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1269099888:
                            if (itemType.equals(HINT_INLINE_CONTENT_DESCRIPTION)) {
                                c = 1;
                                break;
                            }
                            break;
                        case -145102948:
                            if (itemType.equals(HINT_INLINE_START_ICON)) {
                                c = 2;
                                break;
                            }
                            break;
                        case 729157938:
                            if (itemType.equals(HINT_INLINE_TITLE)) {
                                c = 3;
                                break;
                            }
                            break;
                        case 1020097497:
                            if (itemType.equals(HINT_INLINE_ATTRIBUTION_INTENT)) {
                                c = 4;
                                break;
                            }
                            break;
                        case 1994860611:
                            if (itemType.equals(HINT_INLINE_END_ICON)) {
                                c = 5;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        this.mSubtitle = sliceItem.getText().toString();
                    } else if (c == 1) {
                        this.mContentDescription = sliceItem.getText();
                    } else if (c == 2) {
                        this.mStartIcon = sliceItem.getIcon();
                    } else if (c == 3) {
                        this.mTitle = sliceItem.getText().toString();
                    } else if (c == 4) {
                        this.mAttributionIntent = sliceItem.getAction();
                    } else if (c == 5) {
                        this.mEndIcon = sliceItem.getIcon();
                    }
                }
            }
        }

        boolean isSingleIconOnly() {
            return this.mStartIcon != null && this.mTitle == null && this.mSubtitle == null && this.mEndIcon == null;
        }

        public CharSequence getTitle() {
            return this.mTitle;
        }

        public CharSequence getSubtitle() {
            return this.mSubtitle;
        }

        public Icon getStartIcon() {
            return this.mStartIcon;
        }

        public Icon getEndIcon() {
            return this.mEndIcon;
        }

        public CharSequence getContentDescription() {
            return this.mContentDescription;
        }

        @Override // androidx.autofill.inline.common.SlicedContent
        public PendingIntent getAttributionIntent() {
            return this.mAttributionIntent;
        }

        @Override // androidx.autofill.inline.common.SlicedContent
        public boolean isValid() {
            return UiVersions.INLINE_UI_VERSION_1.equals(SlicedContent.getVersion(this.mSlice));
        }

        private static String itemType(SliceItem sliceItem) {
            char c;
            String format = sliceItem.getFormat();
            format.hashCode();
            int hashCode = format.hashCode();
            if (hashCode == -1422950858) {
                if (format.equals("action")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode != 3556653) {
                if (hashCode == 100313435 && format.equals("image")) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (format.equals("text")) {
                    c = 1;
                }
                c = 65535;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2 || sliceItem.getIcon() == null) {
                        return null;
                    }
                    if (sliceItem.getHints().contains(HINT_INLINE_START_ICON)) {
                        return HINT_INLINE_START_ICON;
                    }
                    if (sliceItem.getHints().contains(HINT_INLINE_END_ICON)) {
                        return HINT_INLINE_END_ICON;
                    }
                } else if (TextUtils.isEmpty(sliceItem.getText())) {
                    return null;
                } else {
                    if (sliceItem.getHints().contains(HINT_INLINE_TITLE)) {
                        return HINT_INLINE_TITLE;
                    }
                    if (sliceItem.getHints().contains(HINT_INLINE_SUBTITLE)) {
                        return HINT_INLINE_SUBTITLE;
                    }
                    if (sliceItem.getHints().contains(HINT_INLINE_CONTENT_DESCRIPTION)) {
                        return HINT_INLINE_CONTENT_DESCRIPTION;
                    }
                }
            } else if (sliceItem.getAction() != null && sliceItem.getHints().contains(HINT_INLINE_ATTRIBUTION_INTENT)) {
                return HINT_INLINE_ATTRIBUTION_INTENT;
            }
            return null;
        }

        /* loaded from: classes5.dex */
        public static final class Builder extends SlicedContent.Builder<Content> {
            private final PendingIntent mAttributionIntent;
            private CharSequence mContentDescription;
            private Icon mEndIcon;
            private List<String> mHints;
            private Icon mStartIcon;
            private CharSequence mSubtitle;
            private CharSequence mTitle;

            Builder(PendingIntent pendingIntent) {
                super(UiVersions.INLINE_UI_VERSION_1);
                this.mAttributionIntent = pendingIntent;
            }

            public Builder setTitle(CharSequence charSequence) {
                this.mTitle = charSequence;
                return this;
            }

            public Builder setSubtitle(CharSequence charSequence) {
                this.mSubtitle = charSequence;
                return this;
            }

            public Builder setStartIcon(Icon icon) {
                this.mStartIcon = icon;
                return this;
            }

            public Builder setEndIcon(Icon icon) {
                this.mEndIcon = icon;
                return this;
            }

            public Builder setContentDescription(CharSequence charSequence) {
                this.mContentDescription = charSequence;
                return this;
            }

            public Builder setHints(List<String> list) {
                this.mHints = list;
                return this;
            }

            @Override // androidx.autofill.inline.common.SlicedContent.Builder
            public Content build() {
                CharSequence charSequence = this.mTitle;
                if (charSequence == null && this.mStartIcon == null && this.mEndIcon == null && this.mSubtitle == null) {
                    throw new IllegalStateException("Title, subtitle, start icon, end icon are all null. Please set value for at least one of them");
                }
                if (charSequence == null && this.mSubtitle != null) {
                    throw new IllegalStateException("Cannot set the subtitle without setting the title.");
                }
                if (this.mAttributionIntent == null) {
                    throw new IllegalStateException("Attribution intent cannot be null.");
                }
                if (this.mStartIcon != null) {
                    this.mSliceBuilder.addIcon(this.mStartIcon, null, Collections.singletonList(Content.HINT_INLINE_START_ICON));
                }
                if (this.mTitle != null) {
                    this.mSliceBuilder.addText(this.mTitle, null, Collections.singletonList(Content.HINT_INLINE_TITLE));
                }
                if (this.mSubtitle != null) {
                    this.mSliceBuilder.addText(this.mSubtitle, null, Collections.singletonList(Content.HINT_INLINE_SUBTITLE));
                }
                if (this.mEndIcon != null) {
                    this.mSliceBuilder.addIcon(this.mEndIcon, null, Collections.singletonList(Content.HINT_INLINE_END_ICON));
                }
                if (this.mAttributionIntent != null) {
                    this.mSliceBuilder.addAction(this.mAttributionIntent, new Slice.Builder(this.mSliceBuilder).addHints(Collections.singletonList(Content.HINT_INLINE_ATTRIBUTION_INTENT)).build(), null);
                }
                if (this.mContentDescription != null) {
                    this.mSliceBuilder.addText(this.mContentDescription, null, Collections.singletonList(Content.HINT_INLINE_CONTENT_DESCRIPTION));
                }
                if (this.mHints != null) {
                    this.mSliceBuilder.addHints(this.mHints);
                }
                return new Content(this.mSliceBuilder.build());
            }
        }
    }
}
