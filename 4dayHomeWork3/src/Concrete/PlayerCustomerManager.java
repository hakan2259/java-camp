package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class PlayerCustomerManager extends BaseCustomerManager {

    private CustomerCheckService customerCheckService;

    public PlayerCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {
        if(customerCheckService.checkIfRealPerson(customer)){
            super.save(customer);
        }
        else{
            throw new Exception("Not a valid person");
        }

    }

    @Override
    public void delete(Customer customer) throws Exception {
        if(customerCheckService.checkIfRealPerson(customer)){
            super.delete(customer);
        }else{
            throw new Exception("Not a valid person");
        }

    }

    @Override
    public void update(Customer customer) throws Exception {
        if(customerCheckService.checkIfRealPerson(customer)){
            super.update(customer);
        }else{
            throw new Exception("Not a valid person");
        }

    }
}
