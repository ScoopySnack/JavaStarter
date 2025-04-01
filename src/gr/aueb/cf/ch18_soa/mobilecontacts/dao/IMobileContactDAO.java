package gr.aueb.cf.ch18_soa.mobilecontacts.dao;

import gr.aueb.cf.ch18_soa.mobilecontacts.model.MobileContact;

import java.util.List;

public interface IMobileContactDAO {
    MobileContact insert(MobileContact mobileContact);
    MobileContact update(Long id,MobileContact mobileContact);
    void deleteById(Long id);
    MobileContact getById(Long id);
    List<MobileContact> findAll();

    void deleteByPhoneNumber(String phoneNumber);

    MobileContact getByPhoneNumber(String phoneNumber);
    boolean idExists(Long id);
    boolean phoneNumberExists(String phoneNumber);

}
