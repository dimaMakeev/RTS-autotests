package pageobjects;

import framework.Constants;
import framework.WebDriverCommands;
import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by Lena on 06.09.2015.
 */
public class AccreditationAcceptPage extends WebDriverCommands {

    private final String ACCREDITATION_ACCEPT_STATUS = "//span[@id='BaseMainContent_MainContent_lblRequestStatus' and text()='Подана']";
    private final String ORGANIZATION_CARD_TAB = "ui-id-1";
    private final String ORGANIZATION_TYPE_VALUE = "BaseMainContent_MainContent_lblOrganizationType";
    private final String INN_VALUE = "BaseMainContent_MainContent_lblInn";
    private final String KPP_VALUE = "BaseMainContent_MainContent_lblKpp";
    private final String OGRN_VALUE = "BaseMainContent_MainContent_lblOgrn";
    private final String ADDRESS_VALUE = "BaseMainContent_MainContent_lblPostAddress";
    private final String PHP_ADDRESS_VALUE = "BaseMainContent_MainContent_lblResidenceAddress";
    private final String EMAIL_VALUE = "BaseMainContent_MainContent_lblNotificationEmail";
    private final String DIRECTOR_NAME_VALUE = "BaseMainContent_MainContent_lblDirectorName";
    private final String CONTACT_PERSON_VALUE = "BaseMainContent_MainContent_lblContactPerson";

    private final String REQUISITES_TAB = "ui-id-2";
    private final String BIK_VALUE= "BaseMainContent_MainContent_lblBik";
    private final String CHECKING_ACCOUNT_VALUE = "BaseMainContent_MainContent_lblSettlementAccount";
    private final String BANK_NAME_VALUE = "BaseMainContent_MainContent_lblBankName";
    private final String BANK_ADDRESS_VALUE = "BaseMainContent_MainContent_lblBankAddress";

    private final String APPLICANT_INFO_TAB = "ui-id-5";
    private final String APPLICANT_LAST_NAME_VALUE = "BaseMainContent_MainContent_lblLastName";
    private final String APPLICANT_FIRST_NAME_VALUE = "BaseMainContent_MainContent_lblFirstName";
    private final String APPLICANT_PHONE_NUMBER_VALUE = "BaseMainContent_MainContent_lblContactPhone";
    private final String APPLICANT_EMAIL_VALUE = "BaseMainContent_MainContent_lblContactEmail";
    private final String APPLICANT_PASSPORT_SERIES_VALUE = "BaseMainContent_MainContent_lblPassportSeries";
    private final String APPLICANT_PASSPORT_NUMBER_VALUE = "BaseMainContent_MainContent_lblPassportNumber";
    private final String APPLICANT_PASSPORT_ISSUED_DIVISION_CODE = "BaseMainContent_MainContent_lblPassportIssuedDivisionCode";
    private final String APPLICANT_PASSPORT_ISSUED_DATE = "BaseMainContent_MainContent_lblPassportIssuedDate";
    private final String APPLICANT_PASSPORT_ISSUED_BY = "BaseMainContent_MainContent_lblPassportIssuedBy";

    public AccreditationAcceptPage waitForAccreditationStatusSubmitted(){
        By byAccreditationAcceptStatus = By.xpath(ACCREDITATION_ACCEPT_STATUS);
        waitForElementDisplayed(byAccreditationAcceptStatus, Constants.TIMEOUT_20_SECONDS);

        return this;
    }


    //Check Organization tab info
    public AccreditationAcceptPage clickOrganizationCardTab() throws Exception{
        By byOrganizationCardTab = By.id(ORGANIZATION_CARD_TAB);
        waitForElementPresent(byOrganizationCardTab, Constants.TIMEOUT_2_SECONDS);
        click(byOrganizationCardTab);

        return this;
    }

    public AccreditationAcceptPage checkOrganizationTypeValue(String organizationTypeValue) throws Exception{
        By byOrganizationTypeValue = By.id(ORGANIZATION_TYPE_VALUE);
        Assert.assertTrue(findElement(byOrganizationTypeValue).getText().equals(organizationTypeValue),
                "Organization type value doesn't match to application one");

        return this;
    }

