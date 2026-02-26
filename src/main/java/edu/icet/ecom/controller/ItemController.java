package edu.icet.ecom.controller;

import edu.icet.ecom.dto.ItemDTO;
import edu.icet.ecom.service.impl.ItemServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
@CrossOrigin
public class ItemController{


  private final ItemServiceImpl itemService;
@PostMapping("/add")
    public boolean addItems(@RequestBody ItemDTO itemDTO) {
        return itemService.addItems(itemDTO);
    }

@PutMapping("/update")
    public boolean updateItems(@RequestBody ItemDTO itemDTO) {
        return itemService.updateItems(itemDTO);
    }

    @DeleteMapping("/delete-by-id/{itemCode}")
    public boolean deleteItems(@PathVariable String itemCode) {
        return itemService.deleteItems(itemCode);
    }

@GetMapping("/all")
    public List<ItemDTO> getAll() {
        return itemService.getAll();
    }
}
