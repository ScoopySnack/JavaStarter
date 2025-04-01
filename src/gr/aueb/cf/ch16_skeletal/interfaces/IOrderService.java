package gr.aueb.cf.ch16_skeletal.interfaces;

import java.time.LocalDateTime;

/**
 * We define the services that will be available to the client. Usually CRUD operations.
 */
public interface IOrderService {
    void insertOrder(String address, String lastname, String firstname, String phoneNumber,
                     LocalDateTime timestamp, String item, int quantity);
    void updateOrder(Long id, String address, String lastname, String firstname, String phoneNumber,
                     LocalDateTime timestamp, String item, int quantity);
    void deleteOrder(Long id);
    String getOrder(Long id);
}