    public AccreditationAcceptPage checkAddressValue(String organizationTypeValue, String indexValue, String regionValue, String districtValue, String cityValue,
                                                      String localityValue, String streetValue, String buildingValue)
            throws Exception{
        By byAddressValue;
        if(organizationTypeValue.equals(Constants.phpOrganizationType))
            byAddressValue = By.id(PHP_ADDRESS_VALUE);
        else
            byAddressValue = By.id(ADDRESS_VALUE);
        Assert.assertTrue(findElement(byAddressValue).getText().contains(indexValue),
                "Индекс не соответствует данным, введенным при заполнении заявки на аккредитацию");
        Assert.assertTrue(findElement(byAddressValue).getText().contains(regionValue),
                "Регион не соответствует данным, введенным при заполнении заявки на аккредитацию");
        if(!districtValue.equals("-"))
            Assert.assertTrue(findElement(byAddressValue).getText().contains(districtValue),
                    "Район не соответствует данным, введенным при заполнении заявки на аккредитацию");
        if(!cityValue.equals("-"))
            Assert.assertTrue(findElement(byAddressValue).getText().contains(cityValue),
                    "Город не соответствует данным, введенным при заполнении заявки на аккредитацию");
        if(!localityValue.equals("-"))
            Assert.assertTrue(findElement(byAddressValue).getText().contains(localityValue),
                    "Район не соответствует данным, введенным при заполнении заявки на аккредитацию");
        Assert.assertTrue(findElement(byAddressValue).getText().contains(streetValue),
                "Улица не соответствует данным, введенным при заполнении заявки на аккредитацию");
        Assert.assertTrue(findElement(byAddressValue).getText().contains(buildingValue),
                "Номер дома не соответствует данным, введенным при заполнении заявки на аккредитацию");

        return this;
    }

    public AccreditationAcceptPage checkEmailValue(String emailValue) throws Exception{
        By byEmailValue = By.id(EMAIL_VALUE);
        Assert.assertTrue(findElement(byEmailValue).getText().equals(emailValue),
                "Электронная почта не соответствует данным, введенным при заполнении заявки на аккредитацию");

        return this;
    }

    public AccreditationAcceptPage checkDirectorNameValue(String directorNameValue) throws Exception{
        By byDirectorNameValue = By.id(DIRECTOR_NAME_VALUE);
        Assert.assertTrue(findElement(byDirectorNameValue).getText().equals(directorNameValue),
                "Имя директора не соответствует данным, введенным при заполнении заявки на аккредитацию");

        return this;
    }

    public AccreditationAcceptPage checkContactPersonValue(String contactPersonValue) throws Exception{
        By byContactPersonValue = By.id(CONTACT_PERSON_VALUE);
        Assert.assertTrue(findElement(byContactPersonValue).getText().equals(contactPersonValue),
                "Контактное лицо не соответствует данным, введенным при заполнении заявки на аккредитацию");

        return this;
    }

    //CheckRequisites tab info
    public AccreditationAcceptPage clickRequisitesTab() throws Exception{
        By byRequisitesTab = By.id(REQUISITES_TAB);
        waitForElementPresent(byRequisitesTab, Constants.TIMEOUT_2_SECONDS);
        click(byRequisitesTab);

        return this;
    }

    public AccreditationAcceptPage checkBikValue(String bikValue) throws Exception{
        By byBikValue = By.id(BIK_VALUE);
        Assert.assertTrue(findElement(byBikValue).getText().equals(bikValue),
                "БИК не соответствует данным, введенным при заполнении заявки на аккредитацию");

        return this;
    }

    public AccreditationAcceptPage checkCheckingAccountValue(String checkingAccountValue) throws Exception{
        By byCheckingAccountValue = By.id(CHECKING_ACCOUNT_VALUE);
        Assert.assertTrue(findElement(byCheckingAccountValue).getText().equals(checkingAccountValue),
                "Расчетный счет не соответствует данным, введенным при заполнении заявки на аккредитацию");
        return this;

    }

    public AccreditationAcceptPage checkBankNameValue(String bankNameValue) throws Exception{
        By byBankNameValue = By.id(BANK_NAME_VALUE);
        Assert.assertTrue(findElement(byBankNameValue).getText().equals(bankNameValue),
                "Название банка не соответствует данным, введенным при заполнении заявки на аккредитацию");

        return this;
    }

    public AccreditationAcceptPage checkBankAddressValue(String bankAddressValue) throws Exception{
        By byBankAddressValue = By.id(BANK_ADDRESS_VALUE);
        Assert.assertTrue(findElement(byBankAddressValue).getText().equals(bankAddressValue),
                "Адрес банка не соответствует данным, введенным при заполнении заявки на аккредитацию");

        return this;
    }

    //Check Applicant info tab
    public AccreditationAcceptPage clickApplicantInfoTab() throws Exception{
        By byApplicantInfoTab = By.id(APPLICANT_INFO_TAB);
        waitForElementPresent(byApplicantInfoTab, Constants.TIMEOUT_2_SECONDS);
        click(byApplicantInfoTab);

        return this;
    }

