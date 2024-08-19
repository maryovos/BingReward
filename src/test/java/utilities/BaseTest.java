package utilities;

import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;

import java.io.IOException;

public class BaseTest {

    private static String VALID_USER;
    private static String VALID_PASSWORD;
    private static String INVALID_USER;
    private static String INVALID_PASSWORD;
    private static String USER_A;
    private static String USER_B;
    private static String USER_C;
    private static String USER_D;
    private static String USER_E;
    private static String PSWD_A;
    private static String PSWD_B;
    private static String PSWD_C;
    private static String PSWD_D;
    private static String PSWD_E;

    private static final EnvironmentVariables env = SystemEnvironmentVariables.createEnvironmentVariables();
    private static final String BASE_URL = EnvironmentSpecificConfiguration.from(env).getProperty("webdriver.base.url");
    private static final String LOGIN_PATH = EnvironmentSpecificConfiguration.from(env).getProperty("login.path");

    public static String getBaseUrl() {
        return BASE_URL;
    }

    public static String getLoginPath() {
        return LOGIN_PATH;
    }

    public void initializeProperties() throws IOException {
        loadProperties();
    }

    private void loadProperties() throws IOException {
        PropertiesReader propertiesReader = new PropertiesReader();

        VALID_USER = propertiesReader.getProperty("orange.hrm.live.valid.user");
        VALID_PASSWORD = propertiesReader.getProperty("orange.hrm.live.valid.password");
        INVALID_USER = propertiesReader.getProperty("orange.hrm.live.invalid.user");
        INVALID_PASSWORD = propertiesReader.getProperty("orange.hrm.live.invalid.password");
        USER_A = propertiesReader.getProperty("orange.hrm.live.user.a");
        USER_B = propertiesReader.getProperty("orange.hrm.live.user.b");
        USER_C = propertiesReader.getProperty("orange.hrm.live.user.c");
        USER_D = propertiesReader.getProperty("orange.hrm.live.user.d");
        USER_E = propertiesReader.getProperty("orange.hrm.live.user.e");
        PSWD_A = propertiesReader.getProperty("orange.hrm.live.pswd.a");
        PSWD_B = propertiesReader.getProperty("orange.hrm.live.pswd.b");
        PSWD_C = propertiesReader.getProperty("orange.hrm.live.pswd.c");
        PSWD_D = propertiesReader.getProperty("orange.hrm.live.pswd.d");
        PSWD_E = propertiesReader.getProperty("orange.hrm.live.pswd.e");
    }

    public static String getValidUser() {
        return VALID_USER;
    }

    public static String getValidPassword() {
        return VALID_PASSWORD;
    }

    public static String getInValidUser(){
        return INVALID_USER;
    }

    public static String getInValidPassword(){
        return INVALID_PASSWORD;
    }

    public static String getUserA() {
        return USER_A;
    }

    public static String getUserB() {
        return USER_B;
    }

    public static String getUserC() {
        return USER_C;
    }

    public static String getUserD() {
        return USER_D;
    }

    public static String getUserE() {
        return USER_E;
    }

    public static String getPswdA() {
        return PSWD_A;
    }

    public static String getPswdB() {
        return PSWD_B;
    }

    public static String getPswdC() {
        return PSWD_C;
    }

    public static String getPswdD() {
        return PSWD_D;
    }

    public static String getPswdE() {
        return PSWD_E;
    }
}
