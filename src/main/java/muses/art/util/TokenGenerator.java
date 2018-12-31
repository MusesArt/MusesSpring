package muses.art.util;

import java.util.UUID;

public class TokenGenerator {
    public static String getToken() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