    public AccreditationAcceptPage checkLastNameValue(String lastNameValue) throws Exception{
        By byLastNameValue = By.id(APPLICANT_LAST_NAME_VALUE);
        Assert.assertTrue(findElement(byLastNameValue).getText().equals(lastNameValue),
                "Фамилия не соответствует данным, введенным при заполнении заявки на аккредитацию");

        return this;
    }

    public AccreditationAcceptPage checkFirstNameValue(String firstNameValue) throws Exception{
        By byFirstNameValue = By.id(APPLICANT_FIRST_NAME_VALUE);
        Assert.assertTrue(findElement(byFirstNameValue).getText().equals(firstNameValue),
                "Имя не соответствует данным, введенным при заполнении заявки на аккредитацию");

        return this;
    }

    public AccreditationAcceptPage checkPhoneNumberValue(String countryCodeValue, String cityCodeValue, String phoneValue,
                                                          String addPhoneValue) throws Exception{
        By byPhoneNumberValue = By.id(APPLICANT_PHONE_NUMBER_VALUE);
        String phoneNumberValue = "+" + countryCodeValue + "(" + cityCodeValue + ")" + phoneValue + "(" + addPhoneValue + ")";
        Assert.assertTrue(findElement(byPhoneNumberValue).getText().equals(phoneNumberValue),
                "Телефон не соответствует данным, введенным при заполнении заявки на аккредитацию");

        return this;
    }

    public AccreditationAcceptPage checkApplicantEmailValue (String applicantEmailValue) throws Exception{
        By byApplicantEmailValue = By.id(APPLICANT_EMAIL_VALUE);
        Assert.assertTrue(findElement(byApplicantEmailValue).getText().equals(applicantEmailValue),
                "Электронная почта не соответствует данным, введенным при заполнении заявки на аккредитацию");

        return this;
    }

    public AccreditationAcceptPage checkApplicantPassportSeriesValue (String applicantPassportSeriesValue)
            throws Exception{
        By byApplicantPassportSeriesValue = By.id(APPLICANT_PASSPORT_SERIES_VALUE);
        Assert.assertTrue(findElement(byApplicantPassportSeriesValue).getText().equals(applicantPassportSeriesValue),
                "Серия паспорта не соответствует данным, введенным при заполнении заявки на аккредитацию");

        return this;
    }

    public AccreditationAcceptPage checkApplicantPassportNumberValue (String applicantPassportNumberValue)
            throws Exception{
        By byApplicantPassportNumberValue = By.id(APPLICANT_PASSPORT_NUMBER_VALUE);
        Assert.assertTrue(findElement(byApplicantPassportNumberValue).getText().equals(applicantPassportNumberValue),
                "Номер паспорта не соответствует данным, введенным при заполнении заявки на аккредитацию");

        return this;
    }

    public AccreditationAcceptPage checkApplicantPassportIssuedDivisionCodeValue (String applicantPassportIssuedDivisionCodeValue)
            throws Exception{
        By byApplicantPassportIssuedDivisionCodeValue = By.id(APPLICANT_PASSPORT_ISSUED_DIVISION_CODE);
        Assert.assertTrue(findElement(byApplicantPassportIssuedDivisionCodeValue).getText().equals(applicantPassportIssuedDivisionCodeValue),
                "Код подразделения не соответствует данным, введенным при заполнении заявки на аккредитацию");

        return this;
    }

    public AccreditationAcceptPage checkApplicantPassportIssuedDateValue (String applicantPassportIssuedDateValue)
            throws Exception{
        By byApplicantPassportIssuedDateValue = By.id(APPLICANT_PASSPORT_ISSUED_DATE);
        Assert.assertTrue(findElement(byApplicantPassportIssuedDateValue).getText().equals(applicantPassportIssuedDateValue),
                "Когда выдан не соответствует данным, введенным при заполнении заявки на аккредитацию");

        return this;
    }

    public AccreditationAcceptPage checkApplicantPassportIssuedByValue (String applicantPassportIssuedByValue) throws Exception{
        By byApplicantPassportIssuedByValue = By.id(APPLICANT_PASSPORT_ISSUED_BY);
        Assert.assertTrue(findElement(byApplicantPassportIssuedByValue).getText().equals(applicantPassportIssuedByValue),
                "Кем выдан не соответствует данным, введенным при заполнении заявки на аккредитацию");

        return this;
    }

}
