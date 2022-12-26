package com.google.common.base;

import java.io.Serializable;
import o.applyPendingUpdatesToPosition;
import o.markViewHoldersUpdated;
import o.postponeAndUpdateViewHolders;
import org.apache.commons.codec.language.Soundex;
/* loaded from: classes7.dex */
public enum CaseFormat {
    LOWER_HYPHEN(applyPendingUpdatesToPosition.valueOf((char) Soundex.SILENT_MARKER), "-") { // from class: com.google.common.base.CaseFormat.1
        @Override // com.google.common.base.CaseFormat
        String normalizeWord(String str) {
            return postponeAndUpdateViewHolders.valueOf(str);
        }

        @Override // com.google.common.base.CaseFormat
        String convert(CaseFormat caseFormat, String str) {
            if (caseFormat == LOWER_UNDERSCORE) {
                return str.replace(Soundex.SILENT_MARKER, '_');
            }
            if (caseFormat == UPPER_UNDERSCORE) {
                return postponeAndUpdateViewHolders.ag$a(str.replace(Soundex.SILENT_MARKER, '_'));
            }
            return super.convert(caseFormat, str);
        }
    },
    LOWER_UNDERSCORE(applyPendingUpdatesToPosition.valueOf('_'), "_") { // from class: com.google.common.base.CaseFormat.2
        @Override // com.google.common.base.CaseFormat
        String normalizeWord(String str) {
            return postponeAndUpdateViewHolders.valueOf(str);
        }

        @Override // com.google.common.base.CaseFormat
        String convert(CaseFormat caseFormat, String str) {
            if (caseFormat == LOWER_HYPHEN) {
                return str.replace('_', Soundex.SILENT_MARKER);
            }
            if (caseFormat == UPPER_UNDERSCORE) {
                return postponeAndUpdateViewHolders.ag$a(str);
            }
            return super.convert(caseFormat, str);
        }
    },
    LOWER_CAMEL(applyPendingUpdatesToPosition.ah$a('A', 'Z'), "") { // from class: com.google.common.base.CaseFormat.3
        @Override // com.google.common.base.CaseFormat
        String normalizeWord(String str) {
            return CaseFormat.firstCharOnlyToUpper(str);
        }

        @Override // com.google.common.base.CaseFormat
        String normalizeFirstWord(String str) {
            return postponeAndUpdateViewHolders.valueOf(str);
        }
    },
    UPPER_CAMEL(applyPendingUpdatesToPosition.ah$a('A', 'Z'), "") { // from class: com.google.common.base.CaseFormat.4
        @Override // com.google.common.base.CaseFormat
        String normalizeWord(String str) {
            return CaseFormat.firstCharOnlyToUpper(str);
        }
    },
    UPPER_UNDERSCORE(applyPendingUpdatesToPosition.valueOf('_'), "_") { // from class: com.google.common.base.CaseFormat.5
        @Override // com.google.common.base.CaseFormat
        String normalizeWord(String str) {
            return postponeAndUpdateViewHolders.ag$a(str);
        }

        @Override // com.google.common.base.CaseFormat
        String convert(CaseFormat caseFormat, String str) {
            if (caseFormat == LOWER_HYPHEN) {
                return postponeAndUpdateViewHolders.valueOf(str.replace('_', Soundex.SILENT_MARKER));
            }
            if (caseFormat == LOWER_UNDERSCORE) {
                return postponeAndUpdateViewHolders.valueOf(str);
            }
            return super.convert(caseFormat, str);
        }
    };
    
    private final applyPendingUpdatesToPosition wordBoundary;
    private final String wordSeparator;

    abstract String normalizeWord(String str);

    CaseFormat(applyPendingUpdatesToPosition applypendingupdatestoposition, String str) {
        this.wordBoundary = applypendingupdatestoposition;
        this.wordSeparator = str;
    }

    public final String to(CaseFormat caseFormat, String str) {
        markViewHoldersUpdated.toString(caseFormat);
        markViewHoldersUpdated.toString(str);
        return caseFormat == this ? str : convert(caseFormat, str);
    }

    String convert(CaseFormat caseFormat, String str) {
        StringBuilder sb = null;
        int i = 0;
        int i2 = -1;
        while (true) {
            i2 = this.wordBoundary.toString(str, i2 + 1);
            if (i2 == -1) {
                break;
            }
            if (i == 0) {
                sb = new StringBuilder(str.length() + (caseFormat.wordSeparator.length() * 4));
                sb.append(caseFormat.normalizeFirstWord(str.substring(i, i2)));
            } else {
                sb.getClass();
                sb.append(caseFormat.normalizeWord(str.substring(i, i2)));
            }
            sb.append(caseFormat.wordSeparator);
            i = this.wordSeparator.length() + i2;
        }
        if (i == 0) {
            return caseFormat.normalizeFirstWord(str);
        }
        sb.getClass();
        StringBuilder sb2 = sb;
        sb2.append(caseFormat.normalizeWord(str.substring(i)));
        return sb2.toString();
    }

    public Converter<String, String> converterTo(CaseFormat caseFormat) {
        return new StringConverter(this, caseFormat);
    }

    /* loaded from: classes7.dex */
    static final class StringConverter extends Converter<String, String> implements Serializable {
        private static final long serialVersionUID = 0;
        private final CaseFormat sourceFormat;
        private final CaseFormat targetFormat;

        StringConverter(CaseFormat caseFormat, CaseFormat caseFormat2) {
            this.sourceFormat = (CaseFormat) markViewHoldersUpdated.toString(caseFormat);
            this.targetFormat = (CaseFormat) markViewHoldersUpdated.toString(caseFormat2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public String doForward(String str) {
            return this.sourceFormat.to(this.targetFormat, str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public String doBackward(String str) {
            return this.targetFormat.to(this.sourceFormat, str);
        }

        @Override // com.google.common.base.Converter, o.hasPendingUpdates
        public boolean equals(Object obj) {
            if (obj instanceof StringConverter) {
                StringConverter stringConverter = (StringConverter) obj;
                if (this.sourceFormat.equals(stringConverter.sourceFormat) && this.targetFormat.equals(stringConverter.targetFormat)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.sourceFormat.hashCode() ^ this.targetFormat.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.sourceFormat);
            String valueOf2 = String.valueOf(this.targetFormat);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
            sb.append(valueOf);
            sb.append(".converterTo(");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    String normalizeFirstWord(String str) {
        return normalizeWord(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String firstCharOnlyToUpper(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char postponeandupdateviewholders = postponeAndUpdateViewHolders.toString(str.charAt(0));
        String valueOf = postponeAndUpdateViewHolders.valueOf(str.substring(1));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1);
        sb.append(postponeandupdateviewholders);
        sb.append(valueOf);
        return sb.toString();
    }
}
