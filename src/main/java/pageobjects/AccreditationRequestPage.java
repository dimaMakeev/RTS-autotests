package pageobjects;

import framework.Constants;
import framework.WebDriverCommands;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

/**
 * Created by Lena on 31.08.2015.
 */
public class AccreditationRequestPage extends WebDriverCommands{

    private final String CUSTOMER_ACCREDITATION_CHECKBOX = "BaseMainContent_MainContent_cbIsCustomer"; //id
    private final String SUPPLIER_ACCREDITATION_CHECKBOX = "BaseMainContent_MainContent_cbIsSupplier"; //id
    private final String SELECT_CERTIFICATE_BUTTON = "btnSelectCert";
    private final String CERTIFICATE_NAME_VALUE = "//td[contains(@title, '%s')]";
    private final String CERTIFICATE_NAME_CONFIRM = "btnOK";
    private final String LAST_NAME_INPUT = "BaseMainContent_MainContent_ucEmployeeInfos_txtLastName";
    private final String FIRST_NAME_INPUT = "BaseMainContent_MainContent_ucEmployeeInfos_txtFirstName";
    private final String MIDDLE_NAME_INPUT = "BaseMainContent_MainContent_ucEmployeeInfos_txtMiddleName";
    private final String POSITION_INPUT = "BaseMainContent_MainContent_ucEmployeeInfos_txtPosition";
    private final String COUNTRY_CODE_INPUT = "BaseMainContent_MainContent_ucEmployeeInfos_ucContactPhone_txtCountryCode";
    private final String CITY_CODE_INPUT = "BaseMainContent_MainContent_ucEmployeeInfos_ucContactPhone_txtCityCode";
    private final String CONTACT_PHONE_NUMBER_INPUT = "BaseMainContent_MainContent_ucEmployeeInfos_ucContactPhone_txtNumber";
    private final String ADDITIONAL_NUMBER_INPUT = "BaseMainContent_MainContent_ucEmployeeInfos_ucContactPhone_txtAddNumber";
    private final String MAIL_INPUT = "BaseMainContent_MainContent_ucEmployeeInfos_txtContactEmail";
    private final String LOGIN_INPUT = "BaseMainContent_MainContent_ucEmployeeInfos_txtLogin";
    private final String PASSWORD_INPUT = "BaseMainContent_MainContent_ucEmployeeInfos_txtPassword";
    private final String PASSWORD_CONFIRMATION_INPUT = "BaseMainContent_MainContent_ucEmployeeInfos_txtConfirmPassword";
    private final String PASSPHRASE_INPUT = "BaseMainContent_MainContent_ucEmployeeInfos_txtPassphrase";

    private final String SIMPLIFIED_TAX_SYSTEM_CHECKBOX = "BaseMainContent_MainContent_ucOrganizationInfo_cbVATPayer";
    private final String SMALL_MEDIUM_ENTERPRISES_CHECKBOX = "BaseMainContent_MainContent_ucOrganizationInfo_cbIsSMP";
    private final String LEGAL_ENTITY_RADIO = "BaseMainContent_MainContent_ucOrganizationInfo_rblOrganizationType_0";
    private final String INDIVIDUAL_ENTEREPRENEUR_RADIO = "BaseMainContent_MainContent_ucOrganizationInfo_rblOrganizationType_1";
    private final String INDIVIDUAL_RADIO = "BaseMainContent_MainContent_ucOrganizationInfo_rblOrganizationType_2";
    //JP
    private final String FULL_NAME_INPUT = "BaseMainContent_MainContent_ucOrganizationInfo_txtOrganizationFullName";
    private final String SHORT_NAME_INPUT = "BaseMainContent_MainContent_ucOrganizationInfo_txtOrganizationName";
    private final String EDIT_FULL_NAME_BUTTON = "BaseMainContent_MainContent_ucOrganizationInfo_lbOrganizationFullName";
    //IP
    private final String PHIOIP_INPUT = "BaseMainContent_MainContent_ucOrganizationInfo_txtIndividualEntrepreneurFio";
    private final String EDIT_PHIOIP_BUTTON = "BaseMainContent_MainContent_ucOrganizationInfo_lbIndividualEntrepreneurFio";
    //PHP
    private final String SNILS = "BaseMainContent_MainContent_ucOrganizationInfo_txtSnils";

