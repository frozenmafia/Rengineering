package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.sendbird.android.constant.StringSet;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.net.URL;
import o.deliverResult;
import o.onCancelLoad;
/* loaded from: classes6.dex */
public abstract class TokenStreamFactory implements Serializable {
    private static final long serialVersionUID = 2;

    public abstract boolean canHandleBinaryNatively();

    public abstract boolean canParseAsync();

    public abstract boolean canUseSchema(onCancelLoad oncancelload);

    public abstract JsonGenerator createGenerator(DataOutput dataOutput) throws IOException;

    public abstract JsonGenerator createGenerator(DataOutput dataOutput, JsonEncoding jsonEncoding) throws IOException;

    public abstract JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) throws IOException;

    public abstract JsonGenerator createGenerator(OutputStream outputStream) throws IOException;

    public abstract JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException;

    public abstract JsonGenerator createGenerator(Writer writer) throws IOException;

    public abstract JsonParser createNonBlockingByteArrayParser() throws IOException;

    public abstract JsonParser createParser(DataInput dataInput) throws IOException;

    public abstract JsonParser createParser(File file) throws IOException;

    public abstract JsonParser createParser(InputStream inputStream) throws IOException;

    public abstract JsonParser createParser(Reader reader) throws IOException;

    public abstract JsonParser createParser(String str) throws IOException;

    public abstract JsonParser createParser(URL url) throws IOException;

    public abstract JsonParser createParser(byte[] bArr) throws IOException;

    public abstract JsonParser createParser(byte[] bArr, int i, int i2) throws IOException;

    public abstract JsonParser createParser(char[] cArr) throws IOException;

    public abstract JsonParser createParser(char[] cArr, int i, int i2) throws IOException;

    public abstract int getFormatGeneratorFeatures();

    public abstract String getFormatName();

    public abstract int getFormatParserFeatures();

    public abstract Class<? extends Object> getFormatReadFeatureType();

    public abstract Class<? extends Object> getFormatWriteFeatureType();

    public abstract int getGeneratorFeatures();

    public abstract int getParserFeatures();

    public abstract boolean isEnabled(JsonGenerator.Feature feature);

    public abstract boolean isEnabled(JsonParser.Feature feature);

    public abstract boolean requiresPropertyOrdering();

    /* JADX INFO: Access modifiers changed from: protected */
    public OutputStream _createDataOutputWrapper(DataOutput dataOutput) {
        return new deliverResult(dataOutput);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public InputStream _optimizedStreamFromURL(URL url) throws IOException {
        String host;
        if (StringSet.file.equals(url.getProtocol()) && (((host = url.getHost()) == null || host.length() == 0) && url.getPath().indexOf(37) < 0)) {
            return new FileInputStream(url.getPath());
        }
        return url.openStream();
    }
}
