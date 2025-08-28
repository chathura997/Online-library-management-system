package com.example.Online_library_management_system.service;

import java.util.List;

public interface GenericService<REQUEST, RESPONSE, ID> {

    RESPONSE create(REQUEST requestDTO);
    List<RESPONSE> getAll();
    RESPONSE getById(ID id);
    void delete(ID id);
}