    private final String INN_INPUT = "BaseMainContent_MainContent_ucOrganizationInfo_txtInn";
    private final String KPP_INPUT = "BaseMainContent_MainContent_ucOrganizationInfo_txtKpp";
    private final String OGRN_INPUT = "BaseMainContent_MainContent_ucOrganizationInfo_txtOgrn";
    private final String COUNTRY_CODE_PHONE_INPUT = "BaseMainContent_MainContent_ucOrganizationInfo_ucContactPhone_txtCountryCode";
    private final String CITY_CODE_PHONE_INPUT = "BaseMainContent_MainContent_ucOrganizationInfo_ucContactPhone_txtCityCode";
    private final String NUMBER_PHONE_INPUT = "BaseMainContent_MainContent_ucOrganizationInfo_ucContactPhone_txtNumber";
    private final String ADD_NUMBER_PHONE_INPUT = "BaseMainContent_MainContent_ucOrganizationInfo_ucContactPhone_txtAddNumber";
    private final String WEB_SITE_INPUT = "BaseMainContent_MainContent_ucOrganizationInfo_txtWebSiteUrl";
    private final String COUNTRY_CODE_FAX_INPUT = "BaseMainContent_MainContent_ucOrganizationInfo_ucFax_txtCountryCode";
    private final String CITY_CODE_FAX_INPUT = "BaseMainContent_MainContent_ucOrganizationInfo_ucFax_txtCityCode";
    private final String NUMBER_FAX_INPUT = "BaseMainContent_MainContent_ucOrganizationInfo_ucFax_txtNumber";
    private final String ORGANIZATION_EMAIL_INPUT = "BaseMainContent_MainContent_ucOrganizationInfo_txtEmail";
    private final String BASE_EMAIL_INPUT = "BaseMainContent_MainContent_ucOrganizationInfo_txtNotificationEmail";
    private final String ADDITIONAL_EMAIL_INPUT = "BaseMainContent_MainContent_ucOrganizationInfo_txtAdditionalEmail";
    private final String DIRECTOR_NAME_INPUT = "BaseMainContent_MainContent_ucOrganizationInfo_txtDirectorName";
    private final String CONTACT_PERSON_INPUT = "BaseMainContent_MainContent_ucOrganizationInfo_txtContactPerson";
    private final String ADDITIONAL_CONTACT_INFORMATION_TEXTAREA = "BaseMainContent_MainContent_ucOrganizationInfo_txtContactPerson";
    private final String REGION_SELECT = "//div[@id='BaseMainContent_MainContent_kaJudicial_ddlKladrRegion_chzn']/.//span[text()='Выбрать']";
    private final String REGION_SELECT_VALUE = "//li[contains(@id, 'BaseMainContent_MainContent_kaJudicial_ddlKladrRegion_chzn') and text() = '%s']";
    private final String DISTRICT_SELECT = "//div[@id='BaseMainContent_MainContent_kaJudicial_ddlKladrDistricts_chzn']/.//span[text()='Выбрать']";
    private final String DISTRICT_SELECT_VALUE = "//li[contains(@id, 'BaseMainContent_MainContent_kaJudicial_ddlKladrDistricts_chzn') and text() = '%s']";
    private final String CITY_SELECT = "//div[@id='BaseMainContent_MainContent_kaJudicial_ddlKladrCity_chzn']/.//span[text()='Выбрать']";
    private final String CITY_SELECT_VALUE = "//li[contains(@id, 'BaseMainContent_MainContent_kaJudicial_ddlKladrCity_chzn') and text() = '%s']";
    private final String LOCALITY_SELECT = "//div[@id='BaseMainContent_MainContent_kaJudicial_ddlKladrPopulatedLocality_chzn']/.//span[text()='Выбрать']";
    private final String LOCALITY_SELECT_VALUE = "//li[contains(@id, 'BaseMainContent_MainContent_kaJudicial_ddlKladrPopulatedLocality_chzn') and text() = '%s']";
    private final String STREET_INPUT = "BaseMainContent_MainContent_kaJudicial_txtKladrStreet";
    private final String INDEX_INPUT = "BaseMainContent_MainContent_kaJudicial_txtPostIndex";
    private final String BUILDING_INPUT = "BaseMainContent_MainContent_kaJudicial_txtHome";
    private final String OFFICE_INPUT = "BaseMainContent_MainContent_kaJudicial_txtOffice";
    private final String OKATO_INPUT = "BaseMainContent_MainContent_kaJudicial_txtOkato_txtText";
    private final String PASSPORT_SERIES_INPUT = "BaseMainContent_MainContent_ucEmployeePassportInfo_ucEmployeePassportInfo_txtEmployeePassportSeries";
    private final String PASSPORT_NUMBER_INPUT = "BaseMainContent_MainContent_ucEmployeePassportInfo_ucEmployeePassportInfo_txtEmployeePassportNumber";
    private final String PASSPORT_ISSUED_DIVISION_CODE = "BaseMainContent_MainContent_ucEmployeePassportInfo_ucEmployeePassportInfo_txtEmployeePassportIssuedDivisionCode";
    private final String WHEN_PASSPORT_ISSUED_INPUT = "BaseMainContent_MainContent_ucEmployeePassportInfo_ucEmployeePassportInfo_txtEmployeeWhenPassportIssued";
    private final String WHOM_PASSPORT_ISSUED_INPUT = "BaseMainContent_MainContent_ucEmployeePassportInfo_ucEmployeePassportInfo_txtEmployeeWhomPassportIssued";
    private final String UCHREDITELNIE_DOCUMENTI_TAB = "//a[contains(text(), 'Учредительные документы')]";
    private final String POLNOMOCHIA_RUKOVODITELA_TAB = "//a[contains(text(), 'Полномочия Руководителя')]";
    private final String VIPISKA_EGRYUL_TAB = "//a[contains(text(), 'Выписка ЕГРЮЛ')]";
    private final String POLNOMOCHIA_POLUCHENIE_ACCKEDITASII_TAB = "//a[contains(text(), 'Полномочия на получение аккредитации')]";
    private final String DOVORENNOST_TAB = "//a[contains(text(), 'Доверенность')]";
//    private final String RESHENIE_OB_ODOBRENII_SDELOK = "//a[contains(text(), '')]";
    private final String UDOSTOVERENIE_LICHNOSTI_TAB = "//a[contains(text(), 'Документ, удостоверяющий личность')]";
    private final String VIPISKA_EGRIP_TAB = "//a[contains(text(), 'Выписка из ЕГРИП')]";
    private final String POLNOMOCHIYA_POLZOVATELYA_TAB = "//a[contains(text(), 'Полномочия пользователя')]";
    private final String OTHER_DOCUMENTS_TAB = "//a[contains(text(), 'Другие документы')]";
    private final String ADD_DOCUMENTS_BUTTON = "//a[contains(@id, 'BaseMainContent_MainContent_dlOrganizationDocumentList_divContent_button_%s')]/input[@type='file']";
    private final String ADD_OTHER_DOCUMENTS_BUTTON = "BaseMainContent_MainContent_dlOrganizationDocumentList_divContent_button_otherDocument";
    private final String BIK_INPUT = "BaseMainContent_MainContent_ucBankingDetailsControl_txtBik";
    private final String CHECKING_ACCOUNT_INPUT = "BaseMainContent_MainContent_ucBankingDetailsControl_txtSettlementAccount";
    private final String CORRESPONDENT_ACCOUNT_INPUT = "BaseMainContent_MainContent_ucBankingDetailsControl_txtCorrespondentAccount";
    private final String PERSONAL_ACCOUNT_INPUT = "BaseMainContent_MainContent_ucBankingDetailsControl_txtPersonalAccount";
    private final String BANK_NAME_INPUT = "BaseMainContent_MainContent_ucBankingDetailsControl_txtBankName";
    private final String BANK_ADDRESS_INPUT = "BaseMainContent_MainContent_ucBankingDetailsControl_txtBankAddress";
    private final String MAX_SUMM_INPUT = "BaseMainContent_MainContent_ucRtsTenderRequestInfo_txtRtsTenderContractMaxSum";
    private final String SOURCE_SELECT = "BaseMainContent_MainContent_ucReferralSources_ddlReferralSources_chzn";
    private final String SAVE_DRAFT_BUTTON = "BaseMainContent_MainContent_mvgbSaveDraft";
    private final String CONTRACT_AGREED_CHECKBOX = "BaseMainContent_MainContent_ucRtsTenderRequestInfo_cbIsContractAgreed";
    private final String CAPTCHA_INPUT = "BaseMainContent_MainContent_txtCaptcha";
    private final String ADD_ACCREDITATION_APPLICATION = "BaseMainContent_MainContent_mvgbAccreditation";

