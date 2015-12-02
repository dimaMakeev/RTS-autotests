package commonactions;

import framework.Constants;
import pageobjects.AccreditationAcceptPage;

/**
 * Created by Lena on 06.10.2015.
 */
public class AccreditationAcceptCommonActions {

    public static void waitForAccreditationAcceptPageIsLoaded(AccreditationAcceptPage accreditationAcceptPage){
        accreditationAcceptPage
                .waitForAccreditationStatusSubmitted();
    }

    public static void checkOrganizationCardTabInfo(AccreditationAcceptPage accreditationAcceptPage, String organizationTypeValue,
                                                    String regionValue, String districtValue, String cityValue, String localityValue,
                                                    String streetValue, String indexValue, String buildingValue,
                                                    String emailValue, String directorNameValue, String contactPersonValue)
            throws Exception{
        accreditationAcceptPage
                .clickOrganizationCardTab()
                .checkOrganizationTypeValue(organizationTypeValue)
                .checkAddressValue(organizationTypeValue, regionValue, districtValue, cityValue, localityValue, streetValue, indexValue,
                        buildingValue)
                .checkEmailValue(emailValue)
                .checkContactPersonValue(contactPersonValue);
        if(organizationTypeValue.equals(Constants.jpOrganizationType)){
            accreditationAcceptPage
                    .checkDirectorNameValue(directorNameValue);
        }
    }

    public static void checkRequisitesTabInfo(AccreditationAcceptPage accreditationAcceptPage, String bikValue,
                                              String accountValue, String bankNameValue, String bankAddressValue) throws Exception{
        accreditationAcceptPage
                .clickRequisitesTab()
                .checkBikValue(bikValue)
                .checkCheckingAccountValue(accountValue)
                .checkBankNameValue(bankNameValue)
                .checkBankAddressValue(bankAddressValue);
    }

    public static void checkApplicantInfoTabInfo(AccreditationAcceptPage accreditationAcceptPage, String surnameValue,
                                                 String nameValue, String countryCodeValue, String cityCodeValue,
                                                 String phoneNumberValue, String addNumberValue, String emailValue,
                                                 String organizationTypeValue, String passportSeriesValue,
                                                 String passportNumberValue, String passportIssuedDivisionCodeValue,
                                                 String whenPassportIssuedValue, String whomPassportIssued)
            throws Exception{
        accreditationAcceptPage
                .clickApplicantInfoTab()
                .checkLastNameValue(surnameValue)
                .checkFirstNameValue(nameValue)
                .checkPhoneNumberValue(countryCodeValue,cityCodeValue, phoneNumberValue, addNumberValue)
                .checkApplicantEmailValue(emailValue);
        if(organizationTypeValue.equals(Constants.phpOrganizationType)){
            accreditationAcceptPage
                    .checkApplicantPassportSeriesValue(passportSeriesValue)
                    .checkApplicantPassportNumberValue(passportNumberValue)
                    .checkApplicantPassportIssuedDivisionCodeValue(passportIssuedDivisionCodeValue)
                    .checkApplicantPassportIssuedDateValue(whenPassportIssuedValue)
                    .checkApplicantPassportIssuedByValue(whomPassportIssued);
        }
    }

}
