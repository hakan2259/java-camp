package Abstract;

import Entities.Customer;

public interface CustomerService {

    void save(Customer customer) throws Exception;
    void update(Customer customer) throws Exception;
    void delete(Customer customer) throws Exception;


}