    //Select organization role
    public AccreditationRequestPage clickCustomerAccreditation() throws Exception{
        By byCustomerAccreditationCheckbox = By.id(CUSTOMER_ACCREDITATION_CHECKBOX);
        waitForElementPresent(byCustomerAccreditationCheckbox, Constants.TIMEOUT_2_SECONDS);
        click(byCustomerAccreditationCheckbox);

        return this;
    }

    public AccreditationRequestPage clickSupplierAccreditation() throws Exception{
        By bySupplierAccreditationCheckbox = By.id(SUPPLIER_ACCREDITATION_CHECKBOX);
        waitForElementPresent(bySupplierAccreditationCheckbox, Constants.TIMEOUT_2_SECONDS);
        click(bySupplierAccreditationCheckbox);
        waitTime(Constants.TIMEOUT_2_SECONDS);

        return this;
    }

    //Personal information
    public AccreditationRequestPage clickSelectCertificateButton() throws Exception{
        waitTime(Constants.TIMEOUT_3_MINUTES);
        By bySelectCertificateButton = By.id(SELECT_CERTIFICATE_BUTTON);
        waitForElementPresent(bySelectCertificateButton, Constants.TIMEOUT_2_SECONDS);
        click(bySelectCertificateButton);
        waitTime(Constants.TIMEOUT_1_SECONDS);

        return this;
    }

    public AccreditationRequestPage selectCertificateName(String certificateName) throws Exception{
        By byCertificateNameValue = By.xpath(String.format(CERTIFICATE_NAME_VALUE, certificateName));
        waitForElementPresent(byCertificateNameValue, Constants.TIMEOUT_2_SECONDS);
        click(byCertificateNameValue);
        By byCertificateNameConfirm = By.id(CERTIFICATE_NAME_CONFIRM);
        click(byCertificateNameConfirm);
        waitTime(Constants.TIMEOUT_2_SECONDS);

        return this;
    }

    public AccreditationRequestPage checkLastName(String lastNameValue) throws Exception{
        By byLastNameInput = By.id(LAST_NAME_INPUT);
        waitForElementPresent(byLastNameInput, Constants.TIMEOUT_2_SECONDS);
        Assert.assertTrue(findElement(byLastNameInput).getAttribute("value").equals(lastNameValue), "Фамилия не совпадает с данными сертификата");

        return this;
    }

    public AccreditationRequestPage checkFirstName(String firstNameValue) throws Exception{
        By byFirstNameInput = By.id(FIRST_NAME_INPUT);
        waitForElementPresent(byFirstNameInput, Constants.TIMEOUT_2_SECONDS);
        Assert.assertTrue(findElement(byFirstNameInput).getAttribute("value").equals(firstNameValue) , "Имя не совпадает с данными сертификата");

        return this;
    }

    public AccreditationRequestPage fillMiddleName(String middleNameValue) throws Exception{
        By byMiddleNameInput= By.id(MIDDLE_NAME_INPUT);
        waitForElementPresent(byMiddleNameInput, Constants.TIMEOUT_2_SECONDS);
        Assert.assertTrue(findElement(byMiddleNameInput).getAttribute("value").equals(middleNameValue) , "Отчество не совпадает с данными сертификата");

        return this;
    }

