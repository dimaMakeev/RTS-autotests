package framework;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lena on 04.07.2014.
 */
public interface Constants {

    final String BASE_URL = "https://223-test.rts-tender.ru/supplier/lk/Accreditation/Request.aspx";
    final int RANDOM_INT = 1000;

    /* Browsers */
    final String CHROME_BROWSER = "chrome";
    final String FIREFOX_BROWSER = "firefox";
    final String IE_BROWSER = "ie";


    final String CHAR_SEPARATOR_ARRAY = ", ";
    final String CHAR_SEPARATOR_DATE = "-";
    final String CHAR_SEPARATOR_STRINGS = "\n";
    final String CHAR_SEPARATOR_WORDS = " ";
    final String CHAR_SEPARATOR_URL_PARAMETERS = ".";

    /* Timeouts */
    final int TIMEOUT_0_SECONDS = 0;
    final int TIMEOUT_1_SECONDS = 1;
    final int TIMEOUT_2_SECONDS = 2;
    final int TIMEOUT_3_SECONDS = 3;
    final int TIMEOUT_4_SECONDS = 4;
    final int TIMEOUT_5_SECONDS = 5;
    final int TIMEOUT_10_SECONDS = 10;
    final int TIMEOUT_15_SECONDS = 15;
    final int TIMEOUT_20_SECONDS = 20;
    final int TIMEOUT_30_SECONDS = 30;
    final int TIMEOUT_60_SECONDS = 60;
    final int TIMEOUT_100_SECONDS = 100;
    final int TIMEOUT_120_SECONDS = 120;
    final int TIMEOUT_200_SECONDS = 200;
    final int TIMEOUT_300_SECONDS = 300;
    final int TIMEOUT_240_SECONDS = 240;
    final int TIMEOUT_1_MINUTES = 60;
    final int TIMEOUT_2_MINUTES = 120;
    final int TIMEOUT_3_MINUTES = 180;
    final int TIMEOUT_4_MINUTES = 240;
    final int TIMEOUT_5_MINUTES = 300;

    /* Tries */
    final int TRY_1_TIMES = 1;
    final int TRY_2_TIMES = 2;
    final int TRY_3_TIMES = 3;
    final int TRY_4_TIMES = 4;
    final int TRY_5_TIMES = 5;
    final int TRY_10_TIMES = 10;
    final int TRY_15_TIMES = 20;
    final int TRY_20_TIMES = 20;
    final int TRY_30_TIMES = 30;
    final int TRY_50_TIMES = 50;
    final int TRY_100_TIMES = 100;
    final int TRY_250_TIMES = 250;
    final int TRY_300_TIMES = 300;

    final int SELENIUM_PAGE_LOAD_TIMEOUT_SECONDS = 120;
    final int SELENIUM_IMPLICIT_WAIT_SECONDS = 120;

    final String FILE_PATH = "//path_to_screenshot";

    final String CAPTCHA = "dK.:gU.QcUXA{;8fZQ9{]VKWwwd:2(Au4{cxKoWH";

    final String ALERT_MSG = "";

    final String pathToCertificateGenerator = "\\CertificateGenerator\\CertificateGeneratorConsole.exe";

    final String pathToFoundingDocs = "\\docs\\1.txt";
    final String pathToHeadDocs = "\\docs\\2.txt";
    final String pathToEgrulDocs = "\\docs\\3.txt";
    final String pathToAccreditationDocs = "\\docs\\4.txt";
    final String pathToProcurationDocs = "\\docs\\5.txt";
    final String pathToDecisionDocs = "\\docs\\6.txt";
    final String pathToUdostoverenieLichnostiDocs = "\\docs\\1.txt";
    final String pathToVipiskaEgripDocs = "\\docs\\2.txt";
    final String pathToPolnomochiaPolzovatelyaDocs = "\\docs\\3.txt";

    Map<String, String> organizationTypeList = new HashMap<String, String>() {{
        put("Юридическое лицо", "Jp");
        put("Индивидуальный предприниматель", "Ip");
        put("Физическое лицо", "Php");
    }};

    final String roleTypeSupplier = "поставщик";
    final String roleTypeCustomer = "заказчик";

    final String jpOrganizationType = "Юридическое лицо";
    final String ipOrganizationType = "Индивидуальный предприниматель";
    final String phpOrganizationType = "Физическое лицо";

}
