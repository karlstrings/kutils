package net.mcclendo.kutils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public final class IOUtils {

    private IOUtils() {
    }

    public static String toString(
            final InputStream i,
            final Charset charset) {
        try {
            return new String(i.readAllBytes(), charset);
        } catch (final IOException e) {
            throw new UtilsException(e);
        }
    }
}