    public AccreditationRequestPage fillPositionName(String positionValue) throws Exception{
        By byPositionInput = By.id(POSITION_INPUT);
        waitForElementPresent(byPositionInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byPositionInput, positionValue);

        return this;
    }

    public AccreditationRequestPage fillPhoneNumber(String countryCodeValue, String cityCodeValue, String phoneNumberValue, String additionalNumberValue)
            throws Exception{
        By byCountryCodeInput = By.id(COUNTRY_CODE_INPUT);
        waitForElementPresent(byCountryCodeInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byCountryCodeInput, countryCodeValue);
        By byCityCodeInput = By.id(CITY_CODE_INPUT);
        waitForElementPresent(byCityCodeInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byCityCodeInput, cityCodeValue);
        By byPhoneNumberInput = By.id(CONTACT_PHONE_NUMBER_INPUT);
        waitForElementPresent(byPhoneNumberInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byPhoneNumberInput, phoneNumberValue);
        By byAdditionalNumberInput = By.id(ADDITIONAL_NUMBER_INPUT);
        waitForElementPresent(byAdditionalNumberInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byAdditionalNumberInput, additionalNumberValue);

        return this;
    }

    public AccreditationRequestPage checkEmail(String emailValue) throws Exception{
        By byEmailInput = By.id(MAIL_INPUT);
        waitForElementPresent(byEmailInput, Constants.TIMEOUT_2_SECONDS);
        Assert.assertTrue(findElement(byEmailInput).getAttribute("value").equals(emailValue) , "Электронная почта не совпадает с данными сертификата");

        return this;
    }

    public AccreditationRequestPage fillEmail(String emailValue) throws Exception{
        By byEmailInput = By.id(MAIL_INPUT);
        waitForElementPresent(byEmailInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byEmailInput, emailValue);

        return this;
    }

    public AccreditationRequestPage fillLogin(String loginValue) throws Exception{
        By byLoginInput = By.id(LOGIN_INPUT);
        waitForElementPresent(byLoginInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byLoginInput, loginValue.replaceFirst("@.+", ""));

        return this;
    }

    public AccreditationRequestPage fillPassword(String passwordValue) throws Exception{
        By byPasswordInput = By.id(PASSWORD_INPUT);
        waitForElementPresent(byPasswordInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byPasswordInput, passwordValue);

        return this;
    }

    public AccreditationRequestPage fillPasswordConfirmation(String passwordValue) throws Exception{
        By byPasswordConfirmationInput = By.id(PASSWORD_CONFIRMATION_INPUT);
        waitForElementPresent(byPasswordConfirmationInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byPasswordConfirmationInput, passwordValue);

        return this;
    }

    public AccreditationRequestPage fillPassPhrase(String passPhraseValue) throws Exception{
        By byPassPhraseInput= By.id(PASSPHRASE_INPUT);
        waitForElementPresent(byPassPhraseInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byPassPhraseInput, passPhraseValue);

        return this;
    }

    //Applicant
    public AccreditationRequestPage clickSimplifiedTaxSystem() throws Exception{
        By bySimplifiedTaxSystemCheckbox = By.id(SIMPLIFIED_TAX_SYSTEM_CHECKBOX);
        waitForElementPresent(bySimplifiedTaxSystemCheckbox, Constants.TIMEOUT_2_SECONDS);
        click(bySimplifiedTaxSystemCheckbox);

        return this;
    }

    public AccreditationRequestPage clickSmallMediumEnterprises() throws Exception{
        By bySmallMediumEnterprisesCheckbox = By.id(SMALL_MEDIUM_ENTERPRISES_CHECKBOX);
        waitForElementPresent(bySmallMediumEnterprisesCheckbox, Constants.TIMEOUT_2_SECONDS);
        click(bySmallMediumEnterprisesCheckbox);

        return this;
    }

    public AccreditationRequestPage clickJp() throws Exception{
        By byLegalEntityRadio = By.id(LEGAL_ENTITY_RADIO);
        waitForElementPresent(byLegalEntityRadio, Constants.TIMEOUT_2_SECONDS);
        click(byLegalEntityRadio);

        return this;
    }

    public AccreditationRequestPage clickIp() throws Exception{
        By byIndividualEnterepreneurRadio = By.id(INDIVIDUAL_ENTEREPRENEUR_RADIO);
        waitForElementPresent(byIndividualEnterepreneurRadio, Constants.TIMEOUT_2_SECONDS);
        click(byIndividualEnterepreneurRadio);

        return this;
    }

    public AccreditationRequestPage clickPhp() throws Exception{
        By byIndividualRadio = By.id(INDIVIDUAL_RADIO);
        waitForElementPresent(byIndividualRadio, Constants.TIMEOUT_2_SECONDS);
        click(byIndividualRadio);

        return this;
    }

    public AccreditationRequestPage checkFullJpName(String fullNameValue) throws Exception{
        By byFullJpNameInput = By.id(FULL_NAME_INPUT);
        waitForElementPresent(byFullJpNameInput, Constants.TIMEOUT_2_SECONDS);
        Assert.assertTrue(findElement(byFullJpNameInput).getAttribute("value").equals(fullNameValue) , "Полное название не совпадает с данными сертификата");

        return this;
    }

