package bc.rlt.observer.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.prefs.*;
import java.util.stream.Collectors;

public class Settings {
    
    private static final String DEFAULT_SETTINGS_FILE = "default-settings.json";
    private static final String CURRENT_SETTINGS_KEY = "current-settings";
    private final Preferences preferences = Preferences.userNodeForPackage(getClass());
    
    public String readCurrentSettings() throws IOException{
        return preferences.get(CURRENT_SETTINGS_KEY, "");
    }
    
    public void writeCurrentSettings(String settings) throws IOException{
        preferences.put(CURRENT_SETTINGS_KEY, settings);
    }
    
    public String readDefaultSettings() throws IOException{
        return readResourcesTextFile(DEFAULT_SETTINGS_FILE);
    }

    private String readResourcesTextFile(String fileName) throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        try (InputStream is = classLoader.getResourceAsStream(fileName)) {
            if (is == null) {
                throw new FileNotFoundException();
            }
            try (InputStreamReader isr = new InputStreamReader(is);
                    BufferedReader reader = new BufferedReader(isr)) {
                return reader.lines().collect(Collectors.joining(System.lineSeparator()));
            }
        }
    }
}
