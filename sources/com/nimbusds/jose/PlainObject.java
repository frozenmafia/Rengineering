package com.nimbusds.jose;

import com.nimbusds.jose.util.Base64URL;
import java.text.ParseException;
/* loaded from: classes7.dex */
public class PlainObject extends JOSEObject {
    private static final long serialVersionUID = 1;
    private final PlainHeader header;

    public PlainObject(Payload payload) {
        if (payload == null) {
            throw new IllegalArgumentException("The payload must not be null");
        }
        setPayload(payload);
        this.header = new PlainHeader();
    }

    public PlainObject(PlainHeader plainHeader, Payload payload) {
        if (plainHeader == null) {
            throw new IllegalArgumentException("The unsecured header must not be null");
        }
        this.header = plainHeader;
        if (payload == null) {
            throw new IllegalArgumentException("The payload must not be null");
        }
        setPayload(payload);
    }

    public PlainObject(Base64URL base64URL, Base64URL base64URL2) throws ParseException {
        if (base64URL == null) {
            throw new IllegalArgumentException("The first part must not be null");
        }
        try {
            this.header = PlainHeader.parse(base64URL);
            if (base64URL2 == null) {
                throw new IllegalArgumentException("The second part must not be null");
            }
            setPayload(new Payload(base64URL2));
            setParsedParts(base64URL, base64URL2, null);
        } catch (ParseException e) {
            throw new ParseException("Invalid unsecured header: " + e.getMessage(), 0);
        }
    }

    @Override // com.nimbusds.jose.JOSEObject
    public PlainHeader getHeader() {
        return this.header;
    }

    @Override // com.nimbusds.jose.JOSEObject
    public String serialize() {
        return this.header.toBase64URL().toString() + '.' + getPayload().toBase64URL().toString() + '.';
    }

    public static PlainObject parse(String str) throws ParseException {
        Base64URL[] split = JOSEObject.split(str);
        if (!split[2].toString().isEmpty()) {
            throw new ParseException("Unexpected third Base64URL part", 0);
        }
        return new PlainObject(split[0], split[1]);
    }
}
