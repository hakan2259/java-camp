package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisService.VTDKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        VTDKPSPublicSoap vtdkpsPublicSoap = new VTDKPSPublicSoap();
        boolean result = vtdkpsPublicSoap.TCKimlikNoDogrula(
                Long.parseLong(customer.getNationalityId()),
                        customer.getFirstName().toUpperCase(),
                        customer.getLastName().toUpperCase(),
                        customer.getDateOfBirth().getYear()


        );
        return result;
    }
}
