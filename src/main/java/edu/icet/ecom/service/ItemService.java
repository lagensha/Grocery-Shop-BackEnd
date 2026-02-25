package edu.icet.ecom.service;

import edu.icet.ecom.dto.ItemDTO;

import java.util.List;

public interface ItemService {
    boolean addItems(ItemDTO itemDTO);
    boolean updateItems(ItemDTO itemDTO);
    boolean deleteItems(String itemCode);
    List<ItemDTO> getAll();
}
