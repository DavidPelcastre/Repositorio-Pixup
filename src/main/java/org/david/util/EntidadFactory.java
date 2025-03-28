package org.david.util;

public class EntidadFactory {
    public static <T extends Enum<T>> T getEnumValue(Class<T> enumType, String value) {
        for (T enumValue : enumType.getEnumConstants()) {
            if (enumValue.name().equalsIgnoreCase(value)) {
                return enumValue;
            }
        }
        throw new IllegalArgumentException("Valor no válido para " + enumType.getSimpleName());
    }
}
