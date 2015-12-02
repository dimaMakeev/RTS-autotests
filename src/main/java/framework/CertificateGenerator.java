package framework;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Lena on 05.10.2015.
 */
public class CertificateGenerator {

    public void generateCertificate(String pathToGenerator, String surnameValue, String nameValue,
                                    String organizationValue, String organizationTypeValue){

        String cmd = pathToGenerator + " --cn=" + organizationValue + " --type=" + Constants.organizationTypeList.get(organizationTypeValue)
                + " --inn=random " + "--kpp=random --ogrn=random --snils=random -n=1 --gn=1:" + nameValue + " --sn=1:"
                + surnameValue + " --roles=1:FullRtsWithoutAdmin";
        try{
            Process p;
            p = Runtime.getRuntime().exec(cmd);
            p.waitFor();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public String generateCurrentDateTime(){
        DateFormat dateFormat = new SimpleDateFormat("ddMMyyyyHHmm");
        Date date = new Date();
        return dateFormat.format(date);
    }

}
