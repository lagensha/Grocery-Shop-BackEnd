package edu.icet.ecom.repository;

import edu.icet.ecom.dto.ItemDTO;

import java.util.List;

public interface ItemRepository {
    boolean addItems(ItemDTO itemDTO);
    boolean updateItems(ItemDTO itemDTO);
    boolean deleteItems(String itemCode);
    List<ItemDTO> getAll();
}