    public AccreditationRequestPage checkFullIpName(String fullNameValue) throws Exception{
        By byFullIpNameInput = By.id(PHIOIP_INPUT);
        waitForElementPresent(byFullIpNameInput, Constants.TIMEOUT_2_SECONDS);
        Assert.assertTrue(findElement(byFullIpNameInput).getAttribute("value").equals(fullNameValue) , "Полное название не совпадает с данными сертификата");

        return this;
    }



    public AccreditationRequestPage clickFullNameEdit() throws Exception{
        By byFullNameEditButton = By.id(EDIT_FULL_NAME_BUTTON);
        waitForElementPresent(byFullNameEditButton, Constants.TIMEOUT_2_SECONDS);
        click(byFullNameEditButton);

        return this;
    }

    public AccreditationRequestPage fillShortName(String shortNameValue) throws Exception{
        By byShortNameInput = By.id(SHORT_NAME_INPUT);
        waitForElementPresent(byShortNameInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byShortNameInput, shortNameValue);

        return this;
    }

    public AccreditationRequestPage checkInn(String innValue) throws Exception{
        By byInnInput = By.id(INN_INPUT);
        waitForElementPresent(byInnInput, Constants.TIMEOUT_2_SECONDS);
        Assert.assertTrue(findElement(byInnInput).getAttribute("value").equals(innValue) , "Значение ИНН не совпадает с данными сертификата");

        return this;
    }

    public AccreditationRequestPage checkKpp(String kppValue) throws Exception{
        By byKppInput = By.id(KPP_INPUT);
        waitForElementPresent(byKppInput, Constants.TIMEOUT_2_SECONDS);
        Assert.assertTrue(findElement(byKppInput).getAttribute("value").equals(kppValue) , "Значение КПП не совпадает с данными сертификата");

        return this;
    }

    public AccreditationRequestPage checkOgrn(String ogrnValue) throws Exception{
        By byOgrnInput = By.id(OGRN_INPUT);
        waitForElementPresent(byOgrnInput, Constants.TIMEOUT_2_SECONDS);
        Assert.assertTrue(findElement(byOgrnInput).getAttribute("value").equals(ogrnValue) , "Значение ОГРН не совпадает с данными сертификата");

        return this;
    }

    public AccreditationRequestPage fillApplicantPhoneNumber(String countryCodePhoneValue, String cityCodePhoneValue, String numberPhoneValue, String addlNumberPhoneValue)
            throws Exception{
        By byCountryCodeInput = By.id(COUNTRY_CODE_PHONE_INPUT);
        waitForElementPresent(byCountryCodeInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byCountryCodeInput, countryCodePhoneValue);
        By byCityCodeInput = By.id(CITY_CODE_PHONE_INPUT);
        waitForElementPresent(byCityCodeInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byCityCodeInput, cityCodePhoneValue);
        By byPhoneNumberInput = By.id(NUMBER_PHONE_INPUT);
        waitForElementPresent(byPhoneNumberInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byPhoneNumberInput, numberPhoneValue);
        By byAdditionalNumberInput = By.id(ADD_NUMBER_PHONE_INPUT);
        waitForElementPresent(byAdditionalNumberInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byAdditionalNumberInput, addlNumberPhoneValue);

        return this;
    }

    public AccreditationRequestPage fillWebSite(String webSiteValue) throws Exception{
        By byWebSiteInput = By.id(WEB_SITE_INPUT);
        waitForElementPresent(byWebSiteInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byWebSiteInput, webSiteValue);

        return this;
    }

    public AccreditationRequestPage fillApplicantFaxNumber(String countryCodeFaxValue, String cityCodeFaxValue, String numberFaxValue)
            throws Exception{
        By byCountryCodeInput = By.id(COUNTRY_CODE_FAX_INPUT);
        waitForElementPresent(byCountryCodeInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byCountryCodeInput, countryCodeFaxValue);
        By byCityCodeInput = By.id(CITY_CODE_FAX_INPUT);
        waitForElementPresent(byCityCodeInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byCityCodeInput, cityCodeFaxValue);
        By byFaxNumberInput = By.id(NUMBER_FAX_INPUT);
        waitForElementPresent(byFaxNumberInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byFaxNumberInput, numberFaxValue);

        return this;
    }

    public AccreditationRequestPage fillOrganizationEmail(String organizationEmailValue) throws Exception{
        By byOrganizationEmailInput = By.id(ORGANIZATION_EMAIL_INPUT);
        waitForElementPresent(byOrganizationEmailInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byOrganizationEmailInput, organizationEmailValue);

        return this;
    }

    public AccreditationRequestPage fillBaseEmail(String baseEmailValue) throws Exception{
        By byBaseEmailInput = By.id(BASE_EMAIL_INPUT);
        waitForElementPresent(byBaseEmailInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byBaseEmailInput, baseEmailValue);

        return this;
    }

    public AccreditationRequestPage fillAdditionalEmail(String additionalEmailValue) throws Exception{
        By byAdditionalEmailInput = By.id(ADDITIONAL_EMAIL_INPUT);
        waitForElementPresent(byAdditionalEmailInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byAdditionalEmailInput, additionalEmailValue);

        return this;
    }

    public AccreditationRequestPage fillDirectorName(String directorNameValue) throws Exception{
        By byDirectorNameInput = By.id(DIRECTOR_NAME_INPUT);
        waitForElementPresent(byDirectorNameInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byDirectorNameInput, directorNameValue);

        return this;
    }

