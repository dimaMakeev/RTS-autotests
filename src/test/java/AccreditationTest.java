import commonactions.AccreditationAcceptCommonActions;
import commonactions.AccreditationRequestCommonActions;
import framework.SeleniumTestCase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.AccreditationAcceptPage;
import pageobjects.AccreditationRequestPage;
import framework.CertificateGenerator;
import framework.RetryAnalyzer;

/**
 * Created by Lena on 06.09.2015.
 */
public class AccreditationTest extends SeleniumTestCase {

    @Test(dataProvider = "accreditationData", enabled = true, retryAnalyzer = RetryAnalyzer.class) //
    private void accreditationTest(String testCaseId, String roleType, String organizationTypeValue,
                                          String countryCodeValue, String cityCodeValue,
                                          String phoneNumberValue, String addNumberValue,
                                          String passwordValue, String passPhraseValue, String directorNameValue,
                                          String contactPersonValue, String passportSeriesValue, String passportNumberValue,
                                          String passportIssuedDivisionCodeValue, String whenPassportIssuedValue,
                                          String whomPassportIssued, String regionValue, String districtValue, String cityValue,
                                          String localityValue, String streetValue, String indexValue, String buildingValue,
                                          String okatoValue, String bikValue,String accountValue, String bankNameValue,
                                          String bankAddressValue)
        throws Exception{
        CertificateGenerator certificateGenerator = new CertificateGenerator();
        String currentDateTimeValue = certificateGenerator.generateCurrentDateTime();
        String surnameValue = "Test" + currentDateTimeValue;
        String nameValue = "Test" + currentDateTimeValue;
        String organizationValue = "Testers" + currentDateTimeValue;
        String emailValue = "test" + currentDateTimeValue + "@mailforspam.com";

        AccreditationRequestPage accreditationRequestPage = new AccreditationRequestPage();
        certificateGenerator.generateCertificate(pathToCertificateGenerator, surnameValue, nameValue,
                organizationValue, organizationTypeValue);
        AccreditationRequestCommonActions.selectCertificate(accreditationRequestPage, roleType, surnameValue + " " + nameValue);

        AccreditationRequestCommonActions.fillApplicantPersonalInfo(accreditationRequestPage, surnameValue, nameValue,
                countryCodeValue, cityCodeValue, phoneNumberValue, addNumberValue, emailValue, passwordValue,
                passPhraseValue);
        AccreditationRequestCommonActions.fillApplicantInfo(accreditationRequestPage, roleType, organizationTypeValue,
                directorNameValue, organizationValue, countryCodeValue, cityCodeValue, phoneNumberValue,
                addNumberValue, emailValue, contactPersonValue, passportSeriesValue, passportNumberValue,
                passportIssuedDivisionCodeValue, whenPassportIssuedValue, whomPassportIssued);
        AccreditationRequestCommonActions.fillJAddressInfo(accreditationRequestPage, regionValue, districtValue, cityValue,
                localityValue, streetValue, indexValue, buildingValue, okatoValue);
        AccreditationRequestCommonActions.addDocs(accreditationRequestPage, organizationTypeValue, pathToFoundingDocs,
                pathToHeadDocs, pathToEgrulDocs, pathToAccreditationDocs, pathToProcurationDocs,
                pathToUdostoverenieLichnostiDocs, pathToVipiskaEgripDocs, pathToPolnomochiaPolzovatelyaDocs);
        AccreditationRequestCommonActions.fillBankRequisites(accreditationRequestPage, bikValue, accountValue, bankNameValue,
                bankAddressValue);
        AccreditationRequestCommonActions.checkContractAgreed(accreditationRequestPage);
        AccreditationRequestCommonActions.fillCaptcha(accreditationRequestPage, CAPTCHA);
        AccreditationRequestCommonActions.clickclickAddAccreditationApplication(accreditationRequestPage);

        AccreditationAcceptPage accreditationAcceptPage = new AccreditationAcceptPage();
        AccreditationAcceptCommonActions.waitForAccreditationAcceptPageIsLoaded(accreditationAcceptPage);
        AccreditationAcceptCommonActions.checkOrganizationCardTabInfo(accreditationAcceptPage, organizationTypeValue,
                regionValue, districtValue, cityValue, localityValue, streetValue, indexValue, buildingValue, emailValue,
                directorNameValue, contactPersonValue);
        AccreditationAcceptCommonActions.checkRequisitesTabInfo(accreditationAcceptPage, bikValue, accountValue,
                bankNameValue, bankAddressValue);
        AccreditationAcceptCommonActions.checkApplicantInfoTabInfo(accreditationAcceptPage,
                surnameValue, nameValue, countryCodeValue,cityCodeValue, phoneNumberValue, addNumberValue, emailValue,
                organizationTypeValue, passportSeriesValue, passportNumberValue, passportIssuedDivisionCodeValue,
                whenPassportIssuedValue, whomPassportIssued);

    }

    @DataProvider
    public Object[][] accreditationData(){
        return new Object[][]{
                {"TC_11", "поставщик", "Юридическое лицо", "7", "978", "1111111", "111",
                        "qwe123!@#", "test",
                        "Тест Тест", "Тест Тест", "", "", "", "", "",
                        "Мурманская обл.", "-", "г. Мурманск", "-", "пр-кт. Ленина", "183000", "1", "47401000000",
                        "111111111", "11111111111111111111", "Тестовый банк",
                        "Адрес Тестового банка"},

                {"TC_12", "поставщик", "Индивидуальный предприниматель", "7", "978", "1111111", "111",
                        "qwe123!@#", "test",
                        "Тест Тест", "Тест Тест", "", "", "", "", "",
                        "Мурманская обл.", "-", "г. Мурманск", "-", "пр-кт. Ленина", "183000", "1", "47401000000",
                        "111111111", "11111111111111111111", "Тестовый банк",
                        "Адрес Тестового банка"},

                {"TC_13", "поставщик", "Физическое лицо", "7", "978", "1111111", "111",
                        "qwe123!@#", "test",
                        "Тест Тест", "Тест Тест", "1111", "111111", "900000", "01.01.2001", "Федеральной миграционной службой",
                        "Мурманская обл.", "-", "г. Мурманск", "-", "пр-кт. Ленина", "183000", "1", "47401000000",
                        "111111111", "11111111111111111111", "Тестовый банк",
                        "Адрес Тестового банка"},

                {"TC_14", "заказчик", "Юридическое лицо", "7", "978", "1111111", "111",
                        "qwe123!@#", "test",
                        "Тест Тест", "Тест Тест", "", "", "", "", "",
                        "Мурманская обл.", "-", "г. Мурманск", "-", "пр-кт. Ленина", "183000", "1", "47401000000",
                        "111111111", "11111111111111111111", "Тестовый банк",
                        "Адрес Тестового банка"},

        };
    }

}
