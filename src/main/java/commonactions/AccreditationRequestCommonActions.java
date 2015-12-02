package commonactions;

import framework.Constants;
import pageobjects.AccreditationRequestPage;

/**
 * Created by Lena on 16.09.2015.
 */
public class AccreditationRequestCommonActions {

    public static void selectCertificate(AccreditationRequestPage accreditationRequestPage, String roleType,
                                         String certificateNameValue) throws Exception{
        if(roleType.equals(Constants.roleTypeCustomer))
            accreditationRequestPage.clickCustomerAccreditation();
        if(roleType.equals(Constants.roleTypeSupplier))
            accreditationRequestPage.clickSupplierAccreditation();
        accreditationRequestPage
                .clickSelectCertificateButton()
                .selectCertificateName(certificateNameValue);
    }

    public static void fillApplicantPersonalInfo(AccreditationRequestPage accreditationRequestPage, String lastNameValue,
                                                 String nameValue, String countryCodeValue, String cityCodeValue,
                                                 String phoneNumberValue, String addNumberValue, String emailValue,
                                                 String passwordValue, String passPhraseValue) throws Exception{
        accreditationRequestPage
                .checkLastName(lastNameValue)
                .checkFirstName(nameValue)
                .fillPhoneNumber(countryCodeValue,cityCodeValue, phoneNumberValue, addNumberValue)
                .fillEmail(emailValue)
                .fillLogin(emailValue)
                .fillPassword(passwordValue)
                .fillPasswordConfirmation(passwordValue)
                .fillPassPhrase(passPhraseValue);
    }

    public static void fillApplicantInfo(AccreditationRequestPage accreditationRequestPage,
                                              String roleTypeValue, String organizationTypeValue,
                                              String directorNameValue, String organizationValue,
                                              String countryCodeValue, String cityCodeValue, String phoneNumberValue,
                                              String addNumberValue, String emailValue, String contactPersonValue,
                                              String passportSeriesValue, String passportNumberValue,
                                              String passportIssuedDivisionCodeValue, String whenPassportIssuedValue,
                                              String whomPassportIssued)
        throws Exception{
        if(organizationTypeValue.equals(Constants.jpOrganizationType)) {
            if(roleTypeValue.equals(Constants.roleTypeSupplier))
                accreditationRequestPage.clickJp();
            accreditationRequestPage
                    .fillDirectorName(directorNameValue)
                    .checkFullJpName(organizationValue);
        }
        else if(organizationTypeValue.equals(Constants.ipOrganizationType)){
            if(roleTypeValue.equals(Constants.roleTypeSupplier))
                accreditationRequestPage
                        .clickJp()
                        .clickIp();
            accreditationRequestPage.checkFullIpName(organizationValue);
        }
        else if(organizationTypeValue.equals(Constants.phpOrganizationType)){
            if(roleTypeValue.equals(Constants.roleTypeSupplier))
                accreditationRequestPage
                        .clickJp()
                        .clickPhp();
            accreditationRequestPage
                    .fillPassportSeries(passportSeriesValue)
                    .fillPassportNumber(passportNumberValue)
                    .fillPassportIssuedDivisionCode(passportIssuedDivisionCodeValue)
                    .fillWhenPassportIssued(whenPassportIssuedValue)
                    .fillWhomPassportIssued(whomPassportIssued);
        }
        accreditationRequestPage
                .fillApplicantPhoneNumber(countryCodeValue,cityCodeValue, phoneNumberValue, addNumberValue)
                .fillBaseEmail(emailValue)
                .fillContactPerson(contactPersonValue);
    }

    public static void fillJAddressInfo(AccreditationRequestPage accreditationRequestPage, String regionValue, String
            districtValue, String cityValue, String localityValue, String streetValue, String indexValue,
                                        String buildingValue, String okatoValue) throws Exception{
        accreditationRequestPage
                .selectRegion(regionValue)
                .selectDistrict(districtValue)
                .selectCity(cityValue)
                .selectLocality(localityValue)
                .fillStreet(streetValue)
                .fillIndex(indexValue)
                .fillBuilding(buildingValue)
                .checkOkato(okatoValue);
    }

    public static void addDocs(AccreditationRequestPage accreditationRequestPage, String organizationTypeValue,
                               String pathToFoundingDocs, String pathToHeadDocs, String pathToEgrulDocs,
                               String pathToAccreditationDocs, String pathToProcurationDocs,
                               String pathToUdostoverenieLichnostiDocs, String pathToVipiskaEgripDocs,
                               String pathToPolnomochiaPolzovatelyaDocs)
        throws Exception{
        if(organizationTypeValue.equals(Constants.jpOrganizationType)) {
            accreditationRequestPage
                    .addUchreditelnieDcumenti(pathToFoundingDocs)
                    .addPolnomochiaRukovoditela(pathToHeadDocs)
                    .addVipiskaEgryul(pathToEgrulDocs)
                    .addPolnomochiaPoluchenieAccreditasii(pathToAccreditationDocs)
                    .addDoverennost(pathToProcurationDocs);
//                    .addReshenieOdobreneSdelok(pathToDecisionDocs);
        }
        else if(organizationTypeValue.equals(Constants.ipOrganizationType)){
            accreditationRequestPage
                    .addIpUdostoverenieLichnosti(pathToUdostoverenieLichnostiDocs)
                    .addVipiskaEgrip(pathToVipiskaEgripDocs)
                    .addPolnomochiaPolzovatelya(pathToPolnomochiaPolzovatelyaDocs);
        }
        else if(organizationTypeValue.equals(Constants.phpOrganizationType)){
            accreditationRequestPage
                    .addPhpUdostoverenieLichnosti(pathToUdostoverenieLichnostiDocs);
        }
    }

    public static void fillBankRequisites(AccreditationRequestPage accreditationRequestPage, String bikValue, String accountValue,
                                          String bankNameValue, String bankAddressValue) throws Exception{
        accreditationRequestPage
                .fillBik(bikValue)
                .fillCheckingAccount(accountValue)
                .fillBankName(bankNameValue)
                .fillBankAddress(bankAddressValue);
    }

    public static void checkContractAgreed(AccreditationRequestPage accreditationRequestPage) throws Exception{
        accreditationRequestPage
                .checkContractAgreedCheckbox();
    }

    public static void fillCaptcha(AccreditationRequestPage accreditationRequestPage, String captchaValue) throws Exception{
        accreditationRequestPage
                .fillCaptcha(captchaValue);
    }

    public static void clickclickAddAccreditationApplication(AccreditationRequestPage accreditationRequestPage) throws Exception{
        accreditationRequestPage
                .clickAddAccreditationApplicationButton();
    }

}