    public AccreditationRequestPage fillContactPerson(String contactPersonValue) throws Exception{
        By byContactPersonInput = By.id(CONTACT_PERSON_INPUT);
        waitForElementPresent(byContactPersonInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byContactPersonInput, contactPersonValue);

        return this;
    }

    public AccreditationRequestPage fillAdditionalInfo(String additionalInfoValue) throws Exception{
        By byAdditionalInfoTextArea = By.id(ADDITIONAL_CONTACT_INFORMATION_TEXTAREA);
        waitForElementPresent(byAdditionalInfoTextArea, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byAdditionalInfoTextArea, additionalInfoValue);

        return this;
    }

    //Legal Address
    public AccreditationRequestPage selectRegion(String regionValue) throws Exception{
        By byRegionSelect = By.xpath(REGION_SELECT);
        click(byRegionSelect);
        By byRegionSelectValue = By.xpath(String.format(REGION_SELECT_VALUE, regionValue));
        waitForElementPresent(byRegionSelectValue, Constants.TIMEOUT_2_SECONDS);
        click(byRegionSelectValue);
        waitTime(Constants.TIMEOUT_3_SECONDS);

        return this;
    }

    public AccreditationRequestPage selectDistrict(String districtValue) throws Exception{
        By byDistrictSelect = By.xpath(DISTRICT_SELECT);
        click(byDistrictSelect);
        By byDistrictSelectValue = By.xpath(String.format(DISTRICT_SELECT_VALUE, districtValue));
        waitForElementPresent(byDistrictSelectValue, Constants.TIMEOUT_2_SECONDS);
        click(byDistrictSelectValue);
        waitTime(Constants.TIMEOUT_3_SECONDS);

        return this;
    }

    public AccreditationRequestPage selectCity(String cityValue) throws Exception{
        By byCitySelect = By.xpath(CITY_SELECT);
        click(byCitySelect);
        By byCitySelectValue = By.xpath(String.format(CITY_SELECT_VALUE, cityValue));
        waitForElementPresent(byCitySelectValue, Constants.TIMEOUT_2_SECONDS);
        click(byCitySelectValue);
        waitTime(Constants.TIMEOUT_3_SECONDS);

        return this;
    }

    public AccreditationRequestPage selectLocality(String localityValue) throws Exception{
        By byLocalitySelect = By.xpath(LOCALITY_SELECT);
        click(byLocalitySelect);
        By byLocalitySelectValue = By.xpath(String.format(LOCALITY_SELECT_VALUE, localityValue));
        waitForElementPresent(byLocalitySelectValue, Constants.TIMEOUT_2_SECONDS);
        click(byLocalitySelectValue);
        waitTime(Constants.TIMEOUT_3_SECONDS);

        return this;
    }

    public AccreditationRequestPage fillStreet(String streetValue) throws Exception{
        By byStreetInput = By.id(STREET_INPUT);
        waitForElementPresent(byStreetInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byStreetInput, streetValue);
        sendKeyBoardKeys(byStreetInput, Keys.TAB);
        waitTime(Constants.TIMEOUT_2_SECONDS);

        return this;
    }

    public AccreditationRequestPage fillIndex(String indexValue) throws Exception{
        By byIndexInput = By.id(INDEX_INPUT);
        waitForElementPresent(byIndexInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byIndexInput, indexValue);

        return this;
    }

    public AccreditationRequestPage fillBuilding(String buildingValue) throws Exception{
        By byBuildingInput = By.id(BUILDING_INPUT);
        waitForElementPresent(byBuildingInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byBuildingInput, buildingValue);

        return this;
    }

    public AccreditationRequestPage fillOffice(String officeValue) throws Exception{
        By byOfficeInput = By.id(OFFICE_INPUT);
        waitForElementPresent(byOfficeInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byOfficeInput, officeValue);

        return this;
    }

    public AccreditationRequestPage checkOkato(String okatoValue) throws Exception{
        By byOkatoInput = By.id(OKATO_INPUT);
        waitForElementPresent(byOkatoInput, Constants.TIMEOUT_2_SECONDS);
        Assert.assertTrue(findElement(byOkatoInput).getAttribute("value").equals(okatoValue) , "ОКАТО не соответствует введенным данным");

        return this;
    }

    public AccreditationRequestPage fillPassportSeries(String passportSeriesValue) throws Exception{
        By byPassportSeriesInput = By.id(PASSPORT_SERIES_INPUT);
        waitForElementPresent(byPassportSeriesInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byPassportSeriesInput, passportSeriesValue);

        return this;
    }

    public AccreditationRequestPage fillPassportNumber(String passportNumberValue) throws Exception{
        By byPassportNumberInput = By.id(PASSPORT_NUMBER_INPUT);
        waitForElementPresent(byPassportNumberInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byPassportNumberInput, passportNumberValue);

        return this;
    }

    public AccreditationRequestPage fillPassportIssuedDivisionCode(String passportIssuedDivisionCodeValue) throws Exception{
        By byPassportIssuedDivisionCodeInput = By.id(PASSPORT_ISSUED_DIVISION_CODE);
        waitForElementPresent(byPassportIssuedDivisionCodeInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byPassportIssuedDivisionCodeInput, passportIssuedDivisionCodeValue);

        return this;
    }

    public AccreditationRequestPage fillWhenPassportIssued(String whenPassportIssuedValue) throws Exception{
        By byWhenPassportIssuedInput = By.id(WHEN_PASSPORT_ISSUED_INPUT);
        waitForElementPresent(byWhenPassportIssuedInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byWhenPassportIssuedInput, whenPassportIssuedValue);

        return this;
    }

