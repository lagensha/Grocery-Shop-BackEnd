package edu.icet.ecom.service.impl;

import edu.icet.ecom.dto.ItemDTO;
import edu.icet.ecom.repository.impl.ItemRepoImpl;
import edu.icet.ecom.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepoImpl itemRepo;

    @Override
    public boolean addItems(ItemDTO itemDTO) {
        return itemRepo.addItems(itemDTO);
    }

    @Override
    public boolean updateItems(ItemDTO itemDTO) {
        return false;
    }

    @Override
    public boolean deleteItems(String itemCode) {
        return itemRepo.deleteItems(itemCode);
    }

    @Override
    public List<ItemDTO> getAll() {
        return itemRepo.getAll();
    }
}
