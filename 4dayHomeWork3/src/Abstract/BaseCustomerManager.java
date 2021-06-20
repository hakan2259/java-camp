package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

    @Override
    public void save(Customer customer) throws Exception {
        System.out.println("saved to db " + customer.getCustomerNumber());
    }

    @Override
    public void update(Customer customer) throws Exception {
        System.out.println("updated to db " + customer.getCustomerNumber());
    }

    @Override
    public void delete(Customer customer) throws Exception {
        System.out.println("deleted to db " + customer.getCustomerNumber());

    }
}