    public AccreditationRequestPage fillWhomPassportIssued(String whomPassportIssuedValue) throws Exception{
        By byWhomPassportIssuedInput = By.id(WHOM_PASSPORT_ISSUED_INPUT);
        waitForElementPresent(byWhomPassportIssuedInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byWhomPassportIssuedInput, whomPassportIssuedValue);

        return this;
    }

    public AccreditationRequestPage addUchreditelnieDcumenti(String pathToFile) throws Exception{
        By byUchreditelnieDocumentiTab = By.xpath(UCHREDITELNIE_DOCUMENTI_TAB);
        waitForElementPresent(byUchreditelnieDocumentiTab, Constants.TIMEOUT_2_SECONDS);
        click(byUchreditelnieDocumentiTab);
        By bySelectFileButton = By.xpath(String.format(ADD_DOCUMENTS_BUTTON, 3));
        sendKeys(bySelectFileButton, getAbsoluteFilePath(pathToFile));
        waitTime(Constants.TIMEOUT_2_SECONDS);

        return this;
    }

    public AccreditationRequestPage addPolnomochiaRukovoditela(String pathToFile) throws Exception{
        By byPolnomochiaRukovoditelaTab = By.xpath(POLNOMOCHIA_RUKOVODITELA_TAB);
        waitForElementPresent(byPolnomochiaRukovoditelaTab, Constants.TIMEOUT_2_SECONDS);
        click(byPolnomochiaRukovoditelaTab);
        By bySelectFileButton = By.xpath(String.format(ADD_DOCUMENTS_BUTTON, 4));
        sendKeys(bySelectFileButton, getAbsoluteFilePath(pathToFile));
        waitTime(Constants.TIMEOUT_2_SECONDS);

        return this;
    }

    public AccreditationRequestPage addVipiskaEgryul(String pathToFile) throws Exception{
        By byVipiskaEgryulTab = By.xpath(VIPISKA_EGRYUL_TAB);
        waitForElementPresent(byVipiskaEgryulTab, Constants.TIMEOUT_2_SECONDS);
        click(byVipiskaEgryulTab);
        By bySelectFileButton = By.xpath(String.format(ADD_DOCUMENTS_BUTTON, 2));
        sendKeys(bySelectFileButton, getAbsoluteFilePath(pathToFile));
        waitTime(Constants.TIMEOUT_2_SECONDS);

        return this;
    }

    public AccreditationRequestPage addPolnomochiaPoluchenieAccreditasii(String pathToFile) throws Exception{
        By byPolnomochiaPoluchenieAccreditasiiTab = By.xpath(POLNOMOCHIA_POLUCHENIE_ACCKEDITASII_TAB);
        waitForElementPresent(byPolnomochiaPoluchenieAccreditasiiTab, Constants.TIMEOUT_2_SECONDS);
        click(byPolnomochiaPoluchenieAccreditasiiTab);
        By bySelectFileButton = By.xpath(String.format(ADD_DOCUMENTS_BUTTON, 30));
        sendKeys(bySelectFileButton, getAbsoluteFilePath(pathToFile));
        waitTime(Constants.TIMEOUT_2_SECONDS);

        return this;
    }

    public AccreditationRequestPage addDoverennost(String pathToFile) throws Exception{
        By byDoverennostTab = By.xpath(DOVORENNOST_TAB);
        waitForElementPresent(byDoverennostTab, Constants.TIMEOUT_2_SECONDS);
        click(byDoverennostTab);
        By bySelectFileButton = By.xpath(String.format(ADD_DOCUMENTS_BUTTON, 38));
        sendKeys(bySelectFileButton, getAbsoluteFilePath(pathToFile));
        waitTime(Constants.TIMEOUT_2_SECONDS);

        return this;
    }

    public AccreditationRequestPage addIpUdostoverenieLichnosti(String pathToFile) throws Exception{
        By byUdostoverenieLichnostiTab = By.xpath(UDOSTOVERENIE_LICHNOSTI_TAB);
        waitForElementPresent(byUdostoverenieLichnostiTab, Constants.TIMEOUT_2_SECONDS);
        click(byUdostoverenieLichnostiTab);
        By bySelectFileButton = By.xpath(String.format(ADD_DOCUMENTS_BUTTON, 35));
        sendKeys(bySelectFileButton, getAbsoluteFilePath(pathToFile));
        waitTime(Constants.TIMEOUT_2_SECONDS);

        return this;
    }

    public AccreditationRequestPage addPhpUdostoverenieLichnosti(String pathToFile) throws Exception{
        By byUdostoverenieLichnostiTab = By.xpath(UDOSTOVERENIE_LICHNOSTI_TAB);
        waitForElementPresent(byUdostoverenieLichnostiTab, Constants.TIMEOUT_2_SECONDS);
        click(byUdostoverenieLichnostiTab);
        By bySelectFileButton = By.xpath(String.format(ADD_DOCUMENTS_BUTTON, 36));
        sendKeys(bySelectFileButton, getAbsoluteFilePath(pathToFile));
        waitTime(Constants.TIMEOUT_2_SECONDS);

        return this;
    }

    public AccreditationRequestPage addVipiskaEgrip(String pathToFile) throws Exception{
        By byVipiskaEgripTab = By.xpath(VIPISKA_EGRIP_TAB);
        waitForElementPresent(byVipiskaEgripTab, Constants.TIMEOUT_2_SECONDS);
        click(byVipiskaEgripTab);
        By bySelectFileButton = By.xpath(String.format(ADD_DOCUMENTS_BUTTON, 1));
        sendKeys(bySelectFileButton, getAbsoluteFilePath(pathToFile));
        waitTime(Constants.TIMEOUT_2_SECONDS);

        return this;
    }

    public AccreditationRequestPage addPolnomochiaPolzovatelya(String pathToFile) throws Exception{
        By byPolnomochiaPolzovatelyaTab = By.xpath(POLNOMOCHIYA_POLZOVATELYA_TAB);
        waitForElementPresent(byPolnomochiaPolzovatelyaTab, Constants.TIMEOUT_2_SECONDS);
        click(byPolnomochiaPolzovatelyaTab);
        By bySelectFileButton = By.xpath(String.format(ADD_DOCUMENTS_BUTTON, 39));
        sendKeys(bySelectFileButton, getAbsoluteFilePath(pathToFile));
        waitTime(Constants.TIMEOUT_2_SECONDS);

        return this;
    }

    public AccreditationRequestPage addOtherDocuments(String pathToFile) throws Exception{
        By byOtherDocumentsTab = By.xpath(OTHER_DOCUMENTS_TAB);
        waitForElementPresent(byOtherDocumentsTab, Constants.TIMEOUT_2_SECONDS);
        click(byOtherDocumentsTab);
        By bySelectFileButton = By.id(String.format(ADD_OTHER_DOCUMENTS_BUTTON));
        sendKeys(bySelectFileButton, getAbsoluteFilePath(pathToFile));
        waitTime(Constants.TIMEOUT_2_SECONDS);

        return this;
    }

    //Bank Details
    public AccreditationRequestPage fillBik(String bikValue) throws Exception{
        By byBikInput = By.id(BIK_INPUT);
        waitForElementPresent(byBikInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byBikInput, bikValue);

        return this;
    }

    public AccreditationRequestPage fillCheckingAccount(String checkingAccountValue) throws Exception{
        By byCheckingAccountInput = By.id(CHECKING_ACCOUNT_INPUT);
        waitForElementPresent(byCheckingAccountInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byCheckingAccountInput, checkingAccountValue);

        return this;
    }

    public AccreditationRequestPage fillCorrespondentAccount(String correspondentAccountValue) throws Exception{
        By byCorrespondentAccountInput = By.id(CORRESPONDENT_ACCOUNT_INPUT);
        waitForElementPresent(byCorrespondentAccountInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byCorrespondentAccountInput, correspondentAccountValue);

        return this;
    }

    public AccreditationRequestPage fillPersonalAccount(String personalAccountValue) throws Exception{
        By byPersonalAccountInput = By.id(PERSONAL_ACCOUNT_INPUT);
        waitForElementPresent(byPersonalAccountInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byPersonalAccountInput, personalAccountValue);

        return this;
    }

    public AccreditationRequestPage fillBankName(String bankNameValue) throws Exception{
        By byBankNameInput = By.id(BANK_NAME_INPUT);
        waitForElementPresent(byBankNameInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byBankNameInput, bankNameValue);

        return this;
    }

    public AccreditationRequestPage fillBankAddress(String bankAddressValue) throws Exception{
        By byBankAddressInput = By.id(BANK_ADDRESS_INPUT);
        waitForElementPresent(byBankAddressInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byBankAddressInput, bankAddressValue);

        return this;
    }

    //How did you hear about the electronic trading platform
    public AccreditationRequestPage selectSource(String sourceValue) throws Exception{
        By bySourceSelect = By.id(SOURCE_SELECT);
        WebElement selectElem = findElement(bySourceSelect);
        Select selectSource = new Select(selectElem);
        selectSource.selectByVisibleText(sourceValue);
        waitTime(Constants.TIMEOUT_2_SECONDS);

        return this;
    }

    public AccreditationRequestPage clickSaveDraft() throws Exception{
        By bySaveDraftButton = By.id(SAVE_DRAFT_BUTTON);
        waitForElementPresent(bySaveDraftButton, Constants.TIMEOUT_2_SECONDS);
        click(bySaveDraftButton);

        return this;
    }

    public AccreditationRequestPage checkContractAgreedCheckbox() throws Exception{
        By byContractAgreedCheckbox = By.id(CONTRACT_AGREED_CHECKBOX);
        waitForElementPresent(byContractAgreedCheckbox, Constants.TIMEOUT_2_SECONDS);
        click(byContractAgreedCheckbox);

        return this;
    }

    public AccreditationRequestPage fillCaptcha(String captchaValue) throws Exception{
        By byCaptchaInput = By.id(CAPTCHA_INPUT);
        waitForElementPresent(byCaptchaInput, Constants.TIMEOUT_2_SECONDS);
        sendKeys(byCaptchaInput, captchaValue);

        return this;
    }

    public AccreditationAcceptPage clickAddAccreditationApplicationButton() throws Exception{
        By byAddAccreditationApplicationButton = By.id(ADD_ACCREDITATION_APPLICATION);
        waitForElementPresent(byAddAccreditationApplicationButton, Constants.TIMEOUT_2_SECONDS);
        click(byAddAccreditationApplicationButton);
        waitTime(Constants.TIMEOUT_2_SECONDS);

        return new AccreditationAcceptPage();
    }

}
